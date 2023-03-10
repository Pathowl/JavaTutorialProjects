public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket,int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }else {
            double area = width * height;
            area = area - (extraBuckets * areaPerBucket);
            int bucketsToBuy = (int)Math.ceil(area / areaPerBucket);
            return bucketsToBuy;
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <=0 || height <= 0 || areaPerBucket <=0){
            return -1;
        } else {
            double numberOfBuckets = (width * height) / areaPerBucket;
            return (int)Math.ceil(numberOfBuckets);
        }
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <=0){
            return -1;
        }else {
            double numberOfBuckets = area / areaPerBucket;
            return (int)Math.ceil(numberOfBuckets);
        }
    }

}
