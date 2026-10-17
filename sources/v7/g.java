package v7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class g {
    public static final g a;
    public static final /* synthetic */ g[] b;

    static {
        g gVar = new g("DEFAULT", 0);
        a = gVar;
        b = new g[]{gVar, new g("SIGNED", 1), new g("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) b.clone();
    }
}
