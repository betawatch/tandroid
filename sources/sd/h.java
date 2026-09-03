package sd;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import ld.x0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class h extends x0 {
    public c c;

    @Override // ld.a0
    public final void c(uc.h hVar, Runnable runnable) {
        c cVar = this.c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.n;
        cVar.b(runnable, k.g);
    }
}
