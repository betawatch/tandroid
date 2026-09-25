package y9;

import java.util.List;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class g0 {
    public String a;
    public String b;
    public String c;
    public Long d;
    public Long e;
    public Boolean f;
    public l1 g;
    public c2 h;
    public b2 i;
    public m1 j;
    public List k;
    public Integer l;

    public final h0 a() {
        String str = this.a == null ? " generator" : "";
        if (this.b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = v7.j.t(str, " startedAt");
        }
        if (this.f == null) {
            str = v7.j.t(str, " crashed");
        }
        if (this.g == null) {
            str = v7.j.t(str, " app");
        }
        if (this.l == null) {
            str = v7.j.t(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.a, this.b, this.c, this.d.longValue(), this.e, this.f.booleanValue(), this.g, this.h, this.i, this.j, this.k, this.l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
