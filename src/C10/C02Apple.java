package C10;

class Buyer {
    int myMoney;
    int appleCnt;

//    void pay(누구 ? 얼마 ?) {
        //보유금액에 금액 차감
        //seller에 money전달 사과 개수 리턴받음
        //내 사과개수에 누적
//
//
//    }

    void pay(Seller seller, int money) {
        myMoney -= money;
        int cnt = seller.returnApple(money);
        appleCnt+=cnt;


    }
    public Buyer(int myMoney, int appleCnt) {
        this.myMoney = myMoney;
        this.appleCnt = appleCnt;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "myMoney=" + myMoney +
                ", appleCnt=" + appleCnt +
                '}';
    }
}

class Seller {
    int saveMoney;
    int appleCnt;
    int price;


    int returnApple(int money) {
        saveMoney = money;
        //보유금액에 금액 누적
        int cnt=money/price;
        //사과 개수 계산 후 보유개수에서 차감
        appleCnt-=cnt;
        //사과 개수 리턴
        return cnt;

    }
    public Seller(int saveMoney, int appleCnt, int price) {
        this.saveMoney = saveMoney;
        this.appleCnt = appleCnt;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "saveMoney=" + saveMoney +
                ", appleCnt=" + appleCnt +
                ", price=" + price +
                '}';
    }

}

public class C02Apple {
    public static void main(String[] args) {
        Seller seller = new Seller(10000,100,1000);
        Buyer buyer = new Buyer(5000,0);
        buyer.pay(seller,2000);
        System.out.println(seller);
        System.out.println(buyer);
    }
}
