package tg;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;

    public /* synthetic */ d(AtomicBoolean atomicBoolean, int i10) {
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
