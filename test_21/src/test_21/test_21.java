package test_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_21 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�аݭn�������");
		System.out.println("�п�J���");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int res =Integer.parseInt(str);
		char ans=(res==1)?'A':'B';
		System.out.println("��F"+ans+"���u");
	}

}
