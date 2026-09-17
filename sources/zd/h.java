package zd;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
