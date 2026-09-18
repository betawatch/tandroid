package tg;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;

    public /* synthetic */ f(AtomicBoolean atomicBoolean, int i10) {
        this.a = i10;
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
