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

public class IdlEventAbsDefImpl extends ASTWrapperPsiElement implements IdlEventAbsDef {

  public IdlEventAbsDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdlVisitor visitor) {
    visitor.visitEventAbsDef(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdlVisitor) accept((IdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<IdlExport> getExportList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, IdlExport.class);
  }

  @Override
  @Nullable
  public IdlValueInheritanceSpec getValueInheritanceSpec() {
    return findChildByClass(IdlValueInheritanceSpec.class);
  }

}
