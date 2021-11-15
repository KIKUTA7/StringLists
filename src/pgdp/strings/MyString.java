package pgdp.strings;

public class MyString {
    private  char [] data;
    private  MyString next = null;
    public MyString (char [] data)
    {
        if(data!=null)
        this.data = data;
        next = this;
    }
    public int length ()
    {
        int l = 0;
        for (MyString t =this;t!=null;t=t.next)
            l+=this.data.length;
        return l;
    }

}