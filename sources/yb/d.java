package yb;

import a8.ab;
import android.content.Context;
import bi.b1;
import h2.p0;
import pb.g;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
