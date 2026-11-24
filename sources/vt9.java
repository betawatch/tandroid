// default package

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class vt9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bu9 b;
    public final /* synthetic */ long c;

    public /* synthetic */ vt9(bu9 bu9Var, long j, byte b) {
        this.a = b;
        this.b = bu9Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 2;
        long j = this.c;
        byte b3 = 1;
        bu9 bu9Var = this.b;
        switch (b) {
            case 0:
                vf6 vf6Var = bu9Var.getMessagesController().R;
                long j2 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) vf6Var.f(j2);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    bu9Var.getMessagesController().S.l(dialog.id);
                }
                bu9Var.getMessagesStorage().a.c(new vt9(bu9Var, j2, b3));
                ad7 messagesStorage = bu9Var.getMessagesStorage();
                messagesStorage.a.c(new bb7(messagesStorage, 1, j2, (byte) 1));
                bu9Var.getNotificationCenter().k(3, new Object[0]);
                bu9Var.getNotificationCenter().k(41, Long.valueOf(j2), Boolean.FALSE, null);
                break;
            case 1:
                gl.d3(new vt9(bu9Var, j, b2));
                break;
            case 2:
                im7 notificationsController = bu9Var.getNotificationsController();
                long j3 = this.c;
                notificationsController.L(null, j3, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j3, 0);
                bu9Var.getNotificationsController().J(longSparseIntArray);
                break;
            default:
                bu9Var.getMessagesController().T(0, j, false);
                break;
        }
    }
}
