package qc;

import g7.u6;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a implements f {
    public final g a;

    public a(g gVar) {
        this.a = gVar;
    }

    @Override // qc.h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // qc.h
    public f get(g gVar) {
        return u6.a(this, gVar);
    }

    @Override // qc.f
    public final g getKey() {
        return this.a;
    }

    @Override // qc.h
    public h minusKey(g gVar) {
        return u6.b(this, gVar);
    }

    @Override // qc.h
    public final h plus(h hVar) {
        return u6.c(this, hVar);
    }
}
