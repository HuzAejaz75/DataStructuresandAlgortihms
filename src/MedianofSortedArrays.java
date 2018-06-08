/**
 * Created by huzaifa.aejaz on 6/6/18.
 */
public class MedianofSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double mean1 = 0;
        double mean2 = 0;
        double len1  = (double)nums1.length;
        double len2 = (double)nums2.length;

        if(len1%2==0){//it is even
            int s1 = (int)len1/2;
            int s2 = s1-1;
            mean1 = ((double)nums1[s1]+ (double)nums1[s2])/2;
        }
        else{
            int s1 = (int)Math.ceil(len1/2);
            mean1 = (double)((double)nums1[s1]);
        }

        if(len2%2==0)
        {
            int s1 = (int)len2/2;
            int s2 = s1-1;
            mean2 = (double)((double)nums2[s1]+ (double)nums2[s2])/2.0;
        }
        else{
            double h = len2/2;
            double s1 = Math.ceil(h);
            mean2 = ((double)nums2[(int)s1]);
        }

        return mean1+mean2/2;
    }
}
