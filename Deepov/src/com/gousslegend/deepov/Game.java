package com.gousslegend.deepov;

public class Game
{
	private Board myBoard;
	private Player whitePlayer;
	private Player blackPlayer;

	public Game()
	{
		myBoard = new Board();
	}

	public Player getWhitePlayer()
	{
		return whitePlayer;
	}

	public void setWhitePlayer(Player whitePlayer)
	{
		this.whitePlayer = whitePlayer;
	}

	public Player getBlackPlayer()
	{
		return blackPlayer;
	}

	public void setBlackPlayer(Player blackPlayer)
	{
		this.blackPlayer = blackPlayer;
	}

	public Board getMyBoard()
	{
		return myBoard;
	}
}
