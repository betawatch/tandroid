package ud;

import ld.i2;
import ld.l;
import ld.m;
import qd.t;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c implements l, i2 {
    public final m a;
    public final /* synthetic */ d b;

    public c(d dVar, m mVar) {
        this.b = dVar;
        this.a = mVar;
    }

    @Override // ld.i2
    public final void a(t tVar, int i10) {
        this.a.a(tVar, i10);
    }

    @Override // ld.l
    public final o3.c b(dd.l lVar, Object obj) {
        d dVar = this.b;
        b bVar = new b(dVar, this, 1);
        o3.c F = this.a.F(bVar, (sc.i) obj);
        if (F != null) {
            d.g.set(dVar, null);
        }
        return F;
    }

    @Override // ld.l
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // uc.c
    public final uc.h getContext() {
        return this.a.e;
    }

    @Override // uc.c
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
