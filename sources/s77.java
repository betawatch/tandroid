// default package

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class s77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ TL_update.TL_updatePeerBlocked c;

    public /* synthetic */ s77(uc7 uc7Var, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = tL_updatePeerBlocked;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        TL_update.TL_updatePeerBlocked tL_updatePeerBlocked = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new s77(uc7Var, tL_updatePeerBlocked, b2));
                break;
            default:
                long B1 = r47.B1(tL_updatePeerBlocked.peer_id);
                boolean z = tL_updatePeerBlocked.blocked;
                LongSparseIntArray longSparseIntArray = uc7Var.x0;
                if (!z) {
                    longSparseIntArray.delete(B1);
                } else if (longSparseIntArray.indexOfKey(B1) < 0) {
                    longSparseIntArray.put(B1, 1);
                }
                uc7Var.getNotificationCenter().k(44, new Object[0]);
                uc7Var.O1().m0(B1, tL_updatePeerBlocked.blocked_my_stories_from, false);
                break;
        }
    }
}
