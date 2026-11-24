// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class rs3 {
    public static final rs3 a;
    public static final rs3 b;
    public static final rs3 c;
    public static final /* synthetic */ rs3[] d;

    static {
        rs3 rs3Var = new rs3("NONE", 0);
        a = rs3Var;
        rs3 rs3Var2 = new rs3("VERTICAL", 1);
        b = rs3Var2;
        rs3 rs3Var3 = new rs3("FULL", 2);
        c = rs3Var3;
        d = new rs3[]{rs3Var, rs3Var2, rs3Var3};
    }

    public static rs3 valueOf(String str) {
        return (rs3) Enum.valueOf(rs3.class, str);
    }

    public static rs3[] values() {
        return (rs3[]) d.clone();
    }
}
