package z2;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import k4.d;
import org.telegram.ui.y61;
import y2.g;
import y2.i;
import y2.l;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class b implements g, y61 {
    public final Object a;

    public /* synthetic */ b(Object obj) {
        this.a = obj;
    }

    @Override // y2.g
    public d m(i iVar, long j3, long j10, IOException iOException, int i10) {
        ((l2.d) this.a).a.x(iOException);
        return l.e;
    }

    @Override // y2.g
    public void o(i iVar, long j3, long j10) {
        boolean z10;
        l2.d dVar = (l2.d) this.a;
        synchronized (c.b) {
            z10 = c.c;
        }
        if (z10) {
            dVar.a();
        } else {
            dVar.a.x(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // y2.g
    public void E(i iVar, long j3, long j10, boolean z10) {
    }

    @Override // y2.g
    public /* synthetic */ void n(i iVar, long j3, long j10, int i10) {
    }
}
