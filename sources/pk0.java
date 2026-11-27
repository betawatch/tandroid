// default package

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pk0 extends c2 {
    public final Thread e;
    public final z44 f;

    public pk0(mx2 mx2Var, Thread thread, z44 z44Var) {
        super(mx2Var, true);
        this.e = thread;
        this.f = z44Var;
    }

    @Override // sv5
    public final void f(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.e;
        if (ur5.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
