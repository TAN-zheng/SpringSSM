package com.stx.po;
/**
 * 客户持久化类
 *  编写一个用于映射数据库表t_customer的客户持久类。
 *  类中分别定义id，username,jobs,phone属性，以及其对应的getter/setter方法。
 *
 * */
public class Customer {
    private Integer id;
    private String username;
    private String jobs;
    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
