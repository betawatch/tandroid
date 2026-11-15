package wg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ vf.b c;

    public /* synthetic */ e(AtomicBoolean atomicBoolean, vf.b bVar, int i7) {
        this.a = i7;
        this.b = atomicBoolean;
        this.c = bVar;
    }

    @Override // org.telegram.messenger.z10
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
