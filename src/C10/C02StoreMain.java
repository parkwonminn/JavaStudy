package C10;

class Customer {
    int myMoney;
    int colaCount;

    void pay(Store store, int money) {
        //1내보유금액에서 money 차감
        myMoney = money;
        //2지정된 store 에 money 를 전달
        int cnt=store.returnCola(money);
        //3 콜라 개수를 누적
        colaCount+=cnt;

    }

    public Customer(int myMoney, int colaCount) {
        this.myMoney = myMoney;
        this.colaCount = colaCount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "myMoney=" + myMoney +
                ", colaCount=" + colaCount +
                '}';

    }
}
class Store  {
    int saveMoney;
    int colaCnt;
    int price;

    int returnCola(int money) {
        saveMoney = +money;
        int cnt=money/price;
        colaCnt-=cnt;
        return cnt;
    }

    @Override
    public String toString() {
        return "Store{" +
                "saveMoney=" + saveMoney +
                ", colaCnt=" + colaCnt +
                ", price=" + price +
                '}';
    }

    public Store(int saveMoney, int colaCnt, int price) {
        this.saveMoney = saveMoney;
        this.colaCnt = colaCnt;
        this.price = price;
    }
}

public class C02StoreMain {
    public static void main(String[] args) {
        //고객 객체
        Customer hong = new Customer(10000,0);
        Customer jung = new Customer(20000, 0);
        //편의점 객체
        Store Gs감삼 = new Store(10000,100,1000); //보유 금액, 클라개수, 콜라가격
        Store Gs반월 = new Store(10000,100,1000); //보유 금액, 클라개수, 콜라가격
        //구매하기
        hong.pay(Gs감삼, 2000);
        jung.pay(Gs반월,3000);
        //확인
        System.out.println("----------고객 정보 확인 ---------------");
        System.out.println(hong);
        System.out.println(jung);
        System.out.println("----------편의점 정보 확인 --------------");
        System.out.println(Gs감삼);
        System.out.println(Gs반월);
    }
}
