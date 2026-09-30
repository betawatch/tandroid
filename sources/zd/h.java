package zd;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
