// default package

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ts6 {
    public String a;
    public Uri b;
    public final us6 c = new us6();
    public final xs6 d = new xs6();
    public final List e = Collections.EMPTY_LIST;
    public final po5 f;
    public final long g;
    public final zs6 h;
    public ct6 i;

    public ts6() {
        no5 no5Var = po5.b;
        this.f = j99.e;
        this.h = new zs6();
        this.i = ct6.d;
        this.g = -9223372036854775807L;
    }

    public final ft6 a() {
        bt6 bt6Var;
        xs6 xs6Var = this.d;
        yve.p(xs6Var.b == null || xs6Var.a != null);
        Uri uri = this.b;
        if (uri != null) {
            bt6Var = new bt6(uri, null, xs6Var.a != null ? new ys6(xs6Var) : null, null, this.e, null, this.f, this.g);
        } else {
            bt6Var = null;
        }
        String str = this.a;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        us6 us6Var = this.c;
        us6Var.getClass();
        ws6 ws6Var = new ws6(us6Var);
        zs6 zs6Var = this.h;
        zs6Var.getClass();
        return new ft6(str2, ws6Var, bt6Var, new at6(zs6Var), nt6.M, this.i);
    }
}
