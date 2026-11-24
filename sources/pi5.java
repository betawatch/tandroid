// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
