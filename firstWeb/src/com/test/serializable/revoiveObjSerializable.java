package com.test.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author 宁超
 * @date 2019/5/6 - 10:36
 */
public class revoiveObjSerializable {


    public static void main(String[] args) throws IOException {
        PersonSerializable person = revoivePerson();
        System.out.println("name=====" + person.getName());
        System.out.println("age=====" + person.getAge());

    }
    private static PersonSerializable revoivePerson() throws IOException {
        PersonSerializable person = null;
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("E:/hello.txt"));
            person = (PersonSerializable) in.readObject();
            System.out.println("反序列化成功");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            in.close();
        }
        return person;
    }
}
