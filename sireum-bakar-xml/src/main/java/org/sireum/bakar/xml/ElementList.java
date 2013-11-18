
package org.sireum.bakar.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Element_List complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Element_List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}not_an_element"/>
 *         &lt;element ref="{}defining_identifier"/>
 *         &lt;element ref="{}defining_character_literal"/>
 *         &lt;element ref="{}defining_enumeration_literal"/>
 *         &lt;element ref="{}defining_and_operator"/>
 *         &lt;element ref="{}defining_or_operator"/>
 *         &lt;element ref="{}defining_xor_operator"/>
 *         &lt;element ref="{}defining_equal_operator"/>
 *         &lt;element ref="{}defining_not_equal_operator"/>
 *         &lt;element ref="{}defining_less_than_operator"/>
 *         &lt;element ref="{}defining_less_than_or_equal_operator"/>
 *         &lt;element ref="{}defining_greater_than_operator"/>
 *         &lt;element ref="{}defining_greater_than_or_equal_operator"/>
 *         &lt;element ref="{}defining_plus_operator"/>
 *         &lt;element ref="{}defining_minus_operator"/>
 *         &lt;element ref="{}defining_concatenate_operator"/>
 *         &lt;element ref="{}defining_unary_plus_operator"/>
 *         &lt;element ref="{}defining_unary_minus_operator"/>
 *         &lt;element ref="{}defining_multiply_operator"/>
 *         &lt;element ref="{}defining_divide_operator"/>
 *         &lt;element ref="{}defining_mod_operator"/>
 *         &lt;element ref="{}defining_rem_operator"/>
 *         &lt;element ref="{}defining_exponentiate_operator"/>
 *         &lt;element ref="{}defining_abs_operator"/>
 *         &lt;element ref="{}defining_not_operator"/>
 *         &lt;element ref="{}defining_expanded_name"/>
 *         &lt;element ref="{}ordinary_type_declaration"/>
 *         &lt;element ref="{}task_type_declaration"/>
 *         &lt;element ref="{}protected_type_declaration"/>
 *         &lt;element ref="{}incomplete_type_declaration"/>
 *         &lt;element ref="{}tagged_incomplete_type_declaration"/>
 *         &lt;element ref="{}private_type_declaration"/>
 *         &lt;element ref="{}private_extension_declaration"/>
 *         &lt;element ref="{}subtype_declaration"/>
 *         &lt;element ref="{}variable_declaration"/>
 *         &lt;element ref="{}constant_declaration"/>
 *         &lt;element ref="{}deferred_constant_declaration"/>
 *         &lt;element ref="{}single_task_declaration"/>
 *         &lt;element ref="{}single_protected_declaration"/>
 *         &lt;element ref="{}integer_number_declaration"/>
 *         &lt;element ref="{}real_number_declaration"/>
 *         &lt;element ref="{}enumeration_literal_specification"/>
 *         &lt;element ref="{}discriminant_specification"/>
 *         &lt;element ref="{}component_declaration"/>
 *         &lt;element ref="{}loop_parameter_specification"/>
 *         &lt;element ref="{}generalized_iterator_specification"/>
 *         &lt;element ref="{}element_iterator_specification"/>
 *         &lt;element ref="{}procedure_declaration"/>
 *         &lt;element ref="{}function_declaration"/>
 *         &lt;element ref="{}parameter_specification"/>
 *         &lt;element ref="{}procedure_body_declaration"/>
 *         &lt;element ref="{}function_body_declaration"/>
 *         &lt;element ref="{}return_variable_specification"/>
 *         &lt;element ref="{}return_constant_specification"/>
 *         &lt;element ref="{}null_procedure_declaration"/>
 *         &lt;element ref="{}expression_function_declaration"/>
 *         &lt;element ref="{}package_declaration"/>
 *         &lt;element ref="{}package_body_declaration"/>
 *         &lt;element ref="{}object_renaming_declaration"/>
 *         &lt;element ref="{}exception_renaming_declaration"/>
 *         &lt;element ref="{}package_renaming_declaration"/>
 *         &lt;element ref="{}procedure_renaming_declaration"/>
 *         &lt;element ref="{}function_renaming_declaration"/>
 *         &lt;element ref="{}generic_package_renaming_declaration"/>
 *         &lt;element ref="{}generic_procedure_renaming_declaration"/>
 *         &lt;element ref="{}generic_function_renaming_declaration"/>
 *         &lt;element ref="{}task_body_declaration"/>
 *         &lt;element ref="{}protected_body_declaration"/>
 *         &lt;element ref="{}entry_declaration"/>
 *         &lt;element ref="{}entry_body_declaration"/>
 *         &lt;element ref="{}entry_index_specification"/>
 *         &lt;element ref="{}procedure_body_stub"/>
 *         &lt;element ref="{}function_body_stub"/>
 *         &lt;element ref="{}package_body_stub"/>
 *         &lt;element ref="{}task_body_stub"/>
 *         &lt;element ref="{}protected_body_stub"/>
 *         &lt;element ref="{}exception_declaration"/>
 *         &lt;element ref="{}choice_parameter_specification"/>
 *         &lt;element ref="{}generic_procedure_declaration"/>
 *         &lt;element ref="{}generic_function_declaration"/>
 *         &lt;element ref="{}generic_package_declaration"/>
 *         &lt;element ref="{}package_instantiation"/>
 *         &lt;element ref="{}procedure_instantiation"/>
 *         &lt;element ref="{}function_instantiation"/>
 *         &lt;element ref="{}formal_object_declaration"/>
 *         &lt;element ref="{}formal_type_declaration"/>
 *         &lt;element ref="{}formal_incomplete_type_declaration"/>
 *         &lt;element ref="{}formal_procedure_declaration"/>
 *         &lt;element ref="{}formal_function_declaration"/>
 *         &lt;element ref="{}formal_package_declaration"/>
 *         &lt;element ref="{}formal_package_declaration_with_box"/>
 *         &lt;element ref="{}derived_type_definition"/>
 *         &lt;element ref="{}derived_record_extension_definition"/>
 *         &lt;element ref="{}enumeration_type_definition"/>
 *         &lt;element ref="{}signed_integer_type_definition"/>
 *         &lt;element ref="{}modular_type_definition"/>
 *         &lt;element ref="{}root_integer_definition"/>
 *         &lt;element ref="{}root_real_definition"/>
 *         &lt;element ref="{}universal_integer_definition"/>
 *         &lt;element ref="{}universal_real_definition"/>
 *         &lt;element ref="{}universal_fixed_definition"/>
 *         &lt;element ref="{}floating_point_definition"/>
 *         &lt;element ref="{}ordinary_fixed_point_definition"/>
 *         &lt;element ref="{}decimal_fixed_point_definition"/>
 *         &lt;element ref="{}unconstrained_array_definition"/>
 *         &lt;element ref="{}constrained_array_definition"/>
 *         &lt;element ref="{}record_type_definition"/>
 *         &lt;element ref="{}tagged_record_type_definition"/>
 *         &lt;element ref="{}ordinary_interface"/>
 *         &lt;element ref="{}limited_interface"/>
 *         &lt;element ref="{}task_interface"/>
 *         &lt;element ref="{}protected_interface"/>
 *         &lt;element ref="{}synchronized_interface"/>
 *         &lt;element ref="{}pool_specific_access_to_variable"/>
 *         &lt;element ref="{}access_to_variable"/>
 *         &lt;element ref="{}access_to_constant"/>
 *         &lt;element ref="{}access_to_procedure"/>
 *         &lt;element ref="{}access_to_protected_procedure"/>
 *         &lt;element ref="{}access_to_function"/>
 *         &lt;element ref="{}access_to_protected_function"/>
 *         &lt;element ref="{}subtype_indication"/>
 *         &lt;element ref="{}range_attribute_reference"/>
 *         &lt;element ref="{}simple_expression_range"/>
 *         &lt;element ref="{}digits_constraint"/>
 *         &lt;element ref="{}delta_constraint"/>
 *         &lt;element ref="{}index_constraint"/>
 *         &lt;element ref="{}discriminant_constraint"/>
 *         &lt;element ref="{}component_definition"/>
 *         &lt;element ref="{}discrete_subtype_indication_as_subtype_definition"/>
 *         &lt;element ref="{}discrete_range_attribute_reference_as_subtype_definition"/>
 *         &lt;element ref="{}discrete_simple_expression_range_as_subtype_definition"/>
 *         &lt;element ref="{}discrete_subtype_indication"/>
 *         &lt;element ref="{}discrete_range_attribute_reference"/>
 *         &lt;element ref="{}discrete_simple_expression_range"/>
 *         &lt;element ref="{}unknown_discriminant_part"/>
 *         &lt;element ref="{}known_discriminant_part"/>
 *         &lt;element ref="{}record_definition"/>
 *         &lt;element ref="{}null_record_definition"/>
 *         &lt;element ref="{}null_component"/>
 *         &lt;element ref="{}variant_part"/>
 *         &lt;element ref="{}variant"/>
 *         &lt;element ref="{}others_choice"/>
 *         &lt;element ref="{}anonymous_access_to_variable"/>
 *         &lt;element ref="{}anonymous_access_to_constant"/>
 *         &lt;element ref="{}anonymous_access_to_procedure"/>
 *         &lt;element ref="{}anonymous_access_to_protected_procedure"/>
 *         &lt;element ref="{}anonymous_access_to_function"/>
 *         &lt;element ref="{}anonymous_access_to_protected_function"/>
 *         &lt;element ref="{}private_type_definition"/>
 *         &lt;element ref="{}tagged_private_type_definition"/>
 *         &lt;element ref="{}private_extension_definition"/>
 *         &lt;element ref="{}task_definition"/>
 *         &lt;element ref="{}protected_definition"/>
 *         &lt;element ref="{}formal_private_type_definition"/>
 *         &lt;element ref="{}formal_tagged_private_type_definition"/>
 *         &lt;element ref="{}formal_derived_type_definition"/>
 *         &lt;element ref="{}formal_discrete_type_definition"/>
 *         &lt;element ref="{}formal_signed_integer_type_definition"/>
 *         &lt;element ref="{}formal_modular_type_definition"/>
 *         &lt;element ref="{}formal_floating_point_definition"/>
 *         &lt;element ref="{}formal_ordinary_fixed_point_definition"/>
 *         &lt;element ref="{}formal_decimal_fixed_point_definition"/>
 *         &lt;element ref="{}formal_ordinary_interface"/>
 *         &lt;element ref="{}formal_limited_interface"/>
 *         &lt;element ref="{}formal_task_interface"/>
 *         &lt;element ref="{}formal_protected_interface"/>
 *         &lt;element ref="{}formal_synchronized_interface"/>
 *         &lt;element ref="{}formal_unconstrained_array_definition"/>
 *         &lt;element ref="{}formal_constrained_array_definition"/>
 *         &lt;element ref="{}formal_pool_specific_access_to_variable"/>
 *         &lt;element ref="{}formal_access_to_variable"/>
 *         &lt;element ref="{}formal_access_to_constant"/>
 *         &lt;element ref="{}formal_access_to_procedure"/>
 *         &lt;element ref="{}formal_access_to_protected_procedure"/>
 *         &lt;element ref="{}formal_access_to_function"/>
 *         &lt;element ref="{}formal_access_to_protected_function"/>
 *         &lt;element ref="{}aspect_specification"/>
 *         &lt;element ref="{}box_expression"/>
 *         &lt;element ref="{}integer_literal"/>
 *         &lt;element ref="{}real_literal"/>
 *         &lt;element ref="{}string_literal"/>
 *         &lt;element ref="{}identifier"/>
 *         &lt;element ref="{}and_operator"/>
 *         &lt;element ref="{}or_operator"/>
 *         &lt;element ref="{}xor_operator"/>
 *         &lt;element ref="{}equal_operator"/>
 *         &lt;element ref="{}not_equal_operator"/>
 *         &lt;element ref="{}less_than_operator"/>
 *         &lt;element ref="{}less_than_or_equal_operator"/>
 *         &lt;element ref="{}greater_than_operator"/>
 *         &lt;element ref="{}greater_than_or_equal_operator"/>
 *         &lt;element ref="{}plus_operator"/>
 *         &lt;element ref="{}minus_operator"/>
 *         &lt;element ref="{}concatenate_operator"/>
 *         &lt;element ref="{}unary_plus_operator"/>
 *         &lt;element ref="{}unary_minus_operator"/>
 *         &lt;element ref="{}multiply_operator"/>
 *         &lt;element ref="{}divide_operator"/>
 *         &lt;element ref="{}mod_operator"/>
 *         &lt;element ref="{}rem_operator"/>
 *         &lt;element ref="{}exponentiate_operator"/>
 *         &lt;element ref="{}abs_operator"/>
 *         &lt;element ref="{}not_operator"/>
 *         &lt;element ref="{}character_literal"/>
 *         &lt;element ref="{}enumeration_literal"/>
 *         &lt;element ref="{}explicit_dereference"/>
 *         &lt;element ref="{}function_call"/>
 *         &lt;element ref="{}indexed_component"/>
 *         &lt;element ref="{}slice"/>
 *         &lt;element ref="{}selected_component"/>
 *         &lt;element ref="{}access_attribute"/>
 *         &lt;element ref="{}address_attribute"/>
 *         &lt;element ref="{}adjacent_attribute"/>
 *         &lt;element ref="{}aft_attribute"/>
 *         &lt;element ref="{}alignment_attribute"/>
 *         &lt;element ref="{}base_attribute"/>
 *         &lt;element ref="{}bit_order_attribute"/>
 *         &lt;element ref="{}body_version_attribute"/>
 *         &lt;element ref="{}callable_attribute"/>
 *         &lt;element ref="{}caller_attribute"/>
 *         &lt;element ref="{}ceiling_attribute"/>
 *         &lt;element ref="{}class_attribute"/>
 *         &lt;element ref="{}component_size_attribute"/>
 *         &lt;element ref="{}compose_attribute"/>
 *         &lt;element ref="{}constrained_attribute"/>
 *         &lt;element ref="{}copy_sign_attribute"/>
 *         &lt;element ref="{}count_attribute"/>
 *         &lt;element ref="{}definite_attribute"/>
 *         &lt;element ref="{}delta_attribute"/>
 *         &lt;element ref="{}denorm_attribute"/>
 *         &lt;element ref="{}digits_attribute"/>
 *         &lt;element ref="{}exponent_attribute"/>
 *         &lt;element ref="{}external_tag_attribute"/>
 *         &lt;element ref="{}first_attribute"/>
 *         &lt;element ref="{}first_bit_attribute"/>
 *         &lt;element ref="{}floor_attribute"/>
 *         &lt;element ref="{}fore_attribute"/>
 *         &lt;element ref="{}fraction_attribute"/>
 *         &lt;element ref="{}identity_attribute"/>
 *         &lt;element ref="{}image_attribute"/>
 *         &lt;element ref="{}input_attribute"/>
 *         &lt;element ref="{}last_attribute"/>
 *         &lt;element ref="{}last_bit_attribute"/>
 *         &lt;element ref="{}leading_part_attribute"/>
 *         &lt;element ref="{}length_attribute"/>
 *         &lt;element ref="{}machine_attribute"/>
 *         &lt;element ref="{}machine_emax_attribute"/>
 *         &lt;element ref="{}machine_emin_attribute"/>
 *         &lt;element ref="{}machine_mantissa_attribute"/>
 *         &lt;element ref="{}machine_overflows_attribute"/>
 *         &lt;element ref="{}machine_radix_attribute"/>
 *         &lt;element ref="{}machine_rounds_attribute"/>
 *         &lt;element ref="{}max_attribute"/>
 *         &lt;element ref="{}max_size_in_storage_elements_attribute"/>
 *         &lt;element ref="{}min_attribute"/>
 *         &lt;element ref="{}model_attribute"/>
 *         &lt;element ref="{}model_emin_attribute"/>
 *         &lt;element ref="{}model_epsilon_attribute"/>
 *         &lt;element ref="{}model_mantissa_attribute"/>
 *         &lt;element ref="{}model_small_attribute"/>
 *         &lt;element ref="{}modulus_attribute"/>
 *         &lt;element ref="{}output_attribute"/>
 *         &lt;element ref="{}partition_id_attribute"/>
 *         &lt;element ref="{}pos_attribute"/>
 *         &lt;element ref="{}position_attribute"/>
 *         &lt;element ref="{}pred_attribute"/>
 *         &lt;element ref="{}range_attribute"/>
 *         &lt;element ref="{}read_attribute"/>
 *         &lt;element ref="{}remainder_attribute"/>
 *         &lt;element ref="{}round_attribute"/>
 *         &lt;element ref="{}rounding_attribute"/>
 *         &lt;element ref="{}safe_first_attribute"/>
 *         &lt;element ref="{}safe_last_attribute"/>
 *         &lt;element ref="{}scale_attribute"/>
 *         &lt;element ref="{}scaling_attribute"/>
 *         &lt;element ref="{}signed_zeros_attribute"/>
 *         &lt;element ref="{}size_attribute"/>
 *         &lt;element ref="{}small_attribute"/>
 *         &lt;element ref="{}storage_pool_attribute"/>
 *         &lt;element ref="{}storage_size_attribute"/>
 *         &lt;element ref="{}succ_attribute"/>
 *         &lt;element ref="{}tag_attribute"/>
 *         &lt;element ref="{}terminated_attribute"/>
 *         &lt;element ref="{}truncation_attribute"/>
 *         &lt;element ref="{}unbiased_rounding_attribute"/>
 *         &lt;element ref="{}unchecked_access_attribute"/>
 *         &lt;element ref="{}val_attribute"/>
 *         &lt;element ref="{}valid_attribute"/>
 *         &lt;element ref="{}value_attribute"/>
 *         &lt;element ref="{}version_attribute"/>
 *         &lt;element ref="{}wide_image_attribute"/>
 *         &lt;element ref="{}wide_value_attribute"/>
 *         &lt;element ref="{}wide_width_attribute"/>
 *         &lt;element ref="{}width_attribute"/>
 *         &lt;element ref="{}write_attribute"/>
 *         &lt;element ref="{}machine_rounding_attribute"/>
 *         &lt;element ref="{}mod_attribute"/>
 *         &lt;element ref="{}priority_attribute"/>
 *         &lt;element ref="{}stream_size_attribute"/>
 *         &lt;element ref="{}wide_wide_image_attribute"/>
 *         &lt;element ref="{}wide_wide_value_attribute"/>
 *         &lt;element ref="{}wide_wide_width_attribute"/>
 *         &lt;element ref="{}max_alignment_for_allocation_attribute"/>
 *         &lt;element ref="{}overlaps_storage_attribute"/>
 *         &lt;element ref="{}implementation_defined_attribute"/>
 *         &lt;element ref="{}unknown_attribute"/>
 *         &lt;element ref="{}record_aggregate"/>
 *         &lt;element ref="{}extension_aggregate"/>
 *         &lt;element ref="{}positional_array_aggregate"/>
 *         &lt;element ref="{}named_array_aggregate"/>
 *         &lt;element ref="{}and_then_short_circuit"/>
 *         &lt;element ref="{}or_else_short_circuit"/>
 *         &lt;element ref="{}in_membership_test"/>
 *         &lt;element ref="{}not_in_membership_test"/>
 *         &lt;element ref="{}null_literal"/>
 *         &lt;element ref="{}parenthesized_expression"/>
 *         &lt;element ref="{}raise_expression"/>
 *         &lt;element ref="{}type_conversion"/>
 *         &lt;element ref="{}qualified_expression"/>
 *         &lt;element ref="{}allocation_from_subtype"/>
 *         &lt;element ref="{}allocation_from_qualified_expression"/>
 *         &lt;element ref="{}case_expression"/>
 *         &lt;element ref="{}if_expression"/>
 *         &lt;element ref="{}for_all_quantified_expression"/>
 *         &lt;element ref="{}for_some_quantified_expression"/>
 *         &lt;element ref="{}pragma_argument_association"/>
 *         &lt;element ref="{}discriminant_association"/>
 *         &lt;element ref="{}record_component_association"/>
 *         &lt;element ref="{}array_component_association"/>
 *         &lt;element ref="{}parameter_association"/>
 *         &lt;element ref="{}generic_association"/>
 *         &lt;element ref="{}null_statement"/>
 *         &lt;element ref="{}assignment_statement"/>
 *         &lt;element ref="{}if_statement"/>
 *         &lt;element ref="{}case_statement"/>
 *         &lt;element ref="{}loop_statement"/>
 *         &lt;element ref="{}while_loop_statement"/>
 *         &lt;element ref="{}for_loop_statement"/>
 *         &lt;element ref="{}block_statement"/>
 *         &lt;element ref="{}exit_statement"/>
 *         &lt;element ref="{}goto_statement"/>
 *         &lt;element ref="{}procedure_call_statement"/>
 *         &lt;element ref="{}return_statement"/>
 *         &lt;element ref="{}extended_return_statement"/>
 *         &lt;element ref="{}accept_statement"/>
 *         &lt;element ref="{}entry_call_statement"/>
 *         &lt;element ref="{}requeue_statement"/>
 *         &lt;element ref="{}requeue_statement_with_abort"/>
 *         &lt;element ref="{}delay_until_statement"/>
 *         &lt;element ref="{}delay_relative_statement"/>
 *         &lt;element ref="{}terminate_alternative_statement"/>
 *         &lt;element ref="{}selective_accept_statement"/>
 *         &lt;element ref="{}timed_entry_call_statement"/>
 *         &lt;element ref="{}conditional_entry_call_statement"/>
 *         &lt;element ref="{}asynchronous_select_statement"/>
 *         &lt;element ref="{}abort_statement"/>
 *         &lt;element ref="{}raise_statement"/>
 *         &lt;element ref="{}code_statement"/>
 *         &lt;element ref="{}if_path"/>
 *         &lt;element ref="{}elsif_path"/>
 *         &lt;element ref="{}else_path"/>
 *         &lt;element ref="{}case_path"/>
 *         &lt;element ref="{}select_path"/>
 *         &lt;element ref="{}or_path"/>
 *         &lt;element ref="{}then_abort_path"/>
 *         &lt;element ref="{}case_expression_path"/>
 *         &lt;element ref="{}if_expression_path"/>
 *         &lt;element ref="{}elsif_expression_path"/>
 *         &lt;element ref="{}else_expression_path"/>
 *         &lt;element ref="{}use_package_clause"/>
 *         &lt;element ref="{}use_type_clause"/>
 *         &lt;element ref="{}use_all_type_clause"/>
 *         &lt;element ref="{}with_clause"/>
 *         &lt;element ref="{}attribute_definition_clause"/>
 *         &lt;element ref="{}enumeration_representation_clause"/>
 *         &lt;element ref="{}record_representation_clause"/>
 *         &lt;element ref="{}at_clause"/>
 *         &lt;element ref="{}component_clause"/>
 *         &lt;element ref="{}exception_handler"/>
 *         &lt;group ref="{}pragmas_group"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Element_List", propOrder = {
    "elements"
})
public class ElementList
    extends Base
{

    @XmlElements({
        @XmlElement(name = "not_an_element", type = NotAnElement.class),
        @XmlElement(name = "defining_identifier", type = DefiningIdentifier.class),
        @XmlElement(name = "defining_character_literal", type = DefiningCharacterLiteral.class),
        @XmlElement(name = "defining_enumeration_literal", type = DefiningEnumerationLiteral.class),
        @XmlElement(name = "defining_and_operator", type = DefiningAndOperator.class),
        @XmlElement(name = "defining_or_operator", type = DefiningOrOperator.class),
        @XmlElement(name = "defining_xor_operator", type = DefiningXorOperator.class),
        @XmlElement(name = "defining_equal_operator", type = DefiningEqualOperator.class),
        @XmlElement(name = "defining_not_equal_operator", type = DefiningNotEqualOperator.class),
        @XmlElement(name = "defining_less_than_operator", type = DefiningLessThanOperator.class),
        @XmlElement(name = "defining_less_than_or_equal_operator", type = DefiningLessThanOrEqualOperator.class),
        @XmlElement(name = "defining_greater_than_operator", type = DefiningGreaterThanOperator.class),
        @XmlElement(name = "defining_greater_than_or_equal_operator", type = DefiningGreaterThanOrEqualOperator.class),
        @XmlElement(name = "defining_plus_operator", type = DefiningPlusOperator.class),
        @XmlElement(name = "defining_minus_operator", type = DefiningMinusOperator.class),
        @XmlElement(name = "defining_concatenate_operator", type = DefiningConcatenateOperator.class),
        @XmlElement(name = "defining_unary_plus_operator", type = DefiningUnaryPlusOperator.class),
        @XmlElement(name = "defining_unary_minus_operator", type = DefiningUnaryMinusOperator.class),
        @XmlElement(name = "defining_multiply_operator", type = DefiningMultiplyOperator.class),
        @XmlElement(name = "defining_divide_operator", type = DefiningDivideOperator.class),
        @XmlElement(name = "defining_mod_operator", type = DefiningModOperator.class),
        @XmlElement(name = "defining_rem_operator", type = DefiningRemOperator.class),
        @XmlElement(name = "defining_exponentiate_operator", type = DefiningExponentiateOperator.class),
        @XmlElement(name = "defining_abs_operator", type = DefiningAbsOperator.class),
        @XmlElement(name = "defining_not_operator", type = DefiningNotOperator.class),
        @XmlElement(name = "defining_expanded_name", type = DefiningExpandedName.class),
        @XmlElement(name = "ordinary_type_declaration", type = OrdinaryTypeDeclaration.class),
        @XmlElement(name = "task_type_declaration", type = TaskTypeDeclaration.class),
        @XmlElement(name = "protected_type_declaration", type = ProtectedTypeDeclaration.class),
        @XmlElement(name = "incomplete_type_declaration", type = IncompleteTypeDeclaration.class),
        @XmlElement(name = "tagged_incomplete_type_declaration", type = TaggedIncompleteTypeDeclaration.class),
        @XmlElement(name = "private_type_declaration", type = PrivateTypeDeclaration.class),
        @XmlElement(name = "private_extension_declaration", type = PrivateExtensionDeclaration.class),
        @XmlElement(name = "subtype_declaration", type = SubtypeDeclaration.class),
        @XmlElement(name = "variable_declaration", type = VariableDeclaration.class),
        @XmlElement(name = "constant_declaration", type = ConstantDeclaration.class),
        @XmlElement(name = "deferred_constant_declaration", type = DeferredConstantDeclaration.class),
        @XmlElement(name = "single_task_declaration", type = SingleTaskDeclaration.class),
        @XmlElement(name = "single_protected_declaration", type = SingleProtectedDeclaration.class),
        @XmlElement(name = "integer_number_declaration", type = IntegerNumberDeclaration.class),
        @XmlElement(name = "real_number_declaration", type = RealNumberDeclaration.class),
        @XmlElement(name = "enumeration_literal_specification", type = EnumerationLiteralSpecification.class),
        @XmlElement(name = "discriminant_specification", type = DiscriminantSpecification.class),
        @XmlElement(name = "component_declaration", type = ComponentDeclaration.class),
        @XmlElement(name = "loop_parameter_specification", type = LoopParameterSpecification.class),
        @XmlElement(name = "generalized_iterator_specification", type = GeneralizedIteratorSpecification.class),
        @XmlElement(name = "element_iterator_specification", type = ElementIteratorSpecification.class),
        @XmlElement(name = "procedure_declaration", type = ProcedureDeclaration.class),
        @XmlElement(name = "function_declaration", type = FunctionDeclaration.class),
        @XmlElement(name = "parameter_specification", type = ParameterSpecification.class),
        @XmlElement(name = "procedure_body_declaration", type = ProcedureBodyDeclaration.class),
        @XmlElement(name = "function_body_declaration", type = FunctionBodyDeclaration.class),
        @XmlElement(name = "return_variable_specification", type = ReturnVariableSpecification.class),
        @XmlElement(name = "return_constant_specification", type = ReturnConstantSpecification.class),
        @XmlElement(name = "null_procedure_declaration", type = NullProcedureDeclaration.class),
        @XmlElement(name = "expression_function_declaration", type = ExpressionFunctionDeclaration.class),
        @XmlElement(name = "package_declaration", type = PackageDeclaration.class),
        @XmlElement(name = "package_body_declaration", type = PackageBodyDeclaration.class),
        @XmlElement(name = "object_renaming_declaration", type = ObjectRenamingDeclaration.class),
        @XmlElement(name = "exception_renaming_declaration", type = ExceptionRenamingDeclaration.class),
        @XmlElement(name = "package_renaming_declaration", type = PackageRenamingDeclaration.class),
        @XmlElement(name = "procedure_renaming_declaration", type = ProcedureRenamingDeclaration.class),
        @XmlElement(name = "function_renaming_declaration", type = FunctionRenamingDeclaration.class),
        @XmlElement(name = "generic_package_renaming_declaration", type = GenericPackageRenamingDeclaration.class),
        @XmlElement(name = "generic_procedure_renaming_declaration", type = GenericProcedureRenamingDeclaration.class),
        @XmlElement(name = "generic_function_renaming_declaration", type = GenericFunctionRenamingDeclaration.class),
        @XmlElement(name = "task_body_declaration", type = TaskBodyDeclaration.class),
        @XmlElement(name = "protected_body_declaration", type = ProtectedBodyDeclaration.class),
        @XmlElement(name = "entry_declaration", type = EntryDeclaration.class),
        @XmlElement(name = "entry_body_declaration", type = EntryBodyDeclaration.class),
        @XmlElement(name = "entry_index_specification", type = EntryIndexSpecification.class),
        @XmlElement(name = "procedure_body_stub", type = ProcedureBodyStub.class),
        @XmlElement(name = "function_body_stub", type = FunctionBodyStub.class),
        @XmlElement(name = "package_body_stub", type = PackageBodyStub.class),
        @XmlElement(name = "task_body_stub", type = TaskBodyStub.class),
        @XmlElement(name = "protected_body_stub", type = ProtectedBodyStub.class),
        @XmlElement(name = "exception_declaration", type = ExceptionDeclaration.class),
        @XmlElement(name = "choice_parameter_specification", type = ChoiceParameterSpecification.class),
        @XmlElement(name = "generic_procedure_declaration", type = GenericProcedureDeclaration.class),
        @XmlElement(name = "generic_function_declaration", type = GenericFunctionDeclaration.class),
        @XmlElement(name = "generic_package_declaration", type = GenericPackageDeclaration.class),
        @XmlElement(name = "package_instantiation", type = PackageInstantiation.class),
        @XmlElement(name = "procedure_instantiation", type = ProcedureInstantiation.class),
        @XmlElement(name = "function_instantiation", type = FunctionInstantiation.class),
        @XmlElement(name = "formal_object_declaration", type = FormalObjectDeclaration.class),
        @XmlElement(name = "formal_type_declaration", type = FormalTypeDeclaration.class),
        @XmlElement(name = "formal_incomplete_type_declaration", type = FormalIncompleteTypeDeclaration.class),
        @XmlElement(name = "formal_procedure_declaration", type = FormalProcedureDeclaration.class),
        @XmlElement(name = "formal_function_declaration", type = FormalFunctionDeclaration.class),
        @XmlElement(name = "formal_package_declaration", type = FormalPackageDeclaration.class),
        @XmlElement(name = "formal_package_declaration_with_box", type = FormalPackageDeclarationWithBox.class),
        @XmlElement(name = "derived_type_definition", type = DerivedTypeDefinition.class),
        @XmlElement(name = "derived_record_extension_definition", type = DerivedRecordExtensionDefinition.class),
        @XmlElement(name = "enumeration_type_definition", type = EnumerationTypeDefinition.class),
        @XmlElement(name = "signed_integer_type_definition", type = SignedIntegerTypeDefinition.class),
        @XmlElement(name = "modular_type_definition", type = ModularTypeDefinition.class),
        @XmlElement(name = "root_integer_definition", type = RootIntegerDefinition.class),
        @XmlElement(name = "root_real_definition", type = RootRealDefinition.class),
        @XmlElement(name = "universal_integer_definition", type = UniversalIntegerDefinition.class),
        @XmlElement(name = "universal_real_definition", type = UniversalRealDefinition.class),
        @XmlElement(name = "universal_fixed_definition", type = UniversalFixedDefinition.class),
        @XmlElement(name = "floating_point_definition", type = FloatingPointDefinition.class),
        @XmlElement(name = "ordinary_fixed_point_definition", type = OrdinaryFixedPointDefinition.class),
        @XmlElement(name = "decimal_fixed_point_definition", type = DecimalFixedPointDefinition.class),
        @XmlElement(name = "unconstrained_array_definition", type = UnconstrainedArrayDefinition.class),
        @XmlElement(name = "constrained_array_definition", type = ConstrainedArrayDefinition.class),
        @XmlElement(name = "record_type_definition", type = RecordTypeDefinition.class),
        @XmlElement(name = "tagged_record_type_definition", type = TaggedRecordTypeDefinition.class),
        @XmlElement(name = "ordinary_interface", type = OrdinaryInterface.class),
        @XmlElement(name = "limited_interface", type = LimitedInterface.class),
        @XmlElement(name = "task_interface", type = TaskInterface.class),
        @XmlElement(name = "protected_interface", type = ProtectedInterface.class),
        @XmlElement(name = "synchronized_interface", type = SynchronizedInterface.class),
        @XmlElement(name = "pool_specific_access_to_variable", type = PoolSpecificAccessToVariable.class),
        @XmlElement(name = "access_to_variable", type = AccessToVariable.class),
        @XmlElement(name = "access_to_constant", type = AccessToConstant.class),
        @XmlElement(name = "access_to_procedure", type = AccessToProcedure.class),
        @XmlElement(name = "access_to_protected_procedure", type = AccessToProtectedProcedure.class),
        @XmlElement(name = "access_to_function", type = AccessToFunction.class),
        @XmlElement(name = "access_to_protected_function", type = AccessToProtectedFunction.class),
        @XmlElement(name = "subtype_indication", type = SubtypeIndication.class),
        @XmlElement(name = "range_attribute_reference", type = RangeAttributeReference.class),
        @XmlElement(name = "simple_expression_range", type = SimpleExpressionRange.class),
        @XmlElement(name = "digits_constraint", type = DigitsConstraint.class),
        @XmlElement(name = "delta_constraint", type = DeltaConstraint.class),
        @XmlElement(name = "index_constraint", type = IndexConstraint.class),
        @XmlElement(name = "discriminant_constraint", type = DiscriminantConstraint.class),
        @XmlElement(name = "component_definition", type = ComponentDefinition.class),
        @XmlElement(name = "discrete_subtype_indication_as_subtype_definition", type = DiscreteSubtypeIndicationAsSubtypeDefinition.class),
        @XmlElement(name = "discrete_range_attribute_reference_as_subtype_definition", type = DiscreteRangeAttributeReferenceAsSubtypeDefinition.class),
        @XmlElement(name = "discrete_simple_expression_range_as_subtype_definition", type = DiscreteSimpleExpressionRangeAsSubtypeDefinition.class),
        @XmlElement(name = "discrete_subtype_indication", type = DiscreteSubtypeIndication.class),
        @XmlElement(name = "discrete_range_attribute_reference", type = DiscreteRangeAttributeReference.class),
        @XmlElement(name = "discrete_simple_expression_range", type = DiscreteSimpleExpressionRange.class),
        @XmlElement(name = "unknown_discriminant_part", type = UnknownDiscriminantPart.class),
        @XmlElement(name = "known_discriminant_part", type = KnownDiscriminantPart.class),
        @XmlElement(name = "record_definition", type = RecordDefinition.class),
        @XmlElement(name = "null_record_definition", type = NullRecordDefinition.class),
        @XmlElement(name = "null_component", type = NullComponent.class),
        @XmlElement(name = "variant_part", type = VariantPart.class),
        @XmlElement(name = "variant", type = Variant.class),
        @XmlElement(name = "others_choice", type = OthersChoice.class),
        @XmlElement(name = "anonymous_access_to_variable", type = AnonymousAccessToVariable.class),
        @XmlElement(name = "anonymous_access_to_constant", type = AnonymousAccessToConstant.class),
        @XmlElement(name = "anonymous_access_to_procedure", type = AnonymousAccessToProcedure.class),
        @XmlElement(name = "anonymous_access_to_protected_procedure", type = AnonymousAccessToProtectedProcedure.class),
        @XmlElement(name = "anonymous_access_to_function", type = AnonymousAccessToFunction.class),
        @XmlElement(name = "anonymous_access_to_protected_function", type = AnonymousAccessToProtectedFunction.class),
        @XmlElement(name = "private_type_definition", type = PrivateTypeDefinition.class),
        @XmlElement(name = "tagged_private_type_definition", type = TaggedPrivateTypeDefinition.class),
        @XmlElement(name = "private_extension_definition", type = PrivateExtensionDefinition.class),
        @XmlElement(name = "task_definition", type = TaskDefinition.class),
        @XmlElement(name = "protected_definition", type = ProtectedDefinition.class),
        @XmlElement(name = "formal_private_type_definition", type = FormalPrivateTypeDefinition.class),
        @XmlElement(name = "formal_tagged_private_type_definition", type = FormalTaggedPrivateTypeDefinition.class),
        @XmlElement(name = "formal_derived_type_definition", type = FormalDerivedTypeDefinition.class),
        @XmlElement(name = "formal_discrete_type_definition", type = FormalDiscreteTypeDefinition.class),
        @XmlElement(name = "formal_signed_integer_type_definition", type = FormalSignedIntegerTypeDefinition.class),
        @XmlElement(name = "formal_modular_type_definition", type = FormalModularTypeDefinition.class),
        @XmlElement(name = "formal_floating_point_definition", type = FormalFloatingPointDefinition.class),
        @XmlElement(name = "formal_ordinary_fixed_point_definition", type = FormalOrdinaryFixedPointDefinition.class),
        @XmlElement(name = "formal_decimal_fixed_point_definition", type = FormalDecimalFixedPointDefinition.class),
        @XmlElement(name = "formal_ordinary_interface", type = FormalOrdinaryInterface.class),
        @XmlElement(name = "formal_limited_interface", type = FormalLimitedInterface.class),
        @XmlElement(name = "formal_task_interface", type = FormalTaskInterface.class),
        @XmlElement(name = "formal_protected_interface", type = FormalProtectedInterface.class),
        @XmlElement(name = "formal_synchronized_interface", type = FormalSynchronizedInterface.class),
        @XmlElement(name = "formal_unconstrained_array_definition", type = FormalUnconstrainedArrayDefinition.class),
        @XmlElement(name = "formal_constrained_array_definition", type = FormalConstrainedArrayDefinition.class),
        @XmlElement(name = "formal_pool_specific_access_to_variable", type = FormalPoolSpecificAccessToVariable.class),
        @XmlElement(name = "formal_access_to_variable", type = FormalAccessToVariable.class),
        @XmlElement(name = "formal_access_to_constant", type = FormalAccessToConstant.class),
        @XmlElement(name = "formal_access_to_procedure", type = FormalAccessToProcedure.class),
        @XmlElement(name = "formal_access_to_protected_procedure", type = FormalAccessToProtectedProcedure.class),
        @XmlElement(name = "formal_access_to_function", type = FormalAccessToFunction.class),
        @XmlElement(name = "formal_access_to_protected_function", type = FormalAccessToProtectedFunction.class),
        @XmlElement(name = "aspect_specification", type = AspectSpecification.class),
        @XmlElement(name = "box_expression", type = BoxExpression.class),
        @XmlElement(name = "integer_literal", type = IntegerLiteral.class),
        @XmlElement(name = "real_literal", type = RealLiteral.class),
        @XmlElement(name = "string_literal", type = StringLiteral.class),
        @XmlElement(name = "identifier", type = Identifier.class),
        @XmlElement(name = "and_operator", type = AndOperator.class),
        @XmlElement(name = "or_operator", type = OrOperator.class),
        @XmlElement(name = "xor_operator", type = XorOperator.class),
        @XmlElement(name = "equal_operator", type = EqualOperator.class),
        @XmlElement(name = "not_equal_operator", type = NotEqualOperator.class),
        @XmlElement(name = "less_than_operator", type = LessThanOperator.class),
        @XmlElement(name = "less_than_or_equal_operator", type = LessThanOrEqualOperator.class),
        @XmlElement(name = "greater_than_operator", type = GreaterThanOperator.class),
        @XmlElement(name = "greater_than_or_equal_operator", type = GreaterThanOrEqualOperator.class),
        @XmlElement(name = "plus_operator", type = PlusOperator.class),
        @XmlElement(name = "minus_operator", type = MinusOperator.class),
        @XmlElement(name = "concatenate_operator", type = ConcatenateOperator.class),
        @XmlElement(name = "unary_plus_operator", type = UnaryPlusOperator.class),
        @XmlElement(name = "unary_minus_operator", type = UnaryMinusOperator.class),
        @XmlElement(name = "multiply_operator", type = MultiplyOperator.class),
        @XmlElement(name = "divide_operator", type = DivideOperator.class),
        @XmlElement(name = "mod_operator", type = ModOperator.class),
        @XmlElement(name = "rem_operator", type = RemOperator.class),
        @XmlElement(name = "exponentiate_operator", type = ExponentiateOperator.class),
        @XmlElement(name = "abs_operator", type = AbsOperator.class),
        @XmlElement(name = "not_operator", type = NotOperator.class),
        @XmlElement(name = "character_literal", type = CharacterLiteral.class),
        @XmlElement(name = "enumeration_literal", type = EnumerationLiteral.class),
        @XmlElement(name = "explicit_dereference", type = ExplicitDereference.class),
        @XmlElement(name = "function_call", type = FunctionCall.class),
        @XmlElement(name = "indexed_component", type = IndexedComponent.class),
        @XmlElement(name = "slice", type = Slice.class),
        @XmlElement(name = "selected_component", type = SelectedComponent.class),
        @XmlElement(name = "access_attribute", type = AccessAttribute.class),
        @XmlElement(name = "address_attribute", type = AddressAttribute.class),
        @XmlElement(name = "adjacent_attribute", type = AdjacentAttribute.class),
        @XmlElement(name = "aft_attribute", type = AftAttribute.class),
        @XmlElement(name = "alignment_attribute", type = AlignmentAttribute.class),
        @XmlElement(name = "base_attribute", type = BaseAttribute.class),
        @XmlElement(name = "bit_order_attribute", type = BitOrderAttribute.class),
        @XmlElement(name = "body_version_attribute", type = BodyVersionAttribute.class),
        @XmlElement(name = "callable_attribute", type = CallableAttribute.class),
        @XmlElement(name = "caller_attribute", type = CallerAttribute.class),
        @XmlElement(name = "ceiling_attribute", type = CeilingAttribute.class),
        @XmlElement(name = "class_attribute", type = ClassAttribute.class),
        @XmlElement(name = "component_size_attribute", type = ComponentSizeAttribute.class),
        @XmlElement(name = "compose_attribute", type = ComposeAttribute.class),
        @XmlElement(name = "constrained_attribute", type = ConstrainedAttribute.class),
        @XmlElement(name = "copy_sign_attribute", type = CopySignAttribute.class),
        @XmlElement(name = "count_attribute", type = CountAttribute.class),
        @XmlElement(name = "definite_attribute", type = DefiniteAttribute.class),
        @XmlElement(name = "delta_attribute", type = DeltaAttribute.class),
        @XmlElement(name = "denorm_attribute", type = DenormAttribute.class),
        @XmlElement(name = "digits_attribute", type = DigitsAttribute.class),
        @XmlElement(name = "exponent_attribute", type = ExponentAttribute.class),
        @XmlElement(name = "external_tag_attribute", type = ExternalTagAttribute.class),
        @XmlElement(name = "first_attribute", type = FirstAttribute.class),
        @XmlElement(name = "first_bit_attribute", type = FirstBitAttribute.class),
        @XmlElement(name = "floor_attribute", type = FloorAttribute.class),
        @XmlElement(name = "fore_attribute", type = ForeAttribute.class),
        @XmlElement(name = "fraction_attribute", type = FractionAttribute.class),
        @XmlElement(name = "identity_attribute", type = IdentityAttribute.class),
        @XmlElement(name = "image_attribute", type = ImageAttribute.class),
        @XmlElement(name = "input_attribute", type = InputAttribute.class),
        @XmlElement(name = "last_attribute", type = LastAttribute.class),
        @XmlElement(name = "last_bit_attribute", type = LastBitAttribute.class),
        @XmlElement(name = "leading_part_attribute", type = LeadingPartAttribute.class),
        @XmlElement(name = "length_attribute", type = LengthAttribute.class),
        @XmlElement(name = "machine_attribute", type = MachineAttribute.class),
        @XmlElement(name = "machine_emax_attribute", type = MachineEmaxAttribute.class),
        @XmlElement(name = "machine_emin_attribute", type = MachineEminAttribute.class),
        @XmlElement(name = "machine_mantissa_attribute", type = MachineMantissaAttribute.class),
        @XmlElement(name = "machine_overflows_attribute", type = MachineOverflowsAttribute.class),
        @XmlElement(name = "machine_radix_attribute", type = MachineRadixAttribute.class),
        @XmlElement(name = "machine_rounds_attribute", type = MachineRoundsAttribute.class),
        @XmlElement(name = "max_attribute", type = MaxAttribute.class),
        @XmlElement(name = "max_size_in_storage_elements_attribute", type = MaxSizeInStorageElementsAttribute.class),
        @XmlElement(name = "min_attribute", type = MinAttribute.class),
        @XmlElement(name = "model_attribute", type = ModelAttribute.class),
        @XmlElement(name = "model_emin_attribute", type = ModelEminAttribute.class),
        @XmlElement(name = "model_epsilon_attribute", type = ModelEpsilonAttribute.class),
        @XmlElement(name = "model_mantissa_attribute", type = ModelMantissaAttribute.class),
        @XmlElement(name = "model_small_attribute", type = ModelSmallAttribute.class),
        @XmlElement(name = "modulus_attribute", type = ModulusAttribute.class),
        @XmlElement(name = "output_attribute", type = OutputAttribute.class),
        @XmlElement(name = "partition_id_attribute", type = PartitionIdAttribute.class),
        @XmlElement(name = "pos_attribute", type = PosAttribute.class),
        @XmlElement(name = "position_attribute", type = PositionAttribute.class),
        @XmlElement(name = "pred_attribute", type = PredAttribute.class),
        @XmlElement(name = "range_attribute", type = RangeAttribute.class),
        @XmlElement(name = "read_attribute", type = ReadAttribute.class),
        @XmlElement(name = "remainder_attribute", type = RemainderAttribute.class),
        @XmlElement(name = "round_attribute", type = RoundAttribute.class),
        @XmlElement(name = "rounding_attribute", type = RoundingAttribute.class),
        @XmlElement(name = "safe_first_attribute", type = SafeFirstAttribute.class),
        @XmlElement(name = "safe_last_attribute", type = SafeLastAttribute.class),
        @XmlElement(name = "scale_attribute", type = ScaleAttribute.class),
        @XmlElement(name = "scaling_attribute", type = ScalingAttribute.class),
        @XmlElement(name = "signed_zeros_attribute", type = SignedZerosAttribute.class),
        @XmlElement(name = "size_attribute", type = SizeAttribute.class),
        @XmlElement(name = "small_attribute", type = SmallAttribute.class),
        @XmlElement(name = "storage_pool_attribute", type = StoragePoolAttribute.class),
        @XmlElement(name = "storage_size_attribute", type = StorageSizeAttribute.class),
        @XmlElement(name = "succ_attribute", type = SuccAttribute.class),
        @XmlElement(name = "tag_attribute", type = TagAttribute.class),
        @XmlElement(name = "terminated_attribute", type = TerminatedAttribute.class),
        @XmlElement(name = "truncation_attribute", type = TruncationAttribute.class),
        @XmlElement(name = "unbiased_rounding_attribute", type = UnbiasedRoundingAttribute.class),
        @XmlElement(name = "unchecked_access_attribute", type = UncheckedAccessAttribute.class),
        @XmlElement(name = "val_attribute", type = ValAttribute.class),
        @XmlElement(name = "valid_attribute", type = ValidAttribute.class),
        @XmlElement(name = "value_attribute", type = ValueAttribute.class),
        @XmlElement(name = "version_attribute", type = VersionAttribute.class),
        @XmlElement(name = "wide_image_attribute", type = WideImageAttribute.class),
        @XmlElement(name = "wide_value_attribute", type = WideValueAttribute.class),
        @XmlElement(name = "wide_width_attribute", type = WideWidthAttribute.class),
        @XmlElement(name = "width_attribute", type = WidthAttribute.class),
        @XmlElement(name = "write_attribute", type = WriteAttribute.class),
        @XmlElement(name = "machine_rounding_attribute", type = MachineRoundingAttribute.class),
        @XmlElement(name = "mod_attribute", type = ModAttribute.class),
        @XmlElement(name = "priority_attribute", type = PriorityAttribute.class),
        @XmlElement(name = "stream_size_attribute", type = StreamSizeAttribute.class),
        @XmlElement(name = "wide_wide_image_attribute", type = WideWideImageAttribute.class),
        @XmlElement(name = "wide_wide_value_attribute", type = WideWideValueAttribute.class),
        @XmlElement(name = "wide_wide_width_attribute", type = WideWideWidthAttribute.class),
        @XmlElement(name = "max_alignment_for_allocation_attribute", type = MaxAlignmentForAllocationAttribute.class),
        @XmlElement(name = "overlaps_storage_attribute", type = OverlapsStorageAttribute.class),
        @XmlElement(name = "implementation_defined_attribute", type = ImplementationDefinedAttribute.class),
        @XmlElement(name = "unknown_attribute", type = UnknownAttribute.class),
        @XmlElement(name = "record_aggregate", type = RecordAggregate.class),
        @XmlElement(name = "extension_aggregate", type = ExtensionAggregate.class),
        @XmlElement(name = "positional_array_aggregate", type = PositionalArrayAggregate.class),
        @XmlElement(name = "named_array_aggregate", type = NamedArrayAggregate.class),
        @XmlElement(name = "and_then_short_circuit", type = AndThenShortCircuit.class),
        @XmlElement(name = "or_else_short_circuit", type = OrElseShortCircuit.class),
        @XmlElement(name = "in_membership_test", type = InMembershipTest.class),
        @XmlElement(name = "not_in_membership_test", type = NotInMembershipTest.class),
        @XmlElement(name = "null_literal", type = NullLiteral.class),
        @XmlElement(name = "parenthesized_expression", type = ParenthesizedExpression.class),
        @XmlElement(name = "raise_expression", type = RaiseExpression.class),
        @XmlElement(name = "type_conversion", type = TypeConversion.class),
        @XmlElement(name = "qualified_expression", type = QualifiedExpression.class),
        @XmlElement(name = "allocation_from_subtype", type = AllocationFromSubtype.class),
        @XmlElement(name = "allocation_from_qualified_expression", type = AllocationFromQualifiedExpression.class),
        @XmlElement(name = "case_expression", type = CaseExpression.class),
        @XmlElement(name = "if_expression", type = IfExpression.class),
        @XmlElement(name = "for_all_quantified_expression", type = ForAllQuantifiedExpression.class),
        @XmlElement(name = "for_some_quantified_expression", type = ForSomeQuantifiedExpression.class),
        @XmlElement(name = "pragma_argument_association", type = PragmaArgumentAssociation.class),
        @XmlElement(name = "discriminant_association", type = DiscriminantAssociation.class),
        @XmlElement(name = "record_component_association", type = RecordComponentAssociation.class),
        @XmlElement(name = "array_component_association", type = ArrayComponentAssociation.class),
        @XmlElement(name = "parameter_association", type = ParameterAssociation.class),
        @XmlElement(name = "generic_association", type = GenericAssociation.class),
        @XmlElement(name = "null_statement", type = NullStatement.class),
        @XmlElement(name = "assignment_statement", type = AssignmentStatement.class),
        @XmlElement(name = "if_statement", type = IfStatement.class),
        @XmlElement(name = "case_statement", type = CaseStatement.class),
        @XmlElement(name = "loop_statement", type = LoopStatement.class),
        @XmlElement(name = "while_loop_statement", type = WhileLoopStatement.class),
        @XmlElement(name = "for_loop_statement", type = ForLoopStatement.class),
        @XmlElement(name = "block_statement", type = BlockStatement.class),
        @XmlElement(name = "exit_statement", type = ExitStatement.class),
        @XmlElement(name = "goto_statement", type = GotoStatement.class),
        @XmlElement(name = "procedure_call_statement", type = ProcedureCallStatement.class),
        @XmlElement(name = "return_statement", type = ReturnStatement.class),
        @XmlElement(name = "extended_return_statement", type = ExtendedReturnStatement.class),
        @XmlElement(name = "accept_statement", type = AcceptStatement.class),
        @XmlElement(name = "entry_call_statement", type = EntryCallStatement.class),
        @XmlElement(name = "requeue_statement", type = RequeueStatement.class),
        @XmlElement(name = "requeue_statement_with_abort", type = RequeueStatementWithAbort.class),
        @XmlElement(name = "delay_until_statement", type = DelayUntilStatement.class),
        @XmlElement(name = "delay_relative_statement", type = DelayRelativeStatement.class),
        @XmlElement(name = "terminate_alternative_statement", type = TerminateAlternativeStatement.class),
        @XmlElement(name = "selective_accept_statement", type = SelectiveAcceptStatement.class),
        @XmlElement(name = "timed_entry_call_statement", type = TimedEntryCallStatement.class),
        @XmlElement(name = "conditional_entry_call_statement", type = ConditionalEntryCallStatement.class),
        @XmlElement(name = "asynchronous_select_statement", type = AsynchronousSelectStatement.class),
        @XmlElement(name = "abort_statement", type = AbortStatement.class),
        @XmlElement(name = "raise_statement", type = RaiseStatement.class),
        @XmlElement(name = "code_statement", type = CodeStatement.class),
        @XmlElement(name = "if_path", type = IfPath.class),
        @XmlElement(name = "elsif_path", type = ElsifPath.class),
        @XmlElement(name = "else_path", type = ElsePath.class),
        @XmlElement(name = "case_path", type = CasePath.class),
        @XmlElement(name = "select_path", type = SelectPath.class),
        @XmlElement(name = "or_path", type = OrPath.class),
        @XmlElement(name = "then_abort_path", type = ThenAbortPath.class),
        @XmlElement(name = "case_expression_path", type = CaseExpressionPath.class),
        @XmlElement(name = "if_expression_path", type = IfExpressionPath.class),
        @XmlElement(name = "elsif_expression_path", type = ElsifExpressionPath.class),
        @XmlElement(name = "else_expression_path", type = ElseExpressionPath.class),
        @XmlElement(name = "use_package_clause", type = UsePackageClause.class),
        @XmlElement(name = "use_type_clause", type = UseTypeClause.class),
        @XmlElement(name = "use_all_type_clause", type = UseAllTypeClause.class),
        @XmlElement(name = "with_clause", type = WithClause.class),
        @XmlElement(name = "attribute_definition_clause", type = AttributeDefinitionClause.class),
        @XmlElement(name = "enumeration_representation_clause", type = EnumerationRepresentationClause.class),
        @XmlElement(name = "record_representation_clause", type = RecordRepresentationClause.class),
        @XmlElement(name = "at_clause", type = AtClause.class),
        @XmlElement(name = "component_clause", type = ComponentClause.class),
        @XmlElement(name = "exception_handler", type = ExceptionHandler.class),
        @XmlElement(name = "all_calls_remote_pragma", type = AllCallsRemotePragma.class),
        @XmlElement(name = "asynchronous_pragma", type = AsynchronousPragma.class),
        @XmlElement(name = "atomic_pragma", type = AtomicPragma.class),
        @XmlElement(name = "atomic_components_pragma", type = AtomicComponentsPragma.class),
        @XmlElement(name = "attach_handler_pragma", type = AttachHandlerPragma.class),
        @XmlElement(name = "controlled_pragma", type = ControlledPragma.class),
        @XmlElement(name = "convention_pragma", type = ConventionPragma.class),
        @XmlElement(name = "discard_names_pragma", type = DiscardNamesPragma.class),
        @XmlElement(name = "elaborate_pragma", type = ElaboratePragma.class),
        @XmlElement(name = "elaborate_all_pragma", type = ElaborateAllPragma.class),
        @XmlElement(name = "elaborate_body_pragma", type = ElaborateBodyPragma.class),
        @XmlElement(name = "export_pragma", type = ExportPragma.class),
        @XmlElement(name = "import_pragma", type = ImportPragma.class),
        @XmlElement(name = "inline_pragma", type = InlinePragma.class),
        @XmlElement(name = "inspection_point_pragma", type = InspectionPointPragma.class),
        @XmlElement(name = "interrupt_handler_pragma", type = InterruptHandlerPragma.class),
        @XmlElement(name = "interrupt_priority_pragma", type = InterruptPriorityPragma.class),
        @XmlElement(name = "linker_options_pragma", type = LinkerOptionsPragma.class),
        @XmlElement(name = "list_pragma", type = ListPragma.class),
        @XmlElement(name = "locking_policy_pragma", type = LockingPolicyPragma.class),
        @XmlElement(name = "normalize_scalars_pragma", type = NormalizeScalarsPragma.class),
        @XmlElement(name = "optimize_pragma", type = OptimizePragma.class),
        @XmlElement(name = "pack_pragma", type = PackPragma.class),
        @XmlElement(name = "page_pragma", type = PagePragma.class),
        @XmlElement(name = "preelaborate_pragma", type = PreelaboratePragma.class),
        @XmlElement(name = "priority_pragma", type = PriorityPragma.class),
        @XmlElement(name = "pure_pragma", type = PurePragma.class),
        @XmlElement(name = "queuing_policy_pragma", type = QueuingPolicyPragma.class),
        @XmlElement(name = "remote_call_interface_pragma", type = RemoteCallInterfacePragma.class),
        @XmlElement(name = "remote_types_pragma", type = RemoteTypesPragma.class),
        @XmlElement(name = "restrictions_pragma", type = RestrictionsPragma.class),
        @XmlElement(name = "reviewable_pragma", type = ReviewablePragma.class),
        @XmlElement(name = "shared_passive_pragma", type = SharedPassivePragma.class),
        @XmlElement(name = "storage_size_pragma", type = StorageSizePragma.class),
        @XmlElement(name = "suppress_pragma", type = SuppressPragma.class),
        @XmlElement(name = "task_dispatching_policy_pragma", type = TaskDispatchingPolicyPragma.class),
        @XmlElement(name = "volatile_pragma", type = VolatilePragma.class),
        @XmlElement(name = "volatile_components_pragma", type = VolatileComponentsPragma.class),
        @XmlElement(name = "assert_pragma", type = AssertPragma.class),
        @XmlElement(name = "assertion_policy_pragma", type = AssertionPolicyPragma.class),
        @XmlElement(name = "detect_blocking_pragma", type = DetectBlockingPragma.class),
        @XmlElement(name = "no_return_pragma", type = NoReturnPragma.class),
        @XmlElement(name = "partition_elaboration_policy_pragma", type = PartitionElaborationPolicyPragma.class),
        @XmlElement(name = "preelaborable_initialization_pragma", type = PreelaborableInitializationPragma.class),
        @XmlElement(name = "priority_specific_dispatching_pragma", type = PrioritySpecificDispatchingPragma.class),
        @XmlElement(name = "profile_pragma", type = ProfilePragma.class),
        @XmlElement(name = "relative_deadline_pragma", type = RelativeDeadlinePragma.class),
        @XmlElement(name = "unchecked_union_pragma", type = UncheckedUnionPragma.class),
        @XmlElement(name = "unsuppress_pragma", type = UnsuppressPragma.class),
        @XmlElement(name = "default_storage_pool_pragma", type = DefaultStoragePoolPragma.class),
        @XmlElement(name = "dispatching_domain_pragma", type = DispatchingDomainPragma.class),
        @XmlElement(name = "cpu_pragma", type = CpuPragma.class),
        @XmlElement(name = "independent_pragma", type = IndependentPragma.class),
        @XmlElement(name = "independent_components_pragma", type = IndependentComponentsPragma.class),
        @XmlElement(name = "implementation_defined_pragma", type = ImplementationDefinedPragma.class),
        @XmlElement(name = "unknown_pragma", type = UnknownPragma.class)
    })
    protected List<Base> elements;

    /**
     * Gets the value of the elements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotAnElement }
     * {@link DefiningIdentifier }
     * {@link DefiningCharacterLiteral }
     * {@link DefiningEnumerationLiteral }
     * {@link DefiningAndOperator }
     * {@link DefiningOrOperator }
     * {@link DefiningXorOperator }
     * {@link DefiningEqualOperator }
     * {@link DefiningNotEqualOperator }
     * {@link DefiningLessThanOperator }
     * {@link DefiningLessThanOrEqualOperator }
     * {@link DefiningGreaterThanOperator }
     * {@link DefiningGreaterThanOrEqualOperator }
     * {@link DefiningPlusOperator }
     * {@link DefiningMinusOperator }
     * {@link DefiningConcatenateOperator }
     * {@link DefiningUnaryPlusOperator }
     * {@link DefiningUnaryMinusOperator }
     * {@link DefiningMultiplyOperator }
     * {@link DefiningDivideOperator }
     * {@link DefiningModOperator }
     * {@link DefiningRemOperator }
     * {@link DefiningExponentiateOperator }
     * {@link DefiningAbsOperator }
     * {@link DefiningNotOperator }
     * {@link DefiningExpandedName }
     * {@link OrdinaryTypeDeclaration }
     * {@link TaskTypeDeclaration }
     * {@link ProtectedTypeDeclaration }
     * {@link IncompleteTypeDeclaration }
     * {@link TaggedIncompleteTypeDeclaration }
     * {@link PrivateTypeDeclaration }
     * {@link PrivateExtensionDeclaration }
     * {@link SubtypeDeclaration }
     * {@link VariableDeclaration }
     * {@link ConstantDeclaration }
     * {@link DeferredConstantDeclaration }
     * {@link SingleTaskDeclaration }
     * {@link SingleProtectedDeclaration }
     * {@link IntegerNumberDeclaration }
     * {@link RealNumberDeclaration }
     * {@link EnumerationLiteralSpecification }
     * {@link DiscriminantSpecification }
     * {@link ComponentDeclaration }
     * {@link LoopParameterSpecification }
     * {@link GeneralizedIteratorSpecification }
     * {@link ElementIteratorSpecification }
     * {@link ProcedureDeclaration }
     * {@link FunctionDeclaration }
     * {@link ParameterSpecification }
     * {@link ProcedureBodyDeclaration }
     * {@link FunctionBodyDeclaration }
     * {@link ReturnVariableSpecification }
     * {@link ReturnConstantSpecification }
     * {@link NullProcedureDeclaration }
     * {@link ExpressionFunctionDeclaration }
     * {@link PackageDeclaration }
     * {@link PackageBodyDeclaration }
     * {@link ObjectRenamingDeclaration }
     * {@link ExceptionRenamingDeclaration }
     * {@link PackageRenamingDeclaration }
     * {@link ProcedureRenamingDeclaration }
     * {@link FunctionRenamingDeclaration }
     * {@link GenericPackageRenamingDeclaration }
     * {@link GenericProcedureRenamingDeclaration }
     * {@link GenericFunctionRenamingDeclaration }
     * {@link TaskBodyDeclaration }
     * {@link ProtectedBodyDeclaration }
     * {@link EntryDeclaration }
     * {@link EntryBodyDeclaration }
     * {@link EntryIndexSpecification }
     * {@link ProcedureBodyStub }
     * {@link FunctionBodyStub }
     * {@link PackageBodyStub }
     * {@link TaskBodyStub }
     * {@link ProtectedBodyStub }
     * {@link ExceptionDeclaration }
     * {@link ChoiceParameterSpecification }
     * {@link GenericProcedureDeclaration }
     * {@link GenericFunctionDeclaration }
     * {@link GenericPackageDeclaration }
     * {@link PackageInstantiation }
     * {@link ProcedureInstantiation }
     * {@link FunctionInstantiation }
     * {@link FormalObjectDeclaration }
     * {@link FormalTypeDeclaration }
     * {@link FormalIncompleteTypeDeclaration }
     * {@link FormalProcedureDeclaration }
     * {@link FormalFunctionDeclaration }
     * {@link FormalPackageDeclaration }
     * {@link FormalPackageDeclarationWithBox }
     * {@link DerivedTypeDefinition }
     * {@link DerivedRecordExtensionDefinition }
     * {@link EnumerationTypeDefinition }
     * {@link SignedIntegerTypeDefinition }
     * {@link ModularTypeDefinition }
     * {@link RootIntegerDefinition }
     * {@link RootRealDefinition }
     * {@link UniversalIntegerDefinition }
     * {@link UniversalRealDefinition }
     * {@link UniversalFixedDefinition }
     * {@link FloatingPointDefinition }
     * {@link OrdinaryFixedPointDefinition }
     * {@link DecimalFixedPointDefinition }
     * {@link UnconstrainedArrayDefinition }
     * {@link ConstrainedArrayDefinition }
     * {@link RecordTypeDefinition }
     * {@link TaggedRecordTypeDefinition }
     * {@link OrdinaryInterface }
     * {@link LimitedInterface }
     * {@link TaskInterface }
     * {@link ProtectedInterface }
     * {@link SynchronizedInterface }
     * {@link PoolSpecificAccessToVariable }
     * {@link AccessToVariable }
     * {@link AccessToConstant }
     * {@link AccessToProcedure }
     * {@link AccessToProtectedProcedure }
     * {@link AccessToFunction }
     * {@link AccessToProtectedFunction }
     * {@link SubtypeIndication }
     * {@link RangeAttributeReference }
     * {@link SimpleExpressionRange }
     * {@link DigitsConstraint }
     * {@link DeltaConstraint }
     * {@link IndexConstraint }
     * {@link DiscriminantConstraint }
     * {@link ComponentDefinition }
     * {@link DiscreteSubtypeIndicationAsSubtypeDefinition }
     * {@link DiscreteRangeAttributeReferenceAsSubtypeDefinition }
     * {@link DiscreteSimpleExpressionRangeAsSubtypeDefinition }
     * {@link DiscreteSubtypeIndication }
     * {@link DiscreteRangeAttributeReference }
     * {@link DiscreteSimpleExpressionRange }
     * {@link UnknownDiscriminantPart }
     * {@link KnownDiscriminantPart }
     * {@link RecordDefinition }
     * {@link NullRecordDefinition }
     * {@link NullComponent }
     * {@link VariantPart }
     * {@link Variant }
     * {@link OthersChoice }
     * {@link AnonymousAccessToVariable }
     * {@link AnonymousAccessToConstant }
     * {@link AnonymousAccessToProcedure }
     * {@link AnonymousAccessToProtectedProcedure }
     * {@link AnonymousAccessToFunction }
     * {@link AnonymousAccessToProtectedFunction }
     * {@link PrivateTypeDefinition }
     * {@link TaggedPrivateTypeDefinition }
     * {@link PrivateExtensionDefinition }
     * {@link TaskDefinition }
     * {@link ProtectedDefinition }
     * {@link FormalPrivateTypeDefinition }
     * {@link FormalTaggedPrivateTypeDefinition }
     * {@link FormalDerivedTypeDefinition }
     * {@link FormalDiscreteTypeDefinition }
     * {@link FormalSignedIntegerTypeDefinition }
     * {@link FormalModularTypeDefinition }
     * {@link FormalFloatingPointDefinition }
     * {@link FormalOrdinaryFixedPointDefinition }
     * {@link FormalDecimalFixedPointDefinition }
     * {@link FormalOrdinaryInterface }
     * {@link FormalLimitedInterface }
     * {@link FormalTaskInterface }
     * {@link FormalProtectedInterface }
     * {@link FormalSynchronizedInterface }
     * {@link FormalUnconstrainedArrayDefinition }
     * {@link FormalConstrainedArrayDefinition }
     * {@link FormalPoolSpecificAccessToVariable }
     * {@link FormalAccessToVariable }
     * {@link FormalAccessToConstant }
     * {@link FormalAccessToProcedure }
     * {@link FormalAccessToProtectedProcedure }
     * {@link FormalAccessToFunction }
     * {@link FormalAccessToProtectedFunction }
     * {@link AspectSpecification }
     * {@link BoxExpression }
     * {@link IntegerLiteral }
     * {@link RealLiteral }
     * {@link StringLiteral }
     * {@link Identifier }
     * {@link AndOperator }
     * {@link OrOperator }
     * {@link XorOperator }
     * {@link EqualOperator }
     * {@link NotEqualOperator }
     * {@link LessThanOperator }
     * {@link LessThanOrEqualOperator }
     * {@link GreaterThanOperator }
     * {@link GreaterThanOrEqualOperator }
     * {@link PlusOperator }
     * {@link MinusOperator }
     * {@link ConcatenateOperator }
     * {@link UnaryPlusOperator }
     * {@link UnaryMinusOperator }
     * {@link MultiplyOperator }
     * {@link DivideOperator }
     * {@link ModOperator }
     * {@link RemOperator }
     * {@link ExponentiateOperator }
     * {@link AbsOperator }
     * {@link NotOperator }
     * {@link CharacterLiteral }
     * {@link EnumerationLiteral }
     * {@link ExplicitDereference }
     * {@link FunctionCall }
     * {@link IndexedComponent }
     * {@link Slice }
     * {@link SelectedComponent }
     * {@link AccessAttribute }
     * {@link AddressAttribute }
     * {@link AdjacentAttribute }
     * {@link AftAttribute }
     * {@link AlignmentAttribute }
     * {@link BaseAttribute }
     * {@link BitOrderAttribute }
     * {@link BodyVersionAttribute }
     * {@link CallableAttribute }
     * {@link CallerAttribute }
     * {@link CeilingAttribute }
     * {@link ClassAttribute }
     * {@link ComponentSizeAttribute }
     * {@link ComposeAttribute }
     * {@link ConstrainedAttribute }
     * {@link CopySignAttribute }
     * {@link CountAttribute }
     * {@link DefiniteAttribute }
     * {@link DeltaAttribute }
     * {@link DenormAttribute }
     * {@link DigitsAttribute }
     * {@link ExponentAttribute }
     * {@link ExternalTagAttribute }
     * {@link FirstAttribute }
     * {@link FirstBitAttribute }
     * {@link FloorAttribute }
     * {@link ForeAttribute }
     * {@link FractionAttribute }
     * {@link IdentityAttribute }
     * {@link ImageAttribute }
     * {@link InputAttribute }
     * {@link LastAttribute }
     * {@link LastBitAttribute }
     * {@link LeadingPartAttribute }
     * {@link LengthAttribute }
     * {@link MachineAttribute }
     * {@link MachineEmaxAttribute }
     * {@link MachineEminAttribute }
     * {@link MachineMantissaAttribute }
     * {@link MachineOverflowsAttribute }
     * {@link MachineRadixAttribute }
     * {@link MachineRoundsAttribute }
     * {@link MaxAttribute }
     * {@link MaxSizeInStorageElementsAttribute }
     * {@link MinAttribute }
     * {@link ModelAttribute }
     * {@link ModelEminAttribute }
     * {@link ModelEpsilonAttribute }
     * {@link ModelMantissaAttribute }
     * {@link ModelSmallAttribute }
     * {@link ModulusAttribute }
     * {@link OutputAttribute }
     * {@link PartitionIdAttribute }
     * {@link PosAttribute }
     * {@link PositionAttribute }
     * {@link PredAttribute }
     * {@link RangeAttribute }
     * {@link ReadAttribute }
     * {@link RemainderAttribute }
     * {@link RoundAttribute }
     * {@link RoundingAttribute }
     * {@link SafeFirstAttribute }
     * {@link SafeLastAttribute }
     * {@link ScaleAttribute }
     * {@link ScalingAttribute }
     * {@link SignedZerosAttribute }
     * {@link SizeAttribute }
     * {@link SmallAttribute }
     * {@link StoragePoolAttribute }
     * {@link StorageSizeAttribute }
     * {@link SuccAttribute }
     * {@link TagAttribute }
     * {@link TerminatedAttribute }
     * {@link TruncationAttribute }
     * {@link UnbiasedRoundingAttribute }
     * {@link UncheckedAccessAttribute }
     * {@link ValAttribute }
     * {@link ValidAttribute }
     * {@link ValueAttribute }
     * {@link VersionAttribute }
     * {@link WideImageAttribute }
     * {@link WideValueAttribute }
     * {@link WideWidthAttribute }
     * {@link WidthAttribute }
     * {@link WriteAttribute }
     * {@link MachineRoundingAttribute }
     * {@link ModAttribute }
     * {@link PriorityAttribute }
     * {@link StreamSizeAttribute }
     * {@link WideWideImageAttribute }
     * {@link WideWideValueAttribute }
     * {@link WideWideWidthAttribute }
     * {@link MaxAlignmentForAllocationAttribute }
     * {@link OverlapsStorageAttribute }
     * {@link ImplementationDefinedAttribute }
     * {@link UnknownAttribute }
     * {@link RecordAggregate }
     * {@link ExtensionAggregate }
     * {@link PositionalArrayAggregate }
     * {@link NamedArrayAggregate }
     * {@link AndThenShortCircuit }
     * {@link OrElseShortCircuit }
     * {@link InMembershipTest }
     * {@link NotInMembershipTest }
     * {@link NullLiteral }
     * {@link ParenthesizedExpression }
     * {@link RaiseExpression }
     * {@link TypeConversion }
     * {@link QualifiedExpression }
     * {@link AllocationFromSubtype }
     * {@link AllocationFromQualifiedExpression }
     * {@link CaseExpression }
     * {@link IfExpression }
     * {@link ForAllQuantifiedExpression }
     * {@link ForSomeQuantifiedExpression }
     * {@link PragmaArgumentAssociation }
     * {@link DiscriminantAssociation }
     * {@link RecordComponentAssociation }
     * {@link ArrayComponentAssociation }
     * {@link ParameterAssociation }
     * {@link GenericAssociation }
     * {@link NullStatement }
     * {@link AssignmentStatement }
     * {@link IfStatement }
     * {@link CaseStatement }
     * {@link LoopStatement }
     * {@link WhileLoopStatement }
     * {@link ForLoopStatement }
     * {@link BlockStatement }
     * {@link ExitStatement }
     * {@link GotoStatement }
     * {@link ProcedureCallStatement }
     * {@link ReturnStatement }
     * {@link ExtendedReturnStatement }
     * {@link AcceptStatement }
     * {@link EntryCallStatement }
     * {@link RequeueStatement }
     * {@link RequeueStatementWithAbort }
     * {@link DelayUntilStatement }
     * {@link DelayRelativeStatement }
     * {@link TerminateAlternativeStatement }
     * {@link SelectiveAcceptStatement }
     * {@link TimedEntryCallStatement }
     * {@link ConditionalEntryCallStatement }
     * {@link AsynchronousSelectStatement }
     * {@link AbortStatement }
     * {@link RaiseStatement }
     * {@link CodeStatement }
     * {@link IfPath }
     * {@link ElsifPath }
     * {@link ElsePath }
     * {@link CasePath }
     * {@link SelectPath }
     * {@link OrPath }
     * {@link ThenAbortPath }
     * {@link CaseExpressionPath }
     * {@link IfExpressionPath }
     * {@link ElsifExpressionPath }
     * {@link ElseExpressionPath }
     * {@link UsePackageClause }
     * {@link UseTypeClause }
     * {@link UseAllTypeClause }
     * {@link WithClause }
     * {@link AttributeDefinitionClause }
     * {@link EnumerationRepresentationClause }
     * {@link RecordRepresentationClause }
     * {@link AtClause }
     * {@link ComponentClause }
     * {@link ExceptionHandler }
     * {@link AllCallsRemotePragma }
     * {@link AsynchronousPragma }
     * {@link AtomicPragma }
     * {@link AtomicComponentsPragma }
     * {@link AttachHandlerPragma }
     * {@link ControlledPragma }
     * {@link ConventionPragma }
     * {@link DiscardNamesPragma }
     * {@link ElaboratePragma }
     * {@link ElaborateAllPragma }
     * {@link ElaborateBodyPragma }
     * {@link ExportPragma }
     * {@link ImportPragma }
     * {@link InlinePragma }
     * {@link InspectionPointPragma }
     * {@link InterruptHandlerPragma }
     * {@link InterruptPriorityPragma }
     * {@link LinkerOptionsPragma }
     * {@link ListPragma }
     * {@link LockingPolicyPragma }
     * {@link NormalizeScalarsPragma }
     * {@link OptimizePragma }
     * {@link PackPragma }
     * {@link PagePragma }
     * {@link PreelaboratePragma }
     * {@link PriorityPragma }
     * {@link PurePragma }
     * {@link QueuingPolicyPragma }
     * {@link RemoteCallInterfacePragma }
     * {@link RemoteTypesPragma }
     * {@link RestrictionsPragma }
     * {@link ReviewablePragma }
     * {@link SharedPassivePragma }
     * {@link StorageSizePragma }
     * {@link SuppressPragma }
     * {@link TaskDispatchingPolicyPragma }
     * {@link VolatilePragma }
     * {@link VolatileComponentsPragma }
     * {@link AssertPragma }
     * {@link AssertionPolicyPragma }
     * {@link DetectBlockingPragma }
     * {@link NoReturnPragma }
     * {@link PartitionElaborationPolicyPragma }
     * {@link PreelaborableInitializationPragma }
     * {@link PrioritySpecificDispatchingPragma }
     * {@link ProfilePragma }
     * {@link RelativeDeadlinePragma }
     * {@link UncheckedUnionPragma }
     * {@link UnsuppressPragma }
     * {@link DefaultStoragePoolPragma }
     * {@link DispatchingDomainPragma }
     * {@link CpuPragma }
     * {@link IndependentPragma }
     * {@link IndependentComponentsPragma }
     * {@link ImplementationDefinedPragma }
     * {@link UnknownPragma }
     * 
     * 
     */
    public List<Base> getElements() {
        if (elements == null) {
            elements = new ArrayList<Base>();
        }
        return this.elements;
    }

}
