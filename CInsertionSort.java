public class CInsertionSort {
    public static void insertionSort(int numbers[]) {
    for (int i = 1; i < numbers.length; i++) {
        int curr = numbers[i];
        int prev = i - 1;
        // finding out the correct pos to insert
        while (prev >= 0 && numbers[prev] > curr) {
            numbers[prev + 1] = numbers[prev];
            prev--;
        }
        // insertion
        numbers[prev + 1] = curr;
    }
}


    public static void display(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    public static void main(String[] args) {
        int nubers[] = { 5, 4, 1, 3, 2 };
        insertionSort(nubers);
        display(nubers);
    }
}
//timecomplexcity = o(n^2)
