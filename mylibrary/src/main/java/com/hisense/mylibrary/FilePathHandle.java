package com.hisense.mylibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * * ================================================
 * name:            FilePathHandle
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2019/2/12
 * description：去掉临时命名文件,筛选gradle中的缓存库文件
 * introduce:
 * history：
 * ===================================================
 */
public class FilePathHandle {
    public static void main(String[] args) {
        List<String> list = traverseFolder1("C:\\Users\\Administrator\\.gradle\\caches\\modules-2\\files-2.1");
        for (int i = 0; i < list.size(); i++) {
            String pathNew = getPathNew(list.get(i));
            fileCopy_channel(list.get(i), pathNew);
        }

    }

    /**
     * 文件的新存储路径
     */
    public static String getPathNew(String pathOld) {
        StringBuilder builder = new StringBuilder();
        String[] temp = pathOld.split("\\\\");
        builder.append("D:\\linshicangku\\");
        for (int j = 7; j < temp.length; j++) {
            if (j == 7) {
                String[] temp1 = temp[j].split("\\.");
                for (int k = 0; k < temp1.length; k++) {
                    builder.append(temp1[k]);
                    builder.append("\\");
                }
            } else if (temp[j].length() == 40 && !temp[j].contains("-")) {
//             此处部分库文件可能存在巧合,或者缺位,需要单独处理
            } else {
                builder.append(temp[j]);
                if (j < temp.length - 1) {
                    builder.append("\\");
                }
            }
        }
        return builder.toString();
    }

    /**
     * 获取某个目录下所有不是目录的最终文件路径
     */
    public static List<String> traverseFolder1(String path) {
        List<String> fileLast = new ArrayList<>();
        int fileNum = 0, folderNum = 0;
        File file = new File(path);
        if (file.exists()) {
            LinkedList<File> list = new LinkedList<File>();
            File[] files = file.listFiles();//当前文件下的所有文件和目录
            for (File file2 : files) {
                if (file2.isDirectory()) {//文件夹路径单独存储,继续解析
                    list.add(file2);
                    folderNum++;
                } else {//文件路径直接保存
                    fileLast.add(file2.getAbsolutePath());
                    fileNum++;
                }
            }
            File temp_file;
            while (!list.isEmpty()) {
                temp_file = list.removeFirst();//得到第一个标签,文件目录中移除的路径
                files = temp_file.listFiles();//该目录下的所有文件和文件夹
                for (File file2 : files) {//遍历文件和文件夹,文件夹继续添加大文件夹集合中遍历,文件直接保存
                    if (file2.isDirectory()) {//文件夹目录添加到集合
                        list.add(file2);
                        folderNum++;
                    } else {//文件路径直接存储
                        fileLast.add(file2.getAbsolutePath());
                        fileNum++;
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
        System.out.println("文件夹共有:" + folderNum + ",文件共有:" + fileNum);
        System.out.println("文件共有最终:" + fileLast.size());

        return fileLast;

    }

    public void traverseFolder2(String path) {

        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (null == files || files.length == 0) {
                System.out.println("文件夹是空的!");
                return;
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        System.out.println("文件夹:" + file2.getAbsolutePath());
                        traverseFolder2(file2.getAbsolutePath());
                    } else {
                        System.out.println("文件:" + file2.getAbsolutePath());
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
    }

    public static List<File> getFileList(String strPath) {
        List<File> filelist = new ArrayList<>();
        File dir = new File(strPath);
        File[] files = dir.listFiles(); // 该文件目录下文件全部放入数组
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                String fileName = files[i].getName();
                if (files[i].isDirectory()) { // 判断是文件还是文件夹
                    getFileList(files[i].getAbsolutePath()); // 获取文件绝对路径
                } else if (fileName.endsWith("avi")) { // 判断文件名是否以.avi结尾
                    String strFileName = files[i].getAbsolutePath();
                    System.out.println("---" + strFileName);
                    filelist.add(files[i]);
                } else {
                    continue;
                }
            }

        }
        return filelist;
    }

    /**
     * 将文件存储到新的路径中
     */
    public static void fileCopy_channel(String pathOld, String pathNew) {
        FileChannel input = null;
        FileChannel output = null;

        try {
            input = new FileInputStream(pathOld).getChannel();
            File file = new File(pathNew);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            output = new FileOutputStream(file).getChannel();
            output.transferFrom(input, 0, input.size());
        } catch (Exception e) {//FilePathHandle
            e.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
                if (output != null) {
                    output.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
