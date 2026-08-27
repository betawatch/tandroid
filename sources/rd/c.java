package rd;

import id.j2;
import id.l;
import id.m;
import nd.t;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c implements l, j2 {
    public final m a;
    public final /* synthetic */ d b;

    public c(d dVar, m mVar) {
        this.b = dVar;
        this.a = mVar;
    }

    @Override // id.j2
    public final void a(t tVar, int i10) {
        this.a.a(tVar, i10);
    }

    @Override // id.l
    public final ec.a b(ad.l lVar, Object obj) {
        d dVar = this.b;
        b bVar = new b(dVar, this, 1);
        ec.a F = this.a.F(bVar, (pc.i) obj);
        if (F != null) {
            d.g.set(dVar, null);
        }
        return F;
    }

    @Override // id.l
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // rc.c
    public final rc.h getContext() {
        return this.a.e;
    }

    @Override // rc.c
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
