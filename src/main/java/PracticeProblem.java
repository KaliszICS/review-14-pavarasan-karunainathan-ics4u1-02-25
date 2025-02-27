public class PracticeProblem{
	static final int MAXIMUM = 10;
	static int calculate(int num1, int num2, char operator){
		switch(operator){
			case '+': return num1 + num2;
			case '-': return num1 - num2;
			case '*': return num1 * num2;
			case '/': return num1 / num2;
			case '%': return num1 % num2;
			case '^': return (int)Math.pow(num1, num2);
		}
		return -1;
	}
	
	static boolean totalWordsChecker(String str){
		String[] words = str.split("([^a-zA-Z'_])+");
		return words.length <= MAXIMUM;
	}

	static String minString(String str1, String str2, String str3){
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		str3 = str3.toLowerCase();
		if(str1.compareTo(str2) <= 0){
			if(str1.compareTo(str3) <= 0){
				return str1;
			}else{
				return str3;
			}
		}else if(str2.compareTo(str3) <= 0){
			return str2;
		}else{
			return str3;
		}
	}

	public static void main(String args[]){}
}
