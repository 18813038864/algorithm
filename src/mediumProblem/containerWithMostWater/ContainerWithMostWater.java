package src.mediumProblem.containerWithMostWater;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int i=0,start = 0;
        int j=height.length-1,end = height.length-1;
        int maxArea = Math.min(height[start],height[end])*(end-start);

        while (i<j){
            while (height[start]<=height[end]&&height[i]<=height[start]&&i<j){
                i++;
            }
            start = i;
            maxArea = Math.max(maxArea,Math.min(height[start],height[end])*(end-start));

            while (height[start]>height[end]&&i<j){
                while (height[j]<=height[end]){
                    j--;
                }

                end = j;
                maxArea = Math.max(maxArea,Math.min(height[start],height[end])*(end-start));
            }
        }
        return maxArea;
    }

    public static int maxAreaBest(int[] height) {
        int water = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            int h = Math.min(height[i], height[j]);
            water = Math.max(water, h * (j - i));
            while (height[i] <= h && i < j) i++;
            while (height[j] <= h && i < j) j--;
        }
        return water;
    }

    public static void main(String[] args){
        System.out.println(maxAreaBest(new int[]{2,3,4,5,5,5,6}));
    }
}
