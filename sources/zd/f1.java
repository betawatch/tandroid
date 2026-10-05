package zd;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public interface f1 extends id.f {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    wd.b getChildren();

    f1 getParent();

    o0 invokeOnCompletion(rd.l lVar);

    o0 invokeOnCompletion(boolean z10, boolean z11, rd.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(id.c cVar);

    boolean start();
}
