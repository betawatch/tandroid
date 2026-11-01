package yh;

import org.telegram.messenger.at;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ g(l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        l lVar = this.b;
        switch (i10) {
            case 0:
                l.b0(lVar);
                break;
            default:
                at notificationCenter = lVar.getNotificationCenter();
                int i11 = wp.D8;
                notificationCenter.k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
        }
    }
}
