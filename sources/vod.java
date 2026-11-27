// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
