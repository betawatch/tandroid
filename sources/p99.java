// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class p99 {
    public static final p99 a;
    public static final p99 b;
    public static final p99 c;
    public static final /* synthetic */ p99[] d;

    static {
        p99 p99Var = new p99("BY_PRICE", 0);
        a = p99Var;
        p99 p99Var2 = new p99("BY_DATE", 1);
        b = p99Var2;
        p99 p99Var3 = new p99("BY_NUMBER", 2);
        c = p99Var3;
        d = new p99[]{p99Var, p99Var2, p99Var3};
    }

    public static p99 valueOf(String str) {
        return (p99) Enum.valueOf(p99.class, str);
    }

    public static p99[] values() {
        return (p99[]) d.clone();
    }
}
