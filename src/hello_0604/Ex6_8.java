package hello_0604;

public class Ex6_8 {

    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);

        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }


    static Data copy(Data d) {
        Data tmp = new Data();

        tmp.x = d.x;

        return tmp;
    }
}