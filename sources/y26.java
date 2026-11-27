// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class y26 {
    private static final /* synthetic */ y26[] $VALUES;
    public static final w26 Companion;
    public static final y26 ON_ANY;
    public static final y26 ON_CREATE;
    public static final y26 ON_DESTROY;
    public static final y26 ON_PAUSE;
    public static final y26 ON_RESUME;
    public static final y26 ON_START;
    public static final y26 ON_STOP;

    static {
        y26 y26Var = new y26("ON_CREATE", 0);
        ON_CREATE = y26Var;
        y26 y26Var2 = new y26("ON_START", 1);
        ON_START = y26Var2;
        y26 y26Var3 = new y26("ON_RESUME", 2);
        ON_RESUME = y26Var3;
        y26 y26Var4 = new y26("ON_PAUSE", 3);
        ON_PAUSE = y26Var4;
        y26 y26Var5 = new y26("ON_STOP", 4);
        ON_STOP = y26Var5;
        y26 y26Var6 = new y26("ON_DESTROY", 5);
        ON_DESTROY = y26Var6;
        y26 y26Var7 = new y26("ON_ANY", 6);
        ON_ANY = y26Var7;
        $VALUES = new y26[]{y26Var, y26Var2, y26Var3, y26Var4, y26Var5, y26Var6, y26Var7};
        Companion = new w26();
    }

    public static y26 valueOf(String str) {
        return (y26) Enum.valueOf(y26.class, str);
    }

    public static y26[] values() {
        return (y26[]) $VALUES.clone();
    }

    public final z26 a() {
        switch (x26.a[ordinal()]) {
            case 1:
            case 2:
                return z26.c;
            case 3:
            case 4:
                return z26.d;
            case 5:
                return z26.e;
            case 6:
                return z26.a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
