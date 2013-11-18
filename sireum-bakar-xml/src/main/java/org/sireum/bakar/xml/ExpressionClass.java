
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Expression_Class complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Expression_Class">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{}not_an_element"/>
 *         &lt;element ref="{}discrete_range_attribute_reference"/>
 *         &lt;element ref="{}discrete_simple_expression_range"/>
 *         &lt;element ref="{}others_choice"/>
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
@XmlType(name = "Expression_Class", propOrder = {
    "expression"
})
public class ExpressionClass
    extends Base
{

    @XmlElements({
        @XmlElement(name = "not_an_element", type = NotAnElement.class),
        @XmlElement(name = "discrete_range_attribute_reference", type = DiscreteRangeAttributeReference.class),
        @XmlElement(name = "discrete_simple_expression_range", type = DiscreteSimpleExpressionRange.class),
        @XmlElement(name = "others_choice", type = OthersChoice.class),
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
    protected Base expression;

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link NotAnElement }
     *     {@link DiscreteRangeAttributeReference }
     *     {@link DiscreteSimpleExpressionRange }
     *     {@link OthersChoice }
     *     {@link BoxExpression }
     *     {@link IntegerLiteral }
     *     {@link RealLiteral }
     *     {@link StringLiteral }
     *     {@link Identifier }
     *     {@link AndOperator }
     *     {@link OrOperator }
     *     {@link XorOperator }
     *     {@link EqualOperator }
     *     {@link NotEqualOperator }
     *     {@link LessThanOperator }
     *     {@link LessThanOrEqualOperator }
     *     {@link GreaterThanOperator }
     *     {@link GreaterThanOrEqualOperator }
     *     {@link PlusOperator }
     *     {@link MinusOperator }
     *     {@link ConcatenateOperator }
     *     {@link UnaryPlusOperator }
     *     {@link UnaryMinusOperator }
     *     {@link MultiplyOperator }
     *     {@link DivideOperator }
     *     {@link ModOperator }
     *     {@link RemOperator }
     *     {@link ExponentiateOperator }
     *     {@link AbsOperator }
     *     {@link NotOperator }
     *     {@link CharacterLiteral }
     *     {@link EnumerationLiteral }
     *     {@link ExplicitDereference }
     *     {@link FunctionCall }
     *     {@link IndexedComponent }
     *     {@link Slice }
     *     {@link SelectedComponent }
     *     {@link AccessAttribute }
     *     {@link AddressAttribute }
     *     {@link AdjacentAttribute }
     *     {@link AftAttribute }
     *     {@link AlignmentAttribute }
     *     {@link BaseAttribute }
     *     {@link BitOrderAttribute }
     *     {@link BodyVersionAttribute }
     *     {@link CallableAttribute }
     *     {@link CallerAttribute }
     *     {@link CeilingAttribute }
     *     {@link ClassAttribute }
     *     {@link ComponentSizeAttribute }
     *     {@link ComposeAttribute }
     *     {@link ConstrainedAttribute }
     *     {@link CopySignAttribute }
     *     {@link CountAttribute }
     *     {@link DefiniteAttribute }
     *     {@link DeltaAttribute }
     *     {@link DenormAttribute }
     *     {@link DigitsAttribute }
     *     {@link ExponentAttribute }
     *     {@link ExternalTagAttribute }
     *     {@link FirstAttribute }
     *     {@link FirstBitAttribute }
     *     {@link FloorAttribute }
     *     {@link ForeAttribute }
     *     {@link FractionAttribute }
     *     {@link IdentityAttribute }
     *     {@link ImageAttribute }
     *     {@link InputAttribute }
     *     {@link LastAttribute }
     *     {@link LastBitAttribute }
     *     {@link LeadingPartAttribute }
     *     {@link LengthAttribute }
     *     {@link MachineAttribute }
     *     {@link MachineEmaxAttribute }
     *     {@link MachineEminAttribute }
     *     {@link MachineMantissaAttribute }
     *     {@link MachineOverflowsAttribute }
     *     {@link MachineRadixAttribute }
     *     {@link MachineRoundsAttribute }
     *     {@link MaxAttribute }
     *     {@link MaxSizeInStorageElementsAttribute }
     *     {@link MinAttribute }
     *     {@link ModelAttribute }
     *     {@link ModelEminAttribute }
     *     {@link ModelEpsilonAttribute }
     *     {@link ModelMantissaAttribute }
     *     {@link ModelSmallAttribute }
     *     {@link ModulusAttribute }
     *     {@link OutputAttribute }
     *     {@link PartitionIdAttribute }
     *     {@link PosAttribute }
     *     {@link PositionAttribute }
     *     {@link PredAttribute }
     *     {@link RangeAttribute }
     *     {@link ReadAttribute }
     *     {@link RemainderAttribute }
     *     {@link RoundAttribute }
     *     {@link RoundingAttribute }
     *     {@link SafeFirstAttribute }
     *     {@link SafeLastAttribute }
     *     {@link ScaleAttribute }
     *     {@link ScalingAttribute }
     *     {@link SignedZerosAttribute }
     *     {@link SizeAttribute }
     *     {@link SmallAttribute }
     *     {@link StoragePoolAttribute }
     *     {@link StorageSizeAttribute }
     *     {@link SuccAttribute }
     *     {@link TagAttribute }
     *     {@link TerminatedAttribute }
     *     {@link TruncationAttribute }
     *     {@link UnbiasedRoundingAttribute }
     *     {@link UncheckedAccessAttribute }
     *     {@link ValAttribute }
     *     {@link ValidAttribute }
     *     {@link ValueAttribute }
     *     {@link VersionAttribute }
     *     {@link WideImageAttribute }
     *     {@link WideValueAttribute }
     *     {@link WideWidthAttribute }
     *     {@link WidthAttribute }
     *     {@link WriteAttribute }
     *     {@link MachineRoundingAttribute }
     *     {@link ModAttribute }
     *     {@link PriorityAttribute }
     *     {@link StreamSizeAttribute }
     *     {@link WideWideImageAttribute }
     *     {@link WideWideValueAttribute }
     *     {@link WideWideWidthAttribute }
     *     {@link MaxAlignmentForAllocationAttribute }
     *     {@link OverlapsStorageAttribute }
     *     {@link ImplementationDefinedAttribute }
     *     {@link UnknownAttribute }
     *     {@link RecordAggregate }
     *     {@link ExtensionAggregate }
     *     {@link PositionalArrayAggregate }
     *     {@link NamedArrayAggregate }
     *     {@link AndThenShortCircuit }
     *     {@link OrElseShortCircuit }
     *     {@link InMembershipTest }
     *     {@link NotInMembershipTest }
     *     {@link NullLiteral }
     *     {@link ParenthesizedExpression }
     *     {@link RaiseExpression }
     *     {@link TypeConversion }
     *     {@link QualifiedExpression }
     *     {@link AllocationFromSubtype }
     *     {@link AllocationFromQualifiedExpression }
     *     {@link CaseExpression }
     *     {@link IfExpression }
     *     {@link ForAllQuantifiedExpression }
     *     {@link ForSomeQuantifiedExpression }
     *     {@link AllCallsRemotePragma }
     *     {@link AsynchronousPragma }
     *     {@link AtomicPragma }
     *     {@link AtomicComponentsPragma }
     *     {@link AttachHandlerPragma }
     *     {@link ControlledPragma }
     *     {@link ConventionPragma }
     *     {@link DiscardNamesPragma }
     *     {@link ElaboratePragma }
     *     {@link ElaborateAllPragma }
     *     {@link ElaborateBodyPragma }
     *     {@link ExportPragma }
     *     {@link ImportPragma }
     *     {@link InlinePragma }
     *     {@link InspectionPointPragma }
     *     {@link InterruptHandlerPragma }
     *     {@link InterruptPriorityPragma }
     *     {@link LinkerOptionsPragma }
     *     {@link ListPragma }
     *     {@link LockingPolicyPragma }
     *     {@link NormalizeScalarsPragma }
     *     {@link OptimizePragma }
     *     {@link PackPragma }
     *     {@link PagePragma }
     *     {@link PreelaboratePragma }
     *     {@link PriorityPragma }
     *     {@link PurePragma }
     *     {@link QueuingPolicyPragma }
     *     {@link RemoteCallInterfacePragma }
     *     {@link RemoteTypesPragma }
     *     {@link RestrictionsPragma }
     *     {@link ReviewablePragma }
     *     {@link SharedPassivePragma }
     *     {@link StorageSizePragma }
     *     {@link SuppressPragma }
     *     {@link TaskDispatchingPolicyPragma }
     *     {@link VolatilePragma }
     *     {@link VolatileComponentsPragma }
     *     {@link AssertPragma }
     *     {@link AssertionPolicyPragma }
     *     {@link DetectBlockingPragma }
     *     {@link NoReturnPragma }
     *     {@link PartitionElaborationPolicyPragma }
     *     {@link PreelaborableInitializationPragma }
     *     {@link PrioritySpecificDispatchingPragma }
     *     {@link ProfilePragma }
     *     {@link RelativeDeadlinePragma }
     *     {@link UncheckedUnionPragma }
     *     {@link UnsuppressPragma }
     *     {@link DefaultStoragePoolPragma }
     *     {@link DispatchingDomainPragma }
     *     {@link CpuPragma }
     *     {@link IndependentPragma }
     *     {@link IndependentComponentsPragma }
     *     {@link ImplementationDefinedPragma }
     *     {@link UnknownPragma }
     *     
     */
    public Base getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotAnElement }
     *     {@link DiscreteRangeAttributeReference }
     *     {@link DiscreteSimpleExpressionRange }
     *     {@link OthersChoice }
     *     {@link BoxExpression }
     *     {@link IntegerLiteral }
     *     {@link RealLiteral }
     *     {@link StringLiteral }
     *     {@link Identifier }
     *     {@link AndOperator }
     *     {@link OrOperator }
     *     {@link XorOperator }
     *     {@link EqualOperator }
     *     {@link NotEqualOperator }
     *     {@link LessThanOperator }
     *     {@link LessThanOrEqualOperator }
     *     {@link GreaterThanOperator }
     *     {@link GreaterThanOrEqualOperator }
     *     {@link PlusOperator }
     *     {@link MinusOperator }
     *     {@link ConcatenateOperator }
     *     {@link UnaryPlusOperator }
     *     {@link UnaryMinusOperator }
     *     {@link MultiplyOperator }
     *     {@link DivideOperator }
     *     {@link ModOperator }
     *     {@link RemOperator }
     *     {@link ExponentiateOperator }
     *     {@link AbsOperator }
     *     {@link NotOperator }
     *     {@link CharacterLiteral }
     *     {@link EnumerationLiteral }
     *     {@link ExplicitDereference }
     *     {@link FunctionCall }
     *     {@link IndexedComponent }
     *     {@link Slice }
     *     {@link SelectedComponent }
     *     {@link AccessAttribute }
     *     {@link AddressAttribute }
     *     {@link AdjacentAttribute }
     *     {@link AftAttribute }
     *     {@link AlignmentAttribute }
     *     {@link BaseAttribute }
     *     {@link BitOrderAttribute }
     *     {@link BodyVersionAttribute }
     *     {@link CallableAttribute }
     *     {@link CallerAttribute }
     *     {@link CeilingAttribute }
     *     {@link ClassAttribute }
     *     {@link ComponentSizeAttribute }
     *     {@link ComposeAttribute }
     *     {@link ConstrainedAttribute }
     *     {@link CopySignAttribute }
     *     {@link CountAttribute }
     *     {@link DefiniteAttribute }
     *     {@link DeltaAttribute }
     *     {@link DenormAttribute }
     *     {@link DigitsAttribute }
     *     {@link ExponentAttribute }
     *     {@link ExternalTagAttribute }
     *     {@link FirstAttribute }
     *     {@link FirstBitAttribute }
     *     {@link FloorAttribute }
     *     {@link ForeAttribute }
     *     {@link FractionAttribute }
     *     {@link IdentityAttribute }
     *     {@link ImageAttribute }
     *     {@link InputAttribute }
     *     {@link LastAttribute }
     *     {@link LastBitAttribute }
     *     {@link LeadingPartAttribute }
     *     {@link LengthAttribute }
     *     {@link MachineAttribute }
     *     {@link MachineEmaxAttribute }
     *     {@link MachineEminAttribute }
     *     {@link MachineMantissaAttribute }
     *     {@link MachineOverflowsAttribute }
     *     {@link MachineRadixAttribute }
     *     {@link MachineRoundsAttribute }
     *     {@link MaxAttribute }
     *     {@link MaxSizeInStorageElementsAttribute }
     *     {@link MinAttribute }
     *     {@link ModelAttribute }
     *     {@link ModelEminAttribute }
     *     {@link ModelEpsilonAttribute }
     *     {@link ModelMantissaAttribute }
     *     {@link ModelSmallAttribute }
     *     {@link ModulusAttribute }
     *     {@link OutputAttribute }
     *     {@link PartitionIdAttribute }
     *     {@link PosAttribute }
     *     {@link PositionAttribute }
     *     {@link PredAttribute }
     *     {@link RangeAttribute }
     *     {@link ReadAttribute }
     *     {@link RemainderAttribute }
     *     {@link RoundAttribute }
     *     {@link RoundingAttribute }
     *     {@link SafeFirstAttribute }
     *     {@link SafeLastAttribute }
     *     {@link ScaleAttribute }
     *     {@link ScalingAttribute }
     *     {@link SignedZerosAttribute }
     *     {@link SizeAttribute }
     *     {@link SmallAttribute }
     *     {@link StoragePoolAttribute }
     *     {@link StorageSizeAttribute }
     *     {@link SuccAttribute }
     *     {@link TagAttribute }
     *     {@link TerminatedAttribute }
     *     {@link TruncationAttribute }
     *     {@link UnbiasedRoundingAttribute }
     *     {@link UncheckedAccessAttribute }
     *     {@link ValAttribute }
     *     {@link ValidAttribute }
     *     {@link ValueAttribute }
     *     {@link VersionAttribute }
     *     {@link WideImageAttribute }
     *     {@link WideValueAttribute }
     *     {@link WideWidthAttribute }
     *     {@link WidthAttribute }
     *     {@link WriteAttribute }
     *     {@link MachineRoundingAttribute }
     *     {@link ModAttribute }
     *     {@link PriorityAttribute }
     *     {@link StreamSizeAttribute }
     *     {@link WideWideImageAttribute }
     *     {@link WideWideValueAttribute }
     *     {@link WideWideWidthAttribute }
     *     {@link MaxAlignmentForAllocationAttribute }
     *     {@link OverlapsStorageAttribute }
     *     {@link ImplementationDefinedAttribute }
     *     {@link UnknownAttribute }
     *     {@link RecordAggregate }
     *     {@link ExtensionAggregate }
     *     {@link PositionalArrayAggregate }
     *     {@link NamedArrayAggregate }
     *     {@link AndThenShortCircuit }
     *     {@link OrElseShortCircuit }
     *     {@link InMembershipTest }
     *     {@link NotInMembershipTest }
     *     {@link NullLiteral }
     *     {@link ParenthesizedExpression }
     *     {@link RaiseExpression }
     *     {@link TypeConversion }
     *     {@link QualifiedExpression }
     *     {@link AllocationFromSubtype }
     *     {@link AllocationFromQualifiedExpression }
     *     {@link CaseExpression }
     *     {@link IfExpression }
     *     {@link ForAllQuantifiedExpression }
     *     {@link ForSomeQuantifiedExpression }
     *     {@link AllCallsRemotePragma }
     *     {@link AsynchronousPragma }
     *     {@link AtomicPragma }
     *     {@link AtomicComponentsPragma }
     *     {@link AttachHandlerPragma }
     *     {@link ControlledPragma }
     *     {@link ConventionPragma }
     *     {@link DiscardNamesPragma }
     *     {@link ElaboratePragma }
     *     {@link ElaborateAllPragma }
     *     {@link ElaborateBodyPragma }
     *     {@link ExportPragma }
     *     {@link ImportPragma }
     *     {@link InlinePragma }
     *     {@link InspectionPointPragma }
     *     {@link InterruptHandlerPragma }
     *     {@link InterruptPriorityPragma }
     *     {@link LinkerOptionsPragma }
     *     {@link ListPragma }
     *     {@link LockingPolicyPragma }
     *     {@link NormalizeScalarsPragma }
     *     {@link OptimizePragma }
     *     {@link PackPragma }
     *     {@link PagePragma }
     *     {@link PreelaboratePragma }
     *     {@link PriorityPragma }
     *     {@link PurePragma }
     *     {@link QueuingPolicyPragma }
     *     {@link RemoteCallInterfacePragma }
     *     {@link RemoteTypesPragma }
     *     {@link RestrictionsPragma }
     *     {@link ReviewablePragma }
     *     {@link SharedPassivePragma }
     *     {@link StorageSizePragma }
     *     {@link SuppressPragma }
     *     {@link TaskDispatchingPolicyPragma }
     *     {@link VolatilePragma }
     *     {@link VolatileComponentsPragma }
     *     {@link AssertPragma }
     *     {@link AssertionPolicyPragma }
     *     {@link DetectBlockingPragma }
     *     {@link NoReturnPragma }
     *     {@link PartitionElaborationPolicyPragma }
     *     {@link PreelaborableInitializationPragma }
     *     {@link PrioritySpecificDispatchingPragma }
     *     {@link ProfilePragma }
     *     {@link RelativeDeadlinePragma }
     *     {@link UncheckedUnionPragma }
     *     {@link UnsuppressPragma }
     *     {@link DefaultStoragePoolPragma }
     *     {@link DispatchingDomainPragma }
     *     {@link CpuPragma }
     *     {@link IndependentPragma }
     *     {@link IndependentComponentsPragma }
     *     {@link ImplementationDefinedPragma }
     *     {@link UnknownPragma }
     *     
     */
    public void setExpression(Base value) {
        this.expression = value;
    }

}
