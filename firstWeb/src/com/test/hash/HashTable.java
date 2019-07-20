package com.test.hash;

import java.math.BigInteger;

/**
 * @author 宁超
 * @date 2019/5/7 - 20:19
 */
public class HashTable {
    private Info[] arr;
    /**
     * 默认的构造方法
     */
    public HashTable()
    {
        arr = new Info[100];
    }

    /**
     * 指定初始化大小
     */
    public HashTable(int maxsize)
    {
        arr = new Info[maxsize];
    }
    /**
     * 插入数据
     */
    public void insert(Info info)
    {
        //获得关键字
        String key = info.getKey();
        //关键字所自定的哈希数
        int hashVal = hashCode(key);
        //如果这个索引已经被占用，而且里面是一个未被删除的数据
        while (arr[hashVal] != null && arr[hashVal].getName() != null)
        {
            //进行递加
            ++hashVal;
            //循环
            hashVal %= arr.length;
        }
        arr[hashVal] = info;
    }

    /**
     * 查找数据
     */
    public Info find(String key)
    {
        int  a = "Asd".hashCode();
        int hashval = hashCode(key);
        while (arr[hashval] != null )
        {
            if(key.equals(arr[hashval].getKey()))
            {
                return arr[hashval];
            }
            ++hashval;
            hashval %= arr.length;
        }
        return null;
    }
    /**
     * 删除
     */
    public Info delete(String key)
    {
        int hashVal = hashCode(key);
        while (arr[hashVal] != null)
        {
            if (arr[hashVal].getKey().equals(key))
            {
                Info tmp = arr[hashVal];
                tmp.setName(null);
                return tmp;
            }
            ++hashVal;
            hashVal %= arr.length;
        }
        return  null;
    }

    /**字母转换成ASCII码，然后进行相加但是 abc 和bbb 这样算出来的hashcode是相同的，相当于key一致了
     *幂的连乘 * 27的次方，但是导致数组初始化太大 结果的key值超过100以上
     * 压缩可选值 对的连乘 的结果进行取模 数组key覆盖
     * @param key
     * @return
     */
    public int hashCode(String key)
    {
 /*       int hashVal = 0;
        for (int i = key.length() - 1;i >= 0; i--)
        {
            int letter = key.charAt(i) - 96;
            hashVal += letter;
        }*/
        //int hashVal = 0;
        BigInteger hashVal = new BigInteger("0");
        //int pow27 = 1;
        BigInteger pow27 = new BigInteger("1");
        for (int i = key.length() - 1;i >= 0; i--)
        {
            int letter = key.charAt(i) - 96;
            BigInteger letterB = new BigInteger(String.valueOf(letter));
            hashVal = hashVal.add(letterB.multiply(pow27));
            pow27 = pow27.multiply(new BigInteger("27"));
            //hashVal += letter * pow27;
            //pow27 *= 27;
        }
        return hashVal.mod(new BigInteger(String.valueOf(arr.length))).intValue();
    }
}
