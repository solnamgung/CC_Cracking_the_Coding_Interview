package stringBuilder;

public class Main {
	
//	public String joinWords(String[] words) {
//		String sentence = "";
//		for(String w : words) {
//			sentence = sentence + w;
//		}
//		return sentence;
//	}

	
	String joinWords(String[] words) {
		StringBuilder sentence = new StringBuilder();
		for(String w : words) {
			sentence.append(w);
		}
		return sentence.toString();
	}
	
	//The StringBuilder class provides a set of methods 
	//for appending, inserting, and deleting characters from the sequence, 
	
//	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
//		sb.append("Hello");
//		sb.append(" ");
//		sb.append("world");
//		String result = sb.toString();
//			
//		System.out.println(result);
//	}
		
}
