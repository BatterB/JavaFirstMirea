package ru.mirea.task3;

public class Head {
    private int HeadType;

    public Head(int HeadType)
    {
        this.HeadType = HeadType;
    }

    public Head()
    {
        this.HeadType = 2;
    }

    public void Wink()
    {
        if (HeadType == 2)
        {
            int i = (int) (0 + Math.random()*2);
            switch (i)
            {
                case 0:
                    System.out.println("Получилось не лицо, а квадрат");
                    break;
                case 1:
                    System.out.println("Ну вроде даже похоже на человеческое");
                    break;
            }
        }
        else if (HeadType == 1)
            System.out.println("Полурак получеловек");
        else if (HeadType == 0)
            System.out.println("Стандартное лицо, тут даже сказать нечего");
        else if (HeadType > 2)
            System.out.println("Страшно, очень страшно, мы не знаем что с этим делать");
    }
}
