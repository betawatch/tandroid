package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ nf.e c;

    public /* synthetic */ f(AtomicBoolean atomicBoolean, nf.e eVar, int i10) {
        this.a = i10;
        this.b = atomicBoolean;
        this.c = eVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        nf.e eVar;
        switch (this.a) {
            case 0:
                if (!this.b.get()) {
                    this.c.b();
                    break;
                }
                break;
            default:
                if (!this.b.get() && (eVar = this.c) != null) {
                    eVar.b();
                    break;
                }
                break;
        }
    }
}
