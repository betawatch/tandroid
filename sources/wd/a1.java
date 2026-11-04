package wd;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public interface a1 extends fd.f {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    td.b getChildren();

    l0 invokeOnCompletion(od.l lVar);

    l0 invokeOnCompletion(boolean z10, boolean z11, od.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(fd.c cVar);

    boolean start();
}
