// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class w11 {
    public static final w11 a;
    public static final w11 b;
    public static final w11 c;
    public static final /* synthetic */ w11[] d;

    static {
        w11 w11Var = new w11("SUSPEND", 0);
        a = w11Var;
        w11 w11Var2 = new w11("DROP_OLDEST", 1);
        b = w11Var2;
        w11 w11Var3 = new w11("DROP_LATEST", 2);
        c = w11Var3;
        d = new w11[]{w11Var, w11Var2, w11Var3};
    }

    public static w11 valueOf(String str) {
        return (w11) Enum.valueOf(w11.class, str);
    }

    public static w11[] values() {
        return (w11[]) d.clone();
    }
}
