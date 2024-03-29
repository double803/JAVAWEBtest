package com.test.json;

/**
 * @author 宁超
 * @date 2019/5/6 - 14:29
 */
public class Person {
    private int age;
    private String name;
    private String sex;
    public Person (int age,String name,String sex)
    {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + + '\'' + ",sex='" + sex + + '\'' + ",age='" + age + + '\'' + '}';
    }
}
