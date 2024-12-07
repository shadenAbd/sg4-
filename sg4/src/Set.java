public class Set {

    private int[] arr;
    final int maxLength=10;
    private int lastIndex;

    public Set(){
        arr=new int[maxLength];
        lastIndex=0;
    }

    public boolean add(int x) {
        if (!isMember(x) && (lastIndex < maxLength)) {

                arr[lastIndex] = x;
                lastIndex++;

            return true;
        }
        else return false;
    }

    public boolean isMember(int x){
        for(int i=0;i<maxLength;i++) {
            if (arr[i] == x) {
                System.out.print("x already in arr, ");
               return true;
            }
        }
        return false;
    }

    public void show(){
        int i=0;
        while(i<lastIndex){
            System.out.print(arr[i] +" ");
            i++;
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return lastIndex == 0;
    }

    public boolean isFull(){
        return lastIndex == maxLength;
    }

    public void remove(int x) {

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == x)
            {

                for(int j = i; j < arr.length - 1; j++)
                {
                    arr[j] = arr[j+1];
                }

            }
        }
        lastIndex--;
    }

}
