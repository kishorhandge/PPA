class Threaddemo1 {
    public static void main(String Arr[])
    {
        System.out.println("Inside main method");

        String name=Thread.currentThread().getName();

        System.out.println("Name of current thread is : "+name);
    }
}

 

