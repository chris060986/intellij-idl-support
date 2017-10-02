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

public class IdlValueForwardDclImpl extends ASTWrapperPsiElement implements IdlValueForwardDcl {

  public IdlValueForwardDclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdlVisitor visitor) {
    visitor.visitValueForwardDcl(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdlVisitor) accept((IdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IdlDefinition getDefinition() {
    return findChildByClass(IdlDefinition.class);
  }

  @Override
  @Nullable
  public IdlExport getExport() {
    return findChildByClass(IdlExport.class);
  }

  @Override
  @Nullable
  public IdlImportDcl getImportDcl() {
    return findChildByClass(IdlImportDcl.class);
  }

  @Override
  @Nullable
  public IdlOpOnewayDcl getOpOnewayDcl() {
    return findChildByClass(IdlOpOnewayDcl.class);
  }

  @Override
  @Nullable
  public IdlOpWithContext getOpWithContext() {
    return findChildByClass(IdlOpWithContext.class);
  }

  @Override
  @Nullable
  public IdlTypePrefixDcl getTypePrefixDcl() {
    return findChildByClass(IdlTypePrefixDcl.class);
  }

  @Override
  @Nullable
  public IdlValueKind getValueKind() {
    return findChildByClass(IdlValueKind.class);
  }

}
