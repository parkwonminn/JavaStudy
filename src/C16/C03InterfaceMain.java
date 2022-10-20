package C16;

interface C03Remocon
{
    //필드(final static)
    int MAX_VOLUMN=10;
    int MIN_VOLUMN=0;
    //기능(추상메서드)
    void turnOn();
    void turnOff();
    void setVolumn(int vol);
}
class C03TV implements C03Remocon
{
    int vol;
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
    @Override
    public void setVolumn(int vol) {
        if(MAX_VOLUMN<=vol) {
            this.vol=MAX_VOLUMN;
        }else if(MIN_VOLUMN>=vol) {
            this.vol=MIN_VOLUMN;
        }else {
            this.vol=vol;
        }
        System.out.println("현재 TV Volumn : " + this.vol);
    }

}
class C03Radio implements C03Remocon
{
    int vol;
    @Override
    public void turnOn() {
        System.out.println("라디오를 켭니다.");
    }
    @Override
    public void turnOff() {
        System.out.println("라디오를 끕니다.");
    }
    @Override
    public void setVolumn(int vol) {
        if(MAX_VOLUMN<=vol) {
            this.vol=MAX_VOLUMN;
        }else if(MIN_VOLUMN>=vol) {
            this.vol=MIN_VOLUMN;
        }else {
            this.vol=vol;
        }
        System.out.println("현재 Radio Volumn : " + this.vol);
    }
}

//다중상속 코드 추가
interface SearchURL {
    void Search(String url);


    public class C03InterfaceMain {

        public static void TurnOn(C03Remocon controller) {
            controller.turnOn();
        }

        public static void TurnOff(C03Remocon controller) {
            controller.turnOff();
        }

        public static void SetVol(C03Remocon controller, int num) {
            controller.setVolumn(num);
        }

        public static void Search(SearchURL product, String url) {
            product.Search(url);
        }

        public static void main(String[] args) {
        }


    }
}
