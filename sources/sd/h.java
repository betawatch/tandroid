package sd;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import ld.x0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
