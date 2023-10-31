public class exercicio6 {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 5, 6, 8, 3};

        System.out.println("Array original:");
        exibirArray(numeros);

        bubbleSort(numeros);

        System.out.println("\nArray ordenado em ordem crescente:");
        exibirArray(numeros);
    }

    static void exibirArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean trocou;
        do {
            trocou = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    trocou = true;
                }
            }
            n--;
        } while (trocou);
    }
}
