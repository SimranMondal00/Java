package Recursion.level2Questions;

public class Substrings {
    public static void main(String[] args) {
        System.out.println(SkipA("baacdh"));
        System.out.println(SkipApple("baapplecdh"));
        System.out.println(SkipApp("bappapplecdh"));
    }

    private static String SkipApp(String up) {
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !(up.startsWith("apple"))){
            return SkipApple(up.substring(3));
        }
        else{
            return up.charAt(0) + SkipApple(up.substring(1));
        }
    }

    private static String SkipApple(String up) {
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return SkipApple(up.substring(5));
        }
        else{
            return up.charAt(0) + SkipApple(up.substring(1));
        }
    }

    private static String SkipA(String up) {
        if (up.isEmpty()) {
            return " ";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return SkipA(up.substring(1));
        }
        else{
            return ch + SkipA(up.substring(1));
        }
    }
}
