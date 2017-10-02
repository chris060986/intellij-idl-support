package com.bich.idl.psi;

import com.bich.idl.language.IdlLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;

import javax.annotation.Nonnull;

public class IdlElementType extends IElementType {

    public IdlElementType(@Nonnull @NonNls String debugName){
        super(debugName, IdlLanguage.INSTANCE);
    }

}
