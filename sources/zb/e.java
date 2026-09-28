package zb;

import android.content.Context;
import x7.ha;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class e extends b2.g {
    public final qb.g b;

    public e(qb.g gVar) {
        super(4);
        this.b = gVar;
    }

    @Override // b2.g
    public final Object N0(Object obj) {
        yb.a aVar = (yb.a) obj;
        Context b10 = this.b.b();
        k6.e.b.getClass();
        return new f(aVar, k6.e.a(b10) >= 204700000 ? new a(b10, aVar) : new c(b10, aVar), ha.b());
    }
}
