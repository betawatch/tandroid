package si;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class n0 {
    public static final n0 a;
    public static final n0 b;
    public static final n0 c;
    public static final /* synthetic */ n0[] d;

    static {
        n0 n0Var = new n0("HIGH", 0);
        a = n0Var;
        n0 n0Var2 = new n0("MEDIUM", 1);
        b = n0Var2;
        n0 n0Var3 = new n0("LOW", 2);
        c = n0Var3;
        d = new n0[]{n0Var, n0Var2, n0Var3};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) d.clone();
    }
}
