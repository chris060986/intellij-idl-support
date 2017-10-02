// This is a generated file. Not intended for manual editing.
package com.bich.idl.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.bich.idl.psi.IdlTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class IdlParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ACTUAL_PARAMETER) {
      r = actual_parameter(b, 0);
    }
    else if (t == ACTUAL_PARAMETERS) {
      r = actual_parameters(b, 0);
    }
    else if (t == ADD_EXPR) {
      r = add_expr(b, 0);
    }
    else if (t == AND_EXPR) {
      r = and_expr(b, 0);
    }
    else if (t == ANNOTATION_APPL) {
      r = annotation_appl(b, 0);
    }
    else if (t == ANNOTATION_APPL_PARAM) {
      r = annotation_appl_param(b, 0);
    }
    else if (t == ANNOTATION_APPL_PARAMS) {
      r = annotation_appl_params(b, 0);
    }
    else if (t == ANNOTATION_BODY) {
      r = annotation_body(b, 0);
    }
    else if (t == ANNOTATION_DCL) {
      r = annotation_dcl(b, 0);
    }
    else if (t == ANNOTATION_HEADER) {
      r = annotation_header(b, 0);
    }
    else if (t == ANNOTATION_MEMBER) {
      r = annotation_member(b, 0);
    }
    else if (t == ANNOTATION_MEMBER_TYPE) {
      r = annotation_member_type(b, 0);
    }
    else if (t == ANY_CONST_TYPE) {
      r = any_const_type(b, 0);
    }
    else if (t == ANY_DECLARATOR) {
      r = any_declarator(b, 0);
    }
    else if (t == ANY_DECLARATORS) {
      r = any_declarators(b, 0);
    }
    else if (t == ANY_TYPE) {
      r = any_type(b, 0);
    }
    else if (t == ARRAY_DECLARATOR) {
      r = array_declarator(b, 0);
    }
    else if (t == ATTR_DCL) {
      r = attr_dcl(b, 0);
    }
    else if (t == ATTR_DECLARATOR) {
      r = attr_declarator(b, 0);
    }
    else if (t == ATTR_RAISES_EXPR) {
      r = attr_raises_expr(b, 0);
    }
    else if (t == ATTR_SPEC) {
      r = attr_spec(b, 0);
    }
    else if (t == BASE_TYPE_SPEC) {
      r = base_type_spec(b, 0);
    }
    else if (t == BIT_VALUE) {
      r = bit_value(b, 0);
    }
    else if (t == BITFIELD) {
      r = bitfield(b, 0);
    }
    else if (t == BITFIELD_SPEC) {
      r = bitfield_spec(b, 0);
    }
    else if (t == BITMASK_DCL) {
      r = bitmask_dcl(b, 0);
    }
    else if (t == BITSET_DCL) {
      r = bitset_dcl(b, 0);
    }
    else if (t == BOOLEAN_LITERAL) {
      r = boolean_literal(b, 0);
    }
    else if (t == BOOLEAN_TYPE) {
      r = boolean_type(b, 0);
    }
    else if (t == CASE) {
      r = case_$(b, 0);
    }
    else if (t == CASE_LABEL) {
      r = case_label(b, 0);
    }
    else if (t == CHAR_TYPE) {
      r = char_type(b, 0);
    }
    else if (t == COMPONENT_BODY) {
      r = component_body(b, 0);
    }
    else if (t == COMPONENT_DCL) {
      r = component_dcl(b, 0);
    }
    else if (t == COMPONENT_DEF) {
      r = component_def(b, 0);
    }
    else if (t == COMPONENT_EXPORT) {
      r = component_export(b, 0);
    }
    else if (t == COMPONENT_FORWARD_DCL) {
      r = component_forward_dcl(b, 0);
    }
    else if (t == COMPONENT_HEADER) {
      r = component_header(b, 0);
    }
    else if (t == COMPONENT_INHERITANCE_SPEC) {
      r = component_inheritance_spec(b, 0);
    }
    else if (t == CONNECTOR_DCL) {
      r = connector_dcl(b, 0);
    }
    else if (t == CONNECTOR_EXPORT) {
      r = connector_export(b, 0);
    }
    else if (t == CONNECTOR_HEADER) {
      r = connector_header(b, 0);
    }
    else if (t == CONNECTOR_INHERIT_SPEC) {
      r = connector_inherit_spec(b, 0);
    }
    else if (t == CONST_DCL) {
      r = const_dcl(b, 0);
    }
    else if (t == CONST_EXPR) {
      r = const_expr(b, 0);
    }
    else if (t == CONST_TYPE) {
      r = const_type(b, 0);
    }
    else if (t == CONSTR_TYPE_DCL) {
      r = constr_type_dcl(b, 0);
    }
    else if (t == CONSUMES_DCL) {
      r = consumes_dcl(b, 0);
    }
    else if (t == CONTEXT_EXPR) {
      r = context_expr(b, 0);
    }
    else if (t == DECLARATOR) {
      r = declarator(b, 0);
    }
    else if (t == DECLARATORS) {
      r = declarators(b, 0);
    }
    else if (t == DEFINITION) {
      r = definition(b, 0);
    }
    else if (t == DESTINATION_TYPE) {
      r = destination_type(b, 0);
    }
    else if (t == ELEMENT_SPEC) {
      r = element_spec(b, 0);
    }
    else if (t == EMITS_DCL) {
      r = emits_dcl(b, 0);
    }
    else if (t == ENUM_DCL) {
      r = enum_dcl(b, 0);
    }
    else if (t == ENUMERATOR) {
      r = enumerator(b, 0);
    }
    else if (t == EVENT_ABS_DEF) {
      r = event_abs_def(b, 0);
    }
    else if (t == EVENT_DCL) {
      r = event_dcl(b, 0);
    }
    else if (t == EVENT_DEF) {
      r = event_def(b, 0);
    }
    else if (t == EVENT_FORWARD_DCL) {
      r = event_forward_dcl(b, 0);
    }
    else if (t == EVENT_HEADER) {
      r = event_header(b, 0);
    }
    else if (t == EXCEPT_DCL) {
      r = except_dcl(b, 0);
    }
    else if (t == EXCEPTION_LIST) {
      r = exception_list(b, 0);
    }
    else if (t == EXPORT) {
      r = export(b, 0);
    }
    else if (t == FACTORY_DCL) {
      r = factory_dcl(b, 0);
    }
    else if (t == FACTORY_PARAM_DCL) {
      r = factory_param_dcl(b, 0);
    }
    else if (t == FACTORY_PARAM_DCLS) {
      r = factory_param_dcls(b, 0);
    }
    else if (t == FINDER_DCL) {
      r = finder_dcl(b, 0);
    }
    else if (t == FIXED_ARRAY_SIZE) {
      r = fixed_array_size(b, 0);
    }
    else if (t == FIXED_PT_CONST_TYPE) {
      r = fixed_pt_const_type(b, 0);
    }
    else if (t == FIXED_PT_TYPE) {
      r = fixed_pt_type(b, 0);
    }
    else if (t == FLOATING_PT_TYPE) {
      r = floating_pt_type(b, 0);
    }
    else if (t == FORMAL_PARAMETER) {
      r = formal_parameter(b, 0);
    }
    else if (t == FORMAL_PARAMETER_NAMES) {
      r = formal_parameter_names(b, 0);
    }
    else if (t == FORMAL_PARAMETER_TYPE) {
      r = formal_parameter_type(b, 0);
    }
    else if (t == FORMAL_PARAMETERS) {
      r = formal_parameters(b, 0);
    }
    else if (t == GET_EXCEP_EXPR) {
      r = get_excep_expr(b, 0);
    }
    else if (t == HOME_BODY) {
      r = home_body(b, 0);
    }
    else if (t == HOME_DCL) {
      r = home_dcl(b, 0);
    }
    else if (t == HOME_EXPORT) {
      r = home_export(b, 0);
    }
    else if (t == HOME_HEADER) {
      r = home_header(b, 0);
    }
    else if (t == HOME_INHERITANCE_SPEC) {
      r = home_inheritance_spec(b, 0);
    }
    else if (t == IMPORT_DCL) {
      r = import_dcl(b, 0);
    }
    else if (t == IMPORTED_SCOPE) {
      r = imported_scope(b, 0);
    }
    else if (t == IN_PARAM_DCL) {
      r = in_param_dcl(b, 0);
    }
    else if (t == IN_PARAMETER_DCLS) {
      r = in_parameter_dcls(b, 0);
    }
    else if (t == INIT_DCL) {
      r = init_dcl(b, 0);
    }
    else if (t == INIT_PARAM_DCL) {
      r = init_param_dcl(b, 0);
    }
    else if (t == INIT_PARAM_DCLS) {
      r = init_param_dcls(b, 0);
    }
    else if (t == INTEGER_TYPE) {
      r = integer_type(b, 0);
    }
    else if (t == INTERFACE_BODY) {
      r = interface_body(b, 0);
    }
    else if (t == INTERFACE_DCL) {
      r = interface_dcl(b, 0);
    }
    else if (t == INTERFACE_DEF) {
      r = interface_def(b, 0);
    }
    else if (t == INTERFACE_FORWARD_DCL) {
      r = interface_forward_dcl(b, 0);
    }
    else if (t == INTERFACE_HEADER) {
      r = interface_header(b, 0);
    }
    else if (t == INTERFACE_INHERITANCE_SPEC) {
      r = interface_inheritance_spec(b, 0);
    }
    else if (t == INTERFACE_KIND) {
      r = interface_kind(b, 0);
    }
    else if (t == INTERFACE_NAME) {
      r = interface_name(b, 0);
    }
    else if (t == INTERFACE_TYPE) {
      r = interface_type(b, 0);
    }
    else if (t == LITERAL) {
      r = literal(b, 0);
    }
    else if (t == MAP_TYPE) {
      r = map_type(b, 0);
    }
    else if (t == MEMBER) {
      r = member(b, 0);
    }
    else if (t == MODULE_DCL) {
      r = module_dcl(b, 0);
    }
    else if (t == MULT_EXPR) {
      r = mult_expr(b, 0);
    }
    else if (t == NATIVE_DCL) {
      r = native_dcl(b, 0);
    }
    else if (t == OBJECT_TYPE) {
      r = object_type(b, 0);
    }
    else if (t == OCTET_TYPE) {
      r = octet_type(b, 0);
    }
    else if (t == OP_DCL) {
      r = op_dcl(b, 0);
    }
    else if (t == OP_ONEWAY_DCL) {
      r = op_oneway_dcl(b, 0);
    }
    else if (t == OP_TYPE_SPEC) {
      r = op_type_spec(b, 0);
    }
    else if (t == OP_WITH_CONTEXT) {
      r = op_with_context(b, 0);
    }
    else if (t == OR_EXPR) {
      r = or_expr(b, 0);
    }
    else if (t == PARAM_ATTRIBUTE) {
      r = param_attribute(b, 0);
    }
    else if (t == PARAM_DCL) {
      r = param_dcl(b, 0);
    }
    else if (t == PARAMETER_DCLS) {
      r = parameter_dcls(b, 0);
    }
    else if (t == PORT_BODY) {
      r = port_body(b, 0);
    }
    else if (t == PORT_DCL) {
      r = port_dcl(b, 0);
    }
    else if (t == PORT_EXPORT) {
      r = port_export(b, 0);
    }
    else if (t == PORT_REF) {
      r = port_ref(b, 0);
    }
    else if (t == PORTTYPE_DCL) {
      r = porttype_dcl(b, 0);
    }
    else if (t == PORTTYPE_DEF) {
      r = porttype_def(b, 0);
    }
    else if (t == PORTTYPE_FORWARD_DCL) {
      r = porttype_forward_dcl(b, 0);
    }
    else if (t == POSITIVE_INT_CONST) {
      r = positive_int_const(b, 0);
    }
    else if (t == PRIMARY_EXPR) {
      r = primary_expr(b, 0);
    }
    else if (t == PRIMARY_KEY_SPEC) {
      r = primary_key_spec(b, 0);
    }
    else if (t == PROVIDES_DCL) {
      r = provides_dcl(b, 0);
    }
    else if (t == PUBLISHES_DCL) {
      r = publishes_dcl(b, 0);
    }
    else if (t == RAISES_EXPR) {
      r = raises_expr(b, 0);
    }
    else if (t == READONLY_ATTR_DECLARATOR) {
      r = readonly_attr_declarator(b, 0);
    }
    else if (t == READONLY_ATTR_SPEC) {
      r = readonly_attr_spec(b, 0);
    }
    else if (t == SCOPED_NAME) {
      r = scoped_name(b, 0);
    }
    else if (t == SEQUENCE_TYPE) {
      r = sequence_type(b, 0);
    }
    else if (t == SET_EXCEP_EXPR) {
      r = set_excep_expr(b, 0);
    }
    else if (t == SHIFT_EXPR) {
      r = shift_expr(b, 0);
    }
    else if (t == SIGNED_INT) {
      r = signed_int(b, 0);
    }
    else if (t == SIGNED_LONG_INT) {
      r = signed_long_int(b, 0);
    }
    else if (t == SIGNED_LONGLONG_INT) {
      r = signed_longlong_int(b, 0);
    }
    else if (t == SIGNED_SHORT_INT) {
      r = signed_short_int(b, 0);
    }
    else if (t == SIMPLE_DECLARATOR) {
      r = simple_declarator(b, 0);
    }
    else if (t == SIMPLE_TYPE_SPEC) {
      r = simple_type_spec(b, 0);
    }
    else if (t == STATE_MEMBER) {
      r = state_member(b, 0);
    }
    else if (t == STRING_TYPE) {
      r = string_type(b, 0);
    }
    else if (t == STRUCT_DCL) {
      r = struct_dcl(b, 0);
    }
    else if (t == STRUCT_DEF) {
      r = struct_def(b, 0);
    }
    else if (t == STRUCT_FORWARD_DCL) {
      r = struct_forward_dcl(b, 0);
    }
    else if (t == SUPPORTED_INTERFACE_SPEC) {
      r = supported_interface_spec(b, 0);
    }
    else if (t == SWITCH_BODY) {
      r = switch_body(b, 0);
    }
    else if (t == SWITCH_TYPE_SPEC) {
      r = switch_type_spec(b, 0);
    }
    else if (t == TEMPLATE_MODULE_DCL) {
      r = template_module_dcl(b, 0);
    }
    else if (t == TEMPLATE_MODULE_INST) {
      r = template_module_inst(b, 0);
    }
    else if (t == TEMPLATE_MODULE_REF) {
      r = template_module_ref(b, 0);
    }
    else if (t == TEMPLATE_TYPE_SPEC) {
      r = template_type_spec(b, 0);
    }
    else if (t == TPL_DEFINITION) {
      r = tpl_definition(b, 0);
    }
    else if (t == TYPE_DCL) {
      r = type_dcl(b, 0);
    }
    else if (t == TYPE_DECLARATOR) {
      r = type_declarator(b, 0);
    }
    else if (t == TYPE_ID_DCL) {
      r = type_id_dcl(b, 0);
    }
    else if (t == TYPE_PREFIX_DCL) {
      r = type_prefix_dcl(b, 0);
    }
    else if (t == TYPE_SPEC) {
      r = type_spec(b, 0);
    }
    else if (t == TYPEDEF_DCL) {
      r = typedef_dcl(b, 0);
    }
    else if (t == UNARY_EXPR) {
      r = unary_expr(b, 0);
    }
    else if (t == UNARY_OPERATOR) {
      r = unary_operator(b, 0);
    }
    else if (t == UNION_DCL) {
      r = union_dcl(b, 0);
    }
    else if (t == UNION_DEF) {
      r = union_def(b, 0);
    }
    else if (t == UNION_FORWARD_DCL) {
      r = union_forward_dcl(b, 0);
    }
    else if (t == UNSIGNED_INT) {
      r = unsigned_int(b, 0);
    }
    else if (t == UNSIGNED_LONG_INT) {
      r = unsigned_long_int(b, 0);
    }
    else if (t == UNSIGNED_LONGLONG_INT) {
      r = unsigned_longlong_int(b, 0);
    }
    else if (t == UNSIGNED_SHORT_INT) {
      r = unsigned_short_int(b, 0);
    }
    else if (t == USES_DCL) {
      r = uses_dcl(b, 0);
    }
    else if (t == VALUE_ABS_DEF) {
      r = value_abs_def(b, 0);
    }
    else if (t == VALUE_BASE_TYPE) {
      r = value_base_type(b, 0);
    }
    else if (t == VALUE_BOX_DEF) {
      r = value_box_def(b, 0);
    }
    else if (t == VALUE_DCL) {
      r = value_dcl(b, 0);
    }
    else if (t == VALUE_DEF) {
      r = value_def(b, 0);
    }
    else if (t == VALUE_ELEMENT) {
      r = value_element(b, 0);
    }
    else if (t == VALUE_FORWARD_DCL) {
      r = value_forward_dcl(b, 0);
    }
    else if (t == VALUE_HEADER) {
      r = value_header(b, 0);
    }
    else if (t == VALUE_INHERITANCE_SPEC) {
      r = value_inheritance_spec(b, 0);
    }
    else if (t == VALUE_KIND) {
      r = value_kind(b, 0);
    }
    else if (t == VALUE_NAME) {
      r = value_name(b, 0);
    }
    else if (t == WIDE_CHAR_TYPE) {
      r = wide_char_type(b, 0);
    }
    else if (t == WIDE_STRING_TYPE) {
      r = wide_string_type(b, 0);
    }
    else if (t == XOR_EXPR) {
      r = xor_expr(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return specification(b, l + 1);
  }

  /* ********************************************************** */
  // <type_spec>
  //                       | <const_expr>
  public static boolean actual_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_parameter")) return false;
    if (!nextTokenIs(b, "<actual parameter>", _CONST_EXPR_, _TYPE_SPEC_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACTUAL_PARAMETER, "<actual parameter>");
    r = type_spec(b, l + 1);
    if (!r) r = const_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <actual_parameter> { "," <actual_parameter>}*
  public static boolean actual_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_parameters")) return false;
    if (!nextTokenIs(b, _ACTUAL_PARAMETER_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = actual_parameter(b, l + 1);
    r = r && actual_parameters_1(b, l + 1);
    exit_section_(b, m, ACTUAL_PARAMETERS, r);
    return r;
  }

  // { "," <actual_parameter>}*
  private static boolean actual_parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_parameters_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!actual_parameters_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "actual_parameters_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," <actual_parameter>
  private static boolean actual_parameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_parameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && actual_parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <mult_expr>
  //                 | <add_expr> "+" <mult_expr>
  //                 | <add_expr> "-" <mult_expr>
  public static boolean add_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "add_expr")) return false;
    if (!nextTokenIs(b, "<add expr>", _ADD_EXPR_, _MULT_EXPR_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADD_EXPR, "<add expr>");
    r = mult_expr(b, l + 1);
    if (!r) r = add_expr_1(b, l + 1);
    if (!r) r = add_expr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <add_expr> "+" <mult_expr>
  private static boolean add_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "add_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = add_expr(b, l + 1);
    r = r && consumeToken(b, "+");
    r = r && mult_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <add_expr> "-" <mult_expr>
  private static boolean add_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "add_expr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = add_expr(b, l + 1);
    r = r && consumeToken(b, "-");
    r = r && mult_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <shift_expr>
  //                 | <and_expr> "&" <shift_expr>
  public static boolean and_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expr")) return false;
    if (!nextTokenIs(b, "<and expr>", _AND_EXPR_, _SHIFT_EXPR_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AND_EXPR, "<and expr>");
    r = shift_expr(b, l + 1);
    if (!r) r = and_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <and_expr> "&" <shift_expr>
  private static boolean and_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = and_expr(b, l + 1);
    r = r && consumeToken(b, "&");
    r = r && shift_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "@" <scoped_name> [ "(" <annotation_appl_params> ")" ]
  public static boolean annotation_appl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_appl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATION_APPL, "<annotation appl>");
    r = consumeToken(b, "@");
    r = r && scoped_name(b, l + 1);
    r = r && annotation_appl_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ "(" <annotation_appl_params> ")" ]
  private static boolean annotation_appl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_appl_2")) return false;
    annotation_appl_2_0(b, l + 1);
    return true;
  }

  // "(" <annotation_appl_params> ")"
  private static boolean annotation_appl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_appl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && annotation_appl_params(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <identifier> "=" <const_expr>
  public static boolean annotation_appl_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_appl_param")) return false;
    if (!nextTokenIs(b, _IDENTIFIER_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _IDENTIFIER_);
    r = r && consumeToken(b, "=");
    r = r && const_expr(b, l + 1);
    exit_section_(b, m, ANNOTATION_APPL_PARAM, r);
    return r;
  }

  /* ********************************************************** */
  // <const_expr>
  //                             | <annotation_appl_param> { "," <annotation_appl_param> }*
  public static boolean annotation_appl_params(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_appl_params")) return false;
    if (!nextTokenIs(b, "<annotation appl params>", _ANNOTATION_APPL_PARAM_, _CONST_EXPR_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATION_APPL_PARAMS, "<annotation appl params>");
    r = const_expr(b, l + 1);
    if (!r) r = annotation_appl_params_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <annotation_appl_param> { "," <annotation_appl_param> }*
  private static boolean annotation_appl_params_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_appl_params_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation_appl_param(b, l + 1);
    r = r && annotation_appl_params_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { "," <annotation_appl_param> }*
  private static boolean annotation_appl_params_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_appl_params_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!annotation_appl_params_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotation_appl_params_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," <annotation_appl_param>
  private static boolean annotation_appl_params_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_appl_params_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && annotation_appl_param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // { <annotation_member>
  //                        | <enum_dcl> ";"
  //                        | <const_dcl> ";"
  //                        | <typedef_dcl> ";" }*
  public static boolean annotation_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_body")) return false;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATION_BODY, "<annotation body>");
    int c = current_position_(b);
    while (true) {
      if (!annotation_body_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotation_body", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // <annotation_member>
  //                        | <enum_dcl> ";"
  //                        | <const_dcl> ";"
  //                        | <typedef_dcl> ";"
  private static boolean annotation_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_body_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation_member(b, l + 1);
    if (!r) r = annotation_body_0_1(b, l + 1);
    if (!r) r = annotation_body_0_2(b, l + 1);
    if (!r) r = annotation_body_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <enum_dcl> ";"
  private static boolean annotation_body_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_body_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // <const_dcl> ";"
  private static boolean annotation_body_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_body_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = const_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // <typedef_dcl> ";"
  private static boolean annotation_body_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_body_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typedef_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <annotation_header> "{" <annotation_body> "}"
  public static boolean annotation_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_dcl")) return false;
    if (!nextTokenIs(b, _ANNOTATION_HEADER_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation_header(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && annotation_body(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, ANNOTATION_DCL, r);
    return r;
  }

  /* ********************************************************** */
  // "@annotation" <identifier>
  public static boolean annotation_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATION_HEADER, "<annotation header>");
    r = consumeToken(b, "@annotation");
    r = r && consumeToken(b, _IDENTIFIER_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <annotation_member_type> <simple_declarator>
  //  [ "default" <const_expr> ] ";"
  public static boolean annotation_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_member")) return false;
    if (!nextTokenIs(b, _ANNOTATION_MEMBER_TYPE_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation_member_type(b, l + 1);
    r = r && simple_declarator(b, l + 1);
    r = r && annotation_member_2(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, ANNOTATION_MEMBER, r);
    return r;
  }

  // [ "default" <const_expr> ]
  private static boolean annotation_member_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_member_2")) return false;
    annotation_member_2_0(b, l + 1);
    return true;
  }

  // "default" <const_expr>
  private static boolean annotation_member_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_member_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "default");
    r = r && const_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <const_type> | <any_const_type> | <scoped_name>
  public static boolean annotation_member_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_member_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATION_MEMBER_TYPE, "<annotation member type>");
    r = const_type(b, l + 1);
    if (!r) r = any_const_type(b, l + 1);
    if (!r) r = scoped_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "any"
  public static boolean any_const_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any_const_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANY_CONST_TYPE, "<any const type>");
    r = consumeToken(b, "any");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <simple_declarator>
  //                       | <array_declarator>
  public static boolean any_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any_declarator")) return false;
    if (!nextTokenIs(b, "<any declarator>", _ARRAY_DECLARATOR_, _SIMPLE_DECLARATOR_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANY_DECLARATOR, "<any declarator>");
    r = simple_declarator(b, l + 1);
    if (!r) r = array_declarator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <any_declarator> { "," <any_declarator> }*
  public static boolean any_declarators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any_declarators")) return false;
    if (!nextTokenIs(b, _ANY_DECLARATOR_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = any_declarator(b, l + 1);
    r = r && any_declarators_1(b, l + 1);
    exit_section_(b, m, ANY_DECLARATORS, r);
    return r;
  }

  // { "," <any_declarator> }*
  private static boolean any_declarators_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any_declarators_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!any_declarators_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "any_declarators_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," <any_declarator>
  private static boolean any_declarators_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any_declarators_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && any_declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "any"
  //    <definition> ::+ <except_dcl> ";"
  //                   | <interface_dcl> ";"
  public static boolean any_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANY_TYPE, "<any type>");
    r = any_type_0(b, l + 1);
    if (!r) r = any_type_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "any"
  //    <definition> ::+ <except_dcl> ";"
  private static boolean any_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any_type_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "any");
    r = r && definition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <interface_dcl> ";"
  private static boolean any_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any_type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interface_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <identifier> <fixed_array_size>+
  public static boolean array_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_declarator")) return false;
    if (!nextTokenIs(b, _IDENTIFIER_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _IDENTIFIER_);
    r = r && array_declarator_1(b, l + 1);
    exit_section_(b, m, ARRAY_DECLARATOR, r);
    return r;
  }

  // <fixed_array_size>+
  private static boolean array_declarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_declarator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fixed_array_size(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!fixed_array_size(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_declarator_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <readonly_attr_spec>
  //                 | <attr_spec>
  public static boolean attr_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_dcl")) return false;
    if (!nextTokenIs(b, "<attr dcl>", _ATTR_SPEC_, _READONLY_ATTR_SPEC_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTR_DCL, "<attr dcl>");
    r = readonly_attr_spec(b, l + 1);
    if (!r) r = attr_spec(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <simple_declarator> <attr_raises_expr>
  //                        | <simple_declarator> { "," <simple_declarator> }*
  public static boolean attr_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_declarator")) return false;
    if (!nextTokenIs(b, _SIMPLE_DECLARATOR_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_declarator(b, l + 1);
    if (!r) r = attr_declarator_1(b, l + 1);
    exit_section_(b, m, ATTR_DECLARATOR, r);
    return r;
  }

  // <simple_declarator> { "," <simple_declarator> }*
  private static boolean attr_declarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_declarator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_declarator(b, l + 1);
    r = r && attr_declarator_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { "," <simple_declarator> }*
  private static boolean attr_declarator_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_declarator_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!attr_declarator_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "attr_declarator_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," <simple_declarator>
  private static boolean attr_declarator_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_declarator_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && simple_declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <get_excep_expr> [ <set_excep_expr> ]
  //                         | <set_excep_expr>
  public static boolean attr_raises_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_raises_expr")) return false;
    if (!nextTokenIs(b, "<attr raises expr>", _GET_EXCEP_EXPR_, _SET_EXCEP_EXPR_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTR_RAISES_EXPR, "<attr raises expr>");
    r = attr_raises_expr_0(b, l + 1);
    if (!r) r = set_excep_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <get_excep_expr> [ <set_excep_expr> ]
  private static boolean attr_raises_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_raises_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = get_excep_expr(b, l + 1);
    r = r && attr_raises_expr_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ <set_excep_expr> ]
  private static boolean attr_raises_expr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_raises_expr_0_1")) return false;
    set_excep_expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "attribute" <type_spec> <attr_declarator>
  public static boolean attr_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTR_SPEC, "<attr spec>");
    r = consumeToken(b, "attribute");
    r = r && type_spec(b, l + 1);
    r = r && attr_declarator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <integer_type>
  //                       | <floating_pt_type>
  //                       | <char_type>
  //                       | <wide_char_type>
  //                       | <boolean_type>
  //                       | <octet_type>
  public static boolean base_type_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_type_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASE_TYPE_SPEC, "<base type spec>");
    r = integer_type(b, l + 1);
    if (!r) r = floating_pt_type(b, l + 1);
    if (!r) r = char_type(b, l + 1);
    if (!r) r = wide_char_type(b, l + 1);
    if (!r) r = boolean_type(b, l + 1);
    if (!r) r = octet_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <identifier>
  //  <type_spec> ::+ <template_type_spec>
  //  <declarator> ::+ <array_declarator>
  //  <definition> ::+ <annotation_dcl> " ;"
  public static boolean bit_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_value")) return false;
    if (!nextTokenIs(b, _IDENTIFIER_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, _IDENTIFIER_, _TYPE_SPEC_);
    exit_section_(b, m, BIT_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // <bitfield_spec> <identifier>* ";"
  public static boolean bitfield(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitfield")) return false;
    if (!nextTokenIs(b, _BITFIELD_SPEC_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bitfield_spec(b, l + 1);
    r = r && bitfield_1(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, BITFIELD, r);
    return r;
  }

  // <identifier>*
  private static boolean bitfield_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitfield_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, _IDENTIFIER_)) break;
      if (!empty_element_parsed_guard_(b, "bitfield_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // "bitfield" "<" <positive_int_const> ">"
  //                    | "bitfield" "<" <positive_int_const> "," <destination_type> ">"
  public static boolean bitfield_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitfield_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BITFIELD_SPEC, "<bitfield spec>");
    r = bitfield_spec_0(b, l + 1);
    if (!r) r = bitfield_spec_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "bitfield" "<" <positive_int_const> ">"
  private static boolean bitfield_spec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitfield_spec_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "bitfield");
    r = r && consumeToken(b, "<");
    r = r && positive_int_const(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  // "bitfield" "<" <positive_int_const> "," <destination_type> ">"
  private static boolean bitfield_spec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitfield_spec_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "bitfield");
    r = r && consumeToken(b, "<");
    r = r && positive_int_const(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && destination_type(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "bitmask" <identifier> "{" <bit_value> { "," <bit_value> }* "}"
  public static boolean bitmask_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitmask_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BITMASK_DCL, "<bitmask dcl>");
    r = consumeToken(b, "bitmask");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && consumeToken(b, "{");
    r = r && bit_value(b, l + 1);
    r = r && bitmask_dcl_4(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // { "," <bit_value> }*
  private static boolean bitmask_dcl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitmask_dcl_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!bitmask_dcl_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "bitmask_dcl_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," <bit_value>
  private static boolean bitmask_dcl_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitmask_dcl_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && bit_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "bitset" <identifier> [":" <scoped_name>] "{" <bitfield>* "}"
  public static boolean bitset_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitset_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BITSET_DCL, "<bitset dcl>");
    r = consumeToken(b, "bitset");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && bitset_dcl_2(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && bitset_dcl_4(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [":" <scoped_name>]
  private static boolean bitset_dcl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitset_dcl_2")) return false;
    bitset_dcl_2_0(b, l + 1);
    return true;
  }

  // ":" <scoped_name>
  private static boolean bitset_dcl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitset_dcl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && scoped_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <bitfield>*
  private static boolean bitset_dcl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitset_dcl_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!bitfield(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "bitset_dcl_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // "TRUE" | "FALSE"
  public static boolean boolean_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_LITERAL, "<boolean literal>");
    r = consumeToken(b, "TRUE");
    if (!r) r = consumeToken(b, "FALSE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "boolean"
  public static boolean boolean_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_TYPE, "<boolean type>");
    r = consumeToken(b, "boolean");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <case_label>+ <element_spec> ";"
  public static boolean case_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_$")) return false;
    if (!nextTokenIs(b, _CASE_LABEL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = case_0(b, l + 1);
    r = r && element_spec(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, CASE, r);
    return r;
  }

  // <case_label>+
  private static boolean case_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = case_label(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!case_label(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "case_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "case" <const_expr> ":"
  //                   | "default" ":"
  public static boolean case_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_label")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_LABEL, "<case label>");
    r = case_label_0(b, l + 1);
    if (!r) r = case_label_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "case" <const_expr> ":"
  private static boolean case_label_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_label_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "case");
    r = r && const_expr(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // "default" ":"
  private static boolean case_label_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_label_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "default");
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "char"
  public static boolean char_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "char_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CHAR_TYPE, "<char type>");
    r = consumeToken(b, "char");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <component_export>*
  public static boolean component_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_body")) return false;
    Marker m = enter_section_(b, l, _NONE_, COMPONENT_BODY, "<component body>");
    int c = current_position_(b);
    while (true) {
      if (!component_export(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "component_body", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // <component_def>
  //                      | <component_forward_dcl>
  public static boolean component_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_dcl")) return false;
    if (!nextTokenIs(b, "<component dcl>", _COMPONENT_DEF_, _COMPONENT_FORWARD_DCL_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPONENT_DCL, "<component dcl>");
    r = component_def(b, l + 1);
    if (!r) r = component_forward_dcl(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <component_header> "{" <component_body> "}"
  public static boolean component_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_def")) return false;
    if (!nextTokenIs(b, _COMPONENT_HEADER_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = component_header(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && component_body(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, COMPONENT_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // <provides_dcl> ";"
  //                         | <uses_dcl> ";"
  //                         | <attr_dcl> ";"
  public static boolean component_export(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_export")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPONENT_EXPORT, "<component export>");
    r = component_export_0(b, l + 1);
    if (!r) r = component_export_1(b, l + 1);
    if (!r) r = component_export_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <provides_dcl> ";"
  private static boolean component_export_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_export_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = provides_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // <uses_dcl> ";"
  private static boolean component_export_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_export_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = uses_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // <attr_dcl> ";"
  private static boolean component_export_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_export_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attr_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "component" <identifier>
  public static boolean component_forward_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_forward_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPONENT_FORWARD_DCL, "<component forward dcl>");
    r = consumeToken(b, "component");
    r = r && consumeToken(b, _IDENTIFIER_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "component" <identifier> [ <component_inheritance_spec> ]
  public static boolean component_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPONENT_HEADER, "<component header>");
    r = consumeToken(b, "component");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && component_header_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ <component_inheritance_spec> ]
  private static boolean component_header_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_header_2")) return false;
    component_inheritance_spec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ":" <scoped_name>
  public static boolean component_inheritance_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_inheritance_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPONENT_INHERITANCE_SPEC, "<component inheritance spec>");
    r = consumeToken(b, ":");
    r = r && scoped_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <connector_header> "{" <connector_export>+ "}"
  public static boolean connector_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connector_dcl")) return false;
    if (!nextTokenIs(b, _CONNECTOR_HEADER_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = connector_header(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && connector_dcl_2(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, CONNECTOR_DCL, r);
    return r;
  }

  // <connector_export>+
  private static boolean connector_dcl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connector_dcl_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = connector_export(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!connector_export(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "connector_dcl_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <port_ref>
  //                         | <attr_dcl> ";"
  //  <definition> ::+ <template_module_dcl> ";"
  //                 | <template_module_inst> ";"
  public static boolean connector_export(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connector_export")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONNECTOR_EXPORT, "<connector export>");
    r = port_ref(b, l + 1);
    if (!r) r = connector_export_1(b, l + 1);
    if (!r) r = connector_export_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <attr_dcl> ";"
  //  <definition> ::+ <template_module_dcl> ";"
  private static boolean connector_export_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connector_export_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attr_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && definition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <template_module_inst> ";"
  private static boolean connector_export_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connector_export_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = template_module_inst(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "connector" <identifier> [ <connector_inherit_spec> ]
  public static boolean connector_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connector_header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONNECTOR_HEADER, "<connector header>");
    r = consumeToken(b, "connector");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && connector_header_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ <connector_inherit_spec> ]
  private static boolean connector_header_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connector_header_2")) return false;
    connector_inherit_spec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ":" <scoped_name>
  public static boolean connector_inherit_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connector_inherit_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONNECTOR_INHERIT_SPEC, "<connector inherit spec>");
    r = consumeToken(b, ":");
    r = r && scoped_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "const" <const_type> <identifier> "=" <const_expr>
  public static boolean const_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONST_DCL, "<const dcl>");
    r = consumeToken(b, "const");
    r = r && const_type(b, l + 1);
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && consumeToken(b, "=");
    r = r && const_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <or_expr>
  public static boolean const_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_expr")) return false;
    if (!nextTokenIs(b, _OR_EXPR_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = or_expr(b, l + 1);
    exit_section_(b, m, CONST_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // <integer_type>
  //                   | <floating_pt_type>
  //                   | <fixed_pt_const_type>
  //                   | <char_type>
  //                   | <wide_char_type>
  //                   | <boolean_type>
  //                   | <octet_type>
  //                   | <string_type>
  //                   | <wide_string_type>
  //                   | <scoped_name>
  public static boolean const_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONST_TYPE, "<const type>");
    r = integer_type(b, l + 1);
    if (!r) r = floating_pt_type(b, l + 1);
    if (!r) r = fixed_pt_const_type(b, l + 1);
    if (!r) r = char_type(b, l + 1);
    if (!r) r = wide_char_type(b, l + 1);
    if (!r) r = boolean_type(b, l + 1);
    if (!r) r = octet_type(b, l + 1);
    if (!r) r = string_type(b, l + 1);
    if (!r) r = wide_string_type(b, l + 1);
    if (!r) r = scoped_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <struct_dcl>
  //                        | <union_dcl>
  //                        | <enum_dcl>
  public static boolean constr_type_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constr_type_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTR_TYPE_DCL, "<constr type dcl>");
    r = struct_dcl(b, l + 1);
    if (!r) r = union_dcl(b, l + 1);
    if (!r) r = enum_dcl(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "consumes" <scoped_name> <identifier>
  //    <home_header> ::+ "home" <identifier>
  public static boolean consumes_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "consumes_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSUMES_DCL, "<consumes dcl>");
    r = consumeToken(b, "consumes");
    r = r && scoped_name(b, l + 1);
    r = r && consumeTokens(b, 0, _IDENTIFIER_, _HOME_HEADER_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "context" "(" <string_literal> { "," <string_literal>* } ")"
  //    <value_dcl> ::+ <value_box_def>
  //                  | <value_abs_def>
  public static boolean context_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTEXT_EXPR, "<context expr>");
    r = context_expr_0(b, l + 1);
    if (!r) r = value_abs_def(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "context" "(" <string_literal> { "," <string_literal>* } ")"
  //    <value_dcl> ::+ <value_box_def>
  private static boolean context_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "context");
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, _STRING_LITERAL_);
    r = r && context_expr_0_3(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && value_dcl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "," <string_literal>*
  private static boolean context_expr_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_expr_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && context_expr_0_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <string_literal>*
  private static boolean context_expr_0_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_expr_0_3_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, _STRING_LITERAL_)) break;
      if (!empty_element_parsed_guard_(b, "context_expr_0_3_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // <simple_declarator>
  //    <base_type_spec> ::+ <any_type>
  public static boolean declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarator")) return false;
    if (!nextTokenIs(b, _SIMPLE_DECLARATOR_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_declarator(b, l + 1);
    r = r && base_type_spec(b, l + 1);
    exit_section_(b, m, DECLARATOR, r);
    return r;
  }

  /* ********************************************************** */
  // <declarator> { "," <declarator> }*
  public static boolean declarators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarators")) return false;
    if (!nextTokenIs(b, _DECLARATOR_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declarator(b, l + 1);
    r = r && declarators_1(b, l + 1);
    exit_section_(b, m, DECLARATORS, r);
    return r;
  }

  // { "," <declarator> }*
  private static boolean declarators_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarators_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!declarators_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declarators_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," <declarator>
  private static boolean declarators_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarators_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <module_dcl> ";"
  //                   | <const_dcl> ";"
  //                   | <type_dcl> ";"
  public static boolean definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINITION, "<definition>");
    r = definition_0(b, l + 1);
    if (!r) r = definition_1(b, l + 1);
    if (!r) r = definition_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <module_dcl> ";"
  private static boolean definition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definition_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = module_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // <const_dcl> ";"
  private static boolean definition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = const_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // <type_dcl> ";"
  private static boolean definition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definition_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <boolean_type> | <octet_type> | <integer_type>
  public static boolean destination_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "destination_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DESTINATION_TYPE, "<destination type>");
    r = boolean_type(b, l + 1);
    if (!r) r = octet_type(b, l + 1);
    if (!r) r = integer_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <type_spec> <declarator>
  public static boolean element_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_spec")) return false;
    if (!nextTokenIs(b, _TYPE_SPEC_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_spec(b, l + 1);
    r = r && declarator(b, l + 1);
    exit_section_(b, m, ELEMENT_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // "emits" <scoped_name> <identifier>
  public static boolean emits_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "emits_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EMITS_DCL, "<emits dcl>");
    r = consumeToken(b, "emits");
    r = r && scoped_name(b, l + 1);
    r = r && consumeToken(b, _IDENTIFIER_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "enum" <identifier>
  //    "{" <enumerator> { "," <enumerator> } * "}"
  public static boolean enum_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_DCL, "<enum dcl>");
    r = consumeToken(b, "enum");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && consumeToken(b, "{");
    r = r && enumerator(b, l + 1);
    r = r && enum_dcl_4(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // { "," <enumerator> } *
  private static boolean enum_dcl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_dcl_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!enum_dcl_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_dcl_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," <enumerator>
  private static boolean enum_dcl_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_dcl_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && enumerator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <identifier>
  public static boolean enumerator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumerator")) return false;
    if (!nextTokenIs(b, _IDENTIFIER_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _IDENTIFIER_);
    exit_section_(b, m, ENUMERATOR, r);
    return r;
  }

  /* ********************************************************** */
  // "abstract" "eventtype" <identifier> [ <value_inheritance_spec> ]
  //    "{" <export>* "}"
  public static boolean event_abs_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_abs_def")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EVENT_ABS_DEF, "<event abs def>");
    r = consumeToken(b, "abstract");
    r = r && consumeToken(b, "eventtype");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && event_abs_def_3(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && event_abs_def_5(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ <value_inheritance_spec> ]
  private static boolean event_abs_def_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_abs_def_3")) return false;
    value_inheritance_spec(b, l + 1);
    return true;
  }

  // <export>*
  private static boolean event_abs_def_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_abs_def_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!export(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "event_abs_def_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // <event_def>
  //                    | <event_abs_def>
  //                    | <event_forward_dcl>
  public static boolean event_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EVENT_DCL, "<event dcl>");
    r = event_def(b, l + 1);
    if (!r) r = event_abs_def(b, l + 1);
    if (!r) r = event_forward_dcl(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <event_header> "{" <value_element> * "}"
  public static boolean event_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_def")) return false;
    if (!nextTokenIs(b, _EVENT_HEADER_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = event_header(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && event_def_2(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, EVENT_DEF, r);
    return r;
  }

  // <value_element> *
  private static boolean event_def_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_def_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!value_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "event_def_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // [ "abstract" ] "eventtype" <identifier>
  public static boolean event_forward_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_forward_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EVENT_FORWARD_DCL, "<event forward dcl>");
    r = event_forward_dcl_0(b, l + 1);
    r = r && consumeToken(b, "eventtype");
    r = r && consumeToken(b, _IDENTIFIER_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ "abstract" ]
  private static boolean event_forward_dcl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_forward_dcl_0")) return false;
    consumeToken(b, "abstract");
    return true;
  }

  /* ********************************************************** */
  // [ "custom" ] "eventtype" <identifier> [ <value_inheritance_spec> ]
  //    <definition> ::+ <porttype_dcl> ";"
  //                   | <connector_dcl> ";"
  public static boolean event_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EVENT_HEADER, "<event header>");
    r = event_header_0(b, l + 1);
    if (!r) r = event_header_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ "custom" ] "eventtype" <identifier> [ <value_inheritance_spec> ]
  //    <definition> ::+ <porttype_dcl> ";"
  private static boolean event_header_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_header_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = event_header_0_0(b, l + 1);
    r = r && consumeToken(b, "eventtype");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && event_header_0_3(b, l + 1);
    r = r && definition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ "custom" ]
  private static boolean event_header_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_header_0_0")) return false;
    consumeToken(b, "custom");
    return true;
  }

  // [ <value_inheritance_spec> ]
  private static boolean event_header_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_header_0_3")) return false;
    value_inheritance_spec(b, l + 1);
    return true;
  }

  // <connector_dcl> ";"
  private static boolean event_header_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_header_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = connector_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "exception" <identifier> "{" <member>* "}"
  public static boolean except_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "except_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXCEPT_DCL, "<except dcl>");
    r = consumeToken(b, "exception");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && consumeToken(b, "{");
    r = r && except_dcl_3(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <member>*
  private static boolean except_dcl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "except_dcl_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "except_dcl_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // "(" <scoped_name> { "," <scoped_name> } * ")"
  //    <export> ::+ <type_dcl> ";"
  //               | <const_dcl> ";"
  //               | <except_dcl> ";"
  //    <definition> ::+ <value_dcl> ";"
  public static boolean exception_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exception_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXCEPTION_LIST, "<exception list>");
    r = exception_list_0(b, l + 1);
    if (!r) r = exception_list_1(b, l + 1);
    if (!r) r = exception_list_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" <scoped_name> { "," <scoped_name> } * ")"
  //    <export> ::+ <type_dcl> ";"
  private static boolean exception_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exception_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && scoped_name(b, l + 1);
    r = r && exception_list_0_2(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && export(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { "," <scoped_name> } *
  private static boolean exception_list_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exception_list_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!exception_list_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exception_list_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," <scoped_name>
  private static boolean exception_list_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exception_list_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && scoped_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <const_dcl> ";"
  private static boolean exception_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exception_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = const_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // <except_dcl> ";"
  //    <definition> ::+ <value_dcl> ";"
  private static boolean exception_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exception_list_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = except_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && definition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <op_dcl> ";"
  //               | <attr_dcl> ";"
  public static boolean export(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export")) return false;
    if (!nextTokenIs(b, "<export>", _ATTR_DCL_, _OP_DCL_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPORT, "<export>");
    r = export_0(b, l + 1);
    if (!r) r = export_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <op_dcl> ";"
  private static boolean export_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = op_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // <attr_dcl> ";"
  private static boolean export_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attr_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "factory" <identifier> "(" [ <factory_param_dcls> ] ")" [ <raises_expr> ]
  public static boolean factory_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factory_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FACTORY_DCL, "<factory dcl>");
    r = consumeToken(b, "factory");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && consumeToken(b, "(");
    r = r && factory_dcl_3(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && factory_dcl_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ <factory_param_dcls> ]
  private static boolean factory_dcl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factory_dcl_3")) return false;
    factory_param_dcls(b, l + 1);
    return true;
  }

  // [ <raises_expr> ]
  private static boolean factory_dcl_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factory_dcl_5")) return false;
    raises_expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "in" <type_spec> <simple_declarator>
  //    <definition> ::+ <event_dcl> ";"
  //    <component_header> ::+ "component" <identifier>
  public static boolean factory_param_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factory_param_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FACTORY_PARAM_DCL, "<factory param dcl>");
    r = consumeToken(b, "in");
    r = r && type_spec(b, l + 1);
    r = r && simple_declarator(b, l + 1);
    r = r && definition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <factory_param_dcl> {"," <factory_param_dcl>}*
  public static boolean factory_param_dcls(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factory_param_dcls")) return false;
    if (!nextTokenIs(b, _FACTORY_PARAM_DCL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = factory_param_dcl(b, l + 1);
    r = r && factory_param_dcls_1(b, l + 1);
    exit_section_(b, m, FACTORY_PARAM_DCLS, r);
    return r;
  }

  // {"," <factory_param_dcl>}*
  private static boolean factory_param_dcls_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factory_param_dcls_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!factory_param_dcls_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "factory_param_dcls_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," <factory_param_dcl>
  private static boolean factory_param_dcls_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factory_param_dcls_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && factory_param_dcl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "finder" <identifier> "(" [ <init_param_dcls> ] ")" [ <raises_expr> ]
  public static boolean finder_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "finder_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FINDER_DCL, "<finder dcl>");
    r = consumeToken(b, "finder");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && consumeToken(b, "(");
    r = r && finder_dcl_3(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && finder_dcl_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ <init_param_dcls> ]
  private static boolean finder_dcl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "finder_dcl_3")) return false;
    init_param_dcls(b, l + 1);
    return true;
  }

  // [ <raises_expr> ]
  private static boolean finder_dcl_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "finder_dcl_5")) return false;
    raises_expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "[" <positive_int_const> "]"
  public static boolean fixed_array_size(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fixed_array_size")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIXED_ARRAY_SIZE, "<fixed array size>");
    r = consumeToken(b, "[");
    r = r && positive_int_const(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "fixed"
  public static boolean fixed_pt_const_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fixed_pt_const_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIXED_PT_CONST_TYPE, "<fixed pt const type>");
    r = consumeToken(b, "fixed");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "fixed" "<" <positive_int_const> "," <positive_int_const> ">"
  public static boolean fixed_pt_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fixed_pt_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIXED_PT_TYPE, "<fixed pt type>");
    r = consumeToken(b, "fixed");
    r = r && consumeToken(b, "<");
    r = r && positive_int_const(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && positive_int_const(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "float"
  //                         | "double"
  //                         | "long" "double"
  public static boolean floating_pt_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floating_pt_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FLOATING_PT_TYPE, "<floating pt type>");
    r = consumeToken(b, "float");
    if (!r) r = consumeToken(b, "double");
    if (!r) r = floating_pt_type_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "long" "double"
  private static boolean floating_pt_type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floating_pt_type_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "long");
    r = r && consumeToken(b, "double");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <formal_parameter_type> <identifier>
  public static boolean formal_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameter")) return false;
    if (!nextTokenIs(b, _FORMAL_PARAMETER_TYPE_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = formal_parameter_type(b, l + 1);
    r = r && consumeToken(b, _IDENTIFIER_);
    exit_section_(b, m, FORMAL_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // <identifier> { "," <identifier>}*
  //  <struct_def> ::+ "struct" <identifier> ":" <scoped_name> "{" <member>* "}"
  //                 | "struct" <identifier> "{" "}"
  //  <switch_type_spec> ::+ <wide_char_type>
  //                       | <octet_type>
  //  <template_type_spec> ::+ <map_type>
  //  <constr_type_dcl> ::+ <bitset_dcl>
  //                      | <bitmask_dcl>
  public static boolean formal_parameter_names(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameter_names")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_PARAMETER_NAMES, "<formal parameter names>");
    r = formal_parameter_names_0(b, l + 1);
    if (!r) r = formal_parameter_names_1(b, l + 1);
    if (!r) r = octet_type(b, l + 1);
    if (!r) r = bitmask_dcl(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <identifier> { "," <identifier>}*
  //  <struct_def> ::+ "struct" <identifier> ":" <scoped_name> "{" <member>* "}"
  private static boolean formal_parameter_names_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameter_names_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _IDENTIFIER_);
    r = r && formal_parameter_names_0_1(b, l + 1);
    r = r && struct_def(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { "," <identifier>}*
  private static boolean formal_parameter_names_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameter_names_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!formal_parameter_names_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "formal_parameter_names_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," <identifier>
  private static boolean formal_parameter_names_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameter_names_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, _IDENTIFIER_);
    exit_section_(b, m, null, r);
    return r;
  }

  // "struct" <identifier> "{" "}"
  //  <switch_type_spec> ::+ <wide_char_type>
  private static boolean formal_parameter_names_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameter_names_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "struct");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && consumeToken(b, "{");
    r = r && consumeToken(b, "}");
    r = r && switch_type_spec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "typename" | "interface" | "valuetype" | "eventtype"
  //                            | "struct" | "union" | "exception" | "enum" | "sequence"
  //                            | "const" <const_type>
  //                            | <sequence_type>
  public static boolean formal_parameter_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameter_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_PARAMETER_TYPE, "<formal parameter type>");
    r = consumeToken(b, "typename");
    if (!r) r = consumeToken(b, "interface");
    if (!r) r = consumeToken(b, "valuetype");
    if (!r) r = consumeToken(b, "eventtype");
    if (!r) r = consumeToken(b, "struct");
    if (!r) r = consumeToken(b, "union");
    if (!r) r = consumeToken(b, "exception");
    if (!r) r = consumeToken(b, "enum");
    if (!r) r = consumeToken(b, "sequence");
    if (!r) r = formal_parameter_type_9(b, l + 1);
    if (!r) r = sequence_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "const" <const_type>
  private static boolean formal_parameter_type_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameter_type_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "const");
    r = r && const_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <formal_parameter> {"," <formal_parameter>}*
  public static boolean formal_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameters")) return false;
    if (!nextTokenIs(b, _FORMAL_PARAMETER_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = formal_parameter(b, l + 1);
    r = r && formal_parameters_1(b, l + 1);
    exit_section_(b, m, FORMAL_PARAMETERS, r);
    return r;
  }

  // {"," <formal_parameter>}*
  private static boolean formal_parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameters_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!formal_parameters_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "formal_parameters_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," <formal_parameter>
  private static boolean formal_parameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && formal_parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "getraises" <exception_list>
  public static boolean get_excep_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "get_excep_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GET_EXCEP_EXPR, "<get excep expr>");
    r = consumeToken(b, "getraises");
    r = r && exception_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <home_export>*
  public static boolean home_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "home_body")) return false;
    Marker m = enter_section_(b, l, _NONE_, HOME_BODY, "<home body>");
    int c = current_position_(b);
    while (true) {
      if (!home_export(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "home_body", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // <home_header> "{" <home_body> "}"
  public static boolean home_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "home_dcl")) return false;
    if (!nextTokenIs(b, _HOME_HEADER_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = home_header(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && home_body(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, HOME_DCL, r);
    return r;
  }

  /* ********************************************************** */
  // <export>
  //                    | <factory_dcl> ";"
  public static boolean home_export(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "home_export")) return false;
    if (!nextTokenIs(b, "<home export>", _EXPORT_, _FACTORY_DCL_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HOME_EXPORT, "<home export>");
    r = export(b, l + 1);
    if (!r) r = home_export_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <factory_dcl> ";"
  private static boolean home_export_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "home_export_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = factory_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "home" <identifier> [ <home_inheritance_spec> ]
  //    "manages" <scoped_name>
  public static boolean home_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "home_header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HOME_HEADER, "<home header>");
    r = consumeToken(b, "home");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && home_header_2(b, l + 1);
    r = r && consumeToken(b, "manages");
    r = r && scoped_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ <home_inheritance_spec> ]
  private static boolean home_header_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "home_header_2")) return false;
    home_inheritance_spec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ":" <scoped_name>
  public static boolean home_inheritance_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "home_inheritance_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HOME_INHERITANCE_SPEC, "<home inheritance spec>");
    r = consumeToken(b, ":");
    r = r && scoped_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "import" <imported_scope>
  public static boolean import_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_DCL, "<import dcl>");
    r = consumeToken(b, "import");
    r = r && imported_scope(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <scoped_name> | <string_literal>
  //    <base_type_spec> ::+ <object_type>
  public static boolean imported_scope(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imported_scope")) return false;
    if (!nextTokenIs(b, "<imported scope>", _SCOPED_NAME_, _STRING_LITERAL_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORTED_SCOPE, "<imported scope>");
    r = scoped_name(b, l + 1);
    if (!r) r = parseTokens(b, 0, _STRING_LITERAL_, _BASE_TYPE_SPEC_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "in" <type_spec> <simple_declarator>
  public static boolean in_param_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "in_param_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IN_PARAM_DCL, "<in param dcl>");
    r = consumeToken(b, "in");
    r = r && type_spec(b, l + 1);
    r = r && simple_declarator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <in_param_dcl> { "," <in_param_dcl> } *
  public static boolean in_parameter_dcls(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "in_parameter_dcls")) return false;
    if (!nextTokenIs(b, _IN_PARAM_DCL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = in_param_dcl(b, l + 1);
    r = r && in_parameter_dcls_1(b, l + 1);
    exit_section_(b, m, IN_PARAMETER_DCLS, r);
    return r;
  }

  // { "," <in_param_dcl> } *
  private static boolean in_parameter_dcls_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "in_parameter_dcls_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!in_parameter_dcls_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "in_parameter_dcls_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," <in_param_dcl>
  private static boolean in_parameter_dcls_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "in_parameter_dcls_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && in_param_dcl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "factory" <identifier> "(" [ <init_param_dcls> ] ")" [ <raises_expr> ] ";"
  public static boolean init_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INIT_DCL, "<init dcl>");
    r = consumeToken(b, "factory");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && consumeToken(b, "(");
    r = r && init_dcl_3(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && init_dcl_5(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ <init_param_dcls> ]
  private static boolean init_dcl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_dcl_3")) return false;
    init_param_dcls(b, l + 1);
    return true;
  }

  // [ <raises_expr> ]
  private static boolean init_dcl_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_dcl_5")) return false;
    raises_expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "in" <type_spec> <simple_declarator>
  public static boolean init_param_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_param_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INIT_PARAM_DCL, "<init param dcl>");
    r = consumeToken(b, "in");
    r = r && type_spec(b, l + 1);
    r = r && simple_declarator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <init_param_dcl> { "," <init_param_dcl>}*
  public static boolean init_param_dcls(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_param_dcls")) return false;
    if (!nextTokenIs(b, _INIT_PARAM_DCL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = init_param_dcl(b, l + 1);
    r = r && init_param_dcls_1(b, l + 1);
    exit_section_(b, m, INIT_PARAM_DCLS, r);
    return r;
  }

  // { "," <init_param_dcl>}*
  private static boolean init_param_dcls_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_param_dcls_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!init_param_dcls_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "init_param_dcls_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," <init_param_dcl>
  private static boolean init_param_dcls_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_param_dcls_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && init_param_dcl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <signed_int>
  //                     | <unsigned_int>
  public static boolean integer_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_type")) return false;
    if (!nextTokenIs(b, "<integer type>", _SIGNED_INT_, _UNSIGNED_INT_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER_TYPE, "<integer type>");
    r = signed_int(b, l + 1);
    if (!r) r = unsigned_int(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <export>*
  public static boolean interface_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_body")) return false;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_BODY, "<interface body>");
    int c = current_position_(b);
    while (true) {
      if (!export(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_body", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // <interface_def>
  //                      | <interface_forward_dcl>
  public static boolean interface_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_dcl")) return false;
    if (!nextTokenIs(b, "<interface dcl>", _INTERFACE_DEF_, _INTERFACE_FORWARD_DCL_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_DCL, "<interface dcl>");
    r = interface_def(b, l + 1);
    if (!r) r = interface_forward_dcl(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <interface_header> "{" <interface_body> "}"
  public static boolean interface_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_def")) return false;
    if (!nextTokenIs(b, _INTERFACE_HEADER_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interface_header(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && interface_body(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, INTERFACE_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // <interface_kind> <identifier>
  public static boolean interface_forward_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_forward_dcl")) return false;
    if (!nextTokenIs(b, _INTERFACE_KIND_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interface_kind(b, l + 1);
    r = r && consumeToken(b, _IDENTIFIER_);
    exit_section_(b, m, INTERFACE_FORWARD_DCL, r);
    return r;
  }

  /* ********************************************************** */
  // <interface_kind> <identifier>
  //    [ <interface_inheritance_spec> ]
  public static boolean interface_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_header")) return false;
    if (!nextTokenIs(b, _INTERFACE_KIND_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interface_kind(b, l + 1);
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && interface_header_2(b, l + 1);
    exit_section_(b, m, INTERFACE_HEADER, r);
    return r;
  }

  // [ <interface_inheritance_spec> ]
  private static boolean interface_header_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_header_2")) return false;
    interface_inheritance_spec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ":" <interface_name> { "," <interface_name> }*
  public static boolean interface_inheritance_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_inheritance_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_INHERITANCE_SPEC, "<interface inheritance spec>");
    r = consumeToken(b, ":");
    r = r && interface_name(b, l + 1);
    r = r && interface_inheritance_spec_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // { "," <interface_name> }*
  private static boolean interface_inheritance_spec_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_inheritance_spec_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!interface_inheritance_spec_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_inheritance_spec_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," <interface_name>
  private static boolean interface_inheritance_spec_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_inheritance_spec_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && interface_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "interface"
  public static boolean interface_kind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_kind")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_KIND, "<interface kind>");
    r = consumeToken(b, "interface");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <scoped_name>
  public static boolean interface_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_name")) return false;
    if (!nextTokenIs(b, _SCOPED_NAME_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = scoped_name(b, l + 1);
    exit_section_(b, m, INTERFACE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // <scoped_name>
  public static boolean interface_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_type")) return false;
    if (!nextTokenIs(b, _SCOPED_NAME_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = scoped_name(b, l + 1);
    exit_section_(b, m, INTERFACE_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // <integer_literal>
  //                | <floating_pt_literal>
  //                | <fixed_pt_literal>
  //                | <character_literal>
  //                | <wide_character_literal>
  //                | <boolean_literal>
  //                | <string_literal>
  //                | <wide_string_literal>
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, _INTEGER_LITERAL_);
    if (!r) r = consumeToken(b, _FLOATING_PT_LITERAL_);
    if (!r) r = consumeToken(b, _FIXED_PT_LITERAL_);
    if (!r) r = consumeToken(b, _CHARACTER_LITERAL_);
    if (!r) r = consumeToken(b, _WIDE_CHARACTER_LITERAL_);
    if (!r) r = boolean_literal(b, l + 1);
    if (!r) r = consumeToken(b, _STRING_LITERAL_);
    if (!r) r = consumeToken(b, _WIDE_STRING_LITERAL_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "map" "<" <type_spec> "," <type_spec> "," <positive_int_const> ">"
  //               | "map" "<" <type_spec> "," <type_spec> ">"
  public static boolean map_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAP_TYPE, "<map type>");
    r = map_type_0(b, l + 1);
    if (!r) r = map_type_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "map" "<" <type_spec> "," <type_spec> "," <positive_int_const> ">"
  private static boolean map_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_type_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "map");
    r = r && consumeToken(b, "<");
    r = r && type_spec(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && type_spec(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && positive_int_const(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  // "map" "<" <type_spec> "," <type_spec> ">"
  private static boolean map_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "map");
    r = r && consumeToken(b, "<");
    r = r && type_spec(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && type_spec(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <type_spec> <declarators> ";"
  public static boolean member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member")) return false;
    if (!nextTokenIs(b, _TYPE_SPEC_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_spec(b, l + 1);
    r = r && declarators(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, MEMBER, r);
    return r;
  }

  /* ********************************************************** */
  // "module" <identifier> "{" <definition>+ "}"
  public static boolean module_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_DCL, "<module dcl>");
    r = consumeToken(b, "module");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && consumeToken(b, "{");
    r = r && module_dcl_3(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <definition>+
  private static boolean module_dcl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_dcl_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = definition(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!definition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_dcl_3", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <unary_expr>
  //                  | <mult_expr> "*" <unary_expr>
  //                  | <mult_expr> "/" <unary_expr>
  //                  | <mult_expr> "%" <unary_expr>
  public static boolean mult_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mult_expr")) return false;
    if (!nextTokenIs(b, "<mult expr>", _MULT_EXPR_, _UNARY_EXPR_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULT_EXPR, "<mult expr>");
    r = unary_expr(b, l + 1);
    if (!r) r = mult_expr_1(b, l + 1);
    if (!r) r = mult_expr_2(b, l + 1);
    if (!r) r = mult_expr_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <mult_expr> "*" <unary_expr>
  private static boolean mult_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mult_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mult_expr(b, l + 1);
    r = r && consumeToken(b, "*");
    r = r && unary_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <mult_expr> "/" <unary_expr>
  private static boolean mult_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mult_expr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mult_expr(b, l + 1);
    r = r && consumeToken(b, "/");
    r = r && unary_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <mult_expr> "%" <unary_expr>
  private static boolean mult_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mult_expr_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mult_expr(b, l + 1);
    r = r && consumeToken(b, "%");
    r = r && unary_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "native" <simple_declarator>
  public static boolean native_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "native_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NATIVE_DCL, "<native dcl>");
    r = consumeToken(b, "native");
    r = r && simple_declarator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "Object"
  //    <interface_kind> ::+ "local" "interface"
  public static boolean object_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_TYPE, "<object type>");
    r = consumeToken(b, "Object");
    r = r && interface_kind(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "octet"
  public static boolean octet_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "octet_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OCTET_TYPE, "<octet type>");
    r = consumeToken(b, "octet");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <op_type_spec> <identifier> "(" [ <parameter_dcls> ] ")" [ <raises_expr> ]
  public static boolean op_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op_dcl")) return false;
    if (!nextTokenIs(b, _OP_TYPE_SPEC_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = op_type_spec(b, l + 1);
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && consumeToken(b, "(");
    r = r && op_dcl_3(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && op_dcl_5(b, l + 1);
    exit_section_(b, m, OP_DCL, r);
    return r;
  }

  // [ <parameter_dcls> ]
  private static boolean op_dcl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op_dcl_3")) return false;
    parameter_dcls(b, l + 1);
    return true;
  }

  // [ <raises_expr> ]
  private static boolean op_dcl_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op_dcl_5")) return false;
    raises_expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "oneway" "void" <identifier> "(" [ <in_parameter_dcls> ] ")"
  public static boolean op_oneway_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op_oneway_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OP_ONEWAY_DCL, "<op oneway dcl>");
    r = consumeToken(b, "oneway");
    r = r && consumeToken(b, "void");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && consumeToken(b, "(");
    r = r && op_oneway_dcl_4(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ <in_parameter_dcls> ]
  private static boolean op_oneway_dcl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op_oneway_dcl_4")) return false;
    in_parameter_dcls(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <type_spec>
  //                     | "void"
  public static boolean op_type_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op_type_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OP_TYPE_SPEC, "<op type spec>");
    r = type_spec(b, l + 1);
    if (!r) r = consumeToken(b, "void");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // {<op_dcl> | <op_oneway_dcl>} <context_expr>
  public static boolean op_with_context(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op_with_context")) return false;
    if (!nextTokenIs(b, "<op with context>", _OP_DCL_, _OP_ONEWAY_DCL_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OP_WITH_CONTEXT, "<op with context>");
    r = op_with_context_0(b, l + 1);
    r = r && context_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <op_dcl> | <op_oneway_dcl>
  private static boolean op_with_context_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op_with_context_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = op_dcl(b, l + 1);
    if (!r) r = op_oneway_dcl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <xor_expr>
  //                | <or_expr> "|" <xor_expr>
  public static boolean or_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_expr")) return false;
    if (!nextTokenIs(b, "<or expr>", _OR_EXPR_, _XOR_EXPR_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OR_EXPR, "<or expr>");
    r = xor_expr(b, l + 1);
    if (!r) r = or_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <or_expr> "|" <xor_expr>
  private static boolean or_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = or_expr(b, l + 1);
    r = r && consumeToken(b, "|");
    r = r && xor_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "in"
  //                        | "out"
  //                        | "inout"
  public static boolean param_attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_attribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM_ATTRIBUTE, "<param attribute>");
    r = consumeToken(b, "in");
    if (!r) r = consumeToken(b, "out");
    if (!r) r = consumeToken(b, "inout");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <param_attribute> <type_spec> <simple_declarator>
  public static boolean param_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_dcl")) return false;
    if (!nextTokenIs(b, _PARAM_ATTRIBUTE_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = param_attribute(b, l + 1);
    r = r && type_spec(b, l + 1);
    r = r && simple_declarator(b, l + 1);
    exit_section_(b, m, PARAM_DCL, r);
    return r;
  }

  /* ********************************************************** */
  // <param_dcl> { "," <param_dcl> } *
  public static boolean parameter_dcls(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_dcls")) return false;
    if (!nextTokenIs(b, _PARAM_DCL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = param_dcl(b, l + 1);
    r = r && parameter_dcls_1(b, l + 1);
    exit_section_(b, m, PARAMETER_DCLS, r);
    return r;
  }

  // { "," <param_dcl> } *
  private static boolean parameter_dcls_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_dcls_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!parameter_dcls_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameter_dcls_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," <param_dcl>
  private static boolean parameter_dcls_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_dcls_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && param_dcl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <port_ref> <port_export>*
  public static boolean port_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_body")) return false;
    if (!nextTokenIs(b, _PORT_REF_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = port_ref(b, l + 1);
    r = r && port_body_1(b, l + 1);
    exit_section_(b, m, PORT_BODY, r);
    return r;
  }

  // <port_export>*
  private static boolean port_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_body_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!port_export(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "port_body_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // {"port" | "mirrorport"} <scoped_name> <identifier>
  //    <component_export> ::+ <port_dcl> ";"
  public static boolean port_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PORT_DCL, "<port dcl>");
    r = port_dcl_0(b, l + 1);
    r = r && scoped_name(b, l + 1);
    r = r && consumeTokens(b, 0, _IDENTIFIER_, _COMPONENT_EXPORT_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "port" | "mirrorport"
  private static boolean port_dcl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_dcl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "port");
    if (!r) r = consumeToken(b, "mirrorport");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <port_ref>
  //                    | <attr_dcl> ";"
  public static boolean port_export(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_export")) return false;
    if (!nextTokenIs(b, "<port export>", _ATTR_DCL_, _PORT_REF_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PORT_EXPORT, "<port export>");
    r = port_ref(b, l + 1);
    if (!r) r = port_export_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <attr_dcl> ";"
  private static boolean port_export_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_export_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attr_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <provides_dcl> ";"
  //                 | <uses_dcl> ";"
  //                 | <port_dcl> ";"
  public static boolean port_ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_ref")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PORT_REF, "<port ref>");
    r = port_ref_0(b, l + 1);
    if (!r) r = port_ref_1(b, l + 1);
    if (!r) r = port_ref_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <provides_dcl> ";"
  private static boolean port_ref_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_ref_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = provides_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // <uses_dcl> ";"
  private static boolean port_ref_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_ref_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = uses_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // <port_dcl> ";"
  private static boolean port_ref_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_ref_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = port_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <porttype_def>
  //                     | <porttype_forward_dcl>
  public static boolean porttype_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "porttype_dcl")) return false;
    if (!nextTokenIs(b, "<porttype dcl>", _PORTTYPE_DEF_, _PORTTYPE_FORWARD_DCL_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PORTTYPE_DCL, "<porttype dcl>");
    r = porttype_def(b, l + 1);
    if (!r) r = porttype_forward_dcl(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "porttype" <identifier> "{ " <port_body> "}"
  public static boolean porttype_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "porttype_def")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PORTTYPE_DEF, "<porttype def>");
    r = consumeToken(b, "porttype");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && consumeToken(b, "{ ");
    r = r && port_body(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "porttype" <identifier>
  public static boolean porttype_forward_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "porttype_forward_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PORTTYPE_FORWARD_DCL, "<porttype forward dcl>");
    r = consumeToken(b, "porttype");
    r = r && consumeToken(b, _IDENTIFIER_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <const_expr>
  public static boolean positive_int_const(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "positive_int_const")) return false;
    if (!nextTokenIs(b, _CONST_EXPR_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = const_expr(b, l + 1);
    exit_section_(b, m, POSITIVE_INT_CONST, r);
    return r;
  }

  /* ********************************************************** */
  // <scoped_name>
  //                     | <literal>
  //                     |  "("<const_expr>")"
  public static boolean primary_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_EXPR, "<primary expr>");
    r = scoped_name(b, l + 1);
    if (!r) r = literal(b, l + 1);
    if (!r) r = primary_expr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "("<const_expr>")"
  private static boolean primary_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && const_expr(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "primarykey" <scoped_name>
  //    <home_export> ::+ <finder_dcl> ";"
  public static boolean primary_key_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_key_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_KEY_SPEC, "<primary key spec>");
    r = consumeToken(b, "primarykey");
    r = r && scoped_name(b, l + 1);
    r = r && home_export(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "provides" <interface_type> <identifier>
  public static boolean provides_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "provides_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROVIDES_DCL, "<provides dcl>");
    r = consumeToken(b, "provides");
    r = r && interface_type(b, l + 1);
    r = r && consumeToken(b, _IDENTIFIER_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "publishes" <scoped_name> <identifier>
  public static boolean publishes_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "publishes_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PUBLISHES_DCL, "<publishes dcl>");
    r = consumeToken(b, "publishes");
    r = r && scoped_name(b, l + 1);
    r = r && consumeToken(b, _IDENTIFIER_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "raises" "(" <scoped_name> { "," <scoped_name> } * ")"
  public static boolean raises_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raises_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RAISES_EXPR, "<raises expr>");
    r = consumeToken(b, "raises");
    r = r && consumeToken(b, "(");
    r = r && scoped_name(b, l + 1);
    r = r && raises_expr_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // { "," <scoped_name> } *
  private static boolean raises_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raises_expr_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!raises_expr_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "raises_expr_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," <scoped_name>
  private static boolean raises_expr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raises_expr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && scoped_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <simple_declarator> <raises_expr>
  //                                 | <simple_declarator> { "," <simple_declarator> }*
  public static boolean readonly_attr_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "readonly_attr_declarator")) return false;
    if (!nextTokenIs(b, _SIMPLE_DECLARATOR_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_declarator(b, l + 1);
    if (!r) r = readonly_attr_declarator_1(b, l + 1);
    exit_section_(b, m, READONLY_ATTR_DECLARATOR, r);
    return r;
  }

  // <simple_declarator> { "," <simple_declarator> }*
  private static boolean readonly_attr_declarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "readonly_attr_declarator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_declarator(b, l + 1);
    r = r && readonly_attr_declarator_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { "," <simple_declarator> }*
  private static boolean readonly_attr_declarator_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "readonly_attr_declarator_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!readonly_attr_declarator_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "readonly_attr_declarator_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," <simple_declarator>
  private static boolean readonly_attr_declarator_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "readonly_attr_declarator_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && simple_declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "readonly" "attribute" <type_spec> <readonly_attr_declarator>
  public static boolean readonly_attr_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "readonly_attr_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, READONLY_ATTR_SPEC, "<readonly attr spec>");
    r = consumeToken(b, "readonly");
    r = r && consumeToken(b, "attribute");
    r = r && type_spec(b, l + 1);
    r = r && readonly_attr_declarator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <identifier>
  //               | "::" <identifier>
  //               | <scoped_name> "::" <identifier>
  public static boolean scoped_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scoped_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCOPED_NAME, "<scoped name>");
    r = consumeToken(b, _IDENTIFIER_);
    if (!r) r = scoped_name_1(b, l + 1);
    if (!r) r = scoped_name_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "::" <identifier>
  private static boolean scoped_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scoped_name_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "::");
    r = r && consumeToken(b, _IDENTIFIER_);
    exit_section_(b, m, null, r);
    return r;
  }

  // <scoped_name> "::" <identifier>
  private static boolean scoped_name_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scoped_name_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = scoped_name(b, l + 1);
    r = r && consumeToken(b, "::");
    r = r && consumeToken(b, _IDENTIFIER_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "sequence" "<" <type_spec> "," <positive_int_const> ">"
  //                      | "sequence" "<" <type_spec> ">"
  public static boolean sequence_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequence_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEQUENCE_TYPE, "<sequence type>");
    r = sequence_type_0(b, l + 1);
    if (!r) r = sequence_type_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "sequence" "<" <type_spec> "," <positive_int_const> ">"
  private static boolean sequence_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequence_type_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "sequence");
    r = r && consumeToken(b, "<");
    r = r && type_spec(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && positive_int_const(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  // "sequence" "<" <type_spec> ">"
  private static boolean sequence_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequence_type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "sequence");
    r = r && consumeToken(b, "<");
    r = r && type_spec(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "setraises" <exception_list>
  public static boolean set_excep_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_excep_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SET_EXCEP_EXPR, "<set excep expr>");
    r = consumeToken(b, "setraises");
    r = r && exception_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <add_expr>
  //                   | <shift_expr> ">>" <add_expr>
  //                   | <shift_expr> "<<" <add_expr>
  public static boolean shift_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expr")) return false;
    if (!nextTokenIs(b, "<shift expr>", _ADD_EXPR_, _SHIFT_EXPR_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHIFT_EXPR, "<shift expr>");
    r = add_expr(b, l + 1);
    if (!r) r = shift_expr_1(b, l + 1);
    if (!r) r = shift_expr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <shift_expr> ">>" <add_expr>
  private static boolean shift_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = shift_expr(b, l + 1);
    r = r && consumeToken(b, ">>");
    r = r && add_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <shift_expr> "<<" <add_expr>
  private static boolean shift_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = shift_expr(b, l + 1);
    r = r && consumeToken(b, "<<");
    r = r && add_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <signed_short_int>
  //                   | <signed_long_int>
  //                   | <signed_longlong_int>
  public static boolean signed_int(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signed_int")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNED_INT, "<signed int>");
    r = signed_short_int(b, l + 1);
    if (!r) r = signed_long_int(b, l + 1);
    if (!r) r = signed_longlong_int(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "long"
  public static boolean signed_long_int(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signed_long_int")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNED_LONG_INT, "<signed long int>");
    r = consumeToken(b, "long");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "long" "long"
  public static boolean signed_longlong_int(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signed_longlong_int")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNED_LONGLONG_INT, "<signed longlong int>");
    r = consumeToken(b, "long");
    r = r && consumeToken(b, "long");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "short"
  public static boolean signed_short_int(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signed_short_int")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNED_SHORT_INT, "<signed short int>");
    r = consumeToken(b, "short");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <identifier>
  public static boolean simple_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_declarator")) return false;
    if (!nextTokenIs(b, _IDENTIFIER_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _IDENTIFIER_);
    exit_section_(b, m, SIMPLE_DECLARATOR, r);
    return r;
  }

  /* ********************************************************** */
  // <base_type_spec>
  //                        | <scoped_name>
  public static boolean simple_type_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_type_spec")) return false;
    if (!nextTokenIs(b, "<simple type spec>", _BASE_TYPE_SPEC_, _SCOPED_NAME_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_TYPE_SPEC, "<simple type spec>");
    r = base_type_spec(b, l + 1);
    if (!r) r = scoped_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <definition>+
  static boolean specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specification")) return false;
    if (!nextTokenIs(b, _DEFINITION_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = definition(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!definition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "specification", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( "public" | "private" ) <type_spec> <declarators> ";"
  public static boolean state_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "state_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATE_MEMBER, "<state member>");
    r = state_member_0(b, l + 1);
    r = r && type_spec(b, l + 1);
    r = r && declarators(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "public" | "private"
  private static boolean state_member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "state_member_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "public");
    if (!r) r = consumeToken(b, "private");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "string" "<" <positive_int_const> ">"
  //                    | "string"
  public static boolean string_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_TYPE, "<string type>");
    r = string_type_0(b, l + 1);
    if (!r) r = consumeToken(b, "string");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "string" "<" <positive_int_const> ">"
  private static boolean string_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_type_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "string");
    r = r && consumeToken(b, "<");
    r = r && positive_int_const(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <struct_def>
  //                   | <struct_forward_dcl>
  public static boolean struct_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_dcl")) return false;
    if (!nextTokenIs(b, "<struct dcl>", _STRUCT_DEF_, _STRUCT_FORWARD_DCL_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DCL, "<struct dcl>");
    r = struct_def(b, l + 1);
    if (!r) r = struct_forward_dcl(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "struct" <identifier> "{" <member>+ "}"
  public static boolean struct_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_def")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DEF, "<struct def>");
    r = consumeToken(b, "struct");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && consumeToken(b, "{");
    r = r && struct_def_3(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <member>+
  private static boolean struct_def_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_def_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = member(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_def_3", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "struct" <identifier>
  public static boolean struct_forward_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_forward_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_FORWARD_DCL, "<struct forward dcl>");
    r = consumeToken(b, "struct");
    r = r && consumeToken(b, _IDENTIFIER_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "supports" <scoped_name> { "," <scoped_name> }*
  //    <component_export> ::+ <emits_dcl> ";"
  //                         | <publishes_dcl> ";"
  //                         | <consumes_dcl> ";"
  //    <interface_type> ::+ "Object"
  //    <uses_dcl> ::+ "uses" "multiple" <interface_type> <identifier>
  public static boolean supported_interface_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "supported_interface_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUPPORTED_INTERFACE_SPEC, "<supported interface spec>");
    r = supported_interface_spec_0(b, l + 1);
    if (!r) r = supported_interface_spec_1(b, l + 1);
    if (!r) r = supported_interface_spec_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "supports" <scoped_name> { "," <scoped_name> }*
  //    <component_export> ::+ <emits_dcl> ";"
  private static boolean supported_interface_spec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "supported_interface_spec_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "supports");
    r = r && scoped_name(b, l + 1);
    r = r && supported_interface_spec_0_2(b, l + 1);
    r = r && component_export(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { "," <scoped_name> }*
  private static boolean supported_interface_spec_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "supported_interface_spec_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!supported_interface_spec_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "supported_interface_spec_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," <scoped_name>
  private static boolean supported_interface_spec_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "supported_interface_spec_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && scoped_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <publishes_dcl> ";"
  private static boolean supported_interface_spec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "supported_interface_spec_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = publishes_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // <consumes_dcl> ";"
  //    <interface_type> ::+ "Object"
  //    <uses_dcl> ::+ "uses" "multiple" <interface_type> <identifier>
  private static boolean supported_interface_spec_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "supported_interface_spec_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumes_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && interface_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <case>+
  public static boolean switch_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_body")) return false;
    if (!nextTokenIs(b, _CASE_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = case_$(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!case_$(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switch_body", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, SWITCH_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // <integer_type>
  //                         | <char_type>
  //                         | <boolean_type>
  //                         | <scoped_name>
  public static boolean switch_type_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_type_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SWITCH_TYPE_SPEC, "<switch type spec>");
    r = integer_type(b, l + 1);
    if (!r) r = char_type(b, l + 1);
    if (!r) r = boolean_type(b, l + 1);
    if (!r) r = scoped_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "module" <identifier> "<" <formal_parameters> ">"
  //  "{" <tpl_definition> +"}"
  public static boolean template_module_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_module_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_MODULE_DCL, "<template module dcl>");
    r = consumeToken(b, "module");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && consumeToken(b, "<");
    r = r && formal_parameters(b, l + 1);
    r = r && consumeToken(b, ">");
    r = r && consumeToken(b, "{");
    r = r && template_module_dcl_6(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <tpl_definition> +
  private static boolean template_module_dcl_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_module_dcl_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tpl_definition(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!tpl_definition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "template_module_dcl_6", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "module" <scoped_name> "<" <actual_parameters> ">" <identifier>
  public static boolean template_module_inst(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_module_inst")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_MODULE_INST, "<template module inst>");
    r = consumeToken(b, "module");
    r = r && scoped_name(b, l + 1);
    r = r && consumeToken(b, "<");
    r = r && actual_parameters(b, l + 1);
    r = r && consumeToken(b, ">");
    r = r && consumeToken(b, _IDENTIFIER_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "alias" <scoped_name> "<" <formal_parameter_names> ">" <identifier>
  public static boolean template_module_ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_module_ref")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_MODULE_REF, "<template module ref>");
    r = consumeToken(b, "alias");
    r = r && scoped_name(b, l + 1);
    r = r && consumeToken(b, "<");
    r = r && formal_parameter_names(b, l + 1);
    r = r && consumeToken(b, ">");
    r = r && consumeToken(b, _IDENTIFIER_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <sequence_type>
  //                           | <string_type>
  //                           | <wide_string_type>
  //                           | <fixed_pt_type>
  public static boolean template_type_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_type_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_TYPE_SPEC, "<template type spec>");
    r = sequence_type(b, l + 1);
    if (!r) r = string_type(b, l + 1);
    if (!r) r = wide_string_type(b, l + 1);
    if (!r) r = fixed_pt_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <definition>
  //                     | <template_module_ref> ";"
  public static boolean tpl_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tpl_definition")) return false;
    if (!nextTokenIs(b, "<tpl definition>", _DEFINITION_, _TEMPLATE_MODULE_REF_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TPL_DEFINITION, "<tpl definition>");
    r = definition(b, l + 1);
    if (!r) r = tpl_definition_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <template_module_ref> ";"
  private static boolean tpl_definition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tpl_definition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = template_module_ref(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <constr_type_dcl>
  //                 | <native_dcl>
  //                 | <typedef_dcl>
  public static boolean type_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DCL, "<type dcl>");
    r = constr_type_dcl(b, l + 1);
    if (!r) r = native_dcl(b, l + 1);
    if (!r) r = typedef_dcl(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // { <simple_type_spec>
  //                          | <template_type_spec>
  //                          | <constr_type_dcl>
  //                          } <any_declarators>
  public static boolean type_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DECLARATOR, "<type declarator>");
    r = type_declarator_0(b, l + 1);
    r = r && any_declarators(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <simple_type_spec>
  //                          | <template_type_spec>
  //                          | <constr_type_dcl>
  private static boolean type_declarator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declarator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_type_spec(b, l + 1);
    if (!r) r = template_type_spec(b, l + 1);
    if (!r) r = constr_type_dcl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "typeid" <scoped_name> <string_literal>
  public static boolean type_id_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_id_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_ID_DCL, "<type id dcl>");
    r = consumeToken(b, "typeid");
    r = r && scoped_name(b, l + 1);
    r = r && consumeToken(b, _STRING_LITERAL_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "typeprefix" <scoped_name> <string_literal>
  public static boolean type_prefix_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_prefix_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_PREFIX_DCL, "<type prefix dcl>");
    r = consumeToken(b, "typeprefix");
    r = r && scoped_name(b, l + 1);
    r = r && consumeToken(b, _STRING_LITERAL_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <simple_type_spec>
  public static boolean type_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_spec")) return false;
    if (!nextTokenIs(b, _SIMPLE_TYPE_SPEC_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_type_spec(b, l + 1);
    exit_section_(b, m, TYPE_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // "typedef" <type_declarator>
  public static boolean typedef_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedef_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPEDEF_DCL, "<typedef dcl>");
    r = consumeToken(b, "typedef");
    r = r && type_declarator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <unary_operator> <primary_expr>
  //                   | <primary_expr>
  public static boolean unary_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expr")) return false;
    if (!nextTokenIs(b, "<unary expr>", _PRIMARY_EXPR_, _UNARY_OPERATOR_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_EXPR, "<unary expr>");
    r = unary_operator(b, l + 1);
    if (!r) r = primary_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "-"
  //                       | "+"
  //                       | "~"
  public static boolean unary_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_OPERATOR, "<unary operator>");
    r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "~");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <union_def>
  //                  | <union_forward_dcl>
  public static boolean union_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_dcl")) return false;
    if (!nextTokenIs(b, "<union dcl>", _UNION_DEF_, _UNION_FORWARD_DCL_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNION_DCL, "<union dcl>");
    r = union_def(b, l + 1);
    if (!r) r = union_forward_dcl(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "union" <identifier> "switch" "(" <switch_type_spec> ")"
  //   "{" <switch_body> "}"
  public static boolean union_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_def")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNION_DEF, "<union def>");
    r = consumeToken(b, "union");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && consumeToken(b, "switch");
    r = r && consumeToken(b, "(");
    r = r && switch_type_spec(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, "{");
    r = r && switch_body(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "union" <identifier>
  public static boolean union_forward_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_forward_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNION_FORWARD_DCL, "<union forward dcl>");
    r = consumeToken(b, "union");
    r = r && consumeToken(b, _IDENTIFIER_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <unsigned_short_int>
  //                     | <unsigned_long_int>
  //                     | <unsigned_longlong_int>
  public static boolean unsigned_int(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unsigned_int")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNSIGNED_INT, "<unsigned int>");
    r = unsigned_short_int(b, l + 1);
    if (!r) r = unsigned_long_int(b, l + 1);
    if (!r) r = unsigned_longlong_int(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "unsigned" "long"
  public static boolean unsigned_long_int(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unsigned_long_int")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNSIGNED_LONG_INT, "<unsigned long int>");
    r = consumeToken(b, "unsigned");
    r = r && consumeToken(b, "long");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "unsigned" "long" "long"
  public static boolean unsigned_longlong_int(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unsigned_longlong_int")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNSIGNED_LONGLONG_INT, "<unsigned longlong int>");
    r = consumeToken(b, "unsigned");
    r = r && consumeToken(b, "long");
    r = r && consumeToken(b, "long");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "unsigned" "short"
  public static boolean unsigned_short_int(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unsigned_short_int")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNSIGNED_SHORT_INT, "<unsigned short int>");
    r = consumeToken(b, "unsigned");
    r = r && consumeToken(b, "short");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "uses" <interface_type> <identifier>
  //    <definition> ::+ <home_dcl> ";"
  public static boolean uses_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "uses_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, USES_DCL, "<uses dcl>");
    r = consumeToken(b, "uses");
    r = r && interface_type(b, l + 1);
    r = r && consumeTokens(b, 0, _IDENTIFIER_, _DEFINITION_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "abstract" "valuetype" <identifier> [ <value_inheritance_spec> ]
  //    "{" <export>* "}"
  //    <value_kind> ::+ "custom" "valuetype"
  //    <interface_kind> ::+ "abstract" "interface"
  //    <value_inheritance_spec> ::+ ":"
  public static boolean value_abs_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_abs_def")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_ABS_DEF, "<value abs def>");
    r = consumeToken(b, "abstract");
    r = r && consumeToken(b, "valuetype");
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && value_abs_def_3(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && value_abs_def_5(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && value_kind(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ <value_inheritance_spec> ]
  private static boolean value_abs_def_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_abs_def_3")) return false;
    value_inheritance_spec(b, l + 1);
    return true;
  }

  // <export>*
  private static boolean value_abs_def_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_abs_def_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!export(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "value_abs_def_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // "ValueBase"
  //    <definition> ::+ <component_dcl> ";"
  public static boolean value_base_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_base_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_BASE_TYPE, "<value base type>");
    r = consumeToken(b, "ValueBase");
    r = r && definition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "valuetype" <identifier> <type_spec>
  public static boolean value_box_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_box_def")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_BOX_DEF, "<value box def>");
    r = consumeToken(b, "valuetype");
    r = r && consumeTokens(b, 0, _IDENTIFIER_, _TYPE_SPEC_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <value_def>
  //                  | <value_forward_dcl>
  public static boolean value_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_dcl")) return false;
    if (!nextTokenIs(b, "<value dcl>", _VALUE_DEF_, _VALUE_FORWARD_DCL_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_DCL, "<value dcl>");
    r = value_def(b, l + 1);
    if (!r) r = value_forward_dcl(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <value_header> "{" <value_element>* "}"
  public static boolean value_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_def")) return false;
    if (!nextTokenIs(b, _VALUE_HEADER_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value_header(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && value_def_2(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, VALUE_DEF, r);
    return r;
  }

  // <value_element>*
  private static boolean value_def_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_def_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!value_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "value_def_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // <export>
  //                      | <state_member>
  //                      | <init_dcl>
  public static boolean value_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_ELEMENT, "<value element>");
    r = export(b, l + 1);
    if (!r) r = state_member(b, l + 1);
    if (!r) r = init_dcl(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <value_kind> <identifier>
  //    <definition> ::+ <type_id_dcl> ";"
  //                   | <type_prefix_dcl> ";"
  //                   | <import_dcl> ";"
  //    <export> ::+ <type_id_dcl> ";"
  //               | <type_prefix_dcl> ";"
  //               | <import_dcl> ";"
  //               | <op_oneway_dcl> ";"
  //               | <op_with_context> ";"
  public static boolean value_forward_dcl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_forward_dcl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_FORWARD_DCL, "<value forward dcl>");
    r = value_kind(b, l + 1);
    if (!r) r = value_forward_dcl_1(b, l + 1);
    if (!r) r = value_forward_dcl_2(b, l + 1);
    if (!r) r = value_forward_dcl_3(b, l + 1);
    if (!r) r = value_forward_dcl_4(b, l + 1);
    if (!r) r = value_forward_dcl_5(b, l + 1);
    if (!r) r = value_forward_dcl_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <type_prefix_dcl> ";"
  private static boolean value_forward_dcl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_forward_dcl_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_prefix_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // <import_dcl> ";"
  //    <export> ::+ <type_id_dcl> ";"
  private static boolean value_forward_dcl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_forward_dcl_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && export(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <type_prefix_dcl> ";"
  private static boolean value_forward_dcl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_forward_dcl_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_prefix_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // <import_dcl> ";"
  private static boolean value_forward_dcl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_forward_dcl_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // <op_oneway_dcl> ";"
  private static boolean value_forward_dcl_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_forward_dcl_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = op_oneway_dcl(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // <op_with_context> ";"
  private static boolean value_forward_dcl_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_forward_dcl_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = op_with_context(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <value_kind> <identifier> [ <value_inheritance_spec> ]
  public static boolean value_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_header")) return false;
    if (!nextTokenIs(b, _VALUE_KIND_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value_kind(b, l + 1);
    r = r && consumeToken(b, _IDENTIFIER_);
    r = r && value_header_2(b, l + 1);
    exit_section_(b, m, VALUE_HEADER, r);
    return r;
  }

  // [ <value_inheritance_spec> ]
  private static boolean value_header_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_header_2")) return false;
    value_inheritance_spec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [ ":" <value_name> ] [ "supports" <interface_name> ]
  public static boolean value_inheritance_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_inheritance_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_INHERITANCE_SPEC, "<value inheritance spec>");
    r = value_inheritance_spec_0(b, l + 1);
    r = r && value_inheritance_spec_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ":" <value_name> ]
  private static boolean value_inheritance_spec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_inheritance_spec_0")) return false;
    value_inheritance_spec_0_0(b, l + 1);
    return true;
  }

  // ":" <value_name>
  private static boolean value_inheritance_spec_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_inheritance_spec_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && value_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ "supports" <interface_name> ]
  private static boolean value_inheritance_spec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_inheritance_spec_1")) return false;
    value_inheritance_spec_1_0(b, l + 1);
    return true;
  }

  // "supports" <interface_name>
  private static boolean value_inheritance_spec_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_inheritance_spec_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "supports");
    r = r && interface_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "valuetype"
  public static boolean value_kind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_kind")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_KIND, "<value kind>");
    r = consumeToken(b, "valuetype");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <scoped_name>
  public static boolean value_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_name")) return false;
    if (!nextTokenIs(b, _SCOPED_NAME_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = scoped_name(b, l + 1);
    exit_section_(b, m, VALUE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // "wchar"
  public static boolean wide_char_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wide_char_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WIDE_CHAR_TYPE, "<wide char type>");
    r = consumeToken(b, "wchar");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "wstring" "<" <positive_int_const> ">"
  //                         | "wstring"
  public static boolean wide_string_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wide_string_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WIDE_STRING_TYPE, "<wide string type>");
    r = wide_string_type_0(b, l + 1);
    if (!r) r = consumeToken(b, "wstring");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "wstring" "<" <positive_int_const> ">"
  private static boolean wide_string_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wide_string_type_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "wstring");
    r = r && consumeToken(b, "<");
    r = r && positive_int_const(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <and_expr>
  //                 | <xor_expr> "^" <and_expr>
  public static boolean xor_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xor_expr")) return false;
    if (!nextTokenIs(b, "<xor expr>", _AND_EXPR_, _XOR_EXPR_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, XOR_EXPR, "<xor expr>");
    r = and_expr(b, l + 1);
    if (!r) r = xor_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <xor_expr> "^" <and_expr>
  private static boolean xor_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xor_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xor_expr(b, l + 1);
    r = r && consumeToken(b, "^");
    r = r && and_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
