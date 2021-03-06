
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Statement_Class complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Statement_Class">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{}not_an_element"/>
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
@XmlType(name = "Statement_Class", propOrder = {
    "theStatement"
})
public class StatementClass
    extends Base
{

    @XmlElements({
        @XmlElement(name = "not_an_element", type = NotAnElement.class),
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
    protected Base theStatement;

    /**
     * Gets the value of the theStatement property.
     * 
     * @return
     *     possible object is
     *     {@link NotAnElement }
     *     {@link NullStatement }
     *     {@link AssignmentStatement }
     *     {@link IfStatement }
     *     {@link CaseStatement }
     *     {@link LoopStatement }
     *     {@link WhileLoopStatement }
     *     {@link ForLoopStatement }
     *     {@link BlockStatement }
     *     {@link ExitStatement }
     *     {@link GotoStatement }
     *     {@link ProcedureCallStatement }
     *     {@link ReturnStatement }
     *     {@link ExtendedReturnStatement }
     *     {@link AcceptStatement }
     *     {@link EntryCallStatement }
     *     {@link RequeueStatement }
     *     {@link RequeueStatementWithAbort }
     *     {@link DelayUntilStatement }
     *     {@link DelayRelativeStatement }
     *     {@link TerminateAlternativeStatement }
     *     {@link SelectiveAcceptStatement }
     *     {@link TimedEntryCallStatement }
     *     {@link ConditionalEntryCallStatement }
     *     {@link AsynchronousSelectStatement }
     *     {@link AbortStatement }
     *     {@link RaiseStatement }
     *     {@link CodeStatement }
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
    public Base getTheStatement() {
        return theStatement;
    }

    /**
     * Sets the value of the theStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotAnElement }
     *     {@link NullStatement }
     *     {@link AssignmentStatement }
     *     {@link IfStatement }
     *     {@link CaseStatement }
     *     {@link LoopStatement }
     *     {@link WhileLoopStatement }
     *     {@link ForLoopStatement }
     *     {@link BlockStatement }
     *     {@link ExitStatement }
     *     {@link GotoStatement }
     *     {@link ProcedureCallStatement }
     *     {@link ReturnStatement }
     *     {@link ExtendedReturnStatement }
     *     {@link AcceptStatement }
     *     {@link EntryCallStatement }
     *     {@link RequeueStatement }
     *     {@link RequeueStatementWithAbort }
     *     {@link DelayUntilStatement }
     *     {@link DelayRelativeStatement }
     *     {@link TerminateAlternativeStatement }
     *     {@link SelectiveAcceptStatement }
     *     {@link TimedEntryCallStatement }
     *     {@link ConditionalEntryCallStatement }
     *     {@link AsynchronousSelectStatement }
     *     {@link AbortStatement }
     *     {@link RaiseStatement }
     *     {@link CodeStatement }
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
    public void setTheStatement(Base value) {
        this.theStatement = value;
    }

}
