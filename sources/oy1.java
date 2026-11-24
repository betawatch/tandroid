// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class oy1 {
    public static final oy1 a;
    public static final oy1 b;
    public static final oy1 c;
    public static final oy1 d;
    public static final oy1 e;
    public static final oy1 f;
    public static final /* synthetic */ oy1[] h;

    static {
        oy1 oy1Var = new oy1("VOICE", 0);
        a = oy1Var;
        oy1 oy1Var2 = new oy1("VIDEO", 1);
        b = oy1Var2;
        oy1 oy1Var3 = new oy1("STICKER", 2);
        c = oy1Var3;
        oy1 oy1Var4 = new oy1("KEYBOARD", 3);
        d = oy1Var4;
        oy1 oy1Var5 = new oy1("SMILE", 4);
        e = oy1Var5;
        oy1 oy1Var6 = new oy1("GIF", 5);
        f = oy1Var6;
        h = new oy1[]{oy1Var, oy1Var2, oy1Var3, oy1Var4, oy1Var5, oy1Var6};
    }

    public static oy1 valueOf(String str) {
        return (oy1) Enum.valueOf(oy1.class, str);
    }

    public static oy1[] values() {
        return (oy1[]) h.clone();
    }
}
