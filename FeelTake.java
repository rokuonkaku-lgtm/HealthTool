import java.util.ArrayList;

public class FeelTake{
    
        ArrayList<String> mediList = new ArrayList<>();

        public void two(){
        // 薬を飲んだか確認
        IO.println("番号を選択");
        IO.println("1:内服確認");
        IO.println("2:内服薬を削除");

        String inputCheck = IO.readln("番号を入力-->");
        int check = Integer.parseInt(inputCheck);

        if (check == 1) {
            IO.println("今日内服しましたか？");
            IO.println("1:した 2:してない");
            String inputTake = IO.readln("内服状況を入力-->");
            int take = Integer.parseInt(inputTake);

            if (take == 1) {
                IO.println("1: チェックする / 2:追加する");
                int choice = Integer.parseInt(IO.readln("選択-->"));

                if (choice == 1) {
                    IO.println("【以下の定期薬は飲みましたか？】");
                    for (int i = 0; i < mediList.size(); i++) {
                        IO.println((i + 1) + ": " + mediList.get(i));
                    }
                } else if (choice == 2) {
                    String inputMedi = IO.readln("内服状況を入力-->");
                    mediList.add(inputMedi);
                    IO.println("「" + inputMedi + "」を追加しました！");
                }
            } else if (take == 2) {
                IO.println("内服しましょう！");
                for (int i = 0; i < mediList.size(); i++) {
                    IO.println((i + 1) + ": " + mediList.get(i));
                }
            }
        } else if (check == 2) {
            IO.println("消したい薬の番号を入力してください");
            
            // 1. まず一覧を表示する
            for (int i = 0; i < mediList.size(); i++) {
                IO.println((i + 1) + ": " + mediList.get(i));
            }

            // 2. 表示が終わった後に番号を入力させて削除する
            int inputDelete = Integer.parseInt(IO.readln("消したい番号を入力-->"));
            String removedMedi = mediList.remove(inputDelete - 1);
            IO.println("「" + removedMedi + "」を削除しました！");
        }
    }
}