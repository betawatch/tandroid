// default package

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class p77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ TL_update.TL_updatePeerBlocked c;

    public /* synthetic */ p77(oc7 oc7Var, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = tL_updatePeerBlocked;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        TL_update.TL_updatePeerBlocked tL_updatePeerBlocked = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new p77(oc7Var, tL_updatePeerBlocked, b2));
                break;
            default:
                long B1 = k47.B1(tL_updatePeerBlocked.peer_id);
                boolean z = tL_updatePeerBlocked.blocked;
                LongSparseIntArray longSparseIntArray = oc7Var.x0;
                if (!z) {
                    longSparseIntArray.delete(B1);
                } else if (longSparseIntArray.indexOfKey(B1) < 0) {
                    longSparseIntArray.put(B1, 1);
                }
                oc7Var.getNotificationCenter().k(44, new Object[0]);
                oc7Var.N1().m0(B1, tL_updatePeerBlocked.blocked_my_stories_from, false);
                break;
        }
    }
}
