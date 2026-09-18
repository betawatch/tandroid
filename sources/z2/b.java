package z2;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import k4.d;
import org.telegram.ui.e71;
import y2.h;
import y2.j;
import y2.m;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class b implements h, e71 {
    public final Object a;

    public /* synthetic */ b(Object obj) {
        this.a = obj;
    }

    @Override // y2.h
    public d m(j jVar, long j3, long j10, IOException iOException, int i10) {
        ((l2.d) this.a).a.x(iOException);
        return m.e;
    }

    @Override // y2.h
    public void o(j jVar, long j3, long j10) {
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

    @Override // y2.h
    public void E(j jVar, long j3, long j10, boolean z10) {
    }

    @Override // y2.h
    public /* synthetic */ void n(j jVar, long j3, long j10, int i10) {
    }
}
