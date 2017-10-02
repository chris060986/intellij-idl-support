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

public class IdlTypeDeclaratorImpl extends ASTWrapperPsiElement implements IdlTypeDeclarator {

  public IdlTypeDeclaratorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdlVisitor visitor) {
    visitor.visitTypeDeclarator(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdlVisitor) accept((IdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public IdlAnyDeclarators getAnyDeclarators() {
    return findNotNullChildByClass(IdlAnyDeclarators.class);
  }

  @Override
  @Nullable
  public IdlConstrTypeDcl getConstrTypeDcl() {
    return findChildByClass(IdlConstrTypeDcl.class);
  }

  @Override
  @Nullable
  public IdlSimpleTypeSpec getSimpleTypeSpec() {
    return findChildByClass(IdlSimpleTypeSpec.class);
  }

  @Override
  @Nullable
  public IdlTemplateTypeSpec getTemplateTypeSpec() {
    return findChildByClass(IdlTemplateTypeSpec.class);
  }

}
