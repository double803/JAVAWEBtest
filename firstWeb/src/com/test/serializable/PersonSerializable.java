package com.test.serializable;

import java.io.Serializable;

/**
 * @author 宁超
 * @date 2019/5/6 - 9:34
 */
public class PersonSerializable implements Serializable
{
    /**，这个序列化ID起着关键的作用，它决定着是否能够成功反序列化！
     * 简单来说，java的序列化机制是通过在运行时判断类的serialVersionUID来验证版本一致性的。
     * 在进行反序列化时，JVM会把传来的字节流中的serialVersionUID与本地实体类中的serialVersionUID进行比较，
     * 如果相同则认为是一致的，便可以进行反序列化，否则就会报序列化版本不一致的异常
     */
    private static final long serialVersionUID = 2225234137461873735L;
    private int age;
    private String name;

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
}
