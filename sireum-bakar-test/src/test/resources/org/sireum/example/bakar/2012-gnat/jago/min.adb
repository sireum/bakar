procedure Min (X : Integer; Y : Integer; R: out Integer)
is 
   Result : Integer;
begin
   -- current SPARK subset considers only conditional statement without else branch
   Result := X;
   if X > Y then
      Result := Y;
   end if;
   R := Result;
end Min;
