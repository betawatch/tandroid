package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
            str = r4.c.u(str, " platform");
        }
        if (this.c == null) {
            str = r4.c.u(str, " installationUuid");
        }
        if (((String) this.k) == null) {
            str = r4.c.u(str, " buildVersion");
        }
        if (((String) this.f) == null) {
            str = r4.c.u(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new z9.a0(this.a, this.b, this.i.intValue(), this.c, this.d, this.e, (String) this.k, (String) this.f, (z9.d2) this.g, (z9.j1) this.h, (z9.g1) this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
