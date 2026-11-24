// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class v26 {
    public static final v26 a;
    public static final v26 b;
    public static final v26 c;
    public static final v26 d;
    public static final v26 e;
    public static final /* synthetic */ v26[] f;

    static {
        v26 v26Var = new v26("DESTROYED", 0);
        a = v26Var;
        v26 v26Var2 = new v26("INITIALIZED", 1);
        b = v26Var2;
        v26 v26Var3 = new v26("CREATED", 2);
        c = v26Var3;
        v26 v26Var4 = new v26("STARTED", 3);
        d = v26Var4;
        v26 v26Var5 = new v26("RESUMED", 4);
        e = v26Var5;
        f = new v26[]{v26Var, v26Var2, v26Var3, v26Var4, v26Var5};
    }

    public static v26 valueOf(String str) {
        return (v26) Enum.valueOf(v26.class, str);
    }

    public static v26[] values() {
        return (v26[]) f.clone();
    }
}
