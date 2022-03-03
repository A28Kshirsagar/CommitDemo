package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	
	public int solution(int N)
	{
		String value = Integer.toBinaryString(N);
		
		int count=0;
		List<Integer> lst = new ArrayList<Integer>();
		for(char i:value.toCharArray()) 
		{
			if(i == '0') 
			{
			count += 1;
			}
			else 
			{
			lst.add(count);
			count=0;
			}
		}
		return Collections.max(lst);
	}
	
public static void main(String[] args) {
	int num=32;
	System.out.println(new Solution().solution(num));
}
}
