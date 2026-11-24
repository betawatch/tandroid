// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pi5 {
    public static final pi5 a;
    public static final pi5 b;
    public static final /* synthetic */ pi5[] c;

    static {
        pi5 pi5Var = new pi5("BACK", 0);
        a = pi5Var;
        pi5 pi5Var2 = new pi5("MENU", 1);
        b = pi5Var2;
        c = new pi5[]{pi5Var, pi5Var2};
    }

    public static pi5 valueOf(String str) {
        return (pi5) Enum.valueOf(pi5.class, str);
    }

    public static pi5[] values() {
        return (pi5[]) c.clone();
    }
}
