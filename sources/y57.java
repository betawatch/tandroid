// default package

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class y57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ y57(na7 na7Var, long j, int i, boolean z, int i2, int i3, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = j;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.h = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int i;
        switch (this.a) {
            case 0:
                na7 na7Var = this.b;
                im7 notificationsController = na7Var.getNotificationsController();
                long j = this.c;
                notificationsController.L(null, j, this.d, 0, this.e);
                TLRPC.Dialog dialog = (TLRPC.Dialog) na7Var.R.f(j);
                if (dialog != null) {
                    int i2 = dialog.unread_count;
                    int i3 = this.f;
                    if (i3 != 0) {
                        int i4 = dialog.top_message;
                        int i5 = this.h;
                        if (i5 > i4) {
                            int max = Math.max(i2 - i3, 0);
                            dialog.unread_count = max;
                            if (i5 != Integer.MAX_VALUE && max > (i = i5 - dialog.top_message)) {
                                dialog.unread_count = i;
                            }
                            z = dialog.unread_mark;
                            if (z) {
                                dialog.unread_mark = false;
                                na7Var.getMessagesStorage().C1(dialog.id, false);
                            }
                            if ((i2 == 0 || z) && dialog.unread_count == 0) {
                                na7Var.n2(j, 0L, null);
                                if (na7Var.j0()) {
                                    na7Var.Z4(null);
                                    na7Var.getNotificationCenter().k(3, new Object[0]);
                                }
                            }
                            na7Var.getNotificationCenter().k(2, 256);
                        }
                    }
                    dialog.unread_count = 0;
                    z = dialog.unread_mark;
                    if (z) {
                    }
                    if (i2 == 0) {
                    }
                    na7Var.n2(j, 0L, null);
                    if (na7Var.j0()) {
                    }
                    na7Var.getNotificationCenter().k(2, 256);
                }
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j, 0);
                na7Var.getNotificationsController().J(longSparseIntArray);
                break;
            default:
                gl.c3(new y57(this.b, this.c, this.d, this.e, this.f, this.h, (byte) 0));
                break;
        }
    }
}
