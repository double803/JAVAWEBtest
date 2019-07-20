package com.test.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author 宁超
 * @date 2019/5/6 - 9:42
 */
public class ObjSerializableTest {
    public static void main(String[] args) {
        serializablePeople();
    }

    /**
     * 序列号测试
     */
    private static void serializablePeople()
    {
        PersonSerializable person = new PersonSerializable();
        person.setAge(14);
        person.setName("张三");
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("E:/hello.txt"));
            out.writeObject(person);
            System.out.println("序列号成功");
        }catch  (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
