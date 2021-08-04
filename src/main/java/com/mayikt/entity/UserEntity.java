package com.mayikt.entity;


public class UserEntity {

    private String userName;
    private int age;

    public UserEntity(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }

    //重写equals方法使得比较两个对象的属性值而不是内存地址
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UserEntity) {
            return userName.equals(((UserEntity) obj).userName) && age == (((UserEntity) obj).age);
        } else {
            return false;
        }
    }

    //重写hashcode方法保证存入map去重(属性值去重)
    @Override
    public int hashCode() {
        return userName.hashCode();
    }

}
