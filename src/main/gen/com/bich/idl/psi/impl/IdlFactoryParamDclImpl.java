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

public class IdlFactoryParamDclImpl extends ASTWrapperPsiElement implements IdlFactoryParamDcl {

  public IdlFactoryParamDclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdlVisitor visitor) {
    visitor.visitFactoryParamDcl(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdlVisitor) accept((IdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public IdlDefinition getDefinition() {
    return findNotNullChildByClass(IdlDefinition.class);
  }

  @Override
  @NotNull
  public IdlSimpleDeclarator getSimpleDeclarator() {
    return findNotNullChildByClass(IdlSimpleDeclarator.class);
  }

  @Override
  @NotNull
  public IdlTypeSpec getTypeSpec() {
    return findNotNullChildByClass(IdlTypeSpec.class);
  }

}
