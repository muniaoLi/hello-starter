package com.muniao.hello.starter.service;

import lombok.Data;

@Data
public class HelloService
{
    private String name;
    private String msg;

    public String hello()
    {
        return name + " say hello: " + msg;
    }
}
