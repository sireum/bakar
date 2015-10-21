
package body FaultIntegrator
is

  procedure Test(FI              : in out T;
                 CurrentEvent    : in     Boolean;
                 IntegratedEvent :    out Boolean)
  is
  begin
    if CurrentEvent then
      if FI.Counter = FI.Limit then
        FI.Tripped := True;
      else
        FI.Counter := FI.Counter + 1;
      end if;
    else -- no CurrentEvent
      if FI.Counter = 0 then
        FI.Tripped := False;
      else
        FI.Counter := FI.Counter - 1;
      end if;
    end if;
    IntegratedEvent := FI.Tripped;
  end Test;
end FaultIntegrator;
