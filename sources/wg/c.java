package wg;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
