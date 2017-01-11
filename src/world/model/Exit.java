package world.model;

import java.awt.Dimension;

public class Exit extends Tile
{
	int[] direction;
	public Exit(int[] direction,Tile tile,Dimension pos)
	{
		super(true, tile.getColor(), 0, true, pos);
		this.direction = direction;
	}
	@Override
	public int[] getDoorDirection()
	{
		return direction;
	}
	@Override
	public boolean getIsExit()
	{
		return true;
	}

}
