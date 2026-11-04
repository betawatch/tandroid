package vb;

import android.content.Context;
import ci.u0;
import g2.q0;
import mb.g;
import z7.fa;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends u0 {
    public final g b;

    public d(g gVar) {
        super(4);
        this.b = gVar;
    }

    @Override // ci.u0
    public final Object Q0(Object obj) {
        ub.a aVar = (ub.a) obj;
        Context b10 = this.b.b();
        m6.e.b.getClass();
        return new e(aVar, m6.e.a(b10) >= 204700000 ? new q0(b10, aVar) : new b(b10, aVar), fa.b());
    }
}
