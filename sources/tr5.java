// default package

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class tr5 extends AbstractOwnableSynchronizer implements Runnable {
    public final h6c a;

    public tr5(h6c h6cVar) {
        this.a = h6cVar;
    }

    public final void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
