package ires.corso.test2.test.menu;

public class ToDoMenuLeaf extends ToDoMenuItem
{
    private final Runnable _action;

    public ToDoMenuLeaf(String ID, String title, Runnable action) {
        super(ID, title);
        _action = action;
    }

    @Override
    public void run() {
        _action.run();
    }
}
