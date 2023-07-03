package com.learn.DesignPatterns.Behavioural.State;

public class Canvas {
    // Depending on the current tool, the canvas will behave differently. So mouseUp and mouseDown are different for different tools.
    private Tool currentTool;

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }

    public void mouseUp(){  // When the user releases the mouse
        currentTool.mouseUp();
    }

    public void mouseDown(){  // When the user presses the mouse
        currentTool.mouseDown();
    }
}
