package y7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
