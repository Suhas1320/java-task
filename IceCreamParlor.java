class IceCreamParlor {
    
    static String flavorsAvailable[] = {null, null, null, null, null};
    static int index;

    public static boolean addFlavor(String flavor) {
        boolean isAdded = false;
        if (flavor != null) {
            flavorsAvailable[index] = flavor;
            index++;
            isAdded = true;
        } else {
            System.out.println("Cannot add flavor, as it is a null value");
        }
        return isAdded;
    }

    public static void getAllFlavorsAvailable() {
        System.out.println("Invoking getAllFlavorsAvailable");
        for (int i = 0; i < flavorsAvailable.length; i++) {
            String ref = flavorsAvailable[i];
            System.out.println(ref);
        }
    }
}