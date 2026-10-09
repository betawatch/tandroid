package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.tc;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5 b;

    public /* synthetic */ j5(l5 l5Var, int i10) {
        this.a = i10;
        this.b = l5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        l5 l5Var = this.b;
        switch (i10) {
            case 0:
                l5Var.b();
                break;
            case 1:
                l5Var.a();
                break;
            default:
                tc tcVar = l5Var.d;
                m5 m5Var = l5Var.q;
                j5 j5Var = l5Var.p;
                MessageObject messageObject = l5Var.b;
                if (!l5Var.l) {
                    l5Var.l = true;
                    messageObject.addPaidReactions((int) l5Var.k, true, l5Var.c());
                    long j3 = m5Var.g;
                    int i11 = m5Var.a;
                    m5Var.g = j3 + l5Var.k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    l5Var.k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!l5Var.m) {
                    l5Var.m = true;
                    l5Var.f.b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(j5Var);
                    AndroidUtilities.runOnUIThread(j5Var, 5000L);
                    tcVar.k(true);
                    tcVar.v = j5Var;
                }
                l5Var.e.b.setText(l5Var.d());
                break;
        }
    }
}
