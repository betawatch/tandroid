package xd;

import ld.p;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class c implements cd.h {
    public final Throwable a;
    public final /* synthetic */ cd.h b;

    public c(cd.h hVar, Throwable th2) {
        this.a = th2;
        this.b = hVar;
    }

    @Override // cd.h
    public final Object fold(Object obj, p pVar) {
        return this.b.fold(obj, pVar);
    }

    @Override // cd.h
    public final cd.f get(cd.g gVar) {
        return this.b.get(gVar);
    }

    @Override // cd.h
    public final cd.h minusKey(cd.g gVar) {
        return this.b.minusKey(gVar);
    }

    @Override // cd.h
    public final cd.h plus(cd.h hVar) {
        return this.b.plus(hVar);
    }
}
