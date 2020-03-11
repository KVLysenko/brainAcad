package Labs.Lab10;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Любимые фильмы");
        Film[] tempArr = library.getFilmsArr();
        int index = emptyIndex(tempArr);
        if (index != -1){
            tempArr[index] = new Film("Avengers", 2.10, "Action");
        }
        tempArr = library.getFilmsArr();
        index = emptyIndex(tempArr);
        if (index != -1){
            tempArr[index] = new Film("Tor 3", 2.25, "Action");
        }
        tempArr = library.getFilmsArr();
        index = emptyIndex(tempArr);
        if (index != -1){
            tempArr[index] = new Film("Tor", 2.36, "Action");
        }
        tempArr = library.getFilmsArr();
        index = emptyIndex(tempArr);
        if (index != -1){
            tempArr[index] = new Film("Mask", 2.01, "Action");
        }

    }

    static int emptyIndex(Film[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null){
                return i;
            }
        }
        System.out.println("Вы достигли лимита");
        return -1;
    }
}