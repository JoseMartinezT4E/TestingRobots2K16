package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.Robot;
import org.usfirst.frc.team4.robot.RobotMap;
import org.usfirst.frc.team4.robot.commands.MotorMove;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class PotTesting extends Subsystem {
    
    private AnalogPotentiometer potTop, potBottom;
    private VictorSP motorTop, motorBottom;
    
    public void potTester(){
    	potTop = new AnalogPotentiometer(RobotMap.kCLIMB_POT_TOP);
    	potBottom = new AnalogPotentiometer(RobotMap.kCLIMB_POT_BOTTOM);
    	
    	motorTop = new VictorSP(RobotMap.kCLIMB_VICTOR_TOP);
    	motorBottom = new VictorSP(RobotMap.kCLIMB_POT_BOTTOM);
    }

    public void motorTop(double output){
    	motorTop.set(output);
    }
    
    public void motorBottom(double output){
    	motorBottom.set(output);
    }
    
    public double topPot(){
    	return potTop.get();
    }
    
    public double bottomPot(){
    	return potBottom.get();
    }
    
    // # VAPE
    // # NATION
    
    
    public void initDefaultCommand() {
        setDefaultCommand(new MotorMove());
    }
    
    public void potLog(){
    	SmartDashboard.putNumber("Pot Value Top", Robot.potTesting.topPot());
        SmartDashboard.putNumber("Pot Value Bottom", Robot.potTesting.bottomPot());
    }
    
}

