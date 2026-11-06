package zd;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public interface a1 extends id.f {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    wd.b getChildren();

    l0 invokeOnCompletion(rd.l lVar);

    l0 invokeOnCompletion(boolean z9, boolean z10, rd.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(id.c cVar);

    boolean start();
}
