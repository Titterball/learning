public class Selection_sort
{
	public static void sort(Comparable[] a)
	{     //升序排序
		int N=a.length;
		for(int i=0;i<N;i++)
		{    //将a[i]和a[i+1...N]中最小元素交换
			int min=i;			//最小元素的索引
			for(int j=i+1;j<N;j++)
				if(less(a[j],a[min]))  min=j;
			exchange(a,i,min);    //交换
		}
	}
}