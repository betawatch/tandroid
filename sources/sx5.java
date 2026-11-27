// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sx5 {
    public static final sx5 a;
    public static final sx5 b;
    public static final sx5 c;
    public static final sx5 d;
    public static final /* synthetic */ sx5[] e;

    static {
        sx5 sx5Var = new sx5("STATE_FULLY_HIDDEN", 0);
        a = sx5Var;
        sx5 sx5Var2 = new sx5("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        b = sx5Var2;
        sx5 sx5Var3 = new sx5("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        c = sx5Var3;
        sx5 sx5Var4 = new sx5("STATE_FULLY_VISIBLE", 3);
        d = sx5Var4;
        e = new sx5[]{sx5Var, sx5Var2, sx5Var3, sx5Var4};
    }

    public static sx5 valueOf(String str) {
        return (sx5) Enum.valueOf(sx5.class, str);
    }

    public static sx5[] values() {
        return (sx5[]) e.clone();
    }
}
