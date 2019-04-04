package otour.learn.springapp;

import org.junit.Test;
import org.mockito.Mockito;

public class BraveKnightTest {
    private static final int INVOCATIONS_TIMES = 1;

    @Test
    public void testKnightShouldEmbark() {
        Quest quest = Mockito.mock(Quest.class);
        BraveKnight knight = new BraveKnight(quest);
        int index = 0;
        while (index < INVOCATIONS_TIMES) {
            knight.embarkOnQuest();
        }
        Mockito.verify(quest, Mockito.times(INVOCATIONS_TIMES)).embark();
    }

}
