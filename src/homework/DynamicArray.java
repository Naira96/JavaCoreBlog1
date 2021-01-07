package homework;

public class DynamicArray {
    //sa mer himnakan masivn e, voetex pahelu  enq  avelacvox elementner@
    private int[] array = new int[10];
    //sa mer masivi mej avelacvac elementneri qanakn e
    private int size = 0;

    //
    //stugel,ete masivi mej tex chka -> kanchel extend()
    // ev avelacnel
    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    //1.stexcel hin masivic 10 element aveli mec masiv
    //2.qcel hin masivi elementner@ nori mej
    //3.hin masivi hxum@ kapel nori het
    private void extend() {
        int tmp[] = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    //ete tvac index@ mer unecac masivi indexi sahmannerum e,veradardznel
    //masivi index-erord element@: hakarak depqum veradardznel -1
    public int getByIndex(int index) {
        return index >= 0 && index < size ? array[index] : -1;
    }
//        if (index < array.length && index >= 0) {
//            return array[index];
//        } else
//            System.out.println("Index is out of array.length");
//        return -1;
//    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //veradardznel avelacvac tveric amenamec@
    public int max() {
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //veradardznel avelacvac tveric amenapoqr@
    public int min() {
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    //masivic jnjum enq ekac indexi tak @nkac element@, heto tpeluc masivi bolor elementner@ ktpi irar koxq,isk jnjvac@ voch
    public void deleteByIndex(int index) {
        if (index > 0 && index <= size) {
            for (int i = index + 1; i < size; i++) {
                array[i - 1] = array[i];
            }
            size--;
        }
    }

    //masivic jnjum enq tvac value-in havasar bolor elementner@
    public void deleteByValue(int value) {
        for (int i = 0; i <= size; i++) {
            if (array[i] == value) {
                deleteByIndex(i);
            }
        }
    }

    //masivic jnjum enq tvac valuein havasar miayn arajin element@: Aysinqn ete asum enq jnjin 23 tiv, u masivum unenq mi qani hat,jnji 1-in@
    public void deleteByValueFirst(int value) {
        for (int i = 0; i <= size; i++) {
            if (array[i] == value) {
                deleteByIndex(i);
                break;
            }
        }
    }

    //masivic kktri u kstana poqr masiv @st startIndex-i ev endIndex-i, vorn el kveradardznenq,testi mej ktpenq
    public int[] subArray(int startIndex, int endIndex) {
        int[] tmp = new int[(endIndex - startIndex) + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            tmp[index++] = array[i];
        }
        return tmp;
    }

    //masivic kktri u kstana aveli poqr masiv @st startIndex-i ev minchev verjin elementi,vorn el kveradardznenq, testi mej ktpenq
    public int[] subArray(int startIndex) {
        return subArray(startIndex, size - 1);
    }
}