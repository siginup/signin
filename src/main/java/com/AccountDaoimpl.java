package com;

import com.dao.AccountDao;

import java.util.List;

public class AccountDaoimpl implements AccountDao {
    public List findAll(){
        System.out.println("查询成功");
        return null;
    }
}
