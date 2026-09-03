package sd;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import ld.x0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
