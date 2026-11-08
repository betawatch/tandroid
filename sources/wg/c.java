package wg;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;

    public /* synthetic */ c(AtomicBoolean atomicBoolean, int i7) {
        this.a = i7;
        this.b = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.set(true);
                break;
            default:
                this.b.set(true);
                break;
        }
    }
}
