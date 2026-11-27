// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class sx2 {
    public static final sx2 a;
    public static final sx2 b;
    public static final sx2 c;
    public static final sx2 d;
    public static final sx2 e;
    public static final /* synthetic */ sx2[] f;

    static {
        sx2 sx2Var = new sx2("CPU_ACQUIRED", 0);
        a = sx2Var;
        sx2 sx2Var2 = new sx2("BLOCKING", 1);
        b = sx2Var2;
        sx2 sx2Var3 = new sx2("PARKING", 2);
        c = sx2Var3;
        sx2 sx2Var4 = new sx2("DORMANT", 3);
        d = sx2Var4;
        sx2 sx2Var5 = new sx2("TERMINATED", 4);
        e = sx2Var5;
        f = new sx2[]{sx2Var, sx2Var2, sx2Var3, sx2Var4, sx2Var5};
    }

    public static sx2 valueOf(String str) {
        return (sx2) Enum.valueOf(sx2.class, str);
    }

    public static sx2[] values() {
        return (sx2[]) f.clone();
    }
}
