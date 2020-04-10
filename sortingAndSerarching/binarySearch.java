class BinarySearch{
    public int binarySearch(int[] arr, int l, int r, int x){
        if(r >= l){
            int mid = l + (r - l) / 2;
            if(arr[mid] == x)
                return mid;
            else if(arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            else
                return binarySearch(arr, mid, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {1, 2, 3, 4, 5};
        int x = 3;
        int result = ob.binarySearch(arr, 0, arr.length - 1, x);
        System.out.println(result);    
    }
}