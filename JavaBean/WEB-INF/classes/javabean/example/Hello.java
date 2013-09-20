package javabean.example;
import java.io.*;
public class Hello
{
	private int x;
	public Hello()
	{
	}
	public int getX()
	{
		return x;
	}
	public void setX(int newX)
	{
		this.x=newX;
	}
	public void print()
	{
		System.out.println("hello,everyone!");
	}
}
