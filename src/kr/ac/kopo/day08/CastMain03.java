package kr.ac.kopo.day08;

class 비비빅{
    String company = "빙그레";
    int price = 1400;
    double 전체무게;

}
class 비비빅01 extends 비비빅{
    double 팥중량;
    비비빅01(){
        팥중량 = 10;
        전체무게 = 100;
    }
}
class 비비빅02 extends 비비빅{
    double 팥중량;
    비비빅02(){
        팥중량 = 8;
        전체무게 = 90;
    }
}
class 비비빅공장{
    비비빅 make비비빅(){
        return new 비비빅02();
    }
}
public class CastMain03 {
    public static void main(String[] args) {
        비비빅공장 factory = new 비비빅공장();
        비비빅 ice = factory.make비비빅(); // 묵시적 형변환
        비비빅02 i = (비비빅02)ice;
        System.out.println(i.팥중량);
    }
}
