// default package

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class x77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ x77(oc7 oc7Var, long j, int i, boolean z, int i2, int i3, byte b) {
        this.a = b;
        this.b = oc7Var;
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
                oc7 oc7Var = this.b;
                lo7 notificationsController = oc7Var.getNotificationsController();
                long j = this.c;
                notificationsController.L(null, j, this.d, 0, this.e);
                TLRPC.Dialog dialog = (TLRPC.Dialog) oc7Var.R.f(j);
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
                                oc7Var.getMessagesStorage().C1(dialog.id, false);
                            }
                            if ((i2 == 0 || z) && dialog.unread_count == 0) {
                                oc7Var.o2(j, 0L, null);
                                if (oc7Var.j0()) {
                                    oc7Var.b5(null);
                                    oc7Var.getNotificationCenter().k(3, new Object[0]);
                                }
                            }
                            oc7Var.getNotificationCenter().k(2, 256);
                        }
                    }
                    dialog.unread_count = 0;
                    z = dialog.unread_mark;
                    if (z) {
                    }
                    if (i2 == 0) {
                    }
                    oc7Var.o2(j, 0L, null);
                    if (oc7Var.j0()) {
                    }
                    oc7Var.getNotificationCenter().k(2, 256);
                }
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j, 0);
                oc7Var.getNotificationsController().J(longSparseIntArray);
                break;
            default:
                gm.c3(new x77(this.b, this.c, this.d, this.e, this.f, this.h, (byte) 0));
                break;
        }
    }
}
