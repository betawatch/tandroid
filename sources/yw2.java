// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class yw2 {
    public static final yw2 a;
    public static final yw2 b;
    public static final yw2 c;
    public static final yw2 d;
    public static final yw2 e;
    public static final /* synthetic */ yw2[] f;

    static {
        yw2 yw2Var = new yw2("CPU_ACQUIRED", 0);
        a = yw2Var;
        yw2 yw2Var2 = new yw2("BLOCKING", 1);
        b = yw2Var2;
        yw2 yw2Var3 = new yw2("PARKING", 2);
        c = yw2Var3;
        yw2 yw2Var4 = new yw2("DORMANT", 3);
        d = yw2Var4;
        yw2 yw2Var5 = new yw2("TERMINATED", 4);
        e = yw2Var5;
        f = new yw2[]{yw2Var, yw2Var2, yw2Var3, yw2Var4, yw2Var5};
    }

    public static yw2 valueOf(String str) {
        return (yw2) Enum.valueOf(yw2.class, str);
    }

    public static yw2[] values() {
        return (yw2[]) f.clone();
    }
}
