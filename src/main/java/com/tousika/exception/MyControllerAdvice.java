package com.tousika.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dongsijia on 2018/6/17.
 */
@ControllerAdvice
public class MyControllerAdvice {

    /**
     * 全局捕获异常类，只要作用在@RequestMapping方法上，所有的异常都能捕获到
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map<String, Object> errorHandler(Exception e) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", -1);
        map.put("msg", e.getMessage());
        return map;
    }

    /**
     * 自定义全局异常
     */
    @ResponseBody
    @ExceptionHandler(value = BussinessException.class)
    public Map<String, Object> errorHandler(BussinessException e) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", e.getCode());
        map.put("msg", e.getMsg());
        return map;
    }

}
