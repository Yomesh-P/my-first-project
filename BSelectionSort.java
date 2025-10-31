public class BSelectionSort {
    public static void selectionSort(int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[minPos] > numbers[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = numbers[minPos];
            numbers[minPos] = numbers[i];
            numbers[i] = temp;
        }
    }

    public static void display(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nubers[] = { 5, 4, 1, 3, 2 };
        selectionSort(nubers);
        display(nubers);
    }

}
// time complexcity =o(n^2)
//pick the smallest from unsortef and place at begining