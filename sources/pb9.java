// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pb9 {
    public static final pb9 a;
    public static final pb9 b;
    public static final pb9 c;
    public static final /* synthetic */ pb9[] d;

    static {
        pb9 pb9Var = new pb9("BY_PRICE", 0);
        a = pb9Var;
        pb9 pb9Var2 = new pb9("BY_DATE", 1);
        b = pb9Var2;
        pb9 pb9Var3 = new pb9("BY_NUMBER", 2);
        c = pb9Var3;
        d = new pb9[]{pb9Var, pb9Var2, pb9Var3};
    }

    public static pb9 valueOf(String str) {
        return (pb9) Enum.valueOf(pb9.class, str);
    }

    public static pb9[] values() {
        return (pb9[]) d.clone();
    }
}
