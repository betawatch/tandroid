package wi;

import org.telegram.messenger.g0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                if (hVar.b.j()) {
                    g0.h3(this, 500L);
                    break;
                }
                break;
            default:
                h hVar2 = this.b;
                if (!hVar2.b.l0()) {
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
