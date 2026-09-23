import java.util.ArrayList;

public class FeelMain {

    // todoリスト
    void main() {
        ArrayList<String> feelList = new ArrayList<>();
        FeelMedi fm = new FeelMedi();
		FeelTake ft = new FeelTake();

        while (true) {
            IO.println("------ 健康管理ツール ------");
            IO.println("1: 今日の健康を記録");
            IO.println("2: 今までの記録を見る");
            IO.println("3: 終了");
            IO.print("番号を選んでください > ");
            
            String inputMenu = IO.readln("番号を入力-->");
            int menu = Integer.parseInt(inputMenu);
            
            // 今日の健康を記録する
            if (menu == 1) {
                fm.one(feelList);

            } else if (menu == 2) {
				// リストが空だった場合
                if (feelList.isEmpty()) {
                IO.println("※ まだ記録がありません。");
                // arraylistに格納したタスクを1つずつ取り出す
                IO.println("【これまでの記録】");
                for (int i = 0; i < feelList.size(); i++) {
                    IO.println((i + 1) + ": " + feelList.get(i));
                }
            } else if (menu == 3) {
                IO.println("アプリを終了します。");
                break; // whileループを抜ける
            }
        } 
    } 
}
} 