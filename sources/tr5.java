// default package

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
