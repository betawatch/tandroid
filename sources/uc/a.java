package uc;

import dd.p;
import k7.b8;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
