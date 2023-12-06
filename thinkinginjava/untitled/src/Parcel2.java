class Outer{
    static class Inner{
        public void se(){
            System.out.println("something");
        }
    }

    public Inner re(){
        return new Inner();
    }
}