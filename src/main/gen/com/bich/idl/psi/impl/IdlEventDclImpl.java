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

public class IdlEventDclImpl extends ASTWrapperPsiElement implements IdlEventDcl {

  public IdlEventDclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdlVisitor visitor) {
    visitor.visitEventDcl(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdlVisitor) accept((IdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IdlEventAbsDef getEventAbsDef() {
    return findChildByClass(IdlEventAbsDef.class);
  }

  @Override
  @Nullable
  public IdlEventDef getEventDef() {
    return findChildByClass(IdlEventDef.class);
  }

  @Override
  @Nullable
  public IdlEventForwardDcl getEventForwardDcl() {
    return findChildByClass(IdlEventForwardDcl.class);
  }

}