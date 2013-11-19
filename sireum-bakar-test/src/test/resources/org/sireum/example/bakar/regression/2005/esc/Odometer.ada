-- Spark Book example.

package Odometer
--# own Trip, Total : Integer;
--# initializes Trip, Total;
is

   procedure Zero_Trip;
   --# global out Trip;
   --# derives Trip from ;
   --# post Trip = 0;

   function Read_Trip return Integer;
   --# global in Trip;

   function Read_Total return Integer;
   --# global in Total;

   procedure Inc;
   --# global in out Trip, Total;
   --# derives Trip from Trip & Total from Total;
   --# post Trip = Trip~ + 1 and Total = Total~ + 1;

end Odometer;

package body Odometer is
   Trip : Integer;
   Total : Integer;

   procedure Zero_Trip is
   begin
      Trip := 0;
   end Zero_Trip;

   function Read_Trip return Integer is
   begin
      return Trip;
   end Read_Trip;

   function Read_Total return Integer is
   begin
      return Total;
   end Read_Total;

   procedure Inc is
   begin
      Trip := Trip + 1;
      Total := Total + 1;
   end Inc;
begin
	Trip := 0;
	Total := 0;
end Odometer;


