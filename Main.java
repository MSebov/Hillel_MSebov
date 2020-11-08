 class Main {
    public static void main(String[] args) {
        int[][][] train = createTrain();
        printArray(train);

    }

    private static int[][][] createTrain() {
        int quantity = randomInt(5, 20);
        int[][][] tempWagons = new int[quantity][][];
        int[] randomWagonNumbers = createRandomUnicNumbers(quantity);

        for (int i = 0; i < quantity; i++) {
            tempWagons[i] = createWagon(randomWagonNumbers[i]);
        }

        return tempWagons;
    }

    private static int[][] createWagon(int number) {
        int[] seatsArr = createSeats();
        int[] numberArr = {number};

        return new int[][]{numberArr, seatsArr};
    }

    private static int[] createSeats() {
        int[] temp = new int[5];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = randomInt(0, 2);
        }
        return temp;
    }

    private static int randomInt(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }


    private static int[] createRandomUnicNumbers(int quantity) {
        int[] temp = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            int number = randomInt(0, 31);
            while (hasArrayValue(temp, number)) {
                number = randomInt(0, 31);
            }
            temp[i] = number;
        }
        return temp;
    }

    private static boolean hasArrayValue(int[] array, int value) {
        boolean has = false;
        for (int i : array) {
            if (i == value) {
                has = true;
                break;
            }
        }
        return has;
    }


    private static void printArray(int[][][] arr) {
        String tab = "";
        System.out.println("[");

        for (int[][] inner : arr) {
            System.out.println("\tA => [");
            printArray(inner, tab + "\t");
            System.out.println("\t],");
        }
        System.out.println("]");
    }

    private static void printArray(int[][] arr, String tab) {
        System.out.println(tab + "\tB => " + arr[0][0] + ",");
        printArray(arr[1], tab + "\t");
    }

    private static void printArray(int[] arr, String tab) {
        System.out.println(tab + "C => [");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(tab + "\t" + i + " => " + arr[i] + ",");
        }
        System.out.println(tab + "],");
    }
}
