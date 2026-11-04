package z2;

import d2.o1;
import d2.v;
import g9.i0;
import g9.n1;
import g9.q1;
import g9.w;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j extends l implements Comparable {
    public final boolean E;
    public final int e;
    public final boolean f;
    public final boolean h;
    public final boolean n;
    public final int r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    public j(int i3, o1 o1Var, int i10, i iVar, int i11, String str, String str2) {
        super(i3, o1Var, i10);
        int i12;
        int i13 = 0;
        this.f = p1.b(i11, false);
        int i14 = this.d.e;
        int i15 = iVar.C;
        i0 i0Var = iVar.y;
        int i16 = i14 & (~i15);
        this.h = (i16 & 1) != 0;
        this.n = (i16 & 2) != 0;
        i0 u10 = str2 != null ? i0.u(str2) : i0Var.isEmpty() ? i0.u("") : i0Var;
        int i17 = 0;
        while (true) {
            if (i17 >= u10.size()) {
                i12 = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                i12 = n.i(this.d, (String) u10.get(i17), iVar.D);
                if (i12 > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.r = i17;
        this.s = i12;
        int i18 = str2 != null ? 1088 : iVar.A;
        int i19 = this.d.f;
        q1 q1Var = n.l;
        int bitCount = (i19 == 0 || i19 != i18) ? Integer.bitCount(i18 & i19) : Integer.MAX_VALUE;
        this.w = bitCount;
        v vVar = this.d;
        this.E = (1088 & vVar.f) != 0;
        int c2 = n.c(vVar, iVar.z);
        this.x = c2;
        int i20 = n.i(this.d, str, n.l(str) == null);
        this.y = i20;
        boolean z10 = i12 > 0 || (i0Var.isEmpty() && bitCount > 0) || ((i0Var.isEmpty() && c2 != Integer.MAX_VALUE) || this.h || ((this.n && i20 > 0) || iVar.x));
        if (p1.b(i11, iVar.B0) && z10) {
            i13 = 1;
        }
        this.e = i13;
    }

    @Override // z2.l
    public final int a() {
        return this.e;
    }

    @Override // z2.l
    public final /* bridge */ /* synthetic */ boolean b(l lVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j jVar) {
        w c2 = w.a.c(this.f, jVar.f);
        Integer valueOf = Integer.valueOf(this.r);
        Integer valueOf2 = Integer.valueOf(jVar.r);
        n1 n1Var = n1.b;
        n1 n1Var2 = n1.c;
        w b10 = c2.b(valueOf, valueOf2, n1Var2);
        int i3 = jVar.s;
        int i10 = this.s;
        w a10 = b10.a(i10, i3);
        int i11 = jVar.w;
        int i12 = this.w;
        w c10 = a10.a(i12, i11).b(Integer.valueOf(this.x), Integer.valueOf(jVar.x), n1Var2).c(this.h, jVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.n);
        Boolean valueOf4 = Boolean.valueOf(jVar.n);
        if (i10 != 0) {
            n1Var = n1Var2;
        }
        w a11 = c10.b(valueOf3, valueOf4, n1Var).a(this.y, jVar.y);
        if (i12 == 0) {
            a11 = a11.d(this.E, jVar.E);
        }
        return a11.e();
    }
}
