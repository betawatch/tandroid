// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zxb {
    public static final zxb d = new zxb(new cz1());
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final boolean b;
    public final boolean c;

    static {
        String str = g8c.a;
        e = "1";
        f = "2";
        g = "3";
    }

    public zxb(cz1 cz1Var) {
        this.a = cz1Var.a;
        this.b = cz1Var.b;
        this.c = cz1Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zxb.class == obj.getClass()) {
            zxb zxbVar = (zxb) obj;
            if (this.a == zxbVar.a && this.b == zxbVar.b && this.c == zxbVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
    }
}
