// default package

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
