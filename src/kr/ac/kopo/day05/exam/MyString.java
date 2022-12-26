package kr.ac.kopo.day05.exam;

public class MyString {

    String str;

    MyString() {

    }

    MyString(String str) {
        this.str = str;
    }

    char toUpper(char c){
        if(c >= 'a' && c <= 'z'){
            return c -= ('a' - 'A');
        }
        return c;
    }


    public boolean equalsIgnoreCase(MyString m2) {
        if(str.length() != m2.str.length()){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            char oriChar = str.charAt(i);
            char otherChar = m2.str.charAt(i);
            if(toUpper(oriChar) != toUpper(otherChar)){
                   return false;
            }
        }
        return true;
    }

    public boolean equals(MyString m2){
        if (str == null || m2.toString() == null){
            return false;
        }
        if(str.length() != m2.toString().length()){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != m2.toString().charAt(i)){
                return false;
            }
        }
        return true;
    }
}

/*
    MyString s = new MyString("Hello");
    MyString s2 = new MyString("Hello");
    bolean bool = s.equalsIgnoreCase(s2);
    if(bool){
        System.out.println("같다");
    } else {
        System.out.println("다르다");
    }
 */

