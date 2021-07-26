public class PrimeNumber
{        //显示100以内的素数,每显示8个数，换一行
    public static void main(String[] args)
    {
        int k = 1; //100中的i除以最大i的平方根，k为0则i不是素数
        int l = 0; //换行计数器
        System.out.println("以下数是素数");  //输出的素数表的标题
        for (int i = 2; i <= 100; i++)              //在2至100中依次检查是不是素数
        {
            for (int j = 2; j <= Math.sqrt(i); j++) //使该数依次除以2至该数的平方根
            {
                k = i % j;                       //余数k如果为0，就能整除，不是素数
                if (k == 0) {   //System.out.println(i+"不是素数");
                    break;
                } else {
                    continue;
                }
            }
            if (k != 0)      //余数k不为0，就是素数
            {   //System.out.println(i+"是素数");
                System.out.print(i + " ");
                l = l + 1;
                if (l % 8 == 0)   //每8个数是一行
                {
                    System.out.println();
                }

            }

        }
    }
}




