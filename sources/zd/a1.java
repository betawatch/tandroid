package zd;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public interface a1 extends id.f {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    wd.b getChildren();

    l0 invokeOnCompletion(rd.l lVar);

    l0 invokeOnCompletion(boolean z10, boolean z11, rd.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(id.c cVar);

    boolean start();
}
