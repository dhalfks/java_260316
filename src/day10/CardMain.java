package day10;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardPack cp = new CardPack();
		System.out.println("딜러가 카드를 섞고 있습니다.");
		cp.shuffle();
		
		//player 4명
		System.out.println("딜러가 카드를 나누고 있습니다.");
		System.out.println("player 1 카드 pick");
		
		Card player1 = cp.pick();
		
		System.out.println("player 2 카드 pick");
		Card player2 = cp.pick();
		
		System.out.println("player 3 카드 pick");
		Card player3 = cp.pick();
		
		System.out.println("player 4 카드 pick");
		Card player4 = cp.pick();
		
		System.out.println("각 플레이어 Card open!!");
		System.out.print("player 1 > ");
		player1.print();
		System.out.println();
		
		System.out.print("player 2 > ");
		player2.print();
		System.out.println();
		
		System.out.print("player 3 > ");
		player3.print();
		System.out.println();
		
		System.out.print("player 4 > ");
		player4.print();
		System.out.println();
		
		System.out.println();
		System.out.println("--------");
		
		cp.init();
		
		
		
//		Card card = new Card(); // 카드 1장
//		
//		System.out.println(card); // toString
//		
//		card.print();
//		
//		// ♥A, ♥5, ♣K    ^1 => ♥A  ♣20 => ♣A
//		card.setNum(13);
//		card.setShape("^");
//		card.print();
//		
//		card.setNum(4);
//		card.setShape("♣");
//		card.print();
//		System.out.println();
//		System.out.println("-----------");
//		
//		//  ♥ ◆ ♣ ♠  
//		String shape[] = {"♥", "◆", "♣", "♠"};
//		
//		for(int i=0; i<shape.length; i++) {
//			for(int j=1; j<=13; j++) {
//				card.setShape(shape[i]);
//				card.setNum(j);
//				card.print();
//			}
//			System.out.println();
//		}
//		
//		System.out.println("----------");
//		for(int i=1; i<=4; i++) {
//			switch(i) {
//			case 1: card.setShape("♥"); break;
//			case 2: card.setShape("◆"); break;
//			case 3: card.setShape("♣"); break;
//			case 4: card.setShape("♠"); break;
//			}
//			for(int j=1; j<=13; j++) {
//				card.setNum(j);
//				card.print();
//			}
//			System.out.println();
//		}
//		
//		System.out.println("----------------");
//		System.out.println("--cardPack--");
//		
//		CardPack cp = new CardPack(); // 52장 카드가 채워져서 생성
//		
//		for(int i=0; i<cp.getPack().length; i++) {
//			cp.getPack()[i].print();
//		}
//		
//		System.out.println();
//		cp.shuffle();
//		System.out.println("------------");
//		
//		Card[] pack = cp.getPack();
//		
//		for(int i=0; i<pack.length; i++) {
//			Card c = pack[i];
//			c.print();
//		}
//		
		


	}

}
