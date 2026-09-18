package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5 b;

    public /* synthetic */ q5(s5 s5Var, int i10) {
        this.a = i10;
        this.b = s5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        s5 s5Var = this.b;
        switch (i10) {
            case 0:
                s5Var.b();
                break;
            case 1:
                s5Var.a();
                break;
            default:
                qc qcVar = s5Var.d;
                t5 t5Var = s5Var.q;
                q5 q5Var = s5Var.p;
                MessageObject messageObject = s5Var.b;
                if (!s5Var.l) {
                    s5Var.l = true;
                    messageObject.addPaidReactions((int) s5Var.k, true, s5Var.c());
                    long j3 = t5Var.g;
                    int i11 = t5Var.a;
                    t5Var.g = j3 + s5Var.k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    s5Var.k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!s5Var.m) {
                    s5Var.m = true;
                    s5Var.f.b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(q5Var);
                    AndroidUtilities.runOnUIThread(q5Var, 5000L);
                    qcVar.k(true);
                    qcVar.v = q5Var;
                }
                s5Var.e.b.setText(s5Var.d());
                break;
        }
    }
}
