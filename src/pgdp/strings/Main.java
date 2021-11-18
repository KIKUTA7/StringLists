package pgdp.strings;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        MyString str1 = new MyString(new char[]{'a','b','c','d'});
        str1.concat(new char[]{'e','f'});
        MyString str2 = new MyString(new char[]{'a','b','c','d','e','f'});
        System.out.println(str1.equals(str2));
    }
}
