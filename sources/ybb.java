// default package

import android.os.SystemClock;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ybb {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public long h;
    public final /* synthetic */ oa0 i;

    public ybb(oa0 oa0Var, int i) {
        this.i = oa0Var;
        this.a = i;
    }

    public final void a() {
        Object obj;
        oa0 oa0Var = this.i;
        dfb dfbVar = (dfb) oa0Var.f;
        h74 h74Var = (h74) oa0Var.a;
        if (h74Var.h() != 2 || !h74Var.s() || h74Var.v0() != 0) {
            if (this.g) {
                dfbVar.g(1);
            }
            this.g = false;
            return;
        }
        bqb y0 = h74Var.y0();
        Object l = y0.p() ? null : y0.l(h74Var.A());
        int k0 = h74Var.k0();
        int L = h74Var.L();
        long b0 = h74Var.b0();
        long max = Math.max(0L, h74Var.o() - Math.max(0L, b0 - h74Var.k()));
        if (l != null && k0 == -1) {
            b0 -= hac.i0(y0.g(l, (ypb) oa0Var.e).e);
        }
        ((bfb) oa0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.g;
        int i = this.a;
        if (z && Objects.equals(l, this.b) && k0 == this.c && L == this.d) {
            obj = l;
            if (b0 == this.e && max == this.f) {
                if (elapsedRealtime - this.h >= i) {
                    ((c74) oa0Var.c).a.t1(new u64(2, new ccb(1, i), 1003));
                    return;
                }
                return;
            }
        } else {
            obj = l;
        }
        this.g = true;
        this.h = elapsedRealtime;
        this.b = obj;
        this.c = k0;
        this.d = L;
        this.e = b0;
        this.f = max;
        dfbVar.g(1);
        dfbVar.a.sendEmptyMessageDelayed(1, i);
    }
}
