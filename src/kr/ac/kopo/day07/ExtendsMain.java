package kr.ac.kopo.day07;

class One {
    One(){
        System.out.println("1");
    }
}

class Two extends One{
    Two(){
        System.out.println("2");
        }
}

class Three extends Two{
    Three(){
        System.out.println("3");
    }
}
public class ExtendsMain {
    /**
     * 부모의 공간이 만들어지고, 자식의 공간이 만들어진다.
     * 그래서 1이 찍히고 2가 찍힌다.
     * 부모의 것들을 공유하는 것은 아니다 독립적으로 만들어지게 되지만
     * 자식이 만들어질 때 부모도 함께 만들어져서 같이 사용을 할 수 있는 것이다.
     * @param args
     */
    public static void main(String[] args) {
        //new One();
        //new Two();
        new Three();
    }
}
