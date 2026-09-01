package qd;

import k7.h8;
import ld.e0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class s extends ld.a implements wc.d {
    public final uc.c d;

    public s(uc.c cVar, uc.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override // ld.u1
    public void f(Object obj) {
        a.g(e0.r(obj), h8.b(this.d));
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
