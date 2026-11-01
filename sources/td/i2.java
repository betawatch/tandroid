package td;

import v7.g5;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class i2 implements cd.f, cd.g {
    public static final i2 a = new i2();

    @Override // cd.h
    public final Object fold(Object obj, ld.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // cd.h
    public final cd.f get(cd.g gVar) {
        return g5.a(this, gVar);
    }

    @Override // cd.h
    public final cd.h minusKey(cd.g gVar) {
        return g5.b(this, gVar);
    }

    @Override // cd.h
    public final cd.h plus(cd.h hVar) {
        return g5.c(this, hVar);
    }

    @Override // cd.f
    public final cd.g getKey() {
        return this;
    }
}
