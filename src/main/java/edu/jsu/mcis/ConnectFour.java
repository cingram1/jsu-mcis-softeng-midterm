package edu.jsu.mcis;

public class ConnectFour
 {
    public enum Location {EMPTY, RED, BLACK};
	private boolean redTurn;
	private Location[][] board;
    
    public ConnectFour()
	{
        board = new Location[6][7];
        
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[i].length; j++)
			{
				board[i][j] = Location.EMPTY;
            }
		}
		
		redTurn = true;
    }
    
    public Location getTopOfColumn(int column)
	{
		if(board[0][column] == Location.RED)
		{
			return Location.RED;
		}
		else if(board[0][column] == Location.BLACK)
		{
			return Location.BLACK;
		}
		else if(board[1][column] == Location.RED)
		{
			return Location.RED;
		}
		else if(board[1][column] == Location.BLACK)
		{
			return Location.BLACK;
		}
		else if(board[2][column] == Location.RED)
		{
			return Location.RED;
		}
		else if(board[2][column] == Location.BLACK)
		{
			return Location.BLACK;
		}
		else if(board[3][column] == Location.RED)
		{
			return Location.RED;
		}
		else if(board[3][column] == Location.BLACK)
		{
			return Location.BLACK;
		}
		else if(board[4][column] == Location.RED)
		{
			return Location.RED;
		}
		else if(board[4][column] == Location.BLACK)
		{
			return Location.BLACK;
		}
		else if(board[5][column] == Location.RED)
		{
			return Location.RED;
		}
		else if(board[5][column] == Location.BLACK)
		{
			return Location.BLACK;
		}
		else return Location.EMPTY;
    }
    
    public int getHeightOfColumn(int column) 
	{
        if(board[0][column] == Location.RED || board[0][column] == Location.BLACK)
		{
			return 6;
		}
		else if(board[1][column] == Location.RED || board[1][column] == Location.BLACK)
		{
			return 5;
		}
		else if(board[2][column] == Location.RED || board[2][column] == Location.BLACK)
		{
			return 4;
		}
		else if(board[3][column] == Location.RED || board[3][column] == Location.BLACK)
		{
			return 3;
		}
		else if(board[4][column] == Location.RED || board[4][column] == Location.BLACK)
		{
			return 2;
		}
		else if(board[5][column] == Location.RED || board[5][column] == Location.BLACK)
		{
			return 1;
		}
		
		else return 0;
    }
    
    public void dropToken(int column) throws ColumnFullException
	{
        if(board[5][column] == Location.EMPTY)
		{
			if(redTurn) board[5][column] = Location.RED;
			else board[5][column] = Location.BLACK;
			redTurn = !redTurn;
		}
		else if(board[4][column] == Location.EMPTY)
		{
			if(redTurn) board[4][column] = Location.RED;
			else board[4][column] = Location.BLACK;
			redTurn = !redTurn;
		}
		else if(board[3][column] == Location.EMPTY)
		{
			if(redTurn) board[3][column] = Location.RED;
			else board[3][column] = Location.BLACK;
			redTurn = !redTurn;
		}
		else if(board[2][column] == Location.EMPTY)
		{
			if(redTurn) board[2][column] = Location.RED;
			else board[2][column] = Location.BLACK;
			redTurn = !redTurn;
		}
		else if(board[1][column] == Location.EMPTY)
		{
			if(redTurn) board[1][column] = Location.RED;
			else board[1][column] = Location.BLACK;
			redTurn = !redTurn;
		}
		else if(board[0][column] == Location.EMPTY)
		{
			if(redTurn) board[0][column] = Location.RED;
			else board[0][column] = Location.BLACK;
			redTurn = !redTurn;
		}
		
		else
		{
            throw new ColumnFullException("\n\nThis column is full");
        }
    }
}