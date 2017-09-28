package com.bich.idl.language;

import com.intellij.lang.Language;

public class IdlLanguage extends Language {

    public static final IdlLanguage INSTANCE = new IdlLanguage();
    private static final String LANGUAGE_ID = "Idl";

    public IdlLanguage() {
        super(LANGUAGE_ID );
    }
}
