package org.example;

public class Regex {
    public boolean telephoneNumber(String number) {
        if (number.matches("\\(\\+380\\)[0-9]{2}-[0-9]{3}-[0-9]{2}-[0-9]{2}")) {
            System.out.println("Correct phone number");
            return true;
        }
        else {
            System.out.println("Incorrect phone number");
            return false;
        }
    }
    public String replaceBlanks(String str) {
        String filtered = str.replaceAll("\\s+", " ");
        return filtered;
    }
    public String replaceHtml(String str) {
        String filtered = str.replaceAll("<[^>]*>", "");
        return filtered;
    }
}
