public class WindowOne extends Thread {

    public boolean skipevent_one;
    public WindowTwo windowTwo;

    public WindowOne() {

        this.skipevent_one = false;

    }

    public void run()
    {
        try
        {
            for ( int i=0; i<30; i++ ) {

                if (this.skipevent_one) {
                    System.out.print("1 true WindowOne Object: skipevent is true. Iteration: ");
                    this.skipevent_one = false;
                } else {
                    System.out.print("1 false WindowOne Object: skipevent is false. Iteration: ");
                }
                System.out.println(i);
                this.windowTwo.skipevent_two = true;

                sleep(700);

            }
        }
        catch (Exception e)
        {
            System.out.println ("Exception is caught");
        }
    }
}
