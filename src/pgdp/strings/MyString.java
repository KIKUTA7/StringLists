package pgdp.strings;

import java.util.Arrays;

public class MyString {
    private char[] data = null;
    private MyString next;
    public MyString(char[] data) {
        if (data != null)
            this.data = data;
             this.next = null;

    }
    public MyString(char[] data, MyString x) {
            this.data = data;
        next = x;

    }
    public int length() {
        int l = 0;
        for (MyString t = this; t != null; t = t.next)
            l += t.data.length;
        return l;
    }
    public String toString ()
    {
        char [] arr = new char [length()];
        int len =0;
        for (MyString t=this;t!=null;t=t.next)
        {
            for (int i=0;i<t.data.length;i++)
            {arr[len] = t.data[i];len++;}
        }
        return new String(arr);
    }
    public void concat (char [] data)
    {
     if(data!=null) {
         MyString t =this;
         while (t.next!=null) {
             t = t.next;
         }
         t.next = new MyString(data);
     }
    }


    public boolean equals(MyString other) {
        if (other == null) return false;
        MyString k = other;
        int ind = 0;
        int len = k.data.length;
        for (MyString t = this; t != null; t = t.next) {
            for (int i = 0; i < t.data.length; i++) {
                if (len == 0) {
                    k = k.next;
                    ind = 0;
                   if(k!=null) len += k.data.length;
                else return false;}
                    if (t.data[i] != k.data[ind]) return false;
                    ind++;len --;
                }

            }
            return true;
        }

    public int indexOf(char c) {
        int ind = 0;
        for (MyString t = this; t != null; t = t.next) {
            for (int i = 0; i < t.data.length; i++) {
                if (t.data[i] == c) {
                    return ind;
                }
                ind++;
            }
        }
        return -1;

    }
    public int lastIndexOf (char c)
    {
        int ind = 0;
        int naghdind = -1;
        for (MyString t = this; t != null; t = t.next) {
            for (int i = 0; i < t.data.length; i++) {
                if (t.data[i] == c) {
                    naghdind = ind;
                }
                ind++;
            }
        }
        return naghdind;
    }

}