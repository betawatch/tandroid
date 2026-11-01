package td;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public interface f1 extends cd.f {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    qd.b getChildren();

    f1 getParent();

    o0 invokeOnCompletion(ld.l lVar);

    o0 invokeOnCompletion(boolean z10, boolean z11, ld.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(cd.c cVar);

    boolean start();
}
