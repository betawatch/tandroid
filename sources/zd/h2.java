package zd;

import v7.n8;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class h2 implements id.f, id.g {
    public static final h2 a = new h2();

    @Override // id.h
    public final Object fold(Object obj, rd.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // id.h
    public final id.f get(id.g gVar) {
        return n8.a(this, gVar);
    }

    @Override // id.h
    public final id.h minusKey(id.g gVar) {
        return n8.b(this, gVar);
    }

    @Override // id.h
    public final id.h plus(id.h hVar) {
        return n8.c(this, hVar);
    }

    @Override // id.f
    public final id.g getKey() {
        return this;
    }
}
