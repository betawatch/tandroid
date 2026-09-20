package z2;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import k4.d;
import org.telegram.ui.h71;
import y2.h;
import y2.j;
import y2.m;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class b implements h, h71 {
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
    public void F(j jVar, long j3, long j10, boolean z10) {
    }

    @Override // y2.h
    public /* synthetic */ void n(j jVar, long j3, long j10, int i10) {
    }
}
