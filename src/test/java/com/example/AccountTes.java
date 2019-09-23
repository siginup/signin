package com.example;

import com.dao.AccountDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountTes {
    @Test
    public void accountTest(){
        ApplicationContext ac =new ClassPathXmlApplicationContext("bean.xml");
        AccountDao accountDao=ac.getBean(AccountDao.class);
        accountDao.findAll();
    }
}
