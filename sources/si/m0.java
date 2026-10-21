package si;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class m0 {
    public static final m0 a;
    public static final m0 b;
    public static final m0 c;
    public static final /* synthetic */ m0[] d;

    static {
        m0 m0Var = new m0("HIGH", 0);
        a = m0Var;
        m0 m0Var2 = new m0("MEDIUM", 1);
        b = m0Var2;
        m0 m0Var3 = new m0("LOW", 2);
        c = m0Var3;
        d = new m0[]{m0Var, m0Var2, m0Var3};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) d.clone();
    }
}
