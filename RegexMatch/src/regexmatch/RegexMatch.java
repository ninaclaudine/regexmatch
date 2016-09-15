
package regexmatch;

public class RegexMatch {
    
    public static boolean isTrue(String str){
        return str.matches("[tT]rue");
    }
    
    
    public static void main(String[] args) {
        System.out.println(isTrue("true"));
    }
    
}
