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

public class IdlAnnotationBodyImpl extends ASTWrapperPsiElement implements IdlAnnotationBody {

  public IdlAnnotationBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdlVisitor visitor) {
    visitor.visitAnnotationBody(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdlVisitor) accept((IdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<IdlAnnotationMember> getAnnotationMemberList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, IdlAnnotationMember.class);
  }

  @Override
  @NotNull
  public List<IdlConstDcl> getConstDclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, IdlConstDcl.class);
  }

  @Override
  @NotNull
  public List<IdlEnumDcl> getEnumDclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, IdlEnumDcl.class);
  }

  @Override
  @NotNull
  public List<IdlTypedefDcl> getTypedefDclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, IdlTypedefDcl.class);
  }

}
