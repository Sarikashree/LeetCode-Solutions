class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] c=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
            if(nums1[i]<nums2[j])
            {
                c[k++]=nums1[i++];
            }
            else
            {
                c[k++]=nums2[j++];
            }
        }
        while(i<n)
        {
            c[k++]=nums1[i++];
        }
        while(j<m)
        {
            c[k++]=nums2[j++];
        }
        int total=n+m;
        if(total %2 == 1)
        {
            return c[total/2];
        }
        else
        {
            return (c[total/2] + c[(total/2) -1]) / 2.0;
        }
    }
}
