
package body The_Stack_Praxis
  --# own State is S, Pointer;  -- refinement definition
is
   Stack_Size : constant := 100;
   type Pointer_Range is range 0 .. Stack_Size;
   subtype Index_Range is Pointer_Range range 1..Stack_Size;
   type Vector is array(Index_Range) of Integer;
   S : Vector;
   Pointer : Pointer_Range;

   procedure Push(X : in Integer)
     --# global in out S, Pointer;
     --# derives S       from S, Pointer, X &
     --#         Pointer from Pointer;
   is
   begin
      Pointer := Pointer + 1;
      S(Pointer) := X;
   end Push;


   procedure Pop(X : out Integer)
     --# global in S; in out Pointer;
     --# derives Pointer from Pointer &
     --#         X       from S, Pointer;
   is
   begin

      X := S(Pointer);
      Pointer := Pointer - 1;
   end Pop;

begin  -- initialization
   Pointer := 0;
   S := Vector'(Index_Range => 0);
end The_Stack_Praxis;

