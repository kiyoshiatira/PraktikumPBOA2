public class Data<T> {
    private T[] ruang;
    private int banyak;

    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    public void setIsi(int posisi, T objek) {
        if (posisi >= 1 && posisi <= 100) {
            if (ruang[posisi - 1] == null && objek != null) {
                banyak++;
            }
            else if (ruang[posisi - 1] != null && objek == null) {
                banyak--;
            }
            ruang[posisi - 1] = objek;
        } else {
            System.out.println("Posisi di luar batas.");
        }
    }

    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= 100) {
            return ruang[posisi - 1];
        } else {
            System.out.println("Posisi di luar batas.");
            return null;
        }
    }

    public int getSize() {
        return banyak;
    }
}
