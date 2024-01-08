import java.util.Arrays;

public class SelectionSort {
    void selectionSort(int[] arr) {
        int indexMin, temp;
        // 우선, 위치(index)를 선택.
        for(int i=0; i<arr.length-1; i++) {
            indexMin = i;
            // i+1번째 원소부터 선택한 위치(index)의 값과 비교 시작.
            for(int j=i+1; j<arr.length; j++) {
                // 오름차순이므로 현재 선택한 자리에 있는 값보다 순회 하고 있는 값이 작다면, 위치(index)를 갱신.
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }
            // 두 번째  반복문이 끝난 뒤에는 indexMin에 i에서 선택한 위치(index)에 들어가야 하는 값의 위치(index)를 갖고 있으므로 서로 교환.
            // swap(arr[indexMin], arr[i])
            temp = arr[indexMin];
            arr[indexMin] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
