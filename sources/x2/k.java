package x2;

import b2.p1;
import b2.x;
import e9.b0;
import e9.n0;
import e9.s1;
import e9.v1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k extends m implements Comparable {
    public final boolean D;
    public final int e;
    public final boolean f;
    public final boolean h;
    public final boolean n;
    public final int r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    public k(int i10, p1 p1Var, int i11, j jVar, int i12, String str, String str2) {
        super(i10, p1Var, i11);
        int i13;
        int i14 = 0;
        this.f = i0.a.b(i12, false);
        int i15 = this.d.e;
        int i16 = jVar.C;
        n0 n0Var = jVar.y;
        int i17 = i15 & (~i16);
        this.h = (i17 & 1) != 0;
        this.n = (i17 & 2) != 0;
        n0 y3 = str2 != null ? n0.y(str2) : n0Var.isEmpty() ? n0.y("") : n0Var;
        int i18 = 0;
        while (true) {
            if (i18 >= y3.size()) {
                i13 = 0;
                i18 = Integer.MAX_VALUE;
                break;
            } else {
                i13 = o.i(this.d, (String) y3.get(i18), jVar.D);
                if (i13 > 0) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        this.r = i18;
        this.s = i13;
        int i19 = str2 != null ? 1088 : jVar.A;
        int i20 = this.d.f;
        v1 v1Var = o.l;
        int bitCount = (i20 == 0 || i20 != i19) ? Integer.bitCount(i19 & i20) : Integer.MAX_VALUE;
        this.w = bitCount;
        x xVar = this.d;
        this.D = (1088 & xVar.f) != 0;
        int c10 = o.c(xVar, jVar.z);
        this.x = c10;
        int i21 = o.i(this.d, str, o.l(str) == null);
        this.y = i21;
        boolean z10 = i13 > 0 || (n0Var.isEmpty() && bitCount > 0) || ((n0Var.isEmpty() && c10 != Integer.MAX_VALUE) || this.h || ((this.n && i21 > 0) || jVar.x));
        if (i0.a.b(i12, jVar.B0) && z10) {
            i14 = 1;
        }
        this.e = i14;
    }

    @Override // x2.m
    public final int a() {
        return this.e;
    }

    @Override // x2.m
    public final /* bridge */ /* synthetic */ boolean b(m mVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k kVar) {
        b0 c10 = b0.a.c(this.f, kVar.f);
        Integer valueOf = Integer.valueOf(this.r);
        Integer valueOf2 = Integer.valueOf(kVar.r);
        s1 s1Var = s1.b;
        s1 s1Var2 = s1.c;
        b0 b10 = c10.b(valueOf, valueOf2, s1Var2);
        int i10 = kVar.s;
        int i11 = this.s;
        b0 a2 = b10.a(i11, i10);
        int i12 = kVar.w;
        int i13 = this.w;
        b0 c11 = a2.a(i13, i12).b(Integer.valueOf(this.x), Integer.valueOf(kVar.x), s1Var2).c(this.h, kVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.n);
        Boolean valueOf4 = Boolean.valueOf(kVar.n);
        if (i11 != 0) {
            s1Var = s1Var2;
        }
        b0 a10 = c11.b(valueOf3, valueOf4, s1Var).a(this.y, kVar.y);
        if (i13 == 0) {
            a10 = a10.d(this.D, kVar.D);
        }
        return a10.e();
    }
}
