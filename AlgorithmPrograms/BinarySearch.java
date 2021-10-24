package com.company1.Day16And17.AlgorithmPrograms;

class BinarySearch {

    static int binarySearch(String[] arr, String x) {
        int l = 0, r = arr.length-1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            int res = x.compareTo(arr[mid]);

            if (res == 0)
                return mid;

            if (res > 0)
                l = mid + 1;

            else
                r = mid - 1;
        }
        return -1;
    }

    public static void main(String []args) {
        String[] arr = { "aman", "prafulla","sam", "zaheer"};
        String x = "sam";
        int result = binarySearch(arr, x);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}
