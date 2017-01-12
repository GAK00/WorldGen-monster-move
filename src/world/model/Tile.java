package world.model;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

public abstract class Tile implements java.io.Serializable
{
	private boolean isCrossable;
	private Color tileColor;
	private boolean isExit;
	private boolean isInhabited;
	private boolean hasMonster;
	private Random rand;
	private Monster monsterType;
	private Dimension pos;

	public Tile(boolean isCrossable, Color color)
	{
		rand = new Random();
		this.isCrossable = isCrossable;
		this.tileColor = color;
		this.isExit = false;
		isInhabited = false;
	}

	public Tile(boolean isCrossable, Color color, double spawnChance, boolean isExit, Dimension pos)
	{
		this.pos = pos;
		rand = new Random();
		this.isCrossable = isCrossable;
		this.tileColor = color;
		if (Double.compare(rand.nextDouble(), spawnChance) < 0)
		{
			this.hasMonster = true;

			int detirminate = rand.nextInt(10) + 1;
			Dimension updatePos = new Dimension((int)pos.getWidth()+1,(int)pos.getHeight()+1);
			if (detirminate <= 5)
			{
				
				Troll troll = new Troll(updatePos);
				monsterType = troll;
			} else if (detirminate <= 8)
			{
				Troll troll = new Troll(updatePos);
				monsterType = troll;
			} else
			{
				Troll troll = new Troll(updatePos);
				monsterType = troll;
			}
		} else
		{
			this.hasMonster = false;
		}
		// this.monsterSpawnChance = spawnChance;
		isInhabited = false;
		this.isExit = isExit;
	}

	public void setHasMonster(boolean hasMonster)
	{
		this.hasMonster = hasMonster;
	}

	public boolean canCross()
	{
		return isCrossable;
	}

	public Color getColor()
	{
		return tileColor;
	}

	public boolean gethasMonster()
	{
		return hasMonster;
	}

	public Monster
	getMonsterType()
	{
		return monsterType;
	}

	public int[] getDoorDirection()
	{
		return null;
	}

	public boolean getIsExit()
	{
		return isExit;
	}

	public static int getMinimumSize()
	{
		return 50;
	}

	public boolean isInhabited()
	{
		return isInhabited;
	}

	public void setInhabited(boolean isInhabited)
	{
		this.isInhabited = isInhabited;
	}
	public void setMonsterType(Monster monster)
	{
		this.monsterType = monster;
	}

}
