package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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

    public y9.a0 a() {
        String str = this.a == null ? " sdkVersion" : "";
        if (this.b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.i == null) {
            str = sa.e.v(str, " platform");
        }
        if (this.c == null) {
            str = sa.e.v(str, " installationUuid");
        }
        if (((String) this.k) == null) {
            str = sa.e.v(str, " buildVersion");
        }
        if (((String) this.f) == null) {
            str = sa.e.v(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.a, this.b, this.i.intValue(), this.c, this.d, this.e, (String) this.k, (String) this.f, (y9.d2) this.g, (y9.j1) this.h, (y9.g1) this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
