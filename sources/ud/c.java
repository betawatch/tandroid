package ud;

import ld.i2;
import ld.l;
import ld.m;
import qd.t;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
    public final com.google.android.gms.internal.clearcut.e b(dd.l lVar, Object obj) {
        d dVar = this.b;
        b bVar = new b(dVar, this, 1);
        com.google.android.gms.internal.clearcut.e F = this.a.F(bVar, (sc.i) obj);
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
