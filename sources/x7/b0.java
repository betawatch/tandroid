package x7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b0 {
    public static final b0 a;
    public static final /* synthetic */ b0[] b;

    static {
        b0 b0Var = new b0("DEFAULT", 0);
        a = b0Var;
        b = new b0[]{b0Var, new b0("SIGNED", 1), new b0("FIXED", 2)};
    }

    public static b0[] values() {
        return (b0[]) b.clone();
    }
}
