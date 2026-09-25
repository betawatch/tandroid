package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class e8 {
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

    public y9.a0 a() {
        String str = this.a == null ? " sdkVersion" : "";
        if (this.b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.i == null) {
            str = j.t(str, " platform");
        }
        if (this.c == null) {
            str = j.t(str, " installationUuid");
        }
        if (((String) this.k) == null) {
            str = j.t(str, " buildVersion");
        }
        if (((String) this.f) == null) {
            str = j.t(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.a, this.b, this.i.intValue(), this.c, this.d, this.e, (String) this.k, (String) this.f, (y9.d2) this.g, (y9.j1) this.h, (y9.g1) this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
