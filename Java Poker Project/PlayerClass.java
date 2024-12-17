import java.util.ArrayList;
import java.util.List;

public class PlayerClass extends DeckClass {
   public void ThePlayers() {


            List<CardClass> Player1 = new ArrayList<>();{
                Player1.addAll(Deck.subList(0 ,7));
            }

            List<CardClass> Player2 = new ArrayList<>();{
                Player2.addAll(Deck.subList(8 ,15));
            }

            List<CardClass> Player3 = new ArrayList<>();{
                Player3.addAll(Deck.subList(16 ,23));
            }

            List<CardClass> Player4 = new ArrayList<>();{
                Player4.addAll(Deck.subList(24 ,31));
            }

            List<CardClass> Player5 = new ArrayList<>();{
                Player5.addAll(Deck.subList(32 ,39));
            }
    }
}
