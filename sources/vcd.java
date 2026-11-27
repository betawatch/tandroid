// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
