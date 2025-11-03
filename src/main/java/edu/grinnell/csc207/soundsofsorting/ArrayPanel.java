package edu.grinnell.csc207.soundsofsorting;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;

import javax.swing.JPanel;

/**
 * A drawing panel for visualizing the contents of a @NoteIndices object.
 */
public class ArrayPanel extends JPanel {
    @SuppressWarnings("unused")
    private NoteIndices notes;
   
    /**
     * Create a new <code>ArrayPanel</code> with the given notes and dimensions.
     * @param notes the note indices 
     * @param width the width of the panel
     * @param height the height of the panel
     */
    public ArrayPanel(NoteIndices notes, int width, int height) {
        this.notes = notes;
        this.setPreferredSize(new Dimension(width, height));
    }

    public void paintComponent(Graphics g) {
        // Call the paintComponent method of the superclass JPanel to clear the panel
        super.paintComponent(g); 

        // Get current note indices
        Integer[] indices = notes.getNotes(); 
        int width = getWidth();
        int height = getHeight();
        int barWidth = width / indices.length;

        for (int i = 0; i < indices.length; i++) {
            int value = indices[i];
            
            // Height of the bar is proportional to value
            int barHeight = (int) (((double) (value+1) / (indices.length)) * height);
            int x = i * barWidth;
            // Draw from the bottom up 
            int y = height - barHeight; //y = 0 is the top of the screen

            // Set bar color to yellow if highlighted, blueish if not
            int red = 110;
            int blue = 255;
            Random random = new Random();
            int green = random.nextInt(82) + 173;
            Color bluish = new Color(red, green, blue);
            if (notes.isHighlighted(i)) {
                g.setColor(java.awt.Color.YELLOW);
            } else {
                g.setColor(bluish);
            }

            // Draw the bar
            g.fillRect(x, y, barWidth, barHeight);
        }
    }
}