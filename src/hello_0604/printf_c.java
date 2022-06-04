package hello_0604;

public class printf_c {
    //%d : 10진 저수의 형식으로 출력.
    //%x : 16진 정수의 형식으로 출력.
    //%f : 부동 소수점의 형식으로 출력. (소수점 아래 6자리까지 출력하며 그 아래 7자리 부터 반올림한다.)
    //%c : 문자(cahr)로 출력.
    //%s : 문자열(string)로 출력.

    //%e : 지수형태로 출력.
    //%g : 값을 간략하게 표현할때.

    public static void main(String[] args) {
        String url = "www.codechobo.com";

        String name = "JungSangRok";

        char alp = 'a';


        System.out.printf("%c%n", alp);
        System.out.printf("[%20s]%n", name);
        System.out.printf("%s%n", url);

    }
}
