// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
