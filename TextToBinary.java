public class TextToBinary {
	public static void main(String args[]) {
		final String[] binary = {
			"01100001 ",
			"01100010 ",
			"01100011 ",
			"01100100 ",
			"01100101 ",
			"01100110 ",
			"01100111 ",
			"01101000 ",
			"01101001 ",
			"01101010 ",
			"01101011 ",
			"01101100 ",
			"01101101 ",
			"01101110 ",
			"01101111 ",
			"01110000 ",
			"01110001 ",
			"01110010 ",
			"01110011 ",
			"01110100 ",
			"01110101 ",
			"01110110 ",
			"01110111 ",
			"01111000 ",
			"01111001 ",
			"01111010 ",
			"00100000 "
		};
		
		final String letters = "abcdefghijklmnopqrstuvwxyz ";
		
		String name = "hello github";
		String[] nameArr = name.split("");
		
		String result = "";
		
		for(int i = 0; i < nameArr.length; i++) {
			result += binary[letters.indexOf(nameArr[i])];
		}
		System.out.print(result);
	}
}
