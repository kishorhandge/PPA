 class Threaddemo2 {
    public static void main(String Arr[])
    {
        System.out.println("Inside main method");
        Thread tobj=Thread.currentThread();

        String name=tobj.getName();

        System.out.println("Name of current thread is : "+name);
    }
}
