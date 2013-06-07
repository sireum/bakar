
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Defining_Name_Class complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Defining_Name_Class">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
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
@XmlType(name = "Defining_Name_Class", propOrder = {
    "definingName"
})
public class DefiningNameClass
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
    protected Base definingName;

    /**
     * Gets the value of the definingName property.
     * 
     * @return
     *     possible object is
     *     {@link NotAnElement }
     *     {@link DefiningIdentifier }
     *     {@link DefiningCharacterLiteral }
     *     {@link DefiningEnumerationLiteral }
     *     {@link DefiningAndOperator }
     *     {@link DefiningOrOperator }
     *     {@link DefiningXorOperator }
     *     {@link DefiningEqualOperator }
     *     {@link DefiningNotEqualOperator }
     *     {@link DefiningLessThanOperator }
     *     {@link DefiningLessThanOrEqualOperator }
     *     {@link DefiningGreaterThanOperator }
     *     {@link DefiningGreaterThanOrEqualOperator }
     *     {@link DefiningPlusOperator }
     *     {@link DefiningMinusOperator }
     *     {@link DefiningConcatenateOperator }
     *     {@link DefiningUnaryPlusOperator }
     *     {@link DefiningUnaryMinusOperator }
     *     {@link DefiningMultiplyOperator }
     *     {@link DefiningDivideOperator }
     *     {@link DefiningModOperator }
     *     {@link DefiningRemOperator }
     *     {@link DefiningExponentiateOperator }
     *     {@link DefiningAbsOperator }
     *     {@link DefiningNotOperator }
     *     {@link DefiningExpandedName }
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
    public Base getDefiningName() {
        return definingName;
    }

    /**
     * Sets the value of the definingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotAnElement }
     *     {@link DefiningIdentifier }
     *     {@link DefiningCharacterLiteral }
     *     {@link DefiningEnumerationLiteral }
     *     {@link DefiningAndOperator }
     *     {@link DefiningOrOperator }
     *     {@link DefiningXorOperator }
     *     {@link DefiningEqualOperator }
     *     {@link DefiningNotEqualOperator }
     *     {@link DefiningLessThanOperator }
     *     {@link DefiningLessThanOrEqualOperator }
     *     {@link DefiningGreaterThanOperator }
     *     {@link DefiningGreaterThanOrEqualOperator }
     *     {@link DefiningPlusOperator }
     *     {@link DefiningMinusOperator }
     *     {@link DefiningConcatenateOperator }
     *     {@link DefiningUnaryPlusOperator }
     *     {@link DefiningUnaryMinusOperator }
     *     {@link DefiningMultiplyOperator }
     *     {@link DefiningDivideOperator }
     *     {@link DefiningModOperator }
     *     {@link DefiningRemOperator }
     *     {@link DefiningExponentiateOperator }
     *     {@link DefiningAbsOperator }
     *     {@link DefiningNotOperator }
     *     {@link DefiningExpandedName }
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
    public void setDefiningName(Base value) {
        this.definingName = value;
    }

}
