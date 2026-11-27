// default package

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
