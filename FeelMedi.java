import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class FeelMedi {

    public void one(ArrayList<String> feelList) {

        IO.print(" ");
        IO.println("今日の体調はどっち？");
        IO.println("1:いい 2:悪い");
        String inputNum = IO.readln("番号を入力-->");
        int num = Integer.parseInt(inputNum);
        
        if (num == 1) {
            String feel = IO.readln("今日の体調を入力:");
            feelList.add(feel);
            IO.println("「" + feel + "」を追加しました！");

            // 作成日時を表示する
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
            String formattedDate = now.format(formatter);

            IO.println("作成日時: " + formattedDate);
        }
		 else if (num == 2) { 
    String feel = IO.readln("どのような体調ですか？:");
    feelList.add(feel); // ★ feelList に追加！
    IO.println("「" + feel + "」を追加しました！");

    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
    String formattedDate = now.format(formatter);
    IO.println("作成日時: " + formattedDate);
}
	}
}