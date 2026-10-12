package u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class r0 {
    public static final r0 a;
    public static final r0 b;
    public static final r0 c;
    public static final /* synthetic */ r0[] d;

    static {
        r0 r0Var = new r0("PASS_THROUGH", 0);
        a = r0Var;
        r0 r0Var2 = new r0("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        b = r0Var2;
        r0 r0Var3 = new r0("DISCARDING", 2);
        c = r0Var3;
        d = new r0[]{r0Var, r0Var2, r0Var3};
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) d.clone();
    }
}
