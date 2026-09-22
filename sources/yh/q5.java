package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.pc;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class q5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ q5(t5 t5Var, int i10) {
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
                pc pcVar = t5Var.d;
                u5 u5Var = t5Var.q;
                q5 q5Var = t5Var.p;
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
                    AndroidUtilities.cancelRunOnUIThread(q5Var);
                    AndroidUtilities.runOnUIThread(q5Var, 5000L);
                    pcVar.k(true);
                    pcVar.v = q5Var;
                }
                t5Var.e.b.setText(t5Var.d());
                break;
        }
    }
}
