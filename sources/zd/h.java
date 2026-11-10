package zd;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class h extends a {
    public final Thread d;
    public final t0 e;

    public h(id.h hVar, Thread thread, t0 t0Var) {
        super(hVar, true);
        this.d = thread;
        this.e = t0Var;
    }

    @Override // zd.n1
    public final void g(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.d;
        if (kotlin.jvm.internal.j.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
