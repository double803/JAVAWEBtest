package com.test.sendmessage.entity;

/**
 * @author 宁超
 * @date 2019/5/25 - 10:56
 */
public class UserEntity {

   public UserEntity(String userId,String userName)
    {
        this.userId = userId;
        this.userName = userName;
    }
    private String userId;
    private String userName;
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
