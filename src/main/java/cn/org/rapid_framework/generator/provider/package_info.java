package cn.org.rapid_framework.generator.provider;

/**
 * Created by GYOUNG on 2016/1/31.
 */
public class package_info {
    private static package_info ourInstance = new package_info();

    public static package_info getInstance() {
        return ourInstance;
    }

    private package_info() {
    }
}
