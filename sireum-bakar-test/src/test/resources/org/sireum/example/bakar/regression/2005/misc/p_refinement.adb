
package body P_Refinement
  --# own AbsD is P2.D;
is
   B: Integer;

   --# inherit P_Refinement;
   package P2
     --# own D;
     --# initializes D;
   is
      procedure R(X: out Integer);
      --# global in P_Refinement.Y, P_Refinement.B, P_Refinement.C, D;
      --# derives X from P_Refinement.Y, P_Refinement.B, P_Refinement.C, D;
   end P2;

   package body P2
   is
     D: Integer;

     procedure R(X: out Integer)
     is
     begin
        X := ((P_Refinement.Y + P_Refinement.B) + P_Refinement.C) + D;
     end R;

  begin
     D := 0;
  end P2;

  procedure Q(X: in Integer; Z: out Integer)
  is
  begin
     Z := X + B;
  end Q;

begin
   Y := 1;
   B := 0;
   C := 0;
end P_Refinement;


