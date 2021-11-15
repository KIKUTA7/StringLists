package pgdp.strings;

public class MyString {
    public char[] data = null;
    private MyString next;

    public MyString(char[] data) {
        if (data != null)
            this.data = data;
             next = null;
    }

    public int length() {
        int l = 0;
        for (MyString t = this; t != null; t = t.next)
            l += t.data.length;
        return l;
    }

    public boolean equals(MyString other) {
        if (other == null) return false;
        MyString k = other;
        for (MyString t = this; t != null; t = t.next) {
            if(t.data.length != k.data.length) return false;
            for (int i=0;i<data.length;i++){
                if(t.data[i]!=k.data[i])   return false;
                }
            k = k.next;
        }
        return true;
    }

    public int indexOf(char c) {
        int ind = 0;
        for (MyString t = this; t != null; t = t.next) {
            for (int i = 0; i < t.data.length; i++) {
                if (data[i] == c) {
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
                if (data[i] == c) {
                    naghdind = ind;
                }
                ind++;
            }
        }
        return naghdind;
    }

}