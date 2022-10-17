package C10;

class Buyer {
    int myMoney;
    int appleCnt;

    void pay(Seller seller, int money) {
        myMoney = money;
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
        int cnt=money/price;
        appleCnt-=cnt;
        return cnt;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "saveMoney=" + saveMoney +
                ", appleCnt=" + appleCnt +
                ", price=" + price +
                '}';
    }

    public Seller(int saveMoney, int appleCnt, int price) {
        this.saveMoney = saveMoney;
        this.appleCnt = appleCnt;
        this.price = price;
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
