import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {
    public static void main(String[] args) {
        String content = "I am noob " +
                "from runoob.com.";

        String pattern = ".*runoob.*";
        String pattern1 = "\\s";

        boolean isMatch = Pattern.matches(pattern, content);
        Pattern pattern2 = Pattern.compile(pattern1);
        Matcher isMatch1 = pattern2.matcher(content);

        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
        System.out.println("字符串? " +isMatch1);

        Pattern p = Pattern.compile("\\b\\D\\b");
        Matcher m =p.matcher(content);
        int c=0;
        while(m.find()){
            c++;
        }
        System.out.println("总共单词数："+c);
        System.out.println("总共单词数："+c);

    }
}
