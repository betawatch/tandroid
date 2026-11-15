package wi;

import org.telegram.messenger.g0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                    g0.i3(this, 500L);
                    break;
                }
                break;
            default:
                h hVar2 = this.b;
                if (!hVar2.b.q()) {
                    hVar2.u = false;
                    hVar2.o(false);
                    hVar2.w = false;
                    break;
                } else {
                    g0.i3(this, 1500L);
                    break;
                }
        }
    }
}
