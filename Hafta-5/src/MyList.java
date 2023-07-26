import java.util.Arrays;

public class MyList<T> {
    private int capacity = 10;
    private T[] array;
    private T[] tempArray;

    // MyList() : Boş yapıcı metot kullanılıyorsa, dizinin başlangıç boyutu 10 olmaldır.

    public MyList() {
        this.array = (T[]) new Object[capacity];
    }

    // MyList(int capacity) : Dizinin başlangıç değeri capacity parametresinden alınmalıdır.

    public MyList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
    }

    // getCapacity() : dizinin kapasite değerini verir.
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T[] getTempArray() {
        return tempArray;
    }

    public void setTempArray(T[] tempArray) {
        this.tempArray = tempArray;
    }

    // size() :dizideki eleman sayısını verir.
    public int size() {
        int number = 0;
        for (int i = 0; i < getCapacity(); i++) {
            if (array[i] != null) {
                number++;
            }
        }

        return number;
    }

    // add(T data) : sınıfa ait diziye eleman eklemek için kullanılmalıdır.
    //  Eğer dizide yeteri kadar yer yok ise, dizi boyutu 2 katına çıkartılmalıdır.

    public void add(T data) {
        if (size() > getCapacity()) {
            this.tempArray = this.array;
            setCapacity(getCapacity() * 2);
            this.array = (T[]) new Object[getCapacity()];
            this.array = Arrays.copyOf(tempArray, getCapacity());
        }
        this.array[size()] = data;
    }

    // get(int index):verilen indisteki değeri döndürür.
    // Geçersiz indis girilerse null döndürür

    public T get(int index) {
        if (index > size() || index < 0) {
            return null;
        }
        return this.array[index];
    }

    // remove(int index): verilen indisteki veriyi silmeli ve silinen indis sonrasında ki verileri sol doğru kaydırmalı.
    // Geçersiz indis girilerse null döndürür.

    public T remove(int index) {
        if (size() < index || index < 0) {
            return null;
        }
        T[] temp = this.array;
        this.array[index] = null;
        for (int i = index; i < size(); i++) {
            if (size() - i == 1)
                this.array[i] = null;
            else
                this.array[i] = temp[i + 1];
        }
        return this.array[index];
    }

    // set(int index, T data) : verilen indisteki veriyi yenisi ile değiştirme işlemini yapmalıdır.
    // Geçersiz indis girilerse null döndürür.

    public T set(int index, T data) {
        if (size() < index || index < 0) {
            return null;
        }
        this.array[index] = data;
        return this.array[index];
    }

    // String toString() : Sınıfa ait dizideki elemanları listeleyen bir metot.

    @Override
    public String toString() {
        return "My list : " + Arrays.toString(array);
    }

    // int indexOf(T data) :Parametrede verilen nesnenin listedeki indeksini verir.
    // Nesne listede yoksa -1 değerini verir.


    public int indexOf(T data) {
        for (int i = 0; i < size(); i++) {
            if (this.array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    // int lastIndexOf(T data) :Belirtilen öğenin listedeki son indeksini söyler.
    // Nesne listede yoksa -1 değerini verir.

    public int lastIndexOf(T data) {
        for (int i = size(); i >= 0; i--) {
            if (this.array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    // boolean isEmpty() : Listenin boş olup olmadığını söyler.

    public boolean isEmpty() {
        return size() == 0;
    }

    // T[] toArray() : Listedeki öğeleri, aynı sırayla bir array haline getirir.

    public T[] toArray() {
        return this.array;
    }

    // clear() : Listedeki bütün öğeleri siler, boş liste haline getirir.

    public void clear() {
        for (int i = 0; i < this.size(); i++) {
            this.array[i] = null;
        }
    }

    // MyList<T> sublist(int start,int finish) : Parametrede verilen indeks aralığına ait bir liste döner.

    public MyList<T> subList(int start, int finish) {
        MyList<T> list = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            list.add(this.array[i]);
        }
        return list;
    }

    // boolean contains(T data) : Parametrede verilen değerin dizide olup olmadığını söyler.

    public boolean contains(T data) {
        for (int i = 0; i < size(); i++) {
            if (this.array[i] == data)
                return true;
        }
        return false;
    }
}
