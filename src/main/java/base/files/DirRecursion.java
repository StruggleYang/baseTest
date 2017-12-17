package base.files;

import java.io.File;

/**
 * 递归创建文件夹也可直接用// mkdirs()
 */
public class DirRecursion {
    public static void mkDir(File file) {
        if (file.getParentFile().exists()) {
            file.mkdir();
        } else {
            mkDir(file.getParentFile());
            file.mkdir();
        }
    }

    public static void main(String[] args) {
        File file = new File("E://A//B//C//D");
        /*file.mkdirs();*/
        mkDir(file);
    }
}
