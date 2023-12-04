package edu.camilaavillaa.reto12.lenguaje;

public class Japanese implements Lenguaje {
    @Override
    public String getMessage(String key) {
        switch (key) {
            case "welcome":
                return "電卓へようこそ";
            case "select_option":
                return "オプションを選択してください";
            case "invalid_option":
                return "無効なオプションです。もう一度試してください";
            case "continue":
                return "続行しますか (はい/いいえ)?: ";
            case "exit":
                return "終了中...";
            case "enter_first_number":
                return "最初の数値を入力してください";
            case "enter_second_number":
                return "二番目の数値を入力してください";
            case "enter_raiz":
                return "平方根の基数を入力してください";
            case "enter_base":
                return "平方根を計算するための数値を入力してください:";
            case "enter_exponent":
                return "指数を入力してください";
            case "enter_dividend":
                return "被除数を入力してください:";
            case "enter_divisor":
                return "除数を入力してください:";
            case "enter_modulo_number":
                return "モジュロの計算のための数値を入力してください";
            case "enter_modulo_divisor":
                return "モジュロの計算のための除数を入力してください";
            case "enter_logarithm_number":
                return "対数のための数値を入力してください: ";
            case "enter_logarithm_base":
                return "対数の底を入力してください";
            case "result":
                return "結果:";
            case "menu":
                return "メニュー: \n1 足し算\n2 引き算\n3 乗算\n4 べき乗\n5 割り算\n6 モジュロ\n7 対数\n8 平方根\n0 終了\nS";
            case "operation_description":
                return "操作:";
            case "is":
                return "は";
            case "Adding":
                return "追加";
            case "Subtracting":
                return "減算";
            case  "Multiplying":
                return "乗算";
            case "Dividing":
                return "分割";
            case "Calculating the modulus of":
                return "弾性率の計算";
            case "Calculating the logarithm of: ":
                return  "の対数を計算する： ";
            case "Raising":
                return "育てる：";
            case "Calculating the square root of: ":
                return "の平方根を計算する：";
            case "Do you want to see the arithmetic operations performed so far? (s/S):":
                return  "これまでに行われた算術演算を見たいですか？（はい／いいえ）";

            default:
                return "メッセージが見つかりません";
        }
    }
}
