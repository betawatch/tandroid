package wg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ vf.b c;

    public /* synthetic */ e(AtomicBoolean atomicBoolean, vf.b bVar, int i7) {
        this.a = i7;
        this.b = atomicBoolean;
        this.c = bVar;
    }

    @Override // org.telegram.messenger.w10
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
