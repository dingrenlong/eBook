package com.ebook;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test() {
        String para = "小男孩面带微笑，好似回到了娘亲身边，缓缓地闭上了眼……\n" +
                "\n" +
                "\n" +
                "　　楔子 二\n" +
                "   第一章\n" +
                "　　景泰元年一月初三傍晚，西域天山一条高大无比的巨汉，用着惨淡的眼神看着满营的死尸。他背上插着两只刀刃，手上还举着一柄十二尺长的大马刀，神色直是武勇刚毅。凛冽的秋风吹进营里，伴着西疆独有的黄沙，洒在那大汉饱经风霜的国字脸上。\n" +
                "\n" +
                "　　看着满是死尸的军营，那大汉用力一挥，愤怒地把马刀往地下插落，轰地一声大响，泥沙四溅。他压抑怒气，看着脚下跪着的军官，大声道：“你……你说！那羊皮是谁拿走了！”\n" +
                "\n" +
                "　　那军官惶恐地道：“是……是江充……”";
        //字符串匹配模式
        String patternString = "((楔子)|((第)([\u4e00-\u9fa5a-zA-Z0-9]{1,7})(章)))[^\n]{0,35}(|\n)";
//        String patternString = "(第)([\\u4e00-\\u9fa5a-zA-Z0-9]{1,7})[章][^\\n]{0,35}(|\\n)";
        Pattern pattern = Pattern.compile(patternString);

        Matcher matcher = pattern.matcher(para);

        while (matcher.find()){

            //除去段首多余空格
            int start = matcher.start();
            int end = matcher.end();
            String subString = para.substring(start, end);
            System.out.println(subString);

        }
    }
}