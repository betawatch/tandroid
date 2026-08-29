package sc;

import bd.p;
import i7.s7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class a implements f {
    public final g a;

    public a(g gVar) {
        this.a = gVar;
    }

    @Override // sc.h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // sc.h
    public f get(g gVar) {
        return s7.a(this, gVar);
    }

    @Override // sc.f
    public final g getKey() {
        return this.a;
    }

    @Override // sc.h
    public h minusKey(g gVar) {
        return s7.b(this, gVar);
    }

    @Override // sc.h
    public final h plus(h hVar) {
        return s7.c(this, hVar);
    }
}
