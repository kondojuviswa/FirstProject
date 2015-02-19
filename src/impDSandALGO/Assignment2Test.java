package impDSandALGO;
public class Assignment2Test 
{
    int[] maxArraySum(int a[],int l,int h)
    {
        if((a.length==1)||(l==h))
        {
            int result[]={l,h,a[l]};
            return result;
        }
        int m=(l+h)/2;
        int result1[]=maxArraySum(a,l,m);
        int result2[]=maxArraySum(a,m+1,h);
        int result3[]=crossOverSum(a,m,l,h);
        if(result1[2]>=result2[2]&&result1[2]>=result3[2])
        {
            return result1;
        }
        else if(result2[2]>=result3[2]&&result2[2]>=result1[2])
        {
            return result2;
        }
        else
        {
            return result3;
        }
    }
    int[] crossOverSum(int a[],int m,int l,int h)
    {
        int min_index=-1;
        int max_index=-1;
        int min_index2=-1;
        int max_index2=-1;
        int sum=a[m];
        int max_left = a[m];
        int left_index = m;
        int max_right = a[m+1];
        int right_index = m+1;
        int cross_sum ;
        for(int i=m-1;i>=l;i--)
        {
            sum=sum+a[i];
            if(max_left<sum)
            {
                max_left=sum;
                left_index=i;
            }
        }
        sum=a[m+1];
        for(int j=m+2;j<=h;j++)
        {
            sum=sum+a[j];
            if(max_right<sum)
            {
                max_right=sum;
                right_index=j;
            }
        }
       
        int result[]={left_index,right_index,max_left+max_right};
        return result;
    }
    public static void main(String args[])
    {
        Assignment2Test at2=new Assignment2Test();
        int a[]={4, -1, 2, -6, 3, -2, 4};
        int result[]=at2.maxArraySum(a, 0, a.length-1);
        System.out.println("1st max: "+result[0]+" "+result[1]+" "+result[2]);
    }
}
