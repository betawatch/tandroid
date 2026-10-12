package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class d8 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Object f;
    public Object g;
    public Object h;
    public Integer i;
    public Object j;
    public Serializable k;

    public z9.a0 a() {
        String str = this.a == null ? " sdkVersion" : "";
        if (this.b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.i == null) {
            str = t8.b.u(str, " platform");
        }
        if (this.c == null) {
            str = t8.b.u(str, " installationUuid");
        }
        if (((String) this.k) == null) {
            str = t8.b.u(str, " buildVersion");
        }
        if (((String) this.f) == null) {
            str = t8.b.u(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new z9.a0(this.a, this.b, this.i.intValue(), this.c, this.d, this.e, (String) this.k, (String) this.f, (z9.d2) this.g, (z9.j1) this.h, (z9.g1) this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
