// default package

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ps6 {
    public String a;
    public Uri b;
    public final qs6 c = new qs6();
    public final ts6 d = new ts6();
    public final List e = Collections.EMPTY_LIST;
    public final mo5 f;
    public final long g;
    public final vs6 h;
    public ys6 i;

    public ps6() {
        ko5 ko5Var = mo5.b;
        this.f = y79.e;
        this.h = new vs6();
        this.i = ys6.d;
        this.g = -9223372036854775807L;
    }

    public final bt6 a() {
        xs6 xs6Var;
        ts6 ts6Var = this.d;
        jte.p(ts6Var.b == null || ts6Var.a != null);
        Uri uri = this.b;
        if (uri != null) {
            xs6Var = new xs6(uri, null, ts6Var.a != null ? new us6(ts6Var) : null, null, this.e, null, this.f, this.g);
        } else {
            xs6Var = null;
        }
        String str = this.a;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        qs6 qs6Var = this.c;
        qs6Var.getClass();
        ss6 ss6Var = new ss6(qs6Var);
        vs6 vs6Var = this.h;
        vs6Var.getClass();
        return new bt6(str2, ss6Var, xs6Var, new ws6(vs6Var), jt6.M, this.i);
    }
}
