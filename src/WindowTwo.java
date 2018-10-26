public class WindowTwo extends Thread {

    public boolean skipevent_two;
    public WindowOne windowOne;

    public WindowTwo() {

        this.skipevent_two = false;

    }

    public void run()
    {
        try
        {
            for ( int i=0; i<30; i++ ) {

                if (this.skipevent_two) {
                    System.out.print("2 true WindowTwo Object: skipevent is true. Iteration: ");
                    this.skipevent_two = false;
                } else {
                    System.out.print("2 false WindowTwo Object: skipevent is false. Iteration: ");
                }
                System.out.println(i);
                this.windowOne.skipevent_one = true;

                sleep(1000);

            }
        }
        catch (Exception e)
        {
            System.out.println ("Exception is caught");
        }
    }
}
