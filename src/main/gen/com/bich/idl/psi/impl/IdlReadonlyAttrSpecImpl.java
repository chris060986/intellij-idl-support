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

public class IdlReadonlyAttrSpecImpl extends ASTWrapperPsiElement implements IdlReadonlyAttrSpec {

  public IdlReadonlyAttrSpecImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdlVisitor visitor) {
    visitor.visitReadonlyAttrSpec(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdlVisitor) accept((IdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public IdlReadonlyAttrDeclarator getReadonlyAttrDeclarator() {
    return findNotNullChildByClass(IdlReadonlyAttrDeclarator.class);
  }

  @Override
  @NotNull
  public IdlTypeSpec getTypeSpec() {
    return findNotNullChildByClass(IdlTypeSpec.class);
  }

}
