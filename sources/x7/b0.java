package x7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
