package com.skillstorm.project1;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class ASCIIArt {
	   public static void main(String[] args) throws IOException {

	        int width = 100;
	        int height = 30;

	        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	        Graphics g = image.getGraphics();
	        g.setFont(new Font("Serif", Font.PLAIN, 13));

	        Graphics2D graphics = (Graphics2D) g;
	        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
	                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
	        graphics.drawString("CANDY LAND", 5, 10);

	        for (int y = 0; y < height; y++) {
	            StringBuilder sb = new StringBuilder();
	            for (int x = 0; x < width; x++) {

	                sb.append(image.getRGB(x, y) == -16777216 ? " " : "$");

	            }

	            if (sb.toString().trim().isEmpty()) {
	                continue;
	            }

	            System.out.println(sb);
	        }

	    }
	   
	   

	}

