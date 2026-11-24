// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class uyc {
    public static final uyc c;
    public static final uyc d;
    public static final uyc e;
    public static final uyc f;
    public static final /* synthetic */ uyc[] h;
    public static final /* synthetic */ n34 n;
    public final char a;
    public final char b;

    static {
        uyc uycVar = new uyc("OBJ", 0, '{', '}');
        c = uycVar;
        uyc uycVar2 = new uyc("LIST", 1, '[', ']');
        d = uycVar2;
        uyc uycVar3 = new uyc("MAP", 2, '{', '}');
        e = uycVar3;
        uyc uycVar4 = new uyc("POLY_OBJ", 3, '[', ']');
        f = uycVar4;
        uyc[] uycVarArr = {uycVar, uycVar2, uycVar3, uycVar4};
        h = uycVarArr;
        n = new n34(uycVarArr);
    }

    public uyc(String str, int i, char c2, char c3) {
        this.a = c2;
        this.b = c3;
    }

    public static uyc valueOf(String str) {
        return (uyc) Enum.valueOf(uyc.class, str);
    }

    public static uyc[] values() {
        return (uyc[]) h.clone();
    }
}
