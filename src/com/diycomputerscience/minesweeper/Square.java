package com.diycomputerscience.minesweeper;

public class Square {

	public enum SquareState {COVERED, UNCOVERED, MARKED}
	
	private boolean mine;
	private SquareState state;
	
	public Square() {
		this.state = SquareState.COVERED;
	}
	
	public boolean isMine() {
		return mine;
	}
	
	public void setMine(boolean mine) {
		this.mine = mine;
	}
	
	public SquareState getState() {
		return this.state;
	}

	public void uncover() throws UncoveredMineException {
		if(this.state.equals(SquareState.MARKED)) {
			return;
		} else {
			if(this.isMine()) {
				throw new UncoveredMineException("Uncovered a mine");
			}			
			this.state = SquareState.UNCOVERED;
		}		
	}

	public void mark() {
		if(this.state.equals(SquareState.UNCOVERED)) {
			return;
		} if(this.state.equals(SquareState.MARKED)) {
			this.state = SquareState.COVERED;
		} else {
			this.state = SquareState.MARKED;
		}			
	}
}
