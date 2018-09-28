package algorithm;
public class _01Selection_sort {
	public static void main(String[] args) {//main中要有参数
		//定义数据
		int[] arr={10,9,8,7,6,5,4,3,2,1};
		String result=SelectionSort(arr);
		//输出结果
		System.out.println(result);	
	}
	/**
	 * 选择排序
	 */
	public static String SelectionSort(int[] arr){
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
