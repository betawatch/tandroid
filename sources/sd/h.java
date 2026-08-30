package sd;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import ld.x0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
