package w3;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class c implements y2.g {
    public final Object a;

    public /* synthetic */ c(Object obj) {
        this.a = obj;
    }

    @Override // y2.g
    public k4.d j(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        ((l2.d) this.a).a.y(iOException);
        return y2.l.e;
    }

    @Override // y2.g
    public void l(y2.i iVar, long j10, long j11) {
        boolean z10;
        l2.d dVar = (l2.d) this.a;
        synchronized (z2.b.b) {
            z10 = z2.b.c;
        }
        if (z10) {
            dVar.a();
        } else {
            dVar.a.y(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // y2.g
    public void B(y2.i iVar, long j10, long j11, boolean z10) {
    }

    @Override // y2.g
    public /* synthetic */ void k(y2.i iVar, long j10, long j11, int i10) {
    }
}
