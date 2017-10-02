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

public class IdlPortRefImpl extends ASTWrapperPsiElement implements IdlPortRef {

  public IdlPortRefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdlVisitor visitor) {
    visitor.visitPortRef(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdlVisitor) accept((IdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IdlPortDcl getPortDcl() {
    return findChildByClass(IdlPortDcl.class);
  }

  @Override
  @Nullable
  public IdlProvidesDcl getProvidesDcl() {
    return findChildByClass(IdlProvidesDcl.class);
  }

  @Override
  @Nullable
  public IdlUsesDcl getUsesDcl() {
    return findChildByClass(IdlUsesDcl.class);
  }

}
