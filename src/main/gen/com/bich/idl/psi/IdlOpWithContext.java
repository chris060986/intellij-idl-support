// This is a generated file. Not intended for manual editing.
package com.bich.idl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface IdlOpWithContext extends PsiElement {

  @NotNull
  IdlContextExpr getContextExpr();

  @Nullable
  IdlOpDcl getOpDcl();

  @Nullable
  IdlOpOnewayDcl getOpOnewayDcl();

}
