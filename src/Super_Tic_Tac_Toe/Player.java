package Super_Tic_Tac_Toe;

public class Player {
	
	private int playernumber;
	private String Turn;

	
	Player()
	{
		this.playernumber = 1;
		this.Turn = "M";
	}
	
	Player(int playernumber, String Turn)
	{
		this.playernumber = playernumber;
		this.Turn = Turn;
	}

	// Getters and Setter methods
	public int getPlayerNumber()
	{
		return playernumber;
	}
	
	String getTurn()
	{
		return Turn;
	}
	
	void setPlayerNumber(int playernumber)
	{
		this.playernumber=playernumber;
	}
	
	void setTurn(String Turn)
	{
		this.Turn = Turn;
	}

}
