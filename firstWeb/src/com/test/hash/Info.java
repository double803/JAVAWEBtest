package com.test.hash;

/**
 * @author 宁超
 * @date 2019/5/7 - 20:17
 */
public class Info {

    private String key;
    private String name;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Info(String key, String name)
    {
        this.key = key;
        this.name = name;
    }
}
