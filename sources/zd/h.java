package zd;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
