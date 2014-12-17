package com.riyun.daoImpl;  

import com.riyun.dao.UserDao;  

public class UserDaoImpl implements UserDao{  

    //用户登录  
    public boolean login(String userName, String passWord) {  
        // TODO Auto-generated method stub  
        String sql="select job,ename from emp where ename=?";  
        System.out.println(sql);
        return true;
    }  
}  