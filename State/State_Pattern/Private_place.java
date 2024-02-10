package State_Pattern;

class Private_place implements State {
    @Override
    public void alert(Notify ctx) {
        System.out.println("This is Private Place");
    }
}

class Public_place implements State {
    @Override
    public void alert(Notify ctx) {
        System.out.println("This is Public Place");
    }
}