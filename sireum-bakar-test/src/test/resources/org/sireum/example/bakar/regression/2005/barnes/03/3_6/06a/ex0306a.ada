package P is

   procedure Exchange(X, Y : in out Float);
   --# derives X from Y &
   --#         Y from X;
   --# post X = Y~ and Y = X~;

end P;

package body P is

   procedure Exchange(X, Y : in out Float)
   is
     T : Float;
   begin
      T := X;
      X := Y;
      --# check X = Y~;
      Y := T;
   end Exchange;

end P;
