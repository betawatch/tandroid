package zd;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
