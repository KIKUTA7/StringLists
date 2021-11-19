package pgdp.strings;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        MyString str = new MyString(null);
        str.concat(null);
        MyString str1 = new MyString(new char[]{'c'});
        str1.concat(new char []{'d','a'});
        str1.concat(new char[] {'d'});
        System.out.println(str1.lastIndexOf('d'));
    }
}
