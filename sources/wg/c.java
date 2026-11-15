package wg;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
