//find missing element in array
class Main {
  public static void main(String[] args) {
    int[] arr = new int[] {2,4};
    System.out.println(getMin(arr));
  }

  public static int getMin(int[] nums){
    int start = 0;
    int end = nums.length - 1;

    while(end - start >= 1){
      int mid = start + (end - start) /2;
      if(nums[mid]-mid != nums[start]-start){
        end = mid;
      }
      else if(nums[mid] - mid != nums[end] - end){
        start = mid;
      }
      if(end-start == 1){
        return nums[start]+1;
      }
    }
    return -1;
  }
}
