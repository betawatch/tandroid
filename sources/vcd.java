// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class vcd {
    public static final vcd a;
    public static final /* synthetic */ vcd[] b;

    static {
        vcd vcdVar = new vcd("DEFAULT", 0);
        a = vcdVar;
        b = new vcd[]{vcdVar, new vcd("SIGNED", 1), new vcd("FIXED", 2)};
    }

    public static vcd[] values() {
        return (vcd[]) b.clone();
    }
}
