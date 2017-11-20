package day2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE

		System.out.println("hello world");
		Robot jeffy = new Robot("mini");
		jeffy.setPenColor(Color.CYAN);
		jeffy.penDown();
		jeffy.sparkle();
		jeffy.move(10);
		jeffy.turn(90);
		jeffy.move(10);
		jeffy.setSpeed(200);
		jeffy.turn(240);
		jeffy.move(40);
		jeffy.setSpeed(1000);
		jeffy.move(100);
		jeffy.turn(140);
		jeffy.move(60);
		jeffy.turn(120);
		jeffy.move(40);
		jeffy.hide();
		jeffy.show();
		jeffy.turn(360);
		jeffy.turn(40);
		jeffy.move(100);
		jeffy.turn(200);
		jeffy.move(100);
		jeffy.turn(184);
		jeffy.move(140);
		jeffy.setRandomPenColor();
		jeffy.turn(20);
		jeffy.move(60);
	}
}
