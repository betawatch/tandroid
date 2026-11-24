// default package

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class tm0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicBoolean b;

    public /* synthetic */ tm0(AtomicBoolean atomicBoolean, byte b) {
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
