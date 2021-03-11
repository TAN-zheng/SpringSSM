package com.stx.dao;

import com.stx.po.Customer;

public interface CustomerDao {
    /*
    * 根据id查询客户信息
    * */
    public Customer findCustomerById(Integer id);
}
