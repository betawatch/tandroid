// default package

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class xv9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dw9 b;
    public final /* synthetic */ long c;

    public /* synthetic */ xv9(dw9 dw9Var, long j, byte b) {
        this.a = b;
        this.b = dw9Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 2;
        long j = this.c;
        byte b3 = 1;
        dw9 dw9Var = this.b;
        switch (b) {
            case 0:
                vh6 vh6Var = dw9Var.getMessagesController().R;
                long j2 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) vh6Var.f(j2);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    dw9Var.getMessagesController().S.l(dialog.id);
                }
                dw9Var.getMessagesStorage().a.c(new xv9(dw9Var, j2, b3));
                cf7 messagesStorage = dw9Var.getMessagesStorage();
                messagesStorage.a.c(new cd7(messagesStorage, 1, j2, (byte) 1));
                dw9Var.getNotificationCenter().k(3, new Object[0]);
                dw9Var.getNotificationCenter().k(42, Long.valueOf(j2), Boolean.FALSE, null);
                break;
            case 1:
                gm.c3(new xv9(dw9Var, j, b2));
                break;
            case 2:
                lo7 notificationsController = dw9Var.getNotificationsController();
                long j3 = this.c;
                notificationsController.L(null, j3, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j3, 0);
                dw9Var.getNotificationsController().J(longSparseIntArray);
                break;
            default:
                dw9Var.getMessagesController().T(0, j, false);
                break;
        }
    }
}
