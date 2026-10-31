package yh;

import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                l.a0(lVar);
                break;
            default:
                zs notificationCenter = lVar.getNotificationCenter();
                int i11 = vp.D8;
                notificationCenter.k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
        }
    }
}
