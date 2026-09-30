package main;

public class Main {

    public interface Keyboard {
        void type();
    }

    public interface Mouse {
        void click();
    }

    public interface Monitor {
        void show();
    }


    // WINDOWS

    public static class WindowsKeyboard implements Keyboard {
        public void type() {
            System.out.println("Windows keyboard typing");
        }
    }

    public static class WindowsMouse implements Mouse {
        public void click() {
            System.out.println("Windows mouse clicking");
        }
    }

    public static class WindowsMonitor implements Monitor {
        public void show() {
            System.out.println("Windows monitor showing");
        }
    }


    // LINUX

    public static class LinuxKeyboard implements Keyboard {
        public void type() {
            System.out.println("Linux keyboard typing");
        }
    }

    public static class LinuxMouse implements Mouse {
        public void click() {
            System.out.println("Linux mouse clicking");
        }
    }

    public static class LinuxMonitor implements Monitor {
        public void show() {
            System.out.println("Linux monitor showing");
        }
    }


    // MAC

    public static class MacKeyboard implements Keyboard {
        public void type() {
            System.out.println("Mac keyboard typing");
        }
    }

    public static class MacMouse implements Mouse {
        public void click() {
            System.out.println("Mac mouse clicking");
        }
    }

    public static class MacMonitor implements Monitor {
        public void show() {
            System.out.println("Mac monitor showing");
        }
    }


    // GAMING

    public static class GamingKeyboard implements Keyboard {
        public void type() {
            System.out.println("Gaming keyboard typing");
        }
    }

    public static class GamingMouse implements Mouse {
        public void click() {
            System.out.println("Gaming mouse clicking");
        }
    }

    public static class GamingMonitor implements Monitor {
        public void show() {
            System.out.println("Gaming monitor showing");
        }
    }


    // ABSTRACT FACTORY

    public interface ComputerFactory {

        Keyboard createKeyboard();

        Mouse createMouse();

        Monitor createMonitor();
    }


    // WINDOWS FACTORY

    public static class WindowsFactory implements ComputerFactory {

        public Keyboard createKeyboard() {
            return new WindowsKeyboard();
        }

        public Mouse createMouse() {
            return new WindowsMouse();
        }

        public Monitor createMonitor() {
            return new WindowsMonitor();
        }
    }


    // LINUX FACTORY

    public static class LinuxFactory implements ComputerFactory {

        public Keyboard createKeyboard() {
            return new LinuxKeyboard();
        }

        public Mouse createMouse() {
            return new LinuxMouse();
        }

        public Monitor createMonitor() {
            return new LinuxMonitor();
        }
    }


    // MAC FACTORY

    public static class MacFactory implements ComputerFactory {

        public Keyboard createKeyboard() {
            return new MacKeyboard();
        }

        public Mouse createMouse() {
            return new MacMouse();
        }

        public Monitor createMonitor() {
            return new MacMonitor();
        }
    }


    // GAMING FACTORY

    public static class GamingFactory implements ComputerFactory {

        public Keyboard createKeyboard() {
            return new GamingKeyboard();
        }

        public Mouse createMouse() {
            return new GamingMouse();
        }

        public Monitor createMonitor() {
            return new GamingMonitor();
        }
    }


    // FACTORY METHOD

    public abstract static class ComputerCreator {

        public abstract Keyboard createKeyboard();

        public void startComputer() {

            Keyboard keyboard = createKeyboard();

            keyboard.type();

            System.out.println("Computer started");
        }
    }


    public static class WindowsCreator extends ComputerCreator {

        public Keyboard createKeyboard() {
            return new WindowsKeyboard();
        }
    }


    public static class LinuxCreator extends ComputerCreator {

        public Keyboard createKeyboard() {
            return new LinuxKeyboard();
        }
    }


    public static class MacCreator extends ComputerCreator {

        public Keyboard createKeyboard() {
            return new MacKeyboard();
        }
    }


    // RUNTIME FACTORY SELECTION

    public static ComputerFactory getFactory(String system) {

        if (system.equals("windows")) {
            return new WindowsFactory();
        }

        if (system.equals("linux")) {
            return new LinuxFactory();
        }

        if (system.equals("mac")) {
            return new MacFactory();
        }

        return new GamingFactory();
    }


    // BUSINESS LOGIC

    public static void useComputer(ComputerFactory factory) {

        Keyboard keyboard = factory.createKeyboard();
        Mouse mouse = factory.createMouse();
        Monitor monitor = factory.createMonitor();

        keyboard.type();
        mouse.click();
        monitor.show();

        System.out.println("Computer is ready!");
    }

    public static void main(String[] args) {

        String system = "windows";

        ComputerFactory factory = getFactory(system);

        useComputer(factory);

        System.out.println();
        System.out.println("Factory Method:");

        ComputerCreator creator = new WindowsCreator();

        creator.startComputer();
    }
}