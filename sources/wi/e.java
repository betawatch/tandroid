package wi;

import org.telegram.messenger.g0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
