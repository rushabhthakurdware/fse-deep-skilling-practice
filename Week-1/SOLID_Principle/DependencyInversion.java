public class DependencyInversion {
        public void type() {
            System.out.println("Typing...");
        }
    }
class Computer {
        private DependencyInversion keyboard = new DependencyInversion(); // tightly coupled

        public void start() {
            keyboard.type();
        }
}

