package zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class c3 {
    public static final c3 a;
    public static final c3 b;
    public static final c3 c;
    public static final /* synthetic */ c3[] d;

    static {
        c3 c3Var = new c3("BY_PRICE", 0);
        a = c3Var;
        c3 c3Var2 = new c3("BY_DATE", 1);
        b = c3Var2;
        c3 c3Var3 = new c3("BY_NUMBER", 2);
        c = c3Var3;
        d = new c3[]{c3Var, c3Var2, c3Var3};
    }

    public static c3 valueOf(String str) {
        return (c3) Enum.valueOf(c3.class, str);
    }

    public static c3[] values() {
        return (c3[]) d.clone();
    }
}
