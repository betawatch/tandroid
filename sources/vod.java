// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class vod {
    public static final vod a;
    public static final /* synthetic */ vod[] b;

    static {
        vod vodVar = new vod("DEFAULT", 0);
        a = vodVar;
        b = new vod[]{vodVar, new vod("SIGNED", 1), new vod("FIXED", 2)};
    }

    public static vod[] values() {
        return (vod[]) b.clone();
    }
}
