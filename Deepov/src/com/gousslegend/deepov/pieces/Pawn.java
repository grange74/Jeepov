package com.gousslegend.deepov.pieces;

import java.util.List;
import java.util.Vector;

import com.gousslegend.deepov.Board;
import com.gousslegend.deepov.Color;
import com.gousslegend.deepov.Move;
import com.gousslegend.deepov.Position;

public class Pawn extends Piece
{

	public Pawn(Position position, Board board, Color color)
	{
		super(position, board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Move> getPseudoLegalMoves()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Position> getAttackingSquares()
	{
		// TODO Auto-generated method stub
		return new Vector<Position>();
	}

	@Override
	public List<Move> getLegalMoves()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
