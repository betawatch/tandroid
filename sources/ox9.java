// default package

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class ox9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wx9 b;
    public final /* synthetic */ long c;

    public /* synthetic */ ox9(wx9 wx9Var, long j, byte b) {
        this.a = b;
        this.b = wx9Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 2;
        long j = this.c;
        byte b3 = 1;
        wx9 wx9Var = this.b;
        switch (b) {
            case 0:
                zh6 zh6Var = wx9Var.getMessagesController().R;
                long j2 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) zh6Var.f(j2);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    wx9Var.getMessagesController().S.l(dialog.id);
                }
                wx9Var.getMessagesStorage().a.c(new ox9(wx9Var, j2, b3));
                kf7 messagesStorage = wx9Var.getMessagesStorage();
                messagesStorage.a.c(new id7(messagesStorage, 1, j2, (byte) 0));
                wx9Var.getNotificationCenter().k(3, new Object[0]);
                wx9Var.getNotificationCenter().k(42, Long.valueOf(j2), Boolean.FALSE, null);
                break;
            case 1:
                hl.c3(new ox9(wx9Var, j, b2));
                break;
            case 2:
                ip7 notificationsController = wx9Var.getNotificationsController();
                long j3 = this.c;
                notificationsController.L(null, j3, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j3, 0);
                wx9Var.getNotificationsController().J(longSparseIntArray);
                break;
            default:
                wx9Var.getMessagesController().V(0, j, false);
                break;
        }
    }
}
