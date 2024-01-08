import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int temp = 0;
        // 제외될 원소의 갯수. 1회전이 끝난 후, 배열의 마지막 위치에는 가장 큰 원소가 위치하기 때문에 하나씩 증가.
        for(int i=0; i<arr.length; i++) {
            // 원소를 비교할 index를 뽑을 반복문. j는 현재 원소를 가리키고, j-1은 이전 원소를 가리키게 되므로, j는 1부터 시작.
            for (int j = 1; j < arr.length - i; j++) {
                // 현재 가리키고 있는 두 원소의 대소를 비교. 해당 코드는 오름차순 정렬이므로 현재 원소보다 이전 원소가 더 크다면 원소가 뒤로 가야 하므로 서로 자리를 교환.
                if(arr[j-1] > arr[j]) {
                    // swap(arr[j-1], arr[j]
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {34, 51, 22, 67, 20};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
