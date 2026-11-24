// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class u26 {
    private static final /* synthetic */ u26[] $VALUES;
    public static final s26 Companion;
    public static final u26 ON_ANY;
    public static final u26 ON_CREATE;
    public static final u26 ON_DESTROY;
    public static final u26 ON_PAUSE;
    public static final u26 ON_RESUME;
    public static final u26 ON_START;
    public static final u26 ON_STOP;

    static {
        u26 u26Var = new u26("ON_CREATE", 0);
        ON_CREATE = u26Var;
        u26 u26Var2 = new u26("ON_START", 1);
        ON_START = u26Var2;
        u26 u26Var3 = new u26("ON_RESUME", 2);
        ON_RESUME = u26Var3;
        u26 u26Var4 = new u26("ON_PAUSE", 3);
        ON_PAUSE = u26Var4;
        u26 u26Var5 = new u26("ON_STOP", 4);
        ON_STOP = u26Var5;
        u26 u26Var6 = new u26("ON_DESTROY", 5);
        ON_DESTROY = u26Var6;
        u26 u26Var7 = new u26("ON_ANY", 6);
        ON_ANY = u26Var7;
        $VALUES = new u26[]{u26Var, u26Var2, u26Var3, u26Var4, u26Var5, u26Var6, u26Var7};
        Companion = new s26();
    }

    public static u26 valueOf(String str) {
        return (u26) Enum.valueOf(u26.class, str);
    }

    public static u26[] values() {
        return (u26[]) $VALUES.clone();
    }

    public final v26 a() {
        switch (t26.a[ordinal()]) {
            case 1:
            case 2:
                return v26.c;
            case 3:
            case 4:
                return v26.d;
            case 5:
                return v26.e;
            case 6:
                return v26.a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
