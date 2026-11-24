// default package

import android.net.Uri;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xq6 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Uri a;
    public final String b;
    public final uq6 c;
    public final oq6 d;
    public final List e;
    public final String f;
    public final mm5 g;
    public final long h;

    static {
        String str = g8c.a;
        i = "0";
        j = "1";
        k = "2";
        l = "3";
        m = "4";
        n = "5";
        o = "6";
        p = "7";
    }

    public xq6(Uri uri, String str, uq6 uq6Var, oq6 oq6Var, List list, String str2, mm5 mm5Var, long j2) {
        this.a = uri;
        this.b = ud7.n(str);
        this.c = uq6Var;
        this.d = oq6Var;
        this.e = list;
        this.f = str2;
        this.g = mm5Var;
        jm5 p2 = mm5.p();
        for (int i2 = 0; i2 < mm5Var.size(); i2++) {
            ar6 ar6Var = (ar6) mm5Var.get(i2);
            r75 r75Var = new r75();
            r75Var.c = ar6Var.a;
            r75Var.d = ar6Var.b;
            r75Var.e = ar6Var.c;
            r75Var.a = ar6Var.d;
            r75Var.b = ar6Var.e;
            r75Var.f = ar6Var.f;
            r75Var.g = ar6Var.g;
            p2.c(new zq6(r75Var));
        }
        p2.f();
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq6)) {
            return false;
        }
        xq6 xq6Var = (xq6) obj;
        return this.a.equals(xq6Var.a) && Objects.equals(this.b, xq6Var.b) && Objects.equals(this.c, xq6Var.c) && Objects.equals(this.d, xq6Var.d) && this.e.equals(xq6Var.e) && Objects.equals(this.f, xq6Var.f) && this.g.equals(xq6Var.g) && this.h == xq6Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        uq6 uq6Var = this.c;
        int hashCode3 = (hashCode2 + (uq6Var == null ? 0 : uq6Var.hashCode())) * 31;
        oq6 oq6Var = this.d;
        int hashCode4 = (this.e.hashCode() + ((hashCode3 + (oq6Var == null ? 0 : oq6Var.hashCode())) * 31)) * 31;
        return (int) (((this.g.hashCode() + ((hashCode4 + (this.f != null ? r0.hashCode() : 0)) * 31)) * 31 * 31) + this.h);
    }
}
