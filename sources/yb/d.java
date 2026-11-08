package yb;

import a8.ab;
import android.content.Context;
import bi.b1;
import h2.p0;
import pb.g;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class d extends b1 {
    public final g b;

    public d(g gVar) {
        super(4);
        this.b = gVar;
    }

    @Override // bi.b1
    public final Object Q0(Object obj) {
        xb.a aVar = (xb.a) obj;
        Context b10 = this.b.b();
        n6.e.b.getClass();
        return new e(aVar, n6.e.a(b10) >= 204700000 ? new p0(b10, aVar) : new b(b10, aVar), ab.d());
    }
}
