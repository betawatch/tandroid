package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ r5(t5 t5Var, int i10) {
        this.a = i10;
        this.b = t5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        t5 t5Var = this.b;
        switch (i10) {
            case 0:
                t5Var.b();
                break;
            case 1:
                t5Var.a();
                break;
            default:
                oc ocVar = t5Var.d;
                u5 u5Var = t5Var.q;
                r5 r5Var = t5Var.p;
                MessageObject messageObject = t5Var.b;
                if (!t5Var.l) {
                    t5Var.l = true;
                    messageObject.addPaidReactions((int) t5Var.k, true, t5Var.c());
                    long j3 = u5Var.g;
                    int i11 = u5Var.a;
                    u5Var.g = j3 + t5Var.k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    t5Var.k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!t5Var.m) {
                    t5Var.m = true;
                    t5Var.f.b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(r5Var);
                    AndroidUtilities.runOnUIThread(r5Var, 5000L);
                    ocVar.k(true);
                    ocVar.v = r5Var;
                }
                t5Var.e.b.setText(t5Var.d());
                break;
        }
    }
}
