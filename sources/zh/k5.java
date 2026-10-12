package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.sc;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class k5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;

    public /* synthetic */ k5(m5 m5Var, int i10) {
        this.a = i10;
        this.b = m5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        m5 m5Var = this.b;
        switch (i10) {
            case 0:
                m5Var.b();
                break;
            case 1:
                m5Var.a();
                break;
            default:
                sc scVar = m5Var.d;
                n5 n5Var = m5Var.q;
                k5 k5Var = m5Var.p;
                MessageObject messageObject = m5Var.b;
                if (!m5Var.l) {
                    m5Var.l = true;
                    messageObject.addPaidReactions((int) m5Var.k, true, m5Var.c());
                    long j10 = n5Var.g;
                    int i11 = n5Var.a;
                    n5Var.g = j10 + m5Var.k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    m5Var.k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!m5Var.m) {
                    m5Var.m = true;
                    m5Var.f.b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(k5Var);
                    AndroidUtilities.runOnUIThread(k5Var, 5000L);
                    scVar.k(true);
                    scVar.v = k5Var;
                }
                m5Var.e.b.setText(m5Var.d());
                break;
        }
    }
}
