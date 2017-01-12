package world.model;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Random;

public class Troll extends Monster
{
	Dimension pos;
	public Troll(Dimension pos)
	{
		super();
		this.pos = pos;
	}
	
	
	@Override
	public Color getColor()
	{
		return Color.yellow;
	}
	
	@Override
	public Dimension move(Room room,Dimension Position)
	{
		
		ArrayList<Dimension> validPositions = new ArrayList<Dimension>();
		if(checkDimension(new Dimension(Position.width+1,Position.height),room))
		{
			validPositions.add(new Dimension(Position.width+1,Position.height));
		}
		if(checkDimension(new Dimension(Position.width-1,Position.height),room))
		{
			validPositions.add(new Dimension(Position.width-1,Position.height));
		}
		if(checkDimension(new Dimension(Position.width,Position.height+1),room))
		{
			validPositions.add(new Dimension(Position.width,Position.height+1));
		}
		if(checkDimension(new Dimension(Position.width,Position.height-1),room))
		{
			validPositions.add(new Dimension(Position.width,Position.height-1));
		}
		
		if(validPositions.size()!=0)
		{
			Random rand = new Random();
			Dimension moveTo = validPositions.get(rand.nextInt(validPositions.size()));
			this.pos = moveTo;
			return moveTo;
		}
		else
		{
			return null;
		}
		
		
		
	}
	private boolean checkDimension(Dimension pos,Room room)
	{
		return room.getTile(pos)!=null&&room.getTile(pos).canCross()&&!room.getTile(pos).gethasMonster()&&!room.getTile(pos).isInhabited()&&!room.getTile(pos).getIsExit();
	}

}
