package java_homework2;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
public class test 
{

	public static void main(String[] args)throws IOException
	{
		/*
		//Sample 2_1
		System.out.println("請輸入整數");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num == 1)
		{
			System.out.println("輸入的是1");
			System.out.println("選擇的是1");
		}	
				//Sample 2_2
		System.out.println("結束處理");	
		
		//Sample 2_2
		System.out.println("請輸入整數");
		
			BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num == 1)
			
			System.out.println("輸入的是1");
			System.out.println("選擇的是1");
				
		System.out.println("結束處理");	
		
		
		//Sample 2_3
		System.out.println("請輸入整數");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
	
		int num = Integer.parseInt(br.readLine());
	
		if(num == 1)
		{
			System.out.println("輸入的是1");
		}
		else
		{
			System.out.println("選擇的是輸入1以外的數字");
		}		
		
		//Sample2_4
		System.out.println("請輸入整數");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
	
		int num = Integer.parseInt(br.readLine());
	
		if(num == 1)
		{
			System.out.println("輸入的是1");
		}
		else if(num == 2)
		{
			System.out.println("輸入的是2");
		}
		else
		{
			System.out.println("請輸入1或2");
		}
		
		//Sample2_5
		System.out.println("請輸入整數");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
	
		int num = Integer.parseInt(br.readLine());
	
		switch(num)
		{
			case 1:
			{
				System.out.println("輸入的是1");
				break;
			}
			case 2:
			{
				System.out.println("輸入的是2");
				break;
			}
			case 3:
			{
				System.out.println("請輸入1或2");
				break;
			}
		}
		
		//Sample2_5_2
		System.out.println("請輸入整數");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
	
		int num = Integer.parseInt(br.readLine());
	
		switch(num)
		{
			case 1:
			{
				System.out.println("輸入的是1");
			}
			case 2:
			{
				System.out.println("輸入的是2");
			}
			default:
			{
				System.out.println("請輸入1或2");
			}
		}
		//Sample2_6
		System.out.println("請輸入a或b");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
	
		String str =br.readLine();
		char letter =str.charAt(0);
	
		switch(letter)
		{
			case 'a':
			{
				System.out.println("輸入的是a");
				break;
			}
			case 2:
			{
				System.out.println("輸入的是b");
				break;
			}
			default:
			{
				System.out.println("請輸入a或b");
				break;
			}
		}
		
		//Sample2_7
		System.out.println("請問你是男生嗎?");
		System.out.println("請輸入Y或N");
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
	
		String str =br.readLine();
		char letter =str.charAt(0);
	
		if(letter == 'Y'|| letter == 'y')
		{
			System.out.println("你是男生阿!");
		}
		else if(letter == 'N'|| letter == 'n')
		{
			System.out.println("你是女生阿!");
		}
		else 
		{
			System.out.println("請輸入Y或N");
		}

		//Sample2_8
		System.out.println("請問要選哪條路線?");
		System.out.println("請輸入整數");
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
	
		String str =br.readLine();
		int res = Integer.parseInt(str);
	
		char ans = (res == 1)?'A':'B';
		
		System.out.println("選擇了"+ ans + "路線");
		
		//Sample2_9
		for(int i =1;i<=5;i++)
		{
			System.out.println("第"+i+"次的迴圈");
		}
		
		System.out.println("迴圈結束");
		
		//Sample2_10	
		int i=1;
		while(i<=5)
		{
			System.out.println("第"+i+"次的迴圈");
			i++;
		}
		System.out.println("迴圈結束");
		
		//Sample2_11
		int i = 1;
		do
		{
			System.out.println("第"+i+"次的迴圈");
			i++;
		}
		while(i<=5);
		
		System.out.println("迴圈結束");
		
		//System2_12
		int i,j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("i圈"+i+":j是"+j);
			}
		}
	
		//System2_13
		System.out.println("請問要在第幾次處理結束迴圈呢?(1~10)");
		BufferedReader br = new
				BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("第"+i+"次的處理");
			if(i==res)
				break;
		}
		
		//System2_14
		System.out.println("請問要在第幾次處理結束迴圈呢?(1~10)");
		BufferedReader br = new
				BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i=1;i<=10;i++)
		{
			
			if(i==res)
				continue;
			System.out.println("第"+i+"次的處理");
		}
		
		//Sample2_15
		int[]test;
		test = new int[5];
		
		test[0]=80;
		test[1]=60;
		test[2]=22;
		test[3]=50;
		test[4]=75;
		
		for(int i=0;i<5;i++)
		{
			System.out.println("第"+(i+1)+"個人的分數是"+test[i]+"分");
		}
		
		//Sample2_19
		int[] intArray =(int[])Array.newInstance(int.class,3);
		
		Array.set(intArray,0,123);
		Array.set(intArray,1,456);
		Array.set(intArray,2,789);
		
		System.out.println("inArrray[0]="+Array.get(intArray, 0));
		System.out.println("inArrray[1]="+Array.get(intArray, 1));
		System.out.println("inArrray[2]="+Array.get(intArray, 2));
		
		//Sample2_18
		int[]test = {80,60,22,50,75};
			
		for(int i = 0;i<5;i++)
		{
			System.out.println("第"+(i+1)+"個人的分數是"+test[i]+"分");
		}
		
		//Sample2_19
		int[]test = {80,60,22,50,75};
		
		for(int i = 0;i < test.length;i++)
		{
			System.out.println("第"+(i+1)+"個人的分數是"+test[i]+"分");
		}
		
		System.out.println("考試人數為"+test.length+"人");
		
		//Sample2_20
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
				
		System.out.println("請輸入5個人的分數");
		int  test[] = new int [5];
		
		for (int i = 0;i < test.length;i++)
		{
			String str =br.readLine();
			test[i]=Integer.parseInt(str);
		}
		
		for (int s=0;s < test.length-1;s++)
		{
			for(int t = s+1;t < test.length;t ++)
			{
				if(test[t]>test[s])
				{
					int tmp = test[t];
					test[t] = test[s];
					test[s] = tmp;
				}
			}
		}
		
		for(int i=0;i<test.length;i++)
		{
			System.out.println("第"+(i+1)+"名的分數是"+test[i]);
		}
		
		//Sample2_21
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
				
		System.out.println("請輸入5個人的分數");
		Integer test[] = new Integer [5];
		
		for (int i = 0;i < test.length;i++)
		{
			String str =br.readLine();
			test[i]=Integer.parseInt(str);
		}
		
		Arrays.sort( test,Collections.reverseOrder());
		
		for(int i=0;i<test.length;i++)
		{
			System.out.println("第"+(i+1)+"名的分數是"+test[i]);
		}
		*/
		//Sample2_22
		int[][]test;
		test = new int[2][5];
		
		test[0][0]=80;
		test[0][1]=60;
		test[0][2]=22;
		test[0][3]=50;
		test[0][4]=75;
		test[1][0]=90;
		test[1][1]=55;
		test[1][2]=68;
		test[1][3]=72;
		
		for(int i = 0; i<test[1].length;i++)
		{
			System.out.println("第"+(i+1)+"個人的國語分數是"+test[0][i]+"分");
			System.out.println("第"+(i+1)+"個人的數學分數是"+test[1][i]+"分");

		}
	}	
}
