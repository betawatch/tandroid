package x2;

import b2.q1;
import b2.x;
import c3.h0;
import f9.i0;
import f9.n1;
import f9.w;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class k extends m implements Comparable {
    public final int e;
    public final boolean f;
    public final boolean h;
    public final boolean n;
    public final int r;
    public final int s;
    public final int v;
    public final int w;
    public final int x;
    public final boolean y;

    public k(int i10, q1 q1Var, int i11, j jVar, int i12, String str, String str2) {
        super(i10, q1Var, i11);
        int i13;
        int i14 = 0;
        this.f = h0.e(i12, false);
        int i15 = this.d.e;
        int i16 = jVar.C;
        i0 i0Var = jVar.y;
        int i17 = i15 & (~i16);
        this.h = (i17 & 1) != 0;
        this.n = (i17 & 2) != 0;
        i0 y3 = str2 != null ? i0.y(str2) : i0Var.isEmpty() ? i0.y("") : i0Var;
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
        f9.q1 q1Var2 = o.l;
        int bitCount = (i20 == 0 || i20 != i19) ? Integer.bitCount(i19 & i20) : Integer.MAX_VALUE;
        this.v = bitCount;
        x xVar = this.d;
        this.y = (1088 & xVar.f) != 0;
        int c10 = o.c(xVar, jVar.z);
        this.w = c10;
        int i21 = o.i(this.d, str, o.l(str) == null);
        this.x = i21;
        boolean z10 = i13 > 0 || (i0Var.isEmpty() && bitCount > 0) || ((i0Var.isEmpty() && c10 != Integer.MAX_VALUE) || this.h || ((this.n && i21 > 0) || jVar.x));
        if (h0.e(i12, jVar.B0) && z10) {
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
        w c10 = w.a.c(this.f, kVar.f);
        Integer valueOf = Integer.valueOf(this.r);
        Integer valueOf2 = Integer.valueOf(kVar.r);
        n1 n1Var = n1.b;
        n1 n1Var2 = n1.c;
        w b10 = c10.b(valueOf, valueOf2, n1Var2);
        int i10 = kVar.s;
        int i11 = this.s;
        w a2 = b10.a(i11, i10);
        int i12 = kVar.v;
        int i13 = this.v;
        w c11 = a2.a(i13, i12).b(Integer.valueOf(this.w), Integer.valueOf(kVar.w), n1Var2).c(this.h, kVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.n);
        Boolean valueOf4 = Boolean.valueOf(kVar.n);
        if (i11 != 0) {
            n1Var = n1Var2;
        }
        w a10 = c11.b(valueOf3, valueOf4, n1Var).a(this.x, kVar.x);
        if (i13 == 0) {
            a10 = a10.d(this.y, kVar.y);
        }
        return a10.e();
    }
}
