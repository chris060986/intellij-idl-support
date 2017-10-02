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

public class IdlSupportedInterfaceSpecImpl extends ASTWrapperPsiElement implements IdlSupportedInterfaceSpec {

  public IdlSupportedInterfaceSpecImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdlVisitor visitor) {
    visitor.visitSupportedInterfaceSpec(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdlVisitor) accept((IdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IdlComponentExport getComponentExport() {
    return findChildByClass(IdlComponentExport.class);
  }

  @Override
  @Nullable
  public IdlConsumesDcl getConsumesDcl() {
    return findChildByClass(IdlConsumesDcl.class);
  }

  @Override
  @Nullable
  public IdlInterfaceType getInterfaceType() {
    return findChildByClass(IdlInterfaceType.class);
  }

  @Override
  @Nullable
  public IdlPublishesDcl getPublishesDcl() {
    return findChildByClass(IdlPublishesDcl.class);
  }

  @Override
  @NotNull
  public List<IdlScopedName> getScopedNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, IdlScopedName.class);
  }

}
