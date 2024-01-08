import java.util.Arrays;

public class InsertionSort {
    void insertionSort(int[] arr) {
        // 첫 번째 원소 앞에는 어떤 원소도 갖고 있지 않기 때문에, 두 번째 위치부터 탐색 시작. temp에 임시로 해당 위치값을 저장하고, prev에는 해당 위치의 이전 위치를 저장.
        for(int index = 1; index<arr.length; index++) {
            int temp = arr[index];
            int prev = index - 1;
            // 이전 위치를 가리키는 prev가 음수가 되지 않고, 이전 위치의 값이 '1'번에서 선택한 값보다 크다면, 서로 값을 교환해줌. prev를 더 이전 위치를 가리키도록 함.
            while( (prev >= 0) && (arr[prev] > temp)) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // 두 번째 반복문이 끝나고 난 뒤, prev에는 현재 temp 값보다 작은 값들 중 제일 큰 값의 위치를 가리키게 됨. 따라서, (prev+1)에 temp 값을 삽입.
            arr[prev + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
