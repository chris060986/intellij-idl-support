// This is a generated file. Not intended for manual editing.
package com.bich.idl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.bich.idl.psi.IdlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.bich.idl.psi.*;

public class IdlTemplateTypeSpecImpl extends ASTWrapperPsiElement implements IdlTemplateTypeSpec {

  public IdlTemplateTypeSpecImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdlVisitor visitor) {
    visitor.visitTemplateTypeSpec(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdlVisitor) accept((IdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IdlFixedPtType getFixedPtType() {
    return findChildByClass(IdlFixedPtType.class);
  }

  @Override
  @Nullable
  public IdlSequenceType getSequenceType() {
    return findChildByClass(IdlSequenceType.class);
  }

  @Override
  @Nullable
  public IdlStringType getStringType() {
    return findChildByClass(IdlStringType.class);
  }

  @Override
  @Nullable
  public IdlWideStringType getWideStringType() {
    return findChildByClass(IdlWideStringType.class);
  }

}
