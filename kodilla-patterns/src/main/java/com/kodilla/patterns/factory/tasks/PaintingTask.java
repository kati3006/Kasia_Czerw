package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    final String taskName;
    final String colour;
    final String whatToPaint;

    public PaintingTask(final String taskName, final String colour, final String whatToPaint) {
        this.taskName = taskName;
        this.colour = colour;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        return "executed: painted as " + colour;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }

    public String getColour() {
        return colour;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }
}
