package com.bich.idl.file;

import com.bich.idl.file.icons.IdlIcons;
import com.bich.idl.language.IdlLanguage;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class IdlFileType extends LanguageFileType {

    public static final IdlFileType INSTANCE = new IdlFileType();

    private IdlFileType() {
        super(IdlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "idl";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "idl file type, defined in http://www.omg.org/spec/IDL/4.1/";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "idl";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return IdlIcons.DEFAULT_ICON;
    }
}
