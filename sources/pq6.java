// default package

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class pq6 {
    public String a;
    public Uri b;
    public final qq6 c = new qq6();
    public final tq6 d = new tq6();
    public final List e = Collections.EMPTY_LIST;
    public final mm5 f;
    public final long g;
    public final vq6 h;
    public yq6 i;

    public pq6() {
        km5 km5Var = mm5.b;
        this.f = w59.e;
        this.h = new vq6();
        this.i = yq6.d;
        this.g = -9223372036854775807L;
    }

    public final br6 a() {
        xq6 xq6Var;
        tq6 tq6Var = this.d;
        gre.p(tq6Var.b == null || tq6Var.a != null);
        Uri uri = this.b;
        if (uri != null) {
            xq6Var = new xq6(uri, null, tq6Var.a != null ? new uq6(tq6Var) : null, null, this.e, null, this.f, this.g);
        } else {
            xq6Var = null;
        }
        String str = this.a;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        qq6 qq6Var = this.c;
        qq6Var.getClass();
        sq6 sq6Var = new sq6(qq6Var);
        vq6 vq6Var = this.h;
        vq6Var.getClass();
        return new br6(str2, sq6Var, xq6Var, new wq6(vq6Var), jr6.M, this.i);
    }
}
