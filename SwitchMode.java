package frc.robot;

public class SwitchMode extends Component
{
    public static char mode;
    
    public SwitchMode()
    {
      //Automatically sets the mode to hatch mode on initialization
      mode = 'H';
    }
    
    @Override
    public void update()
    {
      //If the Y button is pressed, switch modes and reset previously used manipulator.
      if(RobotMap.manipController.getRawButton(XboxMap.Y))
      {
        if(mode == 'H')
        {
          HatchManip.reset();
          mode = 'C';
        }
        else
        {
          BallManip.reset();
          mode = 'H';
        }
      }
          
    }
    
    @Override
    public void autoUpdate()
    {
    }
    
    @Override
    public void disable()
    {
    }

}
