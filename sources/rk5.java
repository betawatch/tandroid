// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rk5 {
    public static final rk5 a;
    public static final rk5 b;
    public static final /* synthetic */ rk5[] c;

    static {
        rk5 rk5Var = new rk5("BACK", 0);
        a = rk5Var;
        rk5 rk5Var2 = new rk5("MENU", 1);
        b = rk5Var2;
        c = new rk5[]{rk5Var, rk5Var2};
    }

    public static rk5 valueOf(String str) {
        return (rk5) Enum.valueOf(rk5.class, str);
    }

    public static rk5[] values() {
        return (rk5[]) c.clone();
    }
}
