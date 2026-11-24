// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class y6d {
    public static final y6d a;
    public static final /* synthetic */ y6d[] b;

    static {
        y6d y6dVar = new y6d("DEFAULT", 0);
        a = y6dVar;
        b = new y6d[]{y6dVar, new y6d("SIGNED", 1), new y6d("FIXED", 2)};
    }

    public static y6d[] values() {
        return (y6d[]) b.clone();
    }
}
