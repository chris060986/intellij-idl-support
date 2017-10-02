// This is a generated file. Not intended for manual editing.
package com.bich.idl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface IdlExceptionList extends PsiElement {

  @Nullable
  IdlConstDcl getConstDcl();

  @Nullable
  IdlDefinition getDefinition();

  @Nullable
  IdlExceptDcl getExceptDcl();

  @Nullable
  IdlExport getExport();

  @NotNull
  List<IdlScopedName> getScopedNameList();

}
