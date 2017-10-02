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

public class IdlSignedIntImpl extends ASTWrapperPsiElement implements IdlSignedInt {

  public IdlSignedIntImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdlVisitor visitor) {
    visitor.visitSignedInt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdlVisitor) accept((IdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IdlSignedLongInt getSignedLongInt() {
    return findChildByClass(IdlSignedLongInt.class);
  }

  @Override
  @Nullable
  public IdlSignedLonglongInt getSignedLonglongInt() {
    return findChildByClass(IdlSignedLonglongInt.class);
  }

  @Override
  @Nullable
  public IdlSignedShortInt getSignedShortInt() {
    return findChildByClass(IdlSignedShortInt.class);
  }

}
