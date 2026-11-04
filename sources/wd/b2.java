package wd;

import b8.cc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b2 implements fd.f, fd.g {
    public static final b2 a = new b2();

    @Override // fd.h
    public final Object fold(Object obj, od.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // fd.h
    public final fd.f get(fd.g gVar) {
        return cc.a(this, gVar);
    }

    @Override // fd.h
    public final fd.h minusKey(fd.g gVar) {
        return cc.b(this, gVar);
    }

    @Override // fd.h
    public final fd.h plus(fd.h hVar) {
        return cc.c(this, hVar);
    }

    @Override // fd.f
    public final fd.g getKey() {
        return this;
    }
}
