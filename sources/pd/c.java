package pd;

import dd.p;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c implements uc.h {
    public final Throwable a;
    public final /* synthetic */ uc.h b;

    public c(Throwable th2, uc.h hVar) {
        this.a = th2;
        this.b = hVar;
    }

    @Override // uc.h
    public final Object fold(Object obj, p pVar) {
        return this.b.fold(obj, pVar);
    }

    @Override // uc.h
    public final uc.f get(uc.g gVar) {
        return this.b.get(gVar);
    }

    @Override // uc.h
    public final uc.h minusKey(uc.g gVar) {
        return this.b.minusKey(gVar);
    }

    @Override // uc.h
    public final uc.h plus(uc.h hVar) {
        return this.b.plus(hVar);
    }
}
