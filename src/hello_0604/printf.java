package hello_0604;

public class printf {
    //%d : 10진 저수의 형식으로 출력.
    //%x : 16진 정수의 형식으로 출력.
    //%f : 부동 소수점의 형식으로 출력. (소수점 아래 6자리까지 출력하며 그 아래 7자리 부터 반올림한다.)
    //%c : 문자(cahr)로 출력.
    //%s : 문자열(string)로 출력.

    //%e : 지수형태로 출력.
    //%g : 값을 간략하게 표현할때.

    public static void main(String[] args) {
        String url = "www.codechobo.com";

        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;

        double d = 1.23456789;

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
        System.out.printf("f2=%f, %em %g%n", f2, f2, f2);
        System.out.printf("f3=%f, %em %g%n", f3, f3, f3);

        System.out.printf("d=%f%n",         d);
        System.out.printf("d=%14.10f%n",    d);            //전체 소수점 14자리 중 10자리

        System.out.printf("[1854932584928439120]%n");

        System.out.printf("[%s]%n",     url);   //문자열의 길이만큼 출력공간을 확보
        System.out.printf("[%20s]%n",   url);   //최소 20글자 출력 공간 확보, 우측 정렬
        System.out.printf("[%-20s]%n",  url);   //최소 20글자 출력 공간 확보, 좌측 정렬
        System.out.printf("[%.8s]%n",   url);   //왼쪽에서 8글자만 출력

    }
}
