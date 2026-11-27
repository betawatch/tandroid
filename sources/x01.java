// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class x01 {
    public static final x01 a;
    public static final x01 b;
    public static final x01 c;
    public static final /* synthetic */ x01[] d;

    static {
        x01 x01Var = new x01("SUSPEND", 0);
        a = x01Var;
        x01 x01Var2 = new x01("DROP_OLDEST", 1);
        b = x01Var2;
        x01 x01Var3 = new x01("DROP_LATEST", 2);
        c = x01Var3;
        d = new x01[]{x01Var, x01Var2, x01Var3};
    }

    public static x01 valueOf(String str) {
        return (x01) Enum.valueOf(x01.class, str);
    }

    public static x01[] values() {
        return (x01[]) d.clone();
    }
}
