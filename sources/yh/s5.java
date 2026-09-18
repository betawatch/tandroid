package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u5 b;

    public /* synthetic */ s5(u5 u5Var, int i10) {
        this.a = i10;
        this.b = u5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        u5 u5Var = this.b;
        switch (i10) {
            case 0:
                u5Var.b();
                break;
            case 1:
                u5Var.a();
                break;
            default:
                oc ocVar = u5Var.d;
                v5 v5Var = u5Var.q;
                s5 s5Var = u5Var.p;
                MessageObject messageObject = u5Var.b;
                if (!u5Var.l) {
                    u5Var.l = true;
                    messageObject.addPaidReactions((int) u5Var.k, true, u5Var.c());
                    long j3 = v5Var.g;
                    int i11 = v5Var.a;
                    v5Var.g = j3 + u5Var.k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    u5Var.k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!u5Var.m) {
                    u5Var.m = true;
                    u5Var.f.b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(s5Var);
                    AndroidUtilities.runOnUIThread(s5Var, 5000L);
                    ocVar.k(true);
                    ocVar.v = s5Var;
                }
                u5Var.e.b.setText(u5Var.d());
                break;
        }
    }
}
