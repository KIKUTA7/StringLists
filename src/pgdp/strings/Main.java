package pgdp.strings;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        MyString str = new MyString(new char[]{'d','b','c','d'});
        str.concat(new char[]{'e','f'});
        str.concat(new char[]{'g'});
        System.out.println(str.toString());
    }
}
