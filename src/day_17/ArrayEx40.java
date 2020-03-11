// # 2�����迭 �⺻����[2�ܰ�]
package day_17;

import java.util.Scanner;

public class ArrayEx40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j] = 10*k;
				k++;
				System.out.print(arr[i][j] + " ");
			}
		}
		// ���� 1) �ε��� 2���� �Է¹޾� �� ���
		// ��    1) �ε���1 �Է� : 1	�ε���2 �Է� : 2
		//		   �� ��� : 60 
		System.out.println();
		System.out.println();
		System.out.println("���� 1)�ε��� 2���� �Է¹޾� �� ���");
		System.out.println("�ε���1 �Է�:");
		int idx1 = sc.nextInt();
		System.out.println("�ε���2 �Է�:");
		int idx2 = sc.nextInt();
		
		System.out.println(arr[idx1][idx2]);
				
		// ���� 2) ���� �Է¹޾� �ε��� 2�� ���
		// ��    2) �� �Է� : 60
		//		   �ε���1 ��� : 1	�ε���2 ��� : 2
		System.out.println();
		System.out.println("���� 2)���� �Է¹޾� �ε��� 2�� ���");
		System.out.println("�� �Է�");
		int data = sc.nextInt();
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(arr[i][j] == data)
				{
					System.out.println("�ε���1 ���: " + i);
					System.out.println("�ε���2 ���: " + j);
				}
			}
		}
		// ���� 3) ���� ū ���� �ε��� 2�� ���
		// ���� 3) 2 2
		System.out.println();
		System.out.println("���� 3)���� ū ���� �ε��� 2�� ���");
		int max = arr[0][0];
		idx1 = 0;
		idx2 = 0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(max<arr[i][j])
				{
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("����ū �ε���1: "+ idx1);
		System.out.println("����ū �ε���2: "+ idx2);
		// ���� 4) �� 2���� �Է¹޾� �� ��ü
		System.out.println();
		System.out.println("���� 4)�� 2���� �Է¹޾� �� ��ü");
		System.out.println("ù��° ���� �Է� �Ͻÿ�");
		int data1 = sc.nextInt();
		System.out.println("�ι�° ���� �Է� �Ͻÿ�");
		int data2 = sc.nextInt();
		
		int[][] temp = new int[3][3];
		
		int idx1_i =0;
		int idx1_j =0;
		int idx2_i =0;
		int idx2_j =0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(arr[i][j] == data1)
				{
					idx1_i = i;
					idx1_j = j;
				}
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(arr[i][j] == data2)
				{
					idx2_i = i;
					idx2_j = j;
				}
			}
		}
		
		temp[0][0] = arr[idx1_i][idx1_j];
		arr[idx1_i][idx1_j] = arr[idx2_i][idx2_j];
		arr[idx2_i][idx2_j] = temp[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
		}
	}
}
