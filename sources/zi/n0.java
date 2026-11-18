package zi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class n0 {
    public static final n0 a;
    public static final n0 b;
    public static final /* synthetic */ n0[] c;

    static {
        n0 n0Var = new n0("FRONT", 0);
        a = n0Var;
        n0 n0Var2 = new n0("BACK", 1);
        b = n0Var2;
        c = new n0[]{n0Var, n0Var2};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) c.clone();
    }
}
