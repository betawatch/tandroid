// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
