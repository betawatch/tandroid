package zd;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class h extends a {
    public final Thread d;
    public final w0 e;

    public h(id.h hVar, Thread thread, w0 w0Var) {
        super(hVar, true);
        this.d = thread;
        this.e = w0Var;
    }

    @Override // zd.u1
    public final void f(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.d;
        if (kotlin.jvm.internal.i.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
