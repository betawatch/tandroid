package ug;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ pf.c c;

    public /* synthetic */ e(AtomicBoolean atomicBoolean, pf.c cVar, int i10) {
        this.a = i10;
        this.b = atomicBoolean;
        this.c = cVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        pf.c cVar;
        switch (this.a) {
            case 0:
                if (!this.b.get()) {
                    this.c.b();
                    break;
                }
                break;
            default:
                if (!this.b.get() && (cVar = this.c) != null) {
                    cVar.b();
                    break;
                }
                break;
        }
    }
}
