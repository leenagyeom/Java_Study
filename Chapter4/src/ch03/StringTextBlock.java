package ch03;

public class StringTextBlock {

	public static void main(String[] args) {
		
		String strBlock = """
				This 
				is
				Block
				test
				""";
		System.out.println(strBlock);
		
		System.out.println(getBlockOfHtml());
	}
	
	public static String getBlockOfHtml() {
		return """
				<html>
					<body>
						<span>example test</span>
					</body>
				</html>
				""";
	}
}
