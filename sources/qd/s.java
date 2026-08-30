package qd;

import k7.g8;
import ld.e0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class s extends ld.a implements wc.d {
    public final uc.c d;

    public s(uc.c cVar, uc.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override // ld.u1
    public void f(Object obj) {
        a.g(e0.r(obj), g8.b(this.d));
    }

    @Override // ld.u1
    public void g(Object obj) {
        this.d.resumeWith(e0.r(obj));
    }

    @Override // wc.d
    public final wc.d getCallerFrame() {
        uc.c cVar = this.d;
        if (cVar instanceof wc.d) {
            return (wc.d) cVar;
        }
        return null;
    }

    @Override // ld.u1
    public final boolean z() {
        return true;
    }
}
