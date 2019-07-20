package com.test.data;

/**
 * @author 宁超
 * @date 2019/5/5 - 19:23
 */
public class MyOrderArray {
    private  long [] arr;
    //有效长度
    private  int elements;

    MyOrderArray()
    {
        arr = new long[50];
    }

    MyOrderArray(int maxsize)
    {
        arr = new long[maxsize];
    }

    public  void insert(long value)
    {
        int i;
        for (i = 0; i < elements; i++)
        {
            if(arr[i] > value)
            {
                break;
            }
        }
        for (int j = elements; j > i;j--)
        {
            arr[j] = arr[j-1];
        }
        arr[i] = value;
        elements++;
    }

    public void display()
    {
        System.out.print("[");
        for(int i = 0; i <elements; i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.print("]");
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

    /**
     * 二分法查找
     * @param value
     * @return
     */
    public int binarySearch(long value)
    {
        int middle =0; int low = 0; int pow = elements;
        while (true)
        {
            middle = (pow + low)/2;
            if (arr[middle] == value)
            {
                return  middle;
            }else if (low > pow)
            {
                return  -1;
            }else {
                if (arr[middle] > value)
                {
                    pow = middle - 1;
                }else{
                    low = middle + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        MyOrderArray arr = new MyOrderArray();
        arr.insert(90);
        arr.insert(30);
        arr.insert(80);
        arr.insert(10);
        arr.display();
        System.out.println(arr.binarySearch(30));
    }
}
