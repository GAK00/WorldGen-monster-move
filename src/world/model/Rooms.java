package world.model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import world.controls.WorldControl;

public class Rooms
{

	private int[] left = { -1, 0 };
	private int[] up = { 0, -1 };
	private int[] right = { 1, 0 };
	private int[] down = { 0, 1 };
	private Dimension standered = new Dimension(7, 7);
	private Floor floor = new Floor(new Color(109, 109, 109),new Dimension(0,0));
	private WorldControl control;

	public Rooms(WorldControl control)
	{
		this.control = control;
	}

//	public Room getLeftTurnToUp()
//	{
//		Room rightTurnToUp = new Room(buildLeftTurnToUp(), standered, control);
//		return rightTurnToUp;
//	}

	private Tile wall()
	{
		Wall wall = new Wall(new Color(61, 61, 61));
		return wall;
	}

	private Tile floor(int x, int y)
	{

		Floor floor = new Floor(new Color(109, 109, 109),new Dimension(x,y));
		return floor;
	}

	private Tile leftDoor(int x, int y)
	{
		Exit leftDoor = new Exit(left, floor,new Dimension(x,y));
		return leftDoor;
	}

	private Tile upDoor(int x, int y)
	{
		Exit upDoor = new Exit(up, floor,new Dimension(x,y));
		return upDoor;
	}

	private Tile rightDoor(int x, int y)
	{
		Exit rightDoor = new Exit(right, floor,new Dimension(x,y));
		return rightDoor;
	}

	private Tile downDoor(int x, int y)
	{
		Exit downDoor = new Exit(down, floor,new Dimension(x,y));
		return downDoor;
	}

//	public ArrayList<Tile> buildLeftTurnToUp()
//	{
//		ArrayList<Tile> tiles = new ArrayList<Tile>();
//		// row 1
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(leftDoor());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		// row 2
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		// row 3
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		// row 4
//		tiles.add(upDoor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		// row 5
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		// row 6
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		// row 7
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//
//		return tiles;
//
//	}
//
//	public Room getDownTurnToLeft()
//	{
//		Room rightTurnToUp = new Room(buildDownTurnToLeft(), standered, control);
//		return rightTurnToUp;
//	}
//
//	public ArrayList<Tile> buildDownTurnToLeft()
//	{
//		ArrayList<Tile> tiles = new ArrayList<Tile>();
//		// row 1
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(leftDoor());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		// row 2
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		// row 3
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		// row 4
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		// row 5
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(downDoor());
//		// row 6
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		// row 7
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//
//		return tiles;
//
//	}
//
//	public Room getRightTurnToDown()
//	{
//		Room rightTurnToUp = new Room(buildRightTurnToDown(), standered, control);
//		return rightTurnToUp;
//	}
//
//	public ArrayList<Tile> buildRightTurnToDown()
//	{
//		ArrayList<Tile> tiles = new ArrayList<Tile>();
//		// row 1
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		// row 2
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		// row 3
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(downDoor());
//		// row 4
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		// row 5
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		// row 6
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		// row 7
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(rightDoor());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//
//		return tiles;
//
//	}
//
//	public Room getUpTurnToRight()
//	{
//		Room rightTurnToUp = new Room(buildUpTurnToRight(), standered, control);
//		return rightTurnToUp;
//	}
//
//	public ArrayList<Tile> buildUpTurnToRight()
//	{
//		ArrayList<Tile> tiles = new ArrayList<Tile>();
//		// row 1
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		// row 2
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		// row 3
//		tiles.add(upDoor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		// row 4
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		// row 5
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		// row 6
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		// row 7
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(rightDoor());
//		tiles.add(wall());
//		tiles.add(wall());
//
//		return tiles;
//
//	}
//
//	public Room getStraightVert()
//	{
//		Room rightTurnToUp = new Room(buildStraightVert(), standered, control);
//		return rightTurnToUp;
//	}
//
//	public ArrayList<Tile> buildStraightVert()
//	{
//		ArrayList<Tile> tiles = new ArrayList<Tile>();
//		// row 1
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		// row 2
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		tiles.add(wall());
//		// row 3
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		// row 4
//		tiles.add(upDoor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(downDoor());
//		// row 5
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(downDoor());
//		// row 6
//		tiles.add(wall());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(floor());
//		tiles.add(wall());
//		// row 7
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//		tiles.add(wall());
//
//		return tiles;
//
//	}

	public Room getRoomFromTemplate(String templateName) throws IOException
	{
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		BufferedImage template = ImageIO.read(Rooms.class.getResource("templates/" + templateName));
		Tile currentTile = null;
		for (int x = 0; x < (int) standered.getWidth(); x++)
		{
			for (int y = 0; y < (int) standered.getWidth(); y++)
			{
				Color currentColor = new Color(template.getRGB(x, y));
				if (currentColor.getRGB() == floor(x,y).getColor().getRGB())
				{
					currentTile = floor(x,y);
				} else if (currentColor.getRGB() == wall().getColor().getRGB())
				{
					currentTile = wall();
				} else if (currentColor.getRGB() == Color.BLACK.getRGB())
				{

					if (x == 6)
					{
						currentTile = rightDoor(x,y);
					} else if (x == 0)
					{
						currentTile = leftDoor(x,y);
					} else if (y == 6)
					{
						currentTile = downDoor(x,y);
					} else if (y == 0)
					{
						currentTile = upDoor(x,y);
					} else
					{
						currentTile = floor(x,y);
					}
				
			}
			tiles.add(currentTile);
		}
	}

	Room room = new Room(tiles, standered,control);return room;
}}
