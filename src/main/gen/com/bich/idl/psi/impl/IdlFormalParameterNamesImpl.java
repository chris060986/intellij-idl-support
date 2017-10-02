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

public class IdlFormalParameterNamesImpl extends ASTWrapperPsiElement implements IdlFormalParameterNames {

  public IdlFormalParameterNamesImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdlVisitor visitor) {
    visitor.visitFormalParameterNames(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdlVisitor) accept((IdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IdlBitmaskDcl getBitmaskDcl() {
    return findChildByClass(IdlBitmaskDcl.class);
  }

  @Override
  @Nullable
  public IdlOctetType getOctetType() {
    return findChildByClass(IdlOctetType.class);
  }

  @Override
  @Nullable
  public IdlStructDef getStructDef() {
    return findChildByClass(IdlStructDef.class);
  }

  @Override
  @Nullable
  public IdlSwitchTypeSpec getSwitchTypeSpec() {
    return findChildByClass(IdlSwitchTypeSpec.class);
  }

  @Override
  @Nullable
  public IdlTemplateTypeSpec getTemplateTypeSpec() {
    return findChildByClass(IdlTemplateTypeSpec.class);
  }

}
