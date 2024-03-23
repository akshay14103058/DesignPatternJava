package main.Behavioral.Observer;

public class BitCoinTracker extends Producer implements BitcoinManager{
    BitCoin b = new BitCoin();

    @Override
    public BitCoin getBitcoin() {
        return this.b ;
    }
    public void setPrice(Double value){
        b.setPrice(value);
        notifyChange();
    }
}
