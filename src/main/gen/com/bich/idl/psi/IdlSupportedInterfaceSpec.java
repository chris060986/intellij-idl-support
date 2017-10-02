// This is a generated file. Not intended for manual editing.
package com.bich.idl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface IdlSupportedInterfaceSpec extends PsiElement {

  @Nullable
  IdlComponentExport getComponentExport();

  @Nullable
  IdlConsumesDcl getConsumesDcl();

  @Nullable
  IdlInterfaceType getInterfaceType();

  @Nullable
  IdlPublishesDcl getPublishesDcl();

  @NotNull
  List<IdlScopedName> getScopedNameList();

}
