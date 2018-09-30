package algorithm;

import java.util.Random;

public class _03TestHelper {
	public static void main(String[] args) {//main中要有参数
		//定义数据
		int len = 100;
		int maxNum= 10000;
		int[] arr=TestHelper(len,maxNum);

		String result=SelectionSort(arr);
		//输出结果
		System.out.println(result);	
	}
	/**
	 * 根据需求生成所需数组
	 */
	public static int[] TestHelper(int i,int maxNum){
		//
		int[] res = new int[i];
		Random  r =new Random();
		for(int j = 0;j<i;j++){
			res[j]=r.nextInt(maxNum);
		}
		return res;
		
	}
	/**
	 * 选择排序
	 */
	public static  String SelectionSort(int[] arr){
		String result= "";
		//获取数组长度
		int len = arr.length;
		//设置中间值ֵ
		int check = 0;
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(arr[i]>arr[j]){
					check=arr[i];
					arr[i]=arr[j];
					arr[j]=check;
				}
			}
			int a=arr[i];
			result += a+" "; 
		}
		return result;
	}
}
 