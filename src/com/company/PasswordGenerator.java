package com.company;

public class PasswordGenerator {
    String prefix;
    private int numberOfDigits;
    private int randomDigits;
    private static int count = 0;
    public PasswordGenerator (int a, String b){
        numberOfDigits = a;
        prefix = b;
    }
    public PasswordGenerator (int a){
        numberOfDigits = a;
        prefix = "A";
    }
    public String pwGen(){
        randomDigits = (int) (Math.random() * Math.pow(10, numberOfDigits));
        String a = prefix + "." + randomDigits;
        count++;
        return a;
    }
    public int pwCount(){
        return count;
    }
    public static void main(String [] args){
        PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwCount());
        PasswordGenerator pw2 = new PasswordGenerator(6);
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwGen());
        System.out.println(pw2.pwCount());
        System.out.println(pw1.pwCount());
    }
}

//Output:
//0
//        chs.7769
//        chs.4172
//        2
//        2
//        A.104409
//        3
//        3
//
//        Process finished with exit code 0