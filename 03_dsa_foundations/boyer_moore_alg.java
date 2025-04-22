// finding the elements which has occurances more than n/2

/*
Imagine you're keeping a vote counter. 
Every time you meet the same element, you increase the vote. 
When you meet a different one, you reduce the vote.

Since the majority element appears more than all others combined, 
it will still remain the final candidate.

So why 1 element ?? 
This comes from the piegon hole principle.
Lets say there are two elements A, B
We are finding all the elements with frequency > n/2
Count(A) > n/2
Count(B) > n/2 
This implies 
Count(A) + Count(B) > n
This is not true so, we 
there is one element which has n/2 occurences
*/ 

public class boyer_moore_alg{
    public static int majority_element(int[] nums){
        int candidate = -1;
        int count = 0;
        for (int i : nums){
            if(count == 0){
                candidate = i;
            }
            count += (i == candidate) ? 1 : -1;
        }
        count = 0;
        for(int num : nums){
            if(num == candidate){
                count++;
            }
        }
        if(count > nums.length /2){
            return candidate;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args){
        int[] arr = {3,1,3,1,6,1};
        System.out.println("majority_element : " + majority_element(arr));
 
    }
}