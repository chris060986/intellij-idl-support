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

public class IdlAttrDclImpl extends ASTWrapperPsiElement implements IdlAttrDcl {

  public IdlAttrDclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdlVisitor visitor) {
    visitor.visitAttrDcl(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdlVisitor) accept((IdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IdlAttrSpec getAttrSpec() {
    return findChildByClass(IdlAttrSpec.class);
  }

  @Override
  @Nullable
  public IdlReadonlyAttrSpec getReadonlyAttrSpec() {
    return findChildByClass(IdlReadonlyAttrSpec.class);
  }

}
