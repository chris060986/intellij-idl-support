// This is a generated file. Not intended for manual editing.
package com.bich.idl.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.bich.idl.psi.impl.*;

public interface IdlTypes {

  IElementType ACTUAL_PARAMETER = new IdlElementType("ACTUAL_PARAMETER");
  IElementType ACTUAL_PARAMETERS = new IdlElementType("ACTUAL_PARAMETERS");
  IElementType ADD_EXPR = new IdlElementType("ADD_EXPR");
  IElementType AND_EXPR = new IdlElementType("AND_EXPR");
  IElementType ANNOTATION_APPL = new IdlElementType("ANNOTATION_APPL");
  IElementType ANNOTATION_APPL_PARAM = new IdlElementType("ANNOTATION_APPL_PARAM");
  IElementType ANNOTATION_APPL_PARAMS = new IdlElementType("ANNOTATION_APPL_PARAMS");
  IElementType ANNOTATION_BODY = new IdlElementType("ANNOTATION_BODY");
  IElementType ANNOTATION_DCL = new IdlElementType("ANNOTATION_DCL");
  IElementType ANNOTATION_HEADER = new IdlElementType("ANNOTATION_HEADER");
  IElementType ANNOTATION_MEMBER = new IdlElementType("ANNOTATION_MEMBER");
  IElementType ANNOTATION_MEMBER_TYPE = new IdlElementType("ANNOTATION_MEMBER_TYPE");
  IElementType ANY_CONST_TYPE = new IdlElementType("ANY_CONST_TYPE");
  IElementType ANY_DECLARATOR = new IdlElementType("ANY_DECLARATOR");
  IElementType ANY_DECLARATORS = new IdlElementType("ANY_DECLARATORS");
  IElementType ANY_TYPE = new IdlElementType("ANY_TYPE");
  IElementType ARRAY_DECLARATOR = new IdlElementType("ARRAY_DECLARATOR");
  IElementType ATTR_DCL = new IdlElementType("ATTR_DCL");
  IElementType ATTR_DECLARATOR = new IdlElementType("ATTR_DECLARATOR");
  IElementType ATTR_RAISES_EXPR = new IdlElementType("ATTR_RAISES_EXPR");
  IElementType ATTR_SPEC = new IdlElementType("ATTR_SPEC");
  IElementType BASE_TYPE_SPEC = new IdlElementType("BASE_TYPE_SPEC");
  IElementType BITFIELD = new IdlElementType("BITFIELD");
  IElementType BITFIELD_SPEC = new IdlElementType("BITFIELD_SPEC");
  IElementType BITMASK_DCL = new IdlElementType("BITMASK_DCL");
  IElementType BITSET_DCL = new IdlElementType("BITSET_DCL");
  IElementType BIT_VALUE = new IdlElementType("BIT_VALUE");
  IElementType BOOLEAN_LITERAL = new IdlElementType("BOOLEAN_LITERAL");
  IElementType BOOLEAN_TYPE = new IdlElementType("BOOLEAN_TYPE");
  IElementType CASE = new IdlElementType("CASE");
  IElementType CASE_LABEL = new IdlElementType("CASE_LABEL");
  IElementType CHAR_TYPE = new IdlElementType("CHAR_TYPE");
  IElementType COMPONENT_BODY = new IdlElementType("COMPONENT_BODY");
  IElementType COMPONENT_DCL = new IdlElementType("COMPONENT_DCL");
  IElementType COMPONENT_DEF = new IdlElementType("COMPONENT_DEF");
  IElementType COMPONENT_EXPORT = new IdlElementType("COMPONENT_EXPORT");
  IElementType COMPONENT_FORWARD_DCL = new IdlElementType("COMPONENT_FORWARD_DCL");
  IElementType COMPONENT_HEADER = new IdlElementType("COMPONENT_HEADER");
  IElementType COMPONENT_INHERITANCE_SPEC = new IdlElementType("COMPONENT_INHERITANCE_SPEC");
  IElementType CONNECTOR_DCL = new IdlElementType("CONNECTOR_DCL");
  IElementType CONNECTOR_EXPORT = new IdlElementType("CONNECTOR_EXPORT");
  IElementType CONNECTOR_HEADER = new IdlElementType("CONNECTOR_HEADER");
  IElementType CONNECTOR_INHERIT_SPEC = new IdlElementType("CONNECTOR_INHERIT_SPEC");
  IElementType CONSTR_TYPE_DCL = new IdlElementType("CONSTR_TYPE_DCL");
  IElementType CONST_DCL = new IdlElementType("CONST_DCL");
  IElementType CONST_EXPR = new IdlElementType("CONST_EXPR");
  IElementType CONST_TYPE = new IdlElementType("CONST_TYPE");
  IElementType CONSUMES_DCL = new IdlElementType("CONSUMES_DCL");
  IElementType CONTEXT_EXPR = new IdlElementType("CONTEXT_EXPR");
  IElementType DECLARATOR = new IdlElementType("DECLARATOR");
  IElementType DECLARATORS = new IdlElementType("DECLARATORS");
  IElementType DEFINITION = new IdlElementType("DEFINITION");
  IElementType DESTINATION_TYPE = new IdlElementType("DESTINATION_TYPE");
  IElementType ELEMENT_SPEC = new IdlElementType("ELEMENT_SPEC");
  IElementType EMITS_DCL = new IdlElementType("EMITS_DCL");
  IElementType ENUMERATOR = new IdlElementType("ENUMERATOR");
  IElementType ENUM_DCL = new IdlElementType("ENUM_DCL");
  IElementType EVENT_ABS_DEF = new IdlElementType("EVENT_ABS_DEF");
  IElementType EVENT_DCL = new IdlElementType("EVENT_DCL");
  IElementType EVENT_DEF = new IdlElementType("EVENT_DEF");
  IElementType EVENT_FORWARD_DCL = new IdlElementType("EVENT_FORWARD_DCL");
  IElementType EVENT_HEADER = new IdlElementType("EVENT_HEADER");
  IElementType EXCEPTION_LIST = new IdlElementType("EXCEPTION_LIST");
  IElementType EXCEPT_DCL = new IdlElementType("EXCEPT_DCL");
  IElementType EXPORT = new IdlElementType("EXPORT");
  IElementType FACTORY_DCL = new IdlElementType("FACTORY_DCL");
  IElementType FACTORY_PARAM_DCL = new IdlElementType("FACTORY_PARAM_DCL");
  IElementType FACTORY_PARAM_DCLS = new IdlElementType("FACTORY_PARAM_DCLS");
  IElementType FINDER_DCL = new IdlElementType("FINDER_DCL");
  IElementType FIXED_ARRAY_SIZE = new IdlElementType("FIXED_ARRAY_SIZE");
  IElementType FIXED_PT_CONST_TYPE = new IdlElementType("FIXED_PT_CONST_TYPE");
  IElementType FIXED_PT_TYPE = new IdlElementType("FIXED_PT_TYPE");
  IElementType FLOATING_PT_TYPE = new IdlElementType("FLOATING_PT_TYPE");
  IElementType FORMAL_PARAMETER = new IdlElementType("FORMAL_PARAMETER");
  IElementType FORMAL_PARAMETERS = new IdlElementType("FORMAL_PARAMETERS");
  IElementType FORMAL_PARAMETER_NAMES = new IdlElementType("FORMAL_PARAMETER_NAMES");
  IElementType FORMAL_PARAMETER_TYPE = new IdlElementType("FORMAL_PARAMETER_TYPE");
  IElementType GET_EXCEP_EXPR = new IdlElementType("GET_EXCEP_EXPR");
  IElementType HOME_BODY = new IdlElementType("HOME_BODY");
  IElementType HOME_DCL = new IdlElementType("HOME_DCL");
  IElementType HOME_EXPORT = new IdlElementType("HOME_EXPORT");
  IElementType HOME_HEADER = new IdlElementType("HOME_HEADER");
  IElementType HOME_INHERITANCE_SPEC = new IdlElementType("HOME_INHERITANCE_SPEC");
  IElementType IMPORTED_SCOPE = new IdlElementType("IMPORTED_SCOPE");
  IElementType IMPORT_DCL = new IdlElementType("IMPORT_DCL");
  IElementType INIT_DCL = new IdlElementType("INIT_DCL");
  IElementType INIT_PARAM_DCL = new IdlElementType("INIT_PARAM_DCL");
  IElementType INIT_PARAM_DCLS = new IdlElementType("INIT_PARAM_DCLS");
  IElementType INTEGER_TYPE = new IdlElementType("INTEGER_TYPE");
  IElementType INTERFACE_BODY = new IdlElementType("INTERFACE_BODY");
  IElementType INTERFACE_DCL = new IdlElementType("INTERFACE_DCL");
  IElementType INTERFACE_DEF = new IdlElementType("INTERFACE_DEF");
  IElementType INTERFACE_FORWARD_DCL = new IdlElementType("INTERFACE_FORWARD_DCL");
  IElementType INTERFACE_HEADER = new IdlElementType("INTERFACE_HEADER");
  IElementType INTERFACE_INHERITANCE_SPEC = new IdlElementType("INTERFACE_INHERITANCE_SPEC");
  IElementType INTERFACE_KIND = new IdlElementType("INTERFACE_KIND");
  IElementType INTERFACE_NAME = new IdlElementType("INTERFACE_NAME");
  IElementType INTERFACE_TYPE = new IdlElementType("INTERFACE_TYPE");
  IElementType IN_PARAMETER_DCLS = new IdlElementType("IN_PARAMETER_DCLS");
  IElementType IN_PARAM_DCL = new IdlElementType("IN_PARAM_DCL");
  IElementType LITERAL = new IdlElementType("LITERAL");
  IElementType MAP_TYPE = new IdlElementType("MAP_TYPE");
  IElementType MEMBER = new IdlElementType("MEMBER");
  IElementType MODULE_DCL = new IdlElementType("MODULE_DCL");
  IElementType MULT_EXPR = new IdlElementType("MULT_EXPR");
  IElementType NATIVE_DCL = new IdlElementType("NATIVE_DCL");
  IElementType OBJECT_TYPE = new IdlElementType("OBJECT_TYPE");
  IElementType OCTET_TYPE = new IdlElementType("OCTET_TYPE");
  IElementType OP_DCL = new IdlElementType("OP_DCL");
  IElementType OP_ONEWAY_DCL = new IdlElementType("OP_ONEWAY_DCL");
  IElementType OP_TYPE_SPEC = new IdlElementType("OP_TYPE_SPEC");
  IElementType OP_WITH_CONTEXT = new IdlElementType("OP_WITH_CONTEXT");
  IElementType OR_EXPR = new IdlElementType("OR_EXPR");
  IElementType PARAMETER_DCLS = new IdlElementType("PARAMETER_DCLS");
  IElementType PARAM_ATTRIBUTE = new IdlElementType("PARAM_ATTRIBUTE");
  IElementType PARAM_DCL = new IdlElementType("PARAM_DCL");
  IElementType PORTTYPE_DCL = new IdlElementType("PORTTYPE_DCL");
  IElementType PORTTYPE_DEF = new IdlElementType("PORTTYPE_DEF");
  IElementType PORTTYPE_FORWARD_DCL = new IdlElementType("PORTTYPE_FORWARD_DCL");
  IElementType PORT_BODY = new IdlElementType("PORT_BODY");
  IElementType PORT_DCL = new IdlElementType("PORT_DCL");
  IElementType PORT_EXPORT = new IdlElementType("PORT_EXPORT");
  IElementType PORT_REF = new IdlElementType("PORT_REF");
  IElementType POSITIVE_INT_CONST = new IdlElementType("POSITIVE_INT_CONST");
  IElementType PRIMARY_EXPR = new IdlElementType("PRIMARY_EXPR");
  IElementType PRIMARY_KEY_SPEC = new IdlElementType("PRIMARY_KEY_SPEC");
  IElementType PROVIDES_DCL = new IdlElementType("PROVIDES_DCL");
  IElementType PUBLISHES_DCL = new IdlElementType("PUBLISHES_DCL");
  IElementType RAISES_EXPR = new IdlElementType("RAISES_EXPR");
  IElementType READONLY_ATTR_DECLARATOR = new IdlElementType("READONLY_ATTR_DECLARATOR");
  IElementType READONLY_ATTR_SPEC = new IdlElementType("READONLY_ATTR_SPEC");
  IElementType SCOPED_NAME = new IdlElementType("SCOPED_NAME");
  IElementType SEQUENCE_TYPE = new IdlElementType("SEQUENCE_TYPE");
  IElementType SET_EXCEP_EXPR = new IdlElementType("SET_EXCEP_EXPR");
  IElementType SHIFT_EXPR = new IdlElementType("SHIFT_EXPR");
  IElementType SIGNED_INT = new IdlElementType("SIGNED_INT");
  IElementType SIGNED_LONGLONG_INT = new IdlElementType("SIGNED_LONGLONG_INT");
  IElementType SIGNED_LONG_INT = new IdlElementType("SIGNED_LONG_INT");
  IElementType SIGNED_SHORT_INT = new IdlElementType("SIGNED_SHORT_INT");
  IElementType SIMPLE_DECLARATOR = new IdlElementType("SIMPLE_DECLARATOR");
  IElementType SIMPLE_TYPE_SPEC = new IdlElementType("SIMPLE_TYPE_SPEC");
  IElementType STATE_MEMBER = new IdlElementType("STATE_MEMBER");
  IElementType STRING_TYPE = new IdlElementType("STRING_TYPE");
  IElementType STRUCT_DCL = new IdlElementType("STRUCT_DCL");
  IElementType STRUCT_DEF = new IdlElementType("STRUCT_DEF");
  IElementType STRUCT_FORWARD_DCL = new IdlElementType("STRUCT_FORWARD_DCL");
  IElementType SUPPORTED_INTERFACE_SPEC = new IdlElementType("SUPPORTED_INTERFACE_SPEC");
  IElementType SWITCH_BODY = new IdlElementType("SWITCH_BODY");
  IElementType SWITCH_TYPE_SPEC = new IdlElementType("SWITCH_TYPE_SPEC");
  IElementType TEMPLATE_MODULE_DCL = new IdlElementType("TEMPLATE_MODULE_DCL");
  IElementType TEMPLATE_MODULE_INST = new IdlElementType("TEMPLATE_MODULE_INST");
  IElementType TEMPLATE_MODULE_REF = new IdlElementType("TEMPLATE_MODULE_REF");
  IElementType TEMPLATE_TYPE_SPEC = new IdlElementType("TEMPLATE_TYPE_SPEC");
  IElementType TPL_DEFINITION = new IdlElementType("TPL_DEFINITION");
  IElementType TYPEDEF_DCL = new IdlElementType("TYPEDEF_DCL");
  IElementType TYPE_DCL = new IdlElementType("TYPE_DCL");
  IElementType TYPE_DECLARATOR = new IdlElementType("TYPE_DECLARATOR");
  IElementType TYPE_ID_DCL = new IdlElementType("TYPE_ID_DCL");
  IElementType TYPE_PREFIX_DCL = new IdlElementType("TYPE_PREFIX_DCL");
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
  IElementType USES_DCL = new IdlElementType("USES_DCL");
  IElementType VALUE_ABS_DEF = new IdlElementType("VALUE_ABS_DEF");
  IElementType VALUE_BASE_TYPE = new IdlElementType("VALUE_BASE_TYPE");
  IElementType VALUE_BOX_DEF = new IdlElementType("VALUE_BOX_DEF");
  IElementType VALUE_DCL = new IdlElementType("VALUE_DCL");
  IElementType VALUE_DEF = new IdlElementType("VALUE_DEF");
  IElementType VALUE_ELEMENT = new IdlElementType("VALUE_ELEMENT");
  IElementType VALUE_FORWARD_DCL = new IdlElementType("VALUE_FORWARD_DCL");
  IElementType VALUE_HEADER = new IdlElementType("VALUE_HEADER");
  IElementType VALUE_INHERITANCE_SPEC = new IdlElementType("VALUE_INHERITANCE_SPEC");
  IElementType VALUE_KIND = new IdlElementType("VALUE_KIND");
  IElementType VALUE_NAME = new IdlElementType("VALUE_NAME");
  IElementType WIDE_CHAR_TYPE = new IdlElementType("WIDE_CHAR_TYPE");
  IElementType WIDE_STRING_TYPE = new IdlElementType("WIDE_STRING_TYPE");
  IElementType XOR_EXPR = new IdlElementType("XOR_EXPR");

  IElementType _ATTR_RAISES_EXPR_ = new IdlTokenType("<attr_raises_expr>");
  IElementType _BASE_TYPE_SPEC_ = new IdlTokenType("<base_type_spec>");
  IElementType _CHARACTER_LITERAL_ = new IdlTokenType("<character_literal>");
  IElementType _DEFINITION_ = new IdlTokenType("<definition>");
  IElementType _FIXED_PT_LITERAL_ = new IdlTokenType("<fixed_pt_literal>");
  IElementType _FLOATING_PT_LITERAL_ = new IdlTokenType("<floating_pt_literal>");
  IElementType _IDENTIFIER_ = new IdlTokenType("<identifier>");
  IElementType _INTEGER_LITERAL_ = new IdlTokenType("<integer_literal>");
  IElementType _OCTET_TYPE_ = new IdlTokenType("<octet_type>");
  IElementType _PRIMARY_EXPR_ = new IdlTokenType("<primary_expr>");
  IElementType _RAISES_EXPR_ = new IdlTokenType("<raises_expr>");
  IElementType _SIMPLE_DECLARATOR_ = new IdlTokenType("<simple_declarator>");
  IElementType _STRING_LITERAL_ = new IdlTokenType("<string_literal>");
  IElementType _TEMPLATE_TYPE_SPEC_ = new IdlTokenType("<template_type_spec>");
  IElementType _UNARY_OPERATOR_ = new IdlTokenType("<unary_operator>");
  IElementType _VALUE_KIND_ = new IdlTokenType("<value_kind>");
  IElementType _WIDE_CHARACTER_LITERAL_ = new IdlTokenType("<wide_character_literal>");
  IElementType _WIDE_STRING_LITERAL_ = new IdlTokenType("<wide_string_literal>");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ACTUAL_PARAMETER) {
        return new IdlActualParameterImpl(node);
      }
      else if (type == ACTUAL_PARAMETERS) {
        return new IdlActualParametersImpl(node);
      }
      else if (type == ADD_EXPR) {
        return new IdlAddExprImpl(node);
      }
      else if (type == AND_EXPR) {
        return new IdlAndExprImpl(node);
      }
      else if (type == ANNOTATION_APPL) {
        return new IdlAnnotationApplImpl(node);
      }
      else if (type == ANNOTATION_APPL_PARAM) {
        return new IdlAnnotationApplParamImpl(node);
      }
      else if (type == ANNOTATION_APPL_PARAMS) {
        return new IdlAnnotationApplParamsImpl(node);
      }
      else if (type == ANNOTATION_BODY) {
        return new IdlAnnotationBodyImpl(node);
      }
      else if (type == ANNOTATION_DCL) {
        return new IdlAnnotationDclImpl(node);
      }
      else if (type == ANNOTATION_HEADER) {
        return new IdlAnnotationHeaderImpl(node);
      }
      else if (type == ANNOTATION_MEMBER) {
        return new IdlAnnotationMemberImpl(node);
      }
      else if (type == ANNOTATION_MEMBER_TYPE) {
        return new IdlAnnotationMemberTypeImpl(node);
      }
      else if (type == ANY_CONST_TYPE) {
        return new IdlAnyConstTypeImpl(node);
      }
      else if (type == ANY_DECLARATOR) {
        return new IdlAnyDeclaratorImpl(node);
      }
      else if (type == ANY_DECLARATORS) {
        return new IdlAnyDeclaratorsImpl(node);
      }
      else if (type == ANY_TYPE) {
        return new IdlAnyTypeImpl(node);
      }
      else if (type == ARRAY_DECLARATOR) {
        return new IdlArrayDeclaratorImpl(node);
      }
      else if (type == ATTR_DCL) {
        return new IdlAttrDclImpl(node);
      }
      else if (type == ATTR_DECLARATOR) {
        return new IdlAttrDeclaratorImpl(node);
      }
      else if (type == ATTR_RAISES_EXPR) {
        return new IdlAttrRaisesExprImpl(node);
      }
      else if (type == ATTR_SPEC) {
        return new IdlAttrSpecImpl(node);
      }
      else if (type == BASE_TYPE_SPEC) {
        return new IdlBaseTypeSpecImpl(node);
      }
      else if (type == BITFIELD) {
        return new IdlBitfieldImpl(node);
      }
      else if (type == BITFIELD_SPEC) {
        return new IdlBitfieldSpecImpl(node);
      }
      else if (type == BITMASK_DCL) {
        return new IdlBitmaskDclImpl(node);
      }
      else if (type == BITSET_DCL) {
        return new IdlBitsetDclImpl(node);
      }
      else if (type == BIT_VALUE) {
        return new IdlBitValueImpl(node);
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
      else if (type == COMPONENT_BODY) {
        return new IdlComponentBodyImpl(node);
      }
      else if (type == COMPONENT_DCL) {
        return new IdlComponentDclImpl(node);
      }
      else if (type == COMPONENT_DEF) {
        return new IdlComponentDefImpl(node);
      }
      else if (type == COMPONENT_EXPORT) {
        return new IdlComponentExportImpl(node);
      }
      else if (type == COMPONENT_FORWARD_DCL) {
        return new IdlComponentForwardDclImpl(node);
      }
      else if (type == COMPONENT_HEADER) {
        return new IdlComponentHeaderImpl(node);
      }
      else if (type == COMPONENT_INHERITANCE_SPEC) {
        return new IdlComponentInheritanceSpecImpl(node);
      }
      else if (type == CONNECTOR_DCL) {
        return new IdlConnectorDclImpl(node);
      }
      else if (type == CONNECTOR_EXPORT) {
        return new IdlConnectorExportImpl(node);
      }
      else if (type == CONNECTOR_HEADER) {
        return new IdlConnectorHeaderImpl(node);
      }
      else if (type == CONNECTOR_INHERIT_SPEC) {
        return new IdlConnectorInheritSpecImpl(node);
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
      else if (type == CONSUMES_DCL) {
        return new IdlConsumesDclImpl(node);
      }
      else if (type == CONTEXT_EXPR) {
        return new IdlContextExprImpl(node);
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
      else if (type == DESTINATION_TYPE) {
        return new IdlDestinationTypeImpl(node);
      }
      else if (type == ELEMENT_SPEC) {
        return new IdlElementSpecImpl(node);
      }
      else if (type == EMITS_DCL) {
        return new IdlEmitsDclImpl(node);
      }
      else if (type == ENUMERATOR) {
        return new IdlEnumeratorImpl(node);
      }
      else if (type == ENUM_DCL) {
        return new IdlEnumDclImpl(node);
      }
      else if (type == EVENT_ABS_DEF) {
        return new IdlEventAbsDefImpl(node);
      }
      else if (type == EVENT_DCL) {
        return new IdlEventDclImpl(node);
      }
      else if (type == EVENT_DEF) {
        return new IdlEventDefImpl(node);
      }
      else if (type == EVENT_FORWARD_DCL) {
        return new IdlEventForwardDclImpl(node);
      }
      else if (type == EVENT_HEADER) {
        return new IdlEventHeaderImpl(node);
      }
      else if (type == EXCEPTION_LIST) {
        return new IdlExceptionListImpl(node);
      }
      else if (type == EXCEPT_DCL) {
        return new IdlExceptDclImpl(node);
      }
      else if (type == EXPORT) {
        return new IdlExportImpl(node);
      }
      else if (type == FACTORY_DCL) {
        return new IdlFactoryDclImpl(node);
      }
      else if (type == FACTORY_PARAM_DCL) {
        return new IdlFactoryParamDclImpl(node);
      }
      else if (type == FACTORY_PARAM_DCLS) {
        return new IdlFactoryParamDclsImpl(node);
      }
      else if (type == FINDER_DCL) {
        return new IdlFinderDclImpl(node);
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
      else if (type == FORMAL_PARAMETER) {
        return new IdlFormalParameterImpl(node);
      }
      else if (type == FORMAL_PARAMETERS) {
        return new IdlFormalParametersImpl(node);
      }
      else if (type == FORMAL_PARAMETER_NAMES) {
        return new IdlFormalParameterNamesImpl(node);
      }
      else if (type == FORMAL_PARAMETER_TYPE) {
        return new IdlFormalParameterTypeImpl(node);
      }
      else if (type == GET_EXCEP_EXPR) {
        return new IdlGetExcepExprImpl(node);
      }
      else if (type == HOME_BODY) {
        return new IdlHomeBodyImpl(node);
      }
      else if (type == HOME_DCL) {
        return new IdlHomeDclImpl(node);
      }
      else if (type == HOME_EXPORT) {
        return new IdlHomeExportImpl(node);
      }
      else if (type == HOME_HEADER) {
        return new IdlHomeHeaderImpl(node);
      }
      else if (type == HOME_INHERITANCE_SPEC) {
        return new IdlHomeInheritanceSpecImpl(node);
      }
      else if (type == IMPORTED_SCOPE) {
        return new IdlImportedScopeImpl(node);
      }
      else if (type == IMPORT_DCL) {
        return new IdlImportDclImpl(node);
      }
      else if (type == INIT_DCL) {
        return new IdlInitDclImpl(node);
      }
      else if (type == INIT_PARAM_DCL) {
        return new IdlInitParamDclImpl(node);
      }
      else if (type == INIT_PARAM_DCLS) {
        return new IdlInitParamDclsImpl(node);
      }
      else if (type == INTEGER_TYPE) {
        return new IdlIntegerTypeImpl(node);
      }
      else if (type == INTERFACE_BODY) {
        return new IdlInterfaceBodyImpl(node);
      }
      else if (type == INTERFACE_DCL) {
        return new IdlInterfaceDclImpl(node);
      }
      else if (type == INTERFACE_DEF) {
        return new IdlInterfaceDefImpl(node);
      }
      else if (type == INTERFACE_FORWARD_DCL) {
        return new IdlInterfaceForwardDclImpl(node);
      }
      else if (type == INTERFACE_HEADER) {
        return new IdlInterfaceHeaderImpl(node);
      }
      else if (type == INTERFACE_INHERITANCE_SPEC) {
        return new IdlInterfaceInheritanceSpecImpl(node);
      }
      else if (type == INTERFACE_KIND) {
        return new IdlInterfaceKindImpl(node);
      }
      else if (type == INTERFACE_NAME) {
        return new IdlInterfaceNameImpl(node);
      }
      else if (type == INTERFACE_TYPE) {
        return new IdlInterfaceTypeImpl(node);
      }
      else if (type == IN_PARAMETER_DCLS) {
        return new IdlInParameterDclsImpl(node);
      }
      else if (type == IN_PARAM_DCL) {
        return new IdlInParamDclImpl(node);
      }
      else if (type == LITERAL) {
        return new IdlLiteralImpl(node);
      }
      else if (type == MAP_TYPE) {
        return new IdlMapTypeImpl(node);
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
      else if (type == OBJECT_TYPE) {
        return new IdlObjectTypeImpl(node);
      }
      else if (type == OCTET_TYPE) {
        return new IdlOctetTypeImpl(node);
      }
      else if (type == OP_DCL) {
        return new IdlOpDclImpl(node);
      }
      else if (type == OP_ONEWAY_DCL) {
        return new IdlOpOnewayDclImpl(node);
      }
      else if (type == OP_TYPE_SPEC) {
        return new IdlOpTypeSpecImpl(node);
      }
      else if (type == OP_WITH_CONTEXT) {
        return new IdlOpWithContextImpl(node);
      }
      else if (type == OR_EXPR) {
        return new IdlOrExprImpl(node);
      }
      else if (type == PARAMETER_DCLS) {
        return new IdlParameterDclsImpl(node);
      }
      else if (type == PARAM_ATTRIBUTE) {
        return new IdlParamAttributeImpl(node);
      }
      else if (type == PARAM_DCL) {
        return new IdlParamDclImpl(node);
      }
      else if (type == PORTTYPE_DCL) {
        return new IdlPorttypeDclImpl(node);
      }
      else if (type == PORTTYPE_DEF) {
        return new IdlPorttypeDefImpl(node);
      }
      else if (type == PORTTYPE_FORWARD_DCL) {
        return new IdlPorttypeForwardDclImpl(node);
      }
      else if (type == PORT_BODY) {
        return new IdlPortBodyImpl(node);
      }
      else if (type == PORT_DCL) {
        return new IdlPortDclImpl(node);
      }
      else if (type == PORT_EXPORT) {
        return new IdlPortExportImpl(node);
      }
      else if (type == PORT_REF) {
        return new IdlPortRefImpl(node);
      }
      else if (type == POSITIVE_INT_CONST) {
        return new IdlPositiveIntConstImpl(node);
      }
      else if (type == PRIMARY_EXPR) {
        return new IdlPrimaryExprImpl(node);
      }
      else if (type == PRIMARY_KEY_SPEC) {
        return new IdlPrimaryKeySpecImpl(node);
      }
      else if (type == PROVIDES_DCL) {
        return new IdlProvidesDclImpl(node);
      }
      else if (type == PUBLISHES_DCL) {
        return new IdlPublishesDclImpl(node);
      }
      else if (type == RAISES_EXPR) {
        return new IdlRaisesExprImpl(node);
      }
      else if (type == READONLY_ATTR_DECLARATOR) {
        return new IdlReadonlyAttrDeclaratorImpl(node);
      }
      else if (type == READONLY_ATTR_SPEC) {
        return new IdlReadonlyAttrSpecImpl(node);
      }
      else if (type == SCOPED_NAME) {
        return new IdlScopedNameImpl(node);
      }
      else if (type == SEQUENCE_TYPE) {
        return new IdlSequenceTypeImpl(node);
      }
      else if (type == SET_EXCEP_EXPR) {
        return new IdlSetExcepExprImpl(node);
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
      else if (type == STATE_MEMBER) {
        return new IdlStateMemberImpl(node);
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
      else if (type == SUPPORTED_INTERFACE_SPEC) {
        return new IdlSupportedInterfaceSpecImpl(node);
      }
      else if (type == SWITCH_BODY) {
        return new IdlSwitchBodyImpl(node);
      }
      else if (type == SWITCH_TYPE_SPEC) {
        return new IdlSwitchTypeSpecImpl(node);
      }
      else if (type == TEMPLATE_MODULE_DCL) {
        return new IdlTemplateModuleDclImpl(node);
      }
      else if (type == TEMPLATE_MODULE_INST) {
        return new IdlTemplateModuleInstImpl(node);
      }
      else if (type == TEMPLATE_MODULE_REF) {
        return new IdlTemplateModuleRefImpl(node);
      }
      else if (type == TEMPLATE_TYPE_SPEC) {
        return new IdlTemplateTypeSpecImpl(node);
      }
      else if (type == TPL_DEFINITION) {
        return new IdlTplDefinitionImpl(node);
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
      else if (type == TYPE_ID_DCL) {
        return new IdlTypeIdDclImpl(node);
      }
      else if (type == TYPE_PREFIX_DCL) {
        return new IdlTypePrefixDclImpl(node);
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
      else if (type == USES_DCL) {
        return new IdlUsesDclImpl(node);
      }
      else if (type == VALUE_ABS_DEF) {
        return new IdlValueAbsDefImpl(node);
      }
      else if (type == VALUE_BASE_TYPE) {
        return new IdlValueBaseTypeImpl(node);
      }
      else if (type == VALUE_BOX_DEF) {
        return new IdlValueBoxDefImpl(node);
      }
      else if (type == VALUE_DCL) {
        return new IdlValueDclImpl(node);
      }
      else if (type == VALUE_DEF) {
        return new IdlValueDefImpl(node);
      }
      else if (type == VALUE_ELEMENT) {
        return new IdlValueElementImpl(node);
      }
      else if (type == VALUE_FORWARD_DCL) {
        return new IdlValueForwardDclImpl(node);
      }
      else if (type == VALUE_HEADER) {
        return new IdlValueHeaderImpl(node);
      }
      else if (type == VALUE_INHERITANCE_SPEC) {
        return new IdlValueInheritanceSpecImpl(node);
      }
      else if (type == VALUE_KIND) {
        return new IdlValueKindImpl(node);
      }
      else if (type == VALUE_NAME) {
        return new IdlValueNameImpl(node);
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
