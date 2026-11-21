package wg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ vf.b c;

    public /* synthetic */ e(AtomicBoolean atomicBoolean, vf.b bVar, int i7) {
        this.a = i7;
        this.b = atomicBoolean;
        this.c = bVar;
    }

    @Override // org.telegram.messenger.x10
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
