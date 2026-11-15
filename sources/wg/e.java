package wg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
