package zd;

import v7.o8;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class h2 implements id.f, id.g {
    public static final h2 a = new h2();

    @Override // id.h
    public final Object fold(Object obj, rd.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // id.h
    public final id.f get(id.g gVar) {
        return o8.a(this, gVar);
    }

    @Override // id.h
    public final id.h minusKey(id.g gVar) {
        return o8.b(this, gVar);
    }

    @Override // id.h
    public final id.h plus(id.h hVar) {
        return o8.c(this, hVar);
    }

    @Override // id.f
    public final id.g getKey() {
        return this;
    }
}
