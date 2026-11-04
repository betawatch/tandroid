package wd;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h extends a {
    public final Thread d;
    public final t0 e;

    public h(fd.h hVar, Thread thread, t0 t0Var) {
        super(hVar, true);
        this.d = thread;
        this.e = t0Var;
    }

    @Override // wd.n1
    public final void g(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.d;
        if (kotlin.jvm.internal.j.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
