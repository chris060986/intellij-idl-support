// This is a generated file. Not intended for manual editing.
package com.bich.idl.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.bich.idl.psi.impl.*;

public interface IdlTypes {

  IElementType ADD_EXPR = new IdlElementType("ADD_EXPR");
  IElementType AND_EXPR = new IdlElementType("AND_EXPR");
  IElementType ANY_DECLARATOR = new IdlElementType("ANY_DECLARATOR");
  IElementType ANY_DECLARATORS = new IdlElementType("ANY_DECLARATORS");
  IElementType ARRAY_DECLARATOR = new IdlElementType("ARRAY_DECLARATOR");
  IElementType BASE_TYPE_SPEC = new IdlElementType("BASE_TYPE_SPEC");
  IElementType BOOLEAN_LITERAL = new IdlElementType("BOOLEAN_LITERAL");
  IElementType BOOLEAN_TYPE = new IdlElementType("BOOLEAN_TYPE");
  IElementType CASE = new IdlElementType("CASE");
  IElementType CASE_LABEL = new IdlElementType("CASE_LABEL");
  IElementType CHAR_TYPE = new IdlElementType("CHAR_TYPE");
  IElementType CONSTR_TYPE_DCL = new IdlElementType("CONSTR_TYPE_DCL");
  IElementType CONST_DCL = new IdlElementType("CONST_DCL");
  IElementType CONST_EXPR = new IdlElementType("CONST_EXPR");
  IElementType CONST_TYPE = new IdlElementType("CONST_TYPE");
  IElementType DECLARATOR = new IdlElementType("DECLARATOR");
  IElementType DECLARATORS = new IdlElementType("DECLARATORS");
  IElementType DEFINITION = new IdlElementType("DEFINITION");
  IElementType ELEMENT_SPEC = new IdlElementType("ELEMENT_SPEC");
  IElementType ENUMERATOR = new IdlElementType("ENUMERATOR");
  IElementType ENUM_DCL = new IdlElementType("ENUM_DCL");
  IElementType FIXED_ARRAY_SIZE = new IdlElementType("FIXED_ARRAY_SIZE");
  IElementType FIXED_PT_CONST_TYPE = new IdlElementType("FIXED_PT_CONST_TYPE");
  IElementType FIXED_PT_TYPE = new IdlElementType("FIXED_PT_TYPE");
  IElementType FLOATING_PT_TYPE = new IdlElementType("FLOATING_PT_TYPE");
  IElementType INTEGER_TYPE = new IdlElementType("INTEGER_TYPE");
  IElementType LITERAL = new IdlElementType("LITERAL");
  IElementType MEMBER = new IdlElementType("MEMBER");
  IElementType MODULE_DCL = new IdlElementType("MODULE_DCL");
  IElementType MULT_EXPR = new IdlElementType("MULT_EXPR");
  IElementType NATIVE_DCL = new IdlElementType("NATIVE_DCL");
  IElementType OCTET_TYPE = new IdlElementType("OCTET_TYPE");
  IElementType OR_EXPR = new IdlElementType("OR_EXPR");
  IElementType POSITIVE_INT_CONST = new IdlElementType("POSITIVE_INT_CONST");
  IElementType PRIMARY_EXPR = new IdlElementType("PRIMARY_EXPR");
  IElementType SCOPED_NAME = new IdlElementType("SCOPED_NAME");
  IElementType SEQUENCE_TYPE = new IdlElementType("SEQUENCE_TYPE");
  IElementType SHIFT_EXPR = new IdlElementType("SHIFT_EXPR");
  IElementType SIGNED_INT = new IdlElementType("SIGNED_INT");
  IElementType SIGNED_LONGLONG_INT = new IdlElementType("SIGNED_LONGLONG_INT");
  IElementType SIGNED_LONG_INT = new IdlElementType("SIGNED_LONG_INT");
  IElementType SIGNED_SHORT_INT = new IdlElementType("SIGNED_SHORT_INT");
  IElementType SIMPLE_DECLARATOR = new IdlElementType("SIMPLE_DECLARATOR");
  IElementType SIMPLE_TYPE_SPEC = new IdlElementType("SIMPLE_TYPE_SPEC");
  IElementType STRING_TYPE = new IdlElementType("STRING_TYPE");
  IElementType STRUCT_DCL = new IdlElementType("STRUCT_DCL");
  IElementType STRUCT_DEF = new IdlElementType("STRUCT_DEF");
  IElementType STRUCT_FORWARD_DCL = new IdlElementType("STRUCT_FORWARD_DCL");
  IElementType SWITCH_BODY = new IdlElementType("SWITCH_BODY");
  IElementType SWITCH_TYPE_SPEC = new IdlElementType("SWITCH_TYPE_SPEC");
  IElementType TEMPLATE_TYPE_SPEC = new IdlElementType("TEMPLATE_TYPE_SPEC");
  IElementType TYPEDEF_DCL = new IdlElementType("TYPEDEF_DCL");
  IElementType TYPE_DCL = new IdlElementType("TYPE_DCL");
  IElementType TYPE_DECLARATOR = new IdlElementType("TYPE_DECLARATOR");
  IElementType TYPE_SPEC = new IdlElementType("TYPE_SPEC");
  IElementType UNARY_EXPR = new IdlElementType("UNARY_EXPR");
  IElementType UNARY_OPERATOR = new IdlElementType("UNARY_OPERATOR");
  IElementType UNION_DCL = new IdlElementType("UNION_DCL");
  IElementType UNION_DEF = new IdlElementType("UNION_DEF");
  IElementType UNION_FORWARD_DCL = new IdlElementType("UNION_FORWARD_DCL");
  IElementType UNSIGNED_INT = new IdlElementType("UNSIGNED_INT");
  IElementType UNSIGNED_LONGLONG_INT = new IdlElementType("UNSIGNED_LONGLONG_INT");
  IElementType UNSIGNED_LONG_INT = new IdlElementType("UNSIGNED_LONG_INT");
  IElementType UNSIGNED_SHORT_INT = new IdlElementType("UNSIGNED_SHORT_INT");
  IElementType WIDE_CHAR_TYPE = new IdlElementType("WIDE_CHAR_TYPE");
  IElementType WIDE_STRING_TYPE = new IdlElementType("WIDE_STRING_TYPE");
  IElementType XOR_EXPR = new IdlElementType("XOR_EXPR");

  IElementType _CHARACTER_LITERAL_ = new IdlTokenType("<character_literal>");
  IElementType _FIXED_PT_LITERAL_ = new IdlTokenType("<fixed_pt_literal>");
  IElementType _FLOATING_PT_LITERAL_ = new IdlTokenType("<floating_pt_literal>");
  IElementType _IDENTIFIER_ = new IdlTokenType("<identifier>");
  IElementType _INTEGER_LITERAL_ = new IdlTokenType("<integer_literal>");
  IElementType _PRIMARY_EXPR_ = new IdlTokenType("<primary_expr>");
  IElementType _STRING_LITERAL_ = new IdlTokenType("<string_literal>");
  IElementType _UNARY_OPERATOR_ = new IdlTokenType("<unary_operator>");
  IElementType _WIDE_CHARACTER_LITERAL_ = new IdlTokenType("<wide_character_literal>");
  IElementType _WIDE_STRING_LITERAL_ = new IdlTokenType("<wide_string_literal>");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ADD_EXPR) {
        return new IdlAddExprImpl(node);
      }
      else if (type == AND_EXPR) {
        return new IdlAndExprImpl(node);
      }
      else if (type == ANY_DECLARATOR) {
        return new IdlAnyDeclaratorImpl(node);
      }
      else if (type == ANY_DECLARATORS) {
        return new IdlAnyDeclaratorsImpl(node);
      }
      else if (type == ARRAY_DECLARATOR) {
        return new IdlArrayDeclaratorImpl(node);
      }
      else if (type == BASE_TYPE_SPEC) {
        return new IdlBaseTypeSpecImpl(node);
      }
      else if (type == BOOLEAN_LITERAL) {
        return new IdlBooleanLiteralImpl(node);
      }
      else if (type == BOOLEAN_TYPE) {
        return new IdlBooleanTypeImpl(node);
      }
      else if (type == CASE) {
        return new IdlCaseImpl(node);
      }
      else if (type == CASE_LABEL) {
        return new IdlCaseLabelImpl(node);
      }
      else if (type == CHAR_TYPE) {
        return new IdlCharTypeImpl(node);
      }
      else if (type == CONSTR_TYPE_DCL) {
        return new IdlConstrTypeDclImpl(node);
      }
      else if (type == CONST_DCL) {
        return new IdlConstDclImpl(node);
      }
      else if (type == CONST_EXPR) {
        return new IdlConstExprImpl(node);
      }
      else if (type == CONST_TYPE) {
        return new IdlConstTypeImpl(node);
      }
      else if (type == DECLARATOR) {
        return new IdlDeclaratorImpl(node);
      }
      else if (type == DECLARATORS) {
        return new IdlDeclaratorsImpl(node);
      }
      else if (type == DEFINITION) {
        return new IdlDefinitionImpl(node);
      }
      else if (type == ELEMENT_SPEC) {
        return new IdlElementSpecImpl(node);
      }
      else if (type == ENUMERATOR) {
        return new IdlEnumeratorImpl(node);
      }
      else if (type == ENUM_DCL) {
        return new IdlEnumDclImpl(node);
      }
      else if (type == FIXED_ARRAY_SIZE) {
        return new IdlFixedArraySizeImpl(node);
      }
      else if (type == FIXED_PT_CONST_TYPE) {
        return new IdlFixedPtConstTypeImpl(node);
      }
      else if (type == FIXED_PT_TYPE) {
        return new IdlFixedPtTypeImpl(node);
      }
      else if (type == FLOATING_PT_TYPE) {
        return new IdlFloatingPtTypeImpl(node);
      }
      else if (type == INTEGER_TYPE) {
        return new IdlIntegerTypeImpl(node);
      }
      else if (type == LITERAL) {
        return new IdlLiteralImpl(node);
      }
      else if (type == MEMBER) {
        return new IdlMemberImpl(node);
      }
      else if (type == MODULE_DCL) {
        return new IdlModuleDclImpl(node);
      }
      else if (type == MULT_EXPR) {
        return new IdlMultExprImpl(node);
      }
      else if (type == NATIVE_DCL) {
        return new IdlNativeDclImpl(node);
      }
      else if (type == OCTET_TYPE) {
        return new IdlOctetTypeImpl(node);
      }
      else if (type == OR_EXPR) {
        return new IdlOrExprImpl(node);
      }
      else if (type == POSITIVE_INT_CONST) {
        return new IdlPositiveIntConstImpl(node);
      }
      else if (type == PRIMARY_EXPR) {
        return new IdlPrimaryExprImpl(node);
      }
      else if (type == SCOPED_NAME) {
        return new IdlScopedNameImpl(node);
      }
      else if (type == SEQUENCE_TYPE) {
        return new IdlSequenceTypeImpl(node);
      }
      else if (type == SHIFT_EXPR) {
        return new IdlShiftExprImpl(node);
      }
      else if (type == SIGNED_INT) {
        return new IdlSignedIntImpl(node);
      }
      else if (type == SIGNED_LONGLONG_INT) {
        return new IdlSignedLonglongIntImpl(node);
      }
      else if (type == SIGNED_LONG_INT) {
        return new IdlSignedLongIntImpl(node);
      }
      else if (type == SIGNED_SHORT_INT) {
        return new IdlSignedShortIntImpl(node);
      }
      else if (type == SIMPLE_DECLARATOR) {
        return new IdlSimpleDeclaratorImpl(node);
      }
      else if (type == SIMPLE_TYPE_SPEC) {
        return new IdlSimpleTypeSpecImpl(node);
      }
      else if (type == STRING_TYPE) {
        return new IdlStringTypeImpl(node);
      }
      else if (type == STRUCT_DCL) {
        return new IdlStructDclImpl(node);
      }
      else if (type == STRUCT_DEF) {
        return new IdlStructDefImpl(node);
      }
      else if (type == STRUCT_FORWARD_DCL) {
        return new IdlStructForwardDclImpl(node);
      }
      else if (type == SWITCH_BODY) {
        return new IdlSwitchBodyImpl(node);
      }
      else if (type == SWITCH_TYPE_SPEC) {
        return new IdlSwitchTypeSpecImpl(node);
      }
      else if (type == TEMPLATE_TYPE_SPEC) {
        return new IdlTemplateTypeSpecImpl(node);
      }
      else if (type == TYPEDEF_DCL) {
        return new IdlTypedefDclImpl(node);
      }
      else if (type == TYPE_DCL) {
        return new IdlTypeDclImpl(node);
      }
      else if (type == TYPE_DECLARATOR) {
        return new IdlTypeDeclaratorImpl(node);
      }
      else if (type == TYPE_SPEC) {
        return new IdlTypeSpecImpl(node);
      }
      else if (type == UNARY_EXPR) {
        return new IdlUnaryExprImpl(node);
      }
      else if (type == UNARY_OPERATOR) {
        return new IdlUnaryOperatorImpl(node);
      }
      else if (type == UNION_DCL) {
        return new IdlUnionDclImpl(node);
      }
      else if (type == UNION_DEF) {
        return new IdlUnionDefImpl(node);
      }
      else if (type == UNION_FORWARD_DCL) {
        return new IdlUnionForwardDclImpl(node);
      }
      else if (type == UNSIGNED_INT) {
        return new IdlUnsignedIntImpl(node);
      }
      else if (type == UNSIGNED_LONGLONG_INT) {
        return new IdlUnsignedLonglongIntImpl(node);
      }
      else if (type == UNSIGNED_LONG_INT) {
        return new IdlUnsignedLongIntImpl(node);
      }
      else if (type == UNSIGNED_SHORT_INT) {
        return new IdlUnsignedShortIntImpl(node);
      }
      else if (type == WIDE_CHAR_TYPE) {
        return new IdlWideCharTypeImpl(node);
      }
      else if (type == WIDE_STRING_TYPE) {
        return new IdlWideStringTypeImpl(node);
      }
      else if (type == XOR_EXPR) {
        return new IdlXorExprImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
