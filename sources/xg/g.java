package xg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ sf.b c;

    public /* synthetic */ g(AtomicBoolean atomicBoolean, sf.b bVar, int i3) {
        this.a = i3;
        this.b = atomicBoolean;
        this.c = bVar;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        sf.b bVar;
        switch (this.a) {
            case 0:
                if (!this.b.get()) {
                    this.c.b();
                    break;
                }
                break;
            default:
                if (!this.b.get() && (bVar = this.c) != null) {
                    bVar.b();
                    break;
                }
                break;
        }
    }
}
