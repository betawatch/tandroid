package zb;

import android.content.Context;
import x7.ha;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
