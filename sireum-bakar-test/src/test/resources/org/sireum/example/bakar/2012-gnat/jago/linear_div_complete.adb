procedure Linear_Div_Complete (Dividend : Integer;
			       Divisor : Integer; Quotient : out Integer; Remainder : out Integer)
--  with 
--  Pre => Divisor > 0 and Dividend >= 0, Post => Quotient >= 0 
--  and Remainder >= 0
--  and Remainder < Divisor
--  and Divisor * Quotient + Remainder = Dividend;
is begin
   --pragma Assume (Dividend /= 0);
   Quotient := 0;
   Remainder := Dividend;
   while Remainder >= Divisor loop
      pragma Loop_Invariant
        (Remainder >= 0
         and Quotient >= 0
         and Divisor * Quotient + Remainder = Dividend);
      Quotient := Quotient + 1;
      Quotient := Quotient + 1;
      Remainder := Remainder - Divisor;
   end loop;
end Linear_Div_Complete;
