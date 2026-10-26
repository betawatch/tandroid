package vi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class l0 {
    public static final l0 a;
    public static final l0 b;
    public static final /* synthetic */ l0[] c;

    static {
        l0 l0Var = new l0("FRONT", 0);
        a = l0Var;
        l0 l0Var2 = new l0("BACK", 1);
        b = l0Var2;
        c = new l0[]{l0Var, l0Var2};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) c.clone();
    }
}
