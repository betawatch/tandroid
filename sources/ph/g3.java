package ph;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g3 {
    public static final g3 a;
    public static final g3 b;
    public static final g3 c;
    public static final /* synthetic */ g3[] d;

    static {
        g3 g3Var = new g3("BY_PRICE", 0);
        a = g3Var;
        g3 g3Var2 = new g3("BY_DATE", 1);
        b = g3Var2;
        g3 g3Var3 = new g3("BY_NUMBER", 2);
        c = g3Var3;
        d = new g3[]{g3Var, g3Var2, g3Var3};
    }

    public static g3 valueOf(String str) {
        return (g3) Enum.valueOf(g3.class, str);
    }

    public static g3[] values() {
        return (g3[]) d.clone();
    }
}
