package pgdp.strings;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        MyString myString = new MyString(new char[]{'a','b','c','d'});
        MyString str1 = new MyString(new char[]{'a','b','c','d','e','f','c'});

        MyString str2 = new MyString(new char[]{'a','b','c','d','e','f'});
    }


}
