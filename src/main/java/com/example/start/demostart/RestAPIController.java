package com.example.start.demostart;

import java.time.LocalDateTime;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {
    
    @RequestMapping("/gettext")
    public String Hello() {
        return "hello world. 스프링부트 처음 - " + LocalDateTime.now();
    }

    @ResponseBody
    @RequestMapping(value = "/getjson", method = RequestMethod.GET)
    public HashMap<String, Object> getjson(@RequestParam("text-1") String args1) {

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("where", "서버통과-GET");
        map.put("text-1", args1);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/postjson", method = RequestMethod.POST)
    public HashMap<String, Object> postjson(@RequestBody HashMap<String, Object> map) {
        map.put("where", "서버통과-POST");
        return map;
    }
}
