package org.example.models.charackter;

import org.example.interfaces.Action;
import org.example.models.actions.SilenceAction;

public class Misa extends AbsCharacter {
    public static String stcName = "Миса";

    public Misa() {
        super("Миса");
    }

    public Action respond = new SilenceAction(stcName);

}
