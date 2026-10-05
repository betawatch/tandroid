package y9;

import java.util.List;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
            str = sa.e.v(str, " startedAt");
        }
        if (this.f == null) {
            str = sa.e.v(str, " crashed");
        }
        if (this.g == null) {
            str = sa.e.v(str, " app");
        }
        if (this.l == null) {
            str = sa.e.v(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.a, this.b, this.c, this.d.longValue(), this.e, this.f.booleanValue(), this.g, this.h, this.i, this.j, this.k, this.l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
