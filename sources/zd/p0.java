package zd;

import v7.u7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class p0 extends k1 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ p0(Object obj, int i10) {
        this.e = i10;
        this.f = obj;
    }

    @Override // zd.d1
    public final void a(Throwable th2) {
        switch (this.e) {
            case 0:
                ((o0) this.f).dispose();
                return;
            case 1:
                ((d1) this.f).a(th2);
                return;
            case 2:
                ((u1) this.f).u();
                throw null;
            case 3:
                l1 l1Var = (l1) this.f;
                Object u10 = i().u();
                if (u10 instanceof v) {
                    l1Var.resumeWith(u7.a(((v) u10).a));
                    return;
                } else {
                    l1Var.resumeWith(e0.u(u10));
                    return;
                }
            default:
                ((m) this.f).resumeWith(gd.i.a);
                return;
        }
    }

    public p0(u1 u1Var) {
        this.e = 2;
        this.f = u1Var;
    }
}
