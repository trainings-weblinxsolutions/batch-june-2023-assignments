package index;

public class IndexOfLatsIndexof {

	public static void main(String[] args) {
		String sentence = "This is a good example of text";
		
		System.out.println(sentence.indexOf('e',17));
		System.out.println(sentence.indexOf('e', 16));
		
		System.out.println(sentence.indexOf("oo"));
		System.out.println(sentence.indexOf('t',28));
		
		
		System.out.println(sentence.lastIndexOf('e'));
		System.out.println(sentence.lastIndexOf('x'));
		
		// TODO Auto-generated method stub

	}

}
