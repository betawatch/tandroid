package qd;

import hd.j2;
import hd.l;
import hd.m;
import md.t;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements l, j2 {
    public final m a;
    public final /* synthetic */ d b;

    public c(d dVar, m mVar) {
        this.b = dVar;
        this.a = mVar;
    }

    @Override // hd.j2
    public final void a(t tVar, int i9) {
        this.a.a(tVar, i9);
    }

    @Override // hd.l
    public final e5.c b(zc.l lVar, Object obj) {
        d dVar = this.b;
        b bVar = new b(dVar, this, 1);
        e5.c F = this.a.F(bVar, (oc.i) obj);
        if (F != null) {
            d.g.set(dVar, null);
        }
        return F;
    }

    @Override // hd.l
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // qc.c
    public final qc.h getContext() {
        return this.a.e;
    }

    @Override // qc.c
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
