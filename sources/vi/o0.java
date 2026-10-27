package vi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class o0 {
    public static final o0 a;
    public static final o0 b;
    public static final o0 c;
    public static final /* synthetic */ o0[] d;

    static {
        o0 o0Var = new o0("HIGH", 0);
        a = o0Var;
        o0 o0Var2 = new o0("MEDIUM", 1);
        b = o0Var2;
        o0 o0Var3 = new o0("LOW", 2);
        c = o0Var3;
        d = new o0[]{o0Var, o0Var2, o0Var3};
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) d.clone();
    }
}
