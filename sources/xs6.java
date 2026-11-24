// default package

import android.net.Uri;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xs6 {
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
    public final us6 c;
    public final os6 d;
    public final List e;
    public final String f;
    public final mo5 g;
    public final long h;

    static {
        String str = hac.a;
        i = "0";
        j = "1";
        k = "2";
        l = "3";
        m = "4";
        n = "5";
        o = "6";
        p = "7";
    }

    public xs6(Uri uri, String str, us6 us6Var, os6 os6Var, List list, String str2, mo5 mo5Var, long j2) {
        this.a = uri;
        this.b = wf7.n(str);
        this.c = us6Var;
        this.d = os6Var;
        this.e = list;
        this.f = str2;
        this.g = mo5Var;
        jo5 p2 = mo5.p();
        for (int i2 = 0; i2 < mo5Var.size(); i2++) {
            at6 at6Var = (at6) mo5Var.get(i2);
            q95 q95Var = new q95();
            q95Var.c = at6Var.a;
            q95Var.d = at6Var.b;
            q95Var.e = at6Var.c;
            q95Var.a = at6Var.d;
            q95Var.b = at6Var.e;
            q95Var.f = at6Var.f;
            q95Var.g = at6Var.g;
            p2.c(new zs6(q95Var));
        }
        p2.f();
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs6)) {
            return false;
        }
        xs6 xs6Var = (xs6) obj;
        return this.a.equals(xs6Var.a) && Objects.equals(this.b, xs6Var.b) && Objects.equals(this.c, xs6Var.c) && Objects.equals(this.d, xs6Var.d) && this.e.equals(xs6Var.e) && Objects.equals(this.f, xs6Var.f) && this.g.equals(xs6Var.g) && this.h == xs6Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        us6 us6Var = this.c;
        int hashCode3 = (hashCode2 + (us6Var == null ? 0 : us6Var.hashCode())) * 31;
        os6 os6Var = this.d;
        int hashCode4 = (this.e.hashCode() + ((hashCode3 + (os6Var == null ? 0 : os6Var.hashCode())) * 31)) * 31;
        return (int) (((this.g.hashCode() + ((hashCode4 + (this.f != null ? r0.hashCode() : 0)) * 31)) * 31 * 31) + this.h);
    }
}
