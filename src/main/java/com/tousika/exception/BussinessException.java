package com.tousika.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by dongsijia on 2018/6/17.
 */
@Getter
@Setter
public class BussinessException extends RuntimeException{
    private String code;
    private String msg;
    public BussinessException(String code, String msg){
        super();
        this.code =code;
        this.msg=msg;
    }
}
