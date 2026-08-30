package ud;

import ld.i2;
import ld.l;
import ld.m;
import qd.t;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
    public final i5.c b(dd.l lVar, Object obj) {
        d dVar = this.b;
        b bVar = new b(dVar, this, 1);
        i5.c F = this.a.F(bVar, (sc.i) obj);
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
