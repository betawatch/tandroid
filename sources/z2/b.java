package z2;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import n6.l;
import y2.g;
import y2.i;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class b implements g {
    public final Object a;

    public b(x6.a aVar) {
        l.h(aVar);
        this.a = aVar;
    }

    @Override // y2.g
    public k4.d e(i iVar, long j10, long j11, IOException iOException, int i10) {
        ((l2.d) this.a).a.y(iOException);
        return y2.l.e;
    }

    @Override // y2.g
    public void k(i iVar, long j10, long j11) {
        boolean z10;
        l2.d dVar = (l2.d) this.a;
        synchronized (c.b) {
            z10 = c.c;
        }
        if (z10) {
            dVar.a();
        } else {
            dVar.a.y(new IOException(new ConcurrentModificationException()));
        }
    }

    public b(l2.d dVar) {
        this.a = dVar;
    }

    @Override // y2.g
    public void J(i iVar, long j10, long j11, boolean z10) {
    }

    @Override // y2.g
    public /* synthetic */ void h(i iVar, long j10, long j11, int i10) {
    }
}
