 else if (menu == 2) {
	            // 【ヒント】for文を使って、todoList の中身を全部表示してみよう！
	            IO.println("【タスク一覧】");
	            for (int i = 0; i < feelList.size(); i++) {
	                // todoList.get(i) でi番目のタスクを取り出せるよ
	                IO.println((i + 1) + ": " + feelList.get(i));
	            }

	        } else if (menu == 3) {
	            IO.println("アプリを終了します。");
	            break; // whileループを抜ける
	        }