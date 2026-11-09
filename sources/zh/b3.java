package zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b3 {
    public static final b3 a;
    public static final b3 b;
    public static final b3 c;
    public static final /* synthetic */ b3[] d;

    static {
        b3 b3Var = new b3("BY_PRICE", 0);
        a = b3Var;
        b3 b3Var2 = new b3("BY_DATE", 1);
        b = b3Var2;
        b3 b3Var3 = new b3("BY_NUMBER", 2);
        c = b3Var3;
        d = new b3[]{b3Var, b3Var2, b3Var3};
    }

    public static b3 valueOf(String str) {
        return (b3) Enum.valueOf(b3.class, str);
    }

    public static b3[] values() {
        return (b3[]) d.clone();
    }
}
