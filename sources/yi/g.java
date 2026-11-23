package yi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class g {
    public static final g a;
    public static final g b;
    public static final /* synthetic */ g[] c;

    static {
        g gVar = new g("DISABLED", 0);
        a = gVar;
        g gVar2 = new g("RNNOISE", 1);
        b = gVar2;
        c = new g[]{gVar, gVar2};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) c.clone();
    }
}
