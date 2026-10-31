package td;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
