// This is a generated file. Not intended for manual editing.
package com.bich.idl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface IdlAnnotationBody extends PsiElement {

  @NotNull
  List<IdlAnnotationMember> getAnnotationMemberList();

  @NotNull
  List<IdlConstDcl> getConstDclList();

  @NotNull
  List<IdlEnumDcl> getEnumDclList();

  @NotNull
  List<IdlTypedefDcl> getTypedefDclList();

}
