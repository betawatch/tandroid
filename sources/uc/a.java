package uc;

import dd.p;
import k7.b8;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class a implements f {
    public final g a;

    public a(g gVar) {
        this.a = gVar;
    }

    @Override // uc.h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // uc.h
    public f get(g gVar) {
        return b8.a(this, gVar);
    }

    @Override // uc.f
    public final g getKey() {
        return this.a;
    }

    @Override // uc.h
    public h minusKey(g gVar) {
        return b8.b(this, gVar);
    }

    @Override // uc.h
    public final h plus(h hVar) {
        return b8.c(this, hVar);
    }
}
