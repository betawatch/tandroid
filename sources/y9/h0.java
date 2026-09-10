package y9;

import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class h0 extends d2 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final l1 g;
    public final c2 h;
    public final b2 i;
    public final m1 j;
    public final List k;
    public final int l;

    public h0(String str, String str2, String str3, long j3, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j3;
        this.e = l4;
        this.f = z10;
        this.g = l1Var;
        this.h = c2Var;
        this.i = b2Var;
        this.j = m1Var;
        this.k = list;
        this.l = i10;
    }

    @Override // y9.d2
    public final g0 a() {
        g0 g0Var = new g0();
        g0Var.a = this.a;
        g0Var.b = this.b;
        g0Var.c = this.c;
        g0Var.d = Long.valueOf(this.d);
        g0Var.e = this.e;
        g0Var.f = Boolean.valueOf(this.f);
        g0Var.g = this.g;
        g0Var.h = this.h;
        g0Var.i = this.i;
        g0Var.j = this.j;
        g0Var.k = this.k;
        g0Var.l = Integer.valueOf(this.l);
        return g0Var;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l4;
        c2 c2Var;
        b2 b2Var;
        m1 m1Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d2) {
            h0 h0Var = (h0) ((d2) obj);
            List list2 = h0Var.k;
            m1 m1Var2 = h0Var.j;
            b2 b2Var2 = h0Var.i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.e;
            String str2 = h0Var.c;
            if (this.a.equals(h0Var.a) && this.b.equals(h0Var.b) && ((str = this.c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.e) != null ? l4.equals(l10) : l10 == null) && this.f == h0Var.f && this.g.equals(h0Var.g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.k) != null ? list.equals(list2) : list2 == null) && this.l == h0Var.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j3 = this.d;
        int i10 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l4 = this.e;
        int hashCode3 = (((((i10 ^ (l4 == null ? 0 : l4.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        int hashCode4 = (hashCode3 ^ (c2Var == null ? 0 : c2Var.hashCode())) * 1000003;
        b2 b2Var = this.i;
        int hashCode5 = (hashCode4 ^ (b2Var == null ? 0 : b2Var.hashCode())) * 1000003;
        m1 m1Var = this.j;
        int hashCode6 = (hashCode5 ^ (m1Var == null ? 0 : m1Var.hashCode())) * 1000003;
        List list = this.k;
        return ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.a);
        sb2.append(", identifier=");
        sb2.append(this.b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.e);
        sb2.append(", crashed=");
        sb2.append(this.f);
        sb2.append(", app=");
        sb2.append(this.g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.i);
        sb2.append(", device=");
        sb2.append(this.j);
        sb2.append(", events=");
        sb2.append(this.k);
        sb2.append(", generatorType=");
        return a4.a.n(this.l, "}", sb2);
    }
}
