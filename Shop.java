import java.util.*;

public class Shop {

  private ArrayList<IStock> instruments;
  private String shopName;

  public Shop(String name){
    this.shopName = name;
    this.instruments = new ArrayList<IStock>();
  }

  public void addInstrument(IStock instrument) {
    this.instruments.add(instrument);
  }

  public ArrayList<IStock> getStock(){
    return this.instruments;
  }

  public static void main(String[] args){
    Shop shop1 = new Shop("Bob's music shop");

    Guitar g = new Guitar();
    Piano p = new Piano();

    shop1.addInstrument(g);
    shop1.addInstrument(p);

    for (int i=0; i<shop1.getStock().size(); i++ ) {
      System.out.println(shop1.getStock().get(i).play());
    }


  }

}
