package x2;

import b2.l1;
import e9.i0;
import e9.x0;
import e9.y0;
import e9.z;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class l extends n implements Comparable {
    public final int e;
    public final boolean f;
    public final boolean h;
    public final boolean n;
    public final int r;
    public final int s;
    public final int v;
    public final int w;
    public final boolean x;

    public l(int i10, l1 l1Var, int i11, i iVar, int i12, String str, String str2) {
        super(i10, l1Var, i11);
        int i13;
        int i14;
        int i15 = 0;
        this.f = i2.g.d(i12, false);
        int i16 = this.d.e;
        int i17 = iVar.y;
        i0 i0Var = iVar.v;
        int i18 = i16 & (~i17);
        this.h = (i18 & 1) != 0;
        this.n = (i18 & 2) != 0;
        i0 z10 = str2 != null ? i0.z(str2) : i0Var.isEmpty() ? i0.z("") : i0Var;
        int i19 = 0;
        while (true) {
            int size = z10.size();
            i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i19 >= size) {
                i19 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                i14 = 0;
                break;
            } else {
                i14 = p.d(this.d, (String) z10.get(i19), iVar.z);
                if (i14 > 0) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        this.r = i19;
        this.s = i14;
        int i20 = str2 != null ? 1088 : iVar.w;
        int i21 = this.d.f;
        y0 y0Var = p.l;
        i13 = (i21 == 0 || i21 != i20) ? Integer.bitCount(i20 & i21) : i13;
        this.v = i13;
        this.x = (1088 & this.d.f) != 0;
        int d = p.d(this.d, str, p.g(str) == null);
        this.w = d;
        boolean z11 = i14 > 0 || (i0Var.isEmpty() && i13 > 0) || this.h || (this.n && d > 0);
        if (i2.g.d(i12, iVar.t0) && z11) {
            i15 = 1;
        }
        this.e = i15;
    }

    @Override // x2.n
    public final int a() {
        return this.e;
    }

    @Override // x2.n
    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l lVar) {
        z c10 = z.a.c(this.f, lVar.f);
        Integer valueOf = Integer.valueOf(this.r);
        Integer valueOf2 = Integer.valueOf(lVar.r);
        x0 x0Var = x0.b;
        x0 x0Var2 = x0.c;
        z b10 = c10.b(valueOf, valueOf2, x0Var2);
        int i10 = lVar.s;
        int i11 = this.s;
        z a2 = b10.a(i11, i10);
        int i12 = lVar.v;
        int i13 = this.v;
        z c11 = a2.a(i13, i12).c(this.h, lVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.n);
        Boolean valueOf4 = Boolean.valueOf(lVar.n);
        if (i11 != 0) {
            x0Var = x0Var2;
        }
        z a10 = c11.b(valueOf3, valueOf4, x0Var).a(this.w, lVar.w);
        if (i13 == 0) {
            a10 = a10.d(this.x, lVar.x);
        }
        return a10.e();
    }
}
