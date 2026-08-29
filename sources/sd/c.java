package sd;

import jd.i2;
import jd.l;
import jd.m;
import od.u;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements l, i2 {
    public final m a;
    public final /* synthetic */ d b;

    public c(d dVar, m mVar) {
        this.b = dVar;
        this.a = mVar;
    }

    @Override // jd.l
    public final fc.a a(bd.l lVar, Object obj) {
        d dVar = this.b;
        b bVar = new b(dVar, this, 1);
        fc.a F = this.a.F(bVar, (qc.i) obj);
        if (F != null) {
            d.g.set(dVar, null);
        }
        return F;
    }

    @Override // jd.i2
    public final void b(u uVar, int i10) {
        this.a.b(uVar, i10);
    }

    @Override // jd.l
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // sc.c
    public final sc.h getContext() {
        return this.a.e;
    }

    @Override // sc.c
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
