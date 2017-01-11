package world.model;

import java.awt.Color;
import java.awt.Dimension;

public class Floor extends Tile
{
	public Floor(Color color,Dimension pos)
	{
		super(true, color, 0.35, false,  pos);
	}
	public Floor(Color color,double DangerLevel,Dimension pos)
	{
		super(true, color, DangerLevel,false,pos);
	}
}
