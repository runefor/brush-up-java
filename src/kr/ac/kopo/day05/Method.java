package kr.ac.kopo.day05;

// MethodMain02에서 호출되는 클래스임
public class Method {
    /**
     * 뭐 만든거임 ㅇㅇ
     */
    void call() {
        System.out.println("call() 호출함!!!!");
    }

    /**
     * 설명 추가하래
     * @param i
     */
    void call(int i){
        System.out.println("int");
    }
    void call(int i, char c){
        System.out.println("int, char");
    }
    void call(String str){
        System.out.println("String");
    }
    void call2(){
        System.out.println("---------------------");
        call("hi");
        System.out.println("---------------------");
    }
}
