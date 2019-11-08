import java.math.*;
import java.util.*;
import java.lang.*;
public class Demo{
 
public static void main(String[] args) {
 
	Integer times = null;
	String strTimes = null;
	Runtime run = Runtime.getRuntime();
	boolean flg=true;
	while(flg){
	try {
		System.out.println("シャットダウン時間を入力してください！");
		Scanner sc = new Scanner(System.in);
		strTimes = sc.next();
		if(strTimes.indexOf("h") != -1){
		times=Integer.parseInt(strTimes.substring(0,strTimes.indexOf("h"))) * 60 * 60;
		}else if(strTimes.indexOf("m") != -1){
		times=Integer.parseInt(strTimes.substring(0,strTimes.indexOf("m"))) * 60;
		}else if(strTimes.indexOf("s") != -1){
		times=Integer.parseInt(strTimes.substring(0,strTimes.indexOf("s")));
		}else{
			continue;
		}	
		Process process = run.exec("cmd.exe /k start shutdown /s /t " +times);
		flg=false;
		} catch (Exception e) {
		flg=true;
		}
	} 
 
}
}
