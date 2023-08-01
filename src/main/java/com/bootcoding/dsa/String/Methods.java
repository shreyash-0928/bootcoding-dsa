package com.bootcoding.dsa.String;

public class Methods {
    public static void main(String[] args) {

        String s1 = "Baba Elaichi";
        String s2 = "baba Elaichi";


        String s3 = s1.toUpperCase();
        String s4 = s1.toLowerCase();
        String s5 = "    Haldiram!";
        String s6 = "!Haldiram    ";
        String s7 = "Programmer";
        String s8 = "Java is platform independent";
        String s9 = "C,C++,Java,Python";
        String s10 = "Java";

        // equals()
        System.out.println(s1.equals(s2));

        // equalsIgnoreCase()
        System.out.println(s1.equalsIgnoreCase(s2));

        // toUpperCase()
        System.out.println(s3);

        // toLowerCase
        System.out.println(s4);

        // length()
        System.out.println(s1.length());
        System.out.println(s5.length());
        System.out.println(s6.length());

        // charAt()
        System.out.println(s7.charAt(s7.length()/2));

        // index()
        System.out.println(s7.indexOf('r'));

        // lastIndexOf()
        System.out.println(s7.lastIndexOf('r'));

        // contains()
        System.out.println(s7.contains("ram"));

        // subString()
        System.out.println(s7.substring(0,8));

        System.out.println(s7.substring(0,s7.indexOf('e')));

        // split()
        String[] token = s8.split(" ");
        for (int i = 0; i < token.length; i++) {
            System.out.println(token[i]);
        }
        System.out.println(token.length);

        String[] tech = s9.split(",");
        System.out.println("The candidate knows " + tech.length + " language");

        // trim()
        System.out.println(s8.trim());

        //toCharArray()
        char[] chars = s10.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }



    }
}
