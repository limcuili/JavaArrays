class PrintMonth {

    public static void main (String[] args) {
        // Observe we can declare an array variable and specify its initial values
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
        System.out.println(months[Integer.parseInt(args[0]) - 1]);
    }
}