package yd;

import td.e0;
import v7.w6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class s extends td.a implements ed.d {
    public final cd.c d;

    public s(cd.c cVar, cd.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override // td.u1
    public void b(Object obj) {
        a.g(e0.r(obj), w6.b(this.d));
    }

    @Override // td.u1
    public void g(Object obj) {
        this.d.resumeWith(e0.r(obj));
    }

    @Override // ed.d
    public final ed.d getCallerFrame() {
        cd.c cVar = this.d;
        if (cVar instanceof ed.d) {
            return (ed.d) cVar;
        }
        return null;
    }

    @Override // td.u1
    public final boolean z() {
        return true;
    }
}
