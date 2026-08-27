package rc;

import ad.p;
import h7.y6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class a implements f {
    public final g a;

    public a(g gVar) {
        this.a = gVar;
    }

    @Override // rc.h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // rc.h
    public f get(g gVar) {
        return y6.a(this, gVar);
    }

    @Override // rc.f
    public final g getKey() {
        return this.a;
    }

    @Override // rc.h
    public h minusKey(g gVar) {
        return y6.b(this, gVar);
    }

    @Override // rc.h
    public final h plus(h hVar) {
        return y6.c(this, hVar);
    }
}
