package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
            str = org.telegram.ui.Cells.r6.t(str, " platform");
        }
        if (this.c == null) {
            str = org.telegram.ui.Cells.r6.t(str, " installationUuid");
        }
        if (((String) this.k) == null) {
            str = org.telegram.ui.Cells.r6.t(str, " buildVersion");
        }
        if (((String) this.f) == null) {
            str = org.telegram.ui.Cells.r6.t(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.a, this.b, this.i.intValue(), this.c, this.d, this.e, (String) this.k, (String) this.f, (y9.d2) this.g, (y9.j1) this.h, (y9.g1) this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
