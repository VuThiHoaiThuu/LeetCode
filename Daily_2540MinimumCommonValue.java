public class Daily_2540MinimumCommonValue {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4};
        System.out.println(getCommon(nums1, nums2));

    }

    public static int getCommon(int[] nums1, int[] nums2){
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j])
                i++;
            else if(nums1[i] > nums2[j])
                j++;
            else 
                return nums1[i];
        }
        return -1;
    }


    /*     35/36 testcase passed     */
    public static int getCommon1(int[] nums1, int[] nums2){
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j])
                    return nums1[i];
            }
        }
        return -1;
    }
}
