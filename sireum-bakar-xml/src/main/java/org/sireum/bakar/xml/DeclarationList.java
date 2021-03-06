
package org.sireum.bakar.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Declaration_List complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Declaration_List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}not_an_element"/>
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
@XmlType(name = "Declaration_List", propOrder = {
    "declarations"
})
public class DeclarationList
    extends Base
{

    @XmlElements({
        @XmlElement(name = "not_an_element", type = NotAnElement.class),
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
    protected List<Base> declarations;

    /**
     * Gets the value of the declarations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the declarations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeclarations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotAnElement }
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
    public List<Base> getDeclarations() {
        if (declarations == null) {
            declarations = new ArrayList<Base>();
        }
        return this.declarations;
    }

}
