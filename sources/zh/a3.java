package zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class a3 {
    public static final a3 a;
    public static final a3 b;
    public static final a3 c;
    public static final /* synthetic */ a3[] d;

    static {
        a3 a3Var = new a3("BY_PRICE", 0);
        a = a3Var;
        a3 a3Var2 = new a3("BY_DATE", 1);
        b = a3Var2;
        a3 a3Var3 = new a3("BY_NUMBER", 2);
        c = a3Var3;
        d = new a3[]{a3Var, a3Var2, a3Var3};
    }

    public static a3 valueOf(String str) {
        return (a3) Enum.valueOf(a3.class, str);
    }

    public static a3[] values() {
        return (a3[]) d.clone();
    }
}
