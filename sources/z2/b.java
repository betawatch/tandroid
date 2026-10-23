package z2;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import n6.l;
import y2.g;
import y2.i;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
