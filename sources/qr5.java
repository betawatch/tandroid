// default package

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qr5 extends AbstractOwnableSynchronizer implements Runnable {
    public final h4c a;

    public qr5(h4c h4cVar) {
        this.a = h4cVar;
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
