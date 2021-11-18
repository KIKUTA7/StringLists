package pgdp.strings;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        MyString str = new MyString(new char[]{'d','b','c','d'});
        str.concat(new char[]{'e','f'});
        MyString str1 = new MyString(new char[]{'d','b'});
        str1.concat(new char[]{'c','d','e','f'});
        System.out.println(str.equals(str1));
    }
}
