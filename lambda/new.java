//1.
Runnable r = new Runnable() {
    public void run() {
        System.out.println("Running thread");
    }
};
//OR
Runnable r1 = () -> System.out.println("Running thread");

//2.
Comparator<Integer> comp = new Comparator<Integer>() {
    public int compare(Integer a, Integer b) {
        return a-b;
    }
};
//OR

Comparator<Integer> comp = (Integer a, Integer b) -> a-b;

// 3.
Callable<Integer> c = new Callable<Integer>() {
    public Integer call() {
        return 100;
    }
}

//OR

Callable<Integer> c =() -> 100;

ActionListener al = new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked");
    }
};

//OR

ActionListener al = (ActionEvent e) -> System.out.println("Button clicked");

//5.Calculate Square of a number using lambda expression


@functionalInterface

Interface 