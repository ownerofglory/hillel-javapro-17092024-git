package ua.ithillel.git.manager;

public class StringManagerDefault implements StringManager {
    @Override
    public int stringLen(String s) {
        return s.length();
    }
}
