package hello_0604;

public class Ex6_9 {
    public static void main(String[] args) {
        
        //클래스 메서드 호풀. 인스턴스 생성없이 호출 가능.
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200L, 100L));



        //인스턴스 생성
        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;

        //인스턴스 메서드는 객체생성 후에만 호출이 가능.
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}
