public class Dice {
    int[] results;

    public Dice() {
        results = new int[6];
    }

    public int throwDice() {
        int face = (int) (Math.random() * 6);
        return face;
    }

    public void throw1000Times() {
        for (int i = 0; i < 1000; i++) {
            int face = throwDice();
            results[face] = results[face] + 1;
        }
    }

    public void showResults() {
        for (int i = 0; i < results.length; i++) {
            System.out.println("face: " + (i + 1) + " :" + results[i]);
        }
    }

    public int getMax() {
        int max = results[0];
        for (int i = 0; i < results.length; i++) {
            if (results[i] > max) {
                max = results[i];
            }
        }

        return max;
    }

    public int countNumber(int num) {
        int count = 0;
        for (int i = 0; i < results.length; i++) {
            if (results[i] == num) {
                count++;
            }
        }

        return count;
    }

    public int[] countMaxFace() {
        int max = getMax();
        int maxCount = countNumber(max);
        int[] maxFaces = new int[maxCount];
        int maxFacesLastIndex = 0;
        for (int i = 0; i < results.length; i++) {
            if (results[i] == max) {
                maxFaces[maxFacesLastIndex] = i + 1;
                maxFacesLastIndex++;
            }
        }

        return maxFaces;
    }


}
