// This is a generated file. Not intended for manual editing.
package com.bich.idl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface IdlPrimaryExpr extends PsiElement {

  @Nullable
  IdlConstExpr getConstExpr();

  @Nullable
  IdlLiteral getLiteral();

  @Nullable
  IdlScopedName getScopedName();

}
