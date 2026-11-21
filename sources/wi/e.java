package wi;

import org.telegram.messenger.g0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ e(h hVar, int i7) {
        this.a = i7;
        this.b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h hVar = this.b;
                hVar.q();
                if (hVar.b.h()) {
                    g0.h3(this, 500L);
                    break;
                }
                break;
            default:
                h hVar2 = this.b;
                if (!hVar2.b.s()) {
                    hVar2.u = false;
                    hVar2.o(false);
                    hVar2.w = false;
                    break;
                } else {
                    g0.h3(this, 1500L);
                    break;
                }
        }
    }
}
