
// 對燈光控制的 Command介面 (抽象)
// Interface Command

public abstract class Command {
     Light light;
    public Command(Light light)
    {
        this.light = light;
    }

    public abstract void execute();
}
