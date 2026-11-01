package sb;

import android.content.Context;
import b2.h;
import e2.o0;
import jb.g;
import x7.ia;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class d extends h {
    public final g b;

    public d(g gVar) {
        super(3);
        this.b = gVar;
    }

    @Override // b2.h
    public final Object Q0(Object obj) {
        rb.a aVar = (rb.a) obj;
        Context b10 = this.b.b();
        k6.e.b.getClass();
        return new e(aVar, k6.e.a(b10) >= 204700000 ? new o0(b10, aVar) : new b(b10, aVar), ia.b());
    }
}
