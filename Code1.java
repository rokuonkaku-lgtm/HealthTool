import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main_ArrayList {
	private static Main_ArrayList feelList;

	// todoリスト
	void main() {
		ArrayList<String> feelList = new ArrayList<>();
		Main_ArrayList.feelList = new Main_ArrayList();

		while (true) {
			IO.println("\n--- 健康管理 ---");
			IO.println("1: 今日の健康を記録");
			IO.println("2: 今までの記録を見る");
			IO.println("3: 終了");
			IO.print("番号を選んでください > ");
			
			// 作成日時を表示する
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
			String formattedDate = now.format(formatter);

			System.out.println("作成日時: " + formattedDate);
			// 出力例: 作成日時: 2026/09/13 22:27

			String inputMenu = IO.readln("番号を入力-->");
			int menu = Integer.parseInt(inputMenu);
			
			// 今日の健康を記録する
			if (menu == 1) {
	            IO.print(" ");
	            String feel = IO.readln("新しいタスクを入力:");
	            feelList.add(feel);
	            IO.println("「" + feel + "」を追加しました！");

	        }
		}
	}


    


}