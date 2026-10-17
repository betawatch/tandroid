package si;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class m0 {
    public static final m0 a;
    public static final m0 b;
    public static final /* synthetic */ m0[] c;

    static {
        m0 m0Var = new m0("FRONT", 0);
        a = m0Var;
        m0 m0Var2 = new m0("BACK", 1);
        b = m0Var2;
        c = new m0[]{m0Var, m0Var2};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) c.clone();
    }
}
