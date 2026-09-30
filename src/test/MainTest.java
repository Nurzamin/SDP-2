package test;
import main.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testWindowsKeyboard() {
        assertTrue(Main.getFactory("windows").createKeyboard()
                instanceof Main.WindowsKeyboard);
    }

    @Test
    void testWindowsMouse() {
        assertTrue(Main.getFactory("windows").createMouse()
                instanceof Main.WindowsMouse);
    }

    @Test
    void testWindowsMonitor() {
        assertTrue(Main.getFactory("windows").createMonitor()
                instanceof Main.WindowsMonitor);
    }

    @Test
    void testLinuxKeyboard() {
        assertTrue(Main.getFactory("linux").createKeyboard()
                instanceof Main.LinuxKeyboard);
    }

    @Test
    void testLinuxMouse() {
        assertTrue(Main.getFactory("linux").createMouse()
                instanceof Main.LinuxMouse);
    }

    @Test
    void testLinuxMonitor() {
        assertTrue(Main.getFactory("linux").createMonitor()
                instanceof Main.LinuxMonitor);
    }

    @Test
    void testMacKeyboard() {
        assertTrue(Main.getFactory("mac").createKeyboard()
                instanceof Main.MacKeyboard);
    }

    @Test
    void testMacMouse() {
        assertTrue(Main.getFactory("mac").createMouse()
                instanceof Main.MacMouse);
    }

    @Test
    void testMacMonitor() {
        assertTrue(Main.getFactory("mac").createMonitor()
                instanceof Main.MacMonitor);
    }

    @Test
    void testGamingKeyboard() {
        assertTrue(Main.getFactory("gaming").createKeyboard()
                instanceof Main.GamingKeyboard);
    }

    @Test
    void testGamingMouse() {
        assertTrue(Main.getFactory("gaming").createMouse()
                instanceof Main.GamingMouse);
    }

    @Test
    void testGamingMonitor() {
        assertTrue(Main.getFactory("gaming").createMonitor()
                instanceof Main.GamingMonitor);
    }

    @Test
    void testWindowsFactory() {
        assertTrue(Main.getFactory("windows")
                instanceof Main.WindowsFactory);
    }

    @Test
    void testLinuxFactory() {
        assertTrue(Main.getFactory("linux")
                instanceof Main.LinuxFactory);
    }

    @Test
    void testMacFactory() {
        assertTrue(Main.getFactory("mac")
                instanceof Main.MacFactory);
    }
}