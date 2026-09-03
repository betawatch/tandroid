package uc;

import dd.p;
import k7.b8;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
