package com.test.sendmessage;

import com.test.sendmessage.entity.UserEntity;
import com.test.sendmessage.util.ListUtils;

import java.util.ArrayList;
import java.util.List;
/**
 * @author 宁超
 * @date 2019/5/25 - 11:35
 */
public class BatchThread {
    public static void main(String[] args) {
        //1.初始化用户
        List<UserEntity> listUser = initUser();
        //2.定义每个一个线程最多跑多少数据
        int userCount = 2;
        //3.计算每个线程数，并且计算每个线程跑那些数据
        List<List<UserEntity>> splitList = ListUtils.splitList(initUser(),userCount);
        //每次往数据库查询100条，往集合里面，大集合包小集合
        for(int i=0;i<splitList.size();i++)
        {
            //拿到是每个线程在跑多少数据
            List<UserEntity> list = splitList.get(i);
            new UserThrea(list).start();
            System.out.println("i:" + i + "--" + splitList.toString());
        }
        //4.让子线程进行分批异步处理数据

    }

    public static List<UserEntity> initUser()
    {
        List<UserEntity> listUser = new ArrayList<>();
        for(int i=0;i < 10; i++)
        {
            listUser.add(new UserEntity("userId:" + i,"userName" + i));
        }
        return listUser;
    }
 }
 class UserThrea extends Thread
 {
     List<UserEntity> listUser;
     public UserThrea(List<UserEntity> listUser)
     {
         this.listUser = listUser;
     }

     @Override
     public void run() {
         for(UserEntity userEntity:listUser)
         {
             try {
                 Thread.sleep(500);
             }catch (InterruptedException e)
             {
                 e.printStackTrace();
             }
             System.out.println("name" + getName() + userEntity.toString());
            //第三方短信接口
         }
     }
 }
