package com.test.data;

/**
 * @author 宁超
 * @date 2019/5/5 - 19:23
 */
public class MyArray {
    private  long [] arr;
    //有效长度
    private  int elements;

    MyArray ()
    {
        arr = new long[50];
    }

    MyArray(int maxsize)
    {
        arr = new long[maxsize];
    }

    public  void insert(long value)
    {
        arr[elements] = value;
        elements++;
    }

    public void display()
    {
        System.out.println("[");
        for(int i = 0; i <elements; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("]");
    }

    public  int searchByValue(long  value)
    {
      int i;
      for (i=0; i<elements; i++)
      {
          if (value == arr[i])
          {
              break;
          }
      }
      if (i == elements)
      {
          return -1;
      }else {
          return i;
      }
    }

    public  long getValue(int index)
    {
        if(index >= elements || index <0)
        {
            throw new ArrayIndexOutOfBoundsException();
        }else {
            return arr[index];
        }
    }

    public  void  remove(int index)
    {
        if(index >= elements || index <0)
        {
            throw new ArrayIndexOutOfBoundsException();
        }else {
            for (int i = index; i < elements;i++)
            {
                arr[index] = arr[index + 1];
            }
        }
        elements--;
    }
}
