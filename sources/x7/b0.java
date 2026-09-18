package x7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
