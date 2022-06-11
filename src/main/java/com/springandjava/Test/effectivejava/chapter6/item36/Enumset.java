package com.springandjava.Test.effectivejava.chapter6.item36;

import java.util.EnumSet;
import java.util.Set;

public class Enumset {
    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

    public void applyStyles(Set<Style> styles){}

  //  EnumSet.of(Style.BOLD, Style.Italic)

}
