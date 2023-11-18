fun Whereis (str: String, num:Char) : Boolean
{
    for (ch in str)
    {
        if (num == ch)
        {
            return false;
        }
    }
    return true;
}

fun main()
{
    print ("Введите количество строк: "); val rows = readln().toInt();
    print ("Введите количество столбцов: "); val cols = readln().toInt();
    var nums = " ";
    var num = " ";
    var tabl: Array<Array<String>> = Array(rows, {Array(cols, {"0"})});
    for (i in 1 .. rows)
    {
        for (j in 1 .. cols)
        {
            num = readln().toString();
            tabl[i-1][j-1] = num;
        }
    }

    for (i in 1 .. rows)
    {
        for (j in 1 .. cols)
        {
            print(tabl[i-1][j-1] + " ");
        }
        println();
    }

    print("Использует цифры: " + nums.length.toString() + " ");
}