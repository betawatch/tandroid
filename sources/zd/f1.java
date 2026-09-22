package zd;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
