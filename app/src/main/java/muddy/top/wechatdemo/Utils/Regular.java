package muddy.top.wechatdemo.Utils;

import java.util.regex.Pattern;

import static muddy.top.wechatdemo.Utils.StaticClass.PHONE_NUMBER_REG;

//正则
public class Regular {
    //手机号码正则匹配
    public static boolean  RegexExample1(String mobile){
            boolean isMatch = Pattern.matches(PHONE_NUMBER_REG, mobile);
            return isMatch;
    }
}
