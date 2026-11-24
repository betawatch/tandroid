// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class u06 {
    private static final /* synthetic */ u06[] $VALUES;
    public static final s06 Companion;
    public static final u06 ON_ANY;
    public static final u06 ON_CREATE;
    public static final u06 ON_DESTROY;
    public static final u06 ON_PAUSE;
    public static final u06 ON_RESUME;
    public static final u06 ON_START;
    public static final u06 ON_STOP;

    static {
        u06 u06Var = new u06("ON_CREATE", 0);
        ON_CREATE = u06Var;
        u06 u06Var2 = new u06("ON_START", 1);
        ON_START = u06Var2;
        u06 u06Var3 = new u06("ON_RESUME", 2);
        ON_RESUME = u06Var3;
        u06 u06Var4 = new u06("ON_PAUSE", 3);
        ON_PAUSE = u06Var4;
        u06 u06Var5 = new u06("ON_STOP", 4);
        ON_STOP = u06Var5;
        u06 u06Var6 = new u06("ON_DESTROY", 5);
        ON_DESTROY = u06Var6;
        u06 u06Var7 = new u06("ON_ANY", 6);
        ON_ANY = u06Var7;
        $VALUES = new u06[]{u06Var, u06Var2, u06Var3, u06Var4, u06Var5, u06Var6, u06Var7};
        Companion = new s06();
    }

    public static u06 valueOf(String str) {
        return (u06) Enum.valueOf(u06.class, str);
    }

    public static u06[] values() {
        return (u06[]) $VALUES.clone();
    }

    public final v06 a() {
        switch (t06.a[ordinal()]) {
            case 1:
            case 2:
                return v06.c;
            case 3:
            case 4:
                return v06.d;
            case 5:
                return v06.e;
            case 6:
                return v06.a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
