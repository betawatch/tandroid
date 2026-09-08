package v7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
