// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class v06 {
    public static final v06 a;
    public static final v06 b;
    public static final v06 c;
    public static final v06 d;
    public static final v06 e;
    public static final /* synthetic */ v06[] f;

    static {
        v06 v06Var = new v06("DESTROYED", 0);
        a = v06Var;
        v06 v06Var2 = new v06("INITIALIZED", 1);
        b = v06Var2;
        v06 v06Var3 = new v06("CREATED", 2);
        c = v06Var3;
        v06 v06Var4 = new v06("STARTED", 3);
        d = v06Var4;
        v06 v06Var5 = new v06("RESUMED", 4);
        e = v06Var5;
        f = new v06[]{v06Var, v06Var2, v06Var3, v06Var4, v06Var5};
    }

    public static v06 valueOf(String str) {
        return (v06) Enum.valueOf(v06.class, str);
    }

    public static v06[] values() {
        return (v06[]) f.clone();
    }
}
