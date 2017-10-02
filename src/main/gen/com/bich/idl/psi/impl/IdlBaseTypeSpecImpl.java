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

public class IdlBaseTypeSpecImpl extends ASTWrapperPsiElement implements IdlBaseTypeSpec {

  public IdlBaseTypeSpecImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdlVisitor visitor) {
    visitor.visitBaseTypeSpec(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdlVisitor) accept((IdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IdlBooleanType getBooleanType() {
    return findChildByClass(IdlBooleanType.class);
  }

  @Override
  @Nullable
  public IdlCharType getCharType() {
    return findChildByClass(IdlCharType.class);
  }

  @Override
  @Nullable
  public IdlFloatingPtType getFloatingPtType() {
    return findChildByClass(IdlFloatingPtType.class);
  }

  @Override
  @Nullable
  public IdlIntegerType getIntegerType() {
    return findChildByClass(IdlIntegerType.class);
  }

  @Override
  @Nullable
  public IdlOctetType getOctetType() {
    return findChildByClass(IdlOctetType.class);
  }

  @Override
  @Nullable
  public IdlWideCharType getWideCharType() {
    return findChildByClass(IdlWideCharType.class);
  }

}
