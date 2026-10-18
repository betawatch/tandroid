package x2;

import b2.p1;
import b2.w;
import e9.b0;
import e9.n0;
import e9.s1;
import e9.v1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class j extends l implements Comparable {
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

    public j(int i10, p1 p1Var, int i11, i iVar, int i12, String str, String str2) {
        super(i10, p1Var, i11);
        int i13;
        int i14 = 0;
        this.f = i2.d.e(i12, false);
        int i15 = this.d.e;
        int i16 = iVar.C;
        n0 n0Var = iVar.y;
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
                i13 = n.i(this.d, (String) y3.get(i18), iVar.D);
                if (i13 > 0) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        this.r = i18;
        this.s = i13;
        int i19 = str2 != null ? 1088 : iVar.A;
        int i20 = this.d.f;
        v1 v1Var = n.l;
        int bitCount = (i20 == 0 || i20 != i19) ? Integer.bitCount(i19 & i20) : Integer.MAX_VALUE;
        this.v = bitCount;
        w wVar = this.d;
        this.y = (1088 & wVar.f) != 0;
        int c10 = n.c(wVar, iVar.z);
        this.w = c10;
        int i21 = n.i(this.d, str, n.l(str) == null);
        this.x = i21;
        boolean z10 = i13 > 0 || (n0Var.isEmpty() && bitCount > 0) || ((n0Var.isEmpty() && c10 != Integer.MAX_VALUE) || this.h || ((this.n && i21 > 0) || iVar.x));
        if (i2.d.e(i12, iVar.B0) && z10) {
            i14 = 1;
        }
        this.e = i14;
    }

    @Override // x2.l
    public final int a() {
        return this.e;
    }

    @Override // x2.l
    public final /* bridge */ /* synthetic */ boolean b(l lVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j jVar) {
        b0 c10 = b0.a.c(this.f, jVar.f);
        Integer valueOf = Integer.valueOf(this.r);
        Integer valueOf2 = Integer.valueOf(jVar.r);
        s1 s1Var = s1.b;
        s1 s1Var2 = s1.c;
        b0 b10 = c10.b(valueOf, valueOf2, s1Var2);
        int i10 = jVar.s;
        int i11 = this.s;
        b0 a2 = b10.a(i11, i10);
        int i12 = jVar.v;
        int i13 = this.v;
        b0 c11 = a2.a(i13, i12).b(Integer.valueOf(this.w), Integer.valueOf(jVar.w), s1Var2).c(this.h, jVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.n);
        Boolean valueOf4 = Boolean.valueOf(jVar.n);
        if (i11 != 0) {
            s1Var = s1Var2;
        }
        b0 a10 = c11.b(valueOf3, valueOf4, s1Var).a(this.x, jVar.x);
        if (i13 == 0) {
            a10 = a10.d(this.y, jVar.y);
        }
        return a10.e();
    }
}
