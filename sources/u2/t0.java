package u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class t0 {
    public static final t0 a;
    public static final t0 b;
    public static final t0 c;
    public static final /* synthetic */ t0[] d;

    static {
        t0 t0Var = new t0("PASS_THROUGH", 0);
        a = t0Var;
        t0 t0Var2 = new t0("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        b = t0Var2;
        t0 t0Var3 = new t0("DISCARDING", 2);
        c = t0Var3;
        d = new t0[]{t0Var, t0Var2, t0Var3};
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) d.clone();
    }
}
