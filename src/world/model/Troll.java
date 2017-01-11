package world.model;

import java.awt.Color;
import java.awt.Dimension;

public class Troll extends Monster
{
	Dimension Position;
	public Troll(Dimension pos)
	{
		super();
		this.Position = pos;
	}
	
	
	@Override
	public Color getColor()
	{
		return Color.yellow;
	}
	
	@Override
	public void move()
	{
		
	}

}
