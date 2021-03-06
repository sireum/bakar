--# inherit Shell_Sort;
package Shell_Sort.PTF is
   ---------------------------------------------------------------------------
   -- Helper proof functions
   ---------------------------------------------------------------------------
   function Elem_Count_In_Range(A: Shell_Sort.Array_Type;
                       E: Shell_Sort.Contents_Type; L,U : Shell_Sort.Index_Type) return Natural;
   --#return C => (A(L) = E ->  C = Elem_Count_In_Range(A,E,L+1,U) + 1) and
   --#             (A(L) /= E -> C = Elem_Count_In_Range(A,E,L+1,U));

   function Ordered(A : Shell_Sort.Array_Type; L,U : Shell_Sort.Index_Type) return Boolean;
   --# pre 1 <= L and L <= U and U <= Shell_Sort.Max_Table_Size;
   --# return for all I in Shell_Sort.Index_Type range L .. U - 1
   --#         => (A(I) <= A(I+1));

   function Perm(A, B : Shell_Sort.Array_Type; L,U : Shell_Sort.Index_Type) return Boolean;
   --# return (for all J in Shell_Sort.Index_Type
   --#              => (Elem_Count_In_Range(A, A(J),L,U) = Elem_Count_In_Range(B, B(J),L,U)));

   function Partitioned(A: Shell_Sort.Array_Type; L, M, U: Shell_Sort.Index_Type) return Boolean;
   --# pre 1 <= L and L <= M and M <= U and U <= Shell_Sort.Max_Table_Size;
   --# return for all I in Shell_Sort.Index_Type range L..M =>
   --# (for all J in  Shell_Sort.Index_Type range M+1..U => (A(I) <= A(J)));

end Shell_Sort.PTF;

package body Shell_Sort.PTF is
   function Elem_Count_In_Range(A: Shell_Sort.Array_Type;
                                E: Shell_Sort.Contents_Type;
                                L, U: Shell_Sort.Index_Type)
                               return Natural
   is
      Result: Integer := 0;
   begin
      for I in Shell_Sort.Index_Type range L .. U loop
         if A(I) = E then
            Result := Result + 1;
         end if;
      end loop;
      return Result;
   end Elem_Count_In_Range;

  function Perm(A, B : Shell_Sort.Array_Type;L,U:Shell_Sort.Index_Type) return Boolean is
      Result: Boolean := True;
   begin
      for I in Shell_Sort.Index_Type range L..U loop
         if Elem_Count_In_Range(A, A(I),L,U) /= Elem_Count_In_Range(B, A(I),L,U) then
            Result := False;
         end if;
      end loop;
      return Result;
   end Perm;

function Partitioned(A : Shell_Sort.Array_Type;
        L, M, U : Shell_Sort.Index_Type) return Boolean
        is
          Result: Boolean := True;
    begin
      for I in Shell_Sort.Index_Type range L .. M loop
         for J in Shell_Sort.Index_Type range M+1 .. U loop
           if A(I) > A(J) then
             Result := False;
           end if;
         end loop;
      end loop;
      return Result;
   end Partitioned;


  function Ordered(A: Shell_Sort.Array_Type; L,U : Shell_Sort.Index_Type) return Boolean
    is
       Result: Boolean := True;
  begin
    for I in Shell_Sort.Index_Type range L .. U - 1 loop
       if A(I) > A(I + 1) then
         Result := False;
       end if;
    end loop;
    return Result;
  end Ordered;
end Shell_Sort.PTF;
