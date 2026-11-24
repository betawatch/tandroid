// default package

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tn0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicBoolean b;

    public /* synthetic */ tn0(AtomicBoolean atomicBoolean, byte b) {
        this.a = b;
        this.b = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        AtomicBoolean atomicBoolean = this.b;
        switch (b) {
            case 0:
                atomicBoolean.set(true);
                break;
            default:
                atomicBoolean.set(true);
                break;
        }
    }
}
