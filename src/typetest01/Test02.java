package typetest01;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="123";//실수 문자열은 실수로 변환가능하지만, 정수로 변환이 안됨 .에러남
		String str2="123.123";//실수 문자열은 실수로 변환가능하지만, 정수로 변환이 안됨 .에러남

		
		int s1= Integer.parseInt(str1);//문자열을 정수로 변환!!!!!
		
		double d1= Double.parseDouble(str2);//문자열을 실수로 변환!!!
		
		System.out.println(s1);
		System.out.println(d1);
		
		int i1=1234;
		String str3 = String.valueOf(i1);//정수 또는 실수를 문자열로 변환
	

	}

}
