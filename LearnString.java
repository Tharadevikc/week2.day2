package week2.day2;

public final class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//string literal
String s  ="welcometoTest"+ "leaf";


//string object
String s2 = new String ("TestLeaf");

//compare 2 stringsl
boolean isequal = s.equals(s2);
System.out.println(isequal);
System.out.println(s==s2);
System.out.println(s.equalsIgnoreCase(s2));

//to get the number o characters in string
int length = s.length();
System.out.println(length);

// to convert string to char array
char[] charArray = s.toCharArray();
// use for loop to print each character nd 7 is hardcoded
System.out.println(charArray[7]);
for(int i=0;i<charArray.length;i++)
	System.out.println(charArray[i]);

//to get a particular character
char charAt = s.charAt(s.length()-3);
System.out.println(charAt);

//to get the position of the specific character
int indexOf = s.indexOf('l');
System.out.println(indexOf);

//to check if a string contains a speciic text
boolean contains = s.contains("leaf");
System.out.println(contains);

//to split the string
String[] split = s.split(" ");
for (int i=0;i<=split.length;i++)
	System.out.println(split[i]);
//String[] split = s.split(" ");

	}
	
	

}
