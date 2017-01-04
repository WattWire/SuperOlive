package net.wattwire.model;

/**
 * Created by dave on 1/3/17.
 */
public enum SimpStatus {
    //* Calls constructor (below) with values in parens:

    ITSUCKS(-50,"It really does suck."),
    OK(0,"Just okay."),
    GOOD(20,"Good, but not content."),
    GREAT(90,"Great? We must not be awake.");

    int slevel;
    String stext;

    public int getSlevel() {
        return slevel;
    }

    public String getStext() {
        return stext;
    }

    SimpStatus(int slevel, String stext) {
        this.slevel = slevel;
        this.stext = stext;

    }
}
