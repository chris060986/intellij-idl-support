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

public class IdlConnectorExportImpl extends ASTWrapperPsiElement implements IdlConnectorExport {

  public IdlConnectorExportImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdlVisitor visitor) {
    visitor.visitConnectorExport(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdlVisitor) accept((IdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IdlAttrDcl getAttrDcl() {
    return findChildByClass(IdlAttrDcl.class);
  }

  @Override
  @Nullable
  public IdlDefinition getDefinition() {
    return findChildByClass(IdlDefinition.class);
  }

  @Override
  @Nullable
  public IdlPortRef getPortRef() {
    return findChildByClass(IdlPortRef.class);
  }

  @Override
  @Nullable
  public IdlTemplateModuleInst getTemplateModuleInst() {
    return findChildByClass(IdlTemplateModuleInst.class);
  }

}
