package y7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class g {
    public static final g a;
    public static final /* synthetic */ g[] b;

    static {
        g gVar = new g("DEFAULT", 0);
        a = gVar;
        b = new g[]{gVar, new g("SIGNED", 1), new g("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) b.clone();
    }
}
