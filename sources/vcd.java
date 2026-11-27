// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
