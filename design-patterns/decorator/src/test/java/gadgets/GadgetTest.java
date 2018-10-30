package gadgets;

import com.designpatterns.gadgets.IronMan;
import org.junit.jupiter.api.Test;

public class GadgetTest {

    @Test
    public void addFlightGadget() {
        IronMan ironMan = new IronMan();
        ironMan.addGadget("flight");
        ironMan.addGadget("weapon");
        ironMan.addGadget("flight");
        ironMan.addGadget("weapon");
        ironMan.addGadget("flight");
        ironMan.addGadget("weapon");
        ironMan.addGadget("flight");
        ironMan.addGadget("weapon");
        ironMan.addGadget("flight");
        ironMan.addGadget("weapon");
        ironMan.addGadget("flight");
        ironMan.addGadget("weapon");
        ironMan.addGadget("flight");
        ironMan.addGadget("weapon");
        ironMan.showGadgets();
    }

}
