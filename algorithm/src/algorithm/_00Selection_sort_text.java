package algorithm;
public class _00Selection_sort_text {
	public static void main(String[] args) {//main中要有参数
		//定义数据
		int len = 100;
		int maxNum= 10000;
		int go_num=2;
		String result="";
		int[] res_arr = null;
		int[] arr=_03TestHelper.TestHelper(len,maxNum);
//		int[] arr={10,9,8,7,6,5,4,3,2,1};
		long startTime = System.currentTimeMillis();    //获取开始时间
		long startTime_n = System.nanoTime();    		//获取开始时间
		if(go_num==1)
			result=SelectionSort(arr);
		else
			_01Selection_sort.SelectionSort_1(arr);
		long endTime = System.currentTimeMillis();    	//获取结束时间
		long endTime_n = System.nanoTime();    			//获取结束时间
		_04TimeAndCheck.IsTime(startTime,endTime,1);
		_04TimeAndCheck.IsTime(startTime_n,endTime_n,2);
		
		boolean check=_04TimeAndCheck.IsSort(arr);
//		_01Selection_sort.sort(arr);
//		boolean check=_04TimeAndCheck.IsSort(arr);
		
		if(check)
			System.out.println("结果正确");
		else
			System.out.println("结果错误");
		//输出结果
//		System.out.println(result);	
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
