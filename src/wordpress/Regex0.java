package wordpress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex0 {
	public static void main(String[] args) {
		String [] texts = {"abc", "xabbcx", "ac", "bbc"};
		for(String text: texts){
			patternMatch(text);
		}
	}
	
	private static void patternMatch(String text) {
		Pattern pattern = Pattern.compile("ab+c");
		Matcher matcher = pattern.matcher(text);
		if(matcher.find()) {
			int start = matcher.start();
			int end = matcher.end();
			System.out.println("文字列 " + text + " はマッチしました。");
			System.out.println("開始位置:" + start + ", 終了位置: " + end);
		}
		else {
			System.out.println("文字列 " + text + " はマッチしませんでした。");
		}
	}
}
