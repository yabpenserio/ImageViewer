package controller;

import java.io.File;
import model.Image;
import persistence.FileImageLoader;

public class ImageViewer{
    public static void main(String[] args) {
        File file = new File("C:\\Users\\yabpe\\Documents\\NetBeansProjects\\ImageViewer\\Pictures");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().show(image);
        
    }
}

