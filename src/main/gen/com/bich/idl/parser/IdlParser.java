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
    if (t == ADD_EXPR) {
      r = add_expr(b, 0);
    }
    else if (t == AND_EXPR) {
      r = and_expr(b, 0);
    }
    else if (t == ANY_DECLARATOR) {
      r = any_declarator(b, 0);
    }
    else if (t == ANY_DECLARATORS) {
      r = any_declarators(b, 0);
    }
    else if (t == ARRAY_DECLARATOR) {
      r = array_declarator(b, 0);
    }
    else if (t == BASE_TYPE_SPEC) {
      r = base_type_spec(b, 0);
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
    else if (t == DECLARATOR) {
      r = declarator(b, 0);
    }
    else if (t == DECLARATORS) {
      r = declarators(b, 0);
    }
    else if (t == DEFINITION) {
      r = definition(b, 0);
    }
    else if (t == ELEMENT_SPEC) {
      r = element_spec(b, 0);
    }
    else if (t == ENUM_DCL) {
      r = enum_dcl(b, 0);
    }
    else if (t == ENUMERATOR) {
      r = enumerator(b, 0);
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
    else if (t == INTEGER_TYPE) {
      r = integer_type(b, 0);
    }
    else if (t == LITERAL) {
      r = literal(b, 0);
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
    else if (t == OCTET_TYPE) {
      r = octet_type(b, 0);
    }
    else if (t == OR_EXPR) {
      r = or_expr(b, 0);
    }
    else if (t == POSITIVE_INT_CONST) {
      r = positive_int_const(b, 0);
    }
    else if (t == PRIMARY_EXPR) {
      r = primary_expr(b, 0);
    }
    else if (t == SCOPED_NAME) {
      r = scoped_name(b, 0);
    }
    else if (t == SEQUENCE_TYPE) {
      r = sequence_type(b, 0);
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
    else if (t == SWITCH_BODY) {
      r = switch_body(b, 0);
    }
    else if (t == SWITCH_TYPE_SPEC) {
      r = switch_type_spec(b, 0);
    }
    else if (t == TEMPLATE_TYPE_SPEC) {
      r = template_type_spec(b, 0);
    }
    else if (t == TYPE_DCL) {
      r = type_dcl(b, 0);
    }
    else if (t == TYPE_DECLARATOR) {
      r = type_declarator(b, 0);
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
  // <simple_declarator>
  public static boolean declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarator")) return false;
    if (!nextTokenIs(b, _SIMPLE_DECLARATOR_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_declarator(b, l + 1);
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
  // "enum" <identifier>
  //   "{" <enumerator> { "," <enumerator> } * "}"
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
  // <integer_literal>
  //               | <floating_pt_literal>
  //               | <fixed_pt_literal>
  //               | <character_literal>
  //               | <wide_character_literal>
  //               | <boolean_literal>
  //               | <string_literal>
  //               | <wide_string_literal>
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
  //                         | <scoped_name>
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
  //                           | <template_type_spec>
  //                           | <constr_type_dcl>
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
  //                           | <template_type_spec>
  //                           | <constr_type_dcl>
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
