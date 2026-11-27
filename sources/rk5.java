// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
