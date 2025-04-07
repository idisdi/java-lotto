package Lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class Lottos {

    private void purchaseLottos(int qty) {
        for(int i = 0; i < qty; i++) {
            Lotto lotto = new Lotto();
            lottos.add(lotto);
        }
    }
}
