package com.test.json;

import net.sf.json.JSONArray;
import net.sf.json.JSONNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 宁超
 * @date 2019/5/6 - 14:24
 */
public class JsonTest { public static String jsonTest = "[{\"name\":\"张三\",\"age\":\"14\",\"sex\":\"男\"},{\"name\":\"李四\",\"age\":\"25\",\"sex\":\"女\"}]";

    public static void main(String[] args) {
        Map<String,Object> mapTest = initialJsonDataToMap(jsonTest);
        for(String key : mapTest.keySet())
        {
            System.out.println(mapTest.get(key));
        }
    }

    /**
     * 初始化json字符串数据
     * @param jsonDataStr
     * @return
     */
    @SuppressWarnings("unchecked")
    public static Map<String,Object> initialJsonDataToMap(String jsonDataStr)
    {
        Object json = new net.sf.json.util.JSONTokener(jsonDataStr).nextValue();
        Map<String,Object> result = null;
        if (json instanceof net.sf.json.JSONObject)
        {
            result = net.sf.json.JSONObject.fromObject(jsonDataStr);
            for (String key : result.keySet())
            {
                if (result.get(key) instanceof JSONNull)
                {
                    result.put(key, null);
                }
            }
        } else if (json instanceof net.sf.json.JSONArray)
        {
            List<Object> list = new ArrayList<>();
            JSONArray tmp = net.sf.json.JSONArray.fromObject(jsonDataStr);
            for (int i = 0; i < tmp.size(); i++)
            {
                if (tmp.get(i) == null || tmp.get(i) instanceof net.sf.json.JSONNull)
                {
                    continue;
                }
                list.add(tmp.get(i));
            }
            result = new HashMap<>();
            result.put("list", list);
        }
        return result;
    }
}
