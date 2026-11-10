package wg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ vf.b c;

    public /* synthetic */ e(AtomicBoolean atomicBoolean, vf.b bVar, int i7) {
        this.a = i7;
        this.b = atomicBoolean;
        this.c = bVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        vf.b bVar;
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
