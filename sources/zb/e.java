package zb;

import android.content.Context;
import x7.ha;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
