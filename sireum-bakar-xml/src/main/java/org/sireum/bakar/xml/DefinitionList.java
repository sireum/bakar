
package org.sireum.bakar.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Definition_List complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Definition_List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}not_an_element"/>
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
 *         &lt;element ref="{}identifier"/>
 *         &lt;element ref="{}selected_component"/>
 *         &lt;element ref="{}base_attribute"/>
 *         &lt;element ref="{}class_attribute"/>
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
@XmlType(name = "Definition_List", propOrder = {
    "definitions"
})
public class DefinitionList
    extends Base
{

    @XmlElements({
        @XmlElement(name = "not_an_element", type = NotAnElement.class),
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
        @XmlElement(name = "identifier", type = Identifier.class),
        @XmlElement(name = "selected_component", type = SelectedComponent.class),
        @XmlElement(name = "base_attribute", type = BaseAttribute.class),
        @XmlElement(name = "class_attribute", type = ClassAttribute.class),
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
    protected List<Base> definitions;

    /**
     * Gets the value of the definitions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the definitions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinitions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotAnElement }
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
     * {@link Identifier }
     * {@link SelectedComponent }
     * {@link BaseAttribute }
     * {@link ClassAttribute }
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
    public List<Base> getDefinitions() {
        if (definitions == null) {
            definitions = new ArrayList<Base>();
        }
        return this.definitions;
    }

}
