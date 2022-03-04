package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(7.25,4.3,2.35));
        System.out.println(getBucketCount(3.26, 0.75));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width<=0 || height <=0 || areaPerBucket <=0 || extraBuckets < 0){
            return  -1;
        } else{
           double areaOfWall=width*height;
             int bucketNumber = (int)(Math.ceil((areaOfWall/areaPerBucket)-extraBuckets));
             return bucketNumber;
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket)  {
        if(width<=0 || height <=0 || areaPerBucket <=0 ){
            return  -1;
        }  else{
            double areaOfWall=width*height;
            int bucketNumber = (int)(Math.ceil(areaOfWall/areaPerBucket));
            return bucketNumber;
        }
    }
    public static int getBucketCount(double area, double areaPerBucket)  {
        if(area <=0 || areaPerBucket <=0 ){
            return  -1;
        }  else{
            int bucketNumber = (int)(Math.ceil(area/areaPerBucket));
            return bucketNumber;
        }
    }
}
