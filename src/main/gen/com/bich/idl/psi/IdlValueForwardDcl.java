// This is a generated file. Not intended for manual editing.
package com.bich.idl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface IdlValueForwardDcl extends PsiElement {

  @Nullable
  IdlDefinition getDefinition();

  @Nullable
  IdlExport getExport();

  @Nullable
  IdlImportDcl getImportDcl();

  @Nullable
  IdlOpOnewayDcl getOpOnewayDcl();

  @Nullable
  IdlOpWithContext getOpWithContext();

  @Nullable
  IdlTypePrefixDcl getTypePrefixDcl();

  @Nullable
  IdlValueKind getValueKind();

}
