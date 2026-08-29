package qd;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import jd.x0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class h extends x0 {
    public c c;

    @Override // jd.a0
    public final void c(sc.h hVar, Runnable runnable) {
        c cVar = this.c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.n;
        cVar.b(runnable, k.g);
    }
}
