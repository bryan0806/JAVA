
public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerPiece player = new PlayerPiece();
		TilePiece tile = new TilePiece();
		doSharpes(player);
		doSharpes(tile);
	}
	
	public static void doSharpes(GameShape shape){
		shape.displayShape();
	}

}
