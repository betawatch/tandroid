// default package

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qp5 extends AbstractOwnableSynchronizer implements Runnable {
    public final h2c a;

    public qp5(h2c h2cVar) {
        this.a = h2cVar;
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
