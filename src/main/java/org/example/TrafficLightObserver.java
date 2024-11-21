package org.example;

    class TrafficLightObserver implements Vehicle {
        @Override
        public void update(String color){
            switch (color) {
                case "Red":
                    System.out.println();
                    break;
                case "Green":
                    System.out.println();
                    break;
                case "Yellow":
                    System.out.println();
                    break;
            }
        }
}
