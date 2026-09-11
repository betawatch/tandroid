package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class o5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r5 b;

    public /* synthetic */ o5(r5 r5Var, int i10) {
        this.a = i10;
        this.b = r5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        r5 r5Var = this.b;
        switch (i10) {
            case 0:
                r5Var.b();
                break;
            case 1:
                r5Var.a();
                break;
            default:
                qc qcVar = r5Var.d;
                s5 s5Var = r5Var.q;
                o5 o5Var = r5Var.p;
                MessageObject messageObject = r5Var.b;
                if (!r5Var.l) {
                    r5Var.l = true;
                    messageObject.addPaidReactions((int) r5Var.k, true, r5Var.c());
                    long j3 = s5Var.g;
                    int i11 = s5Var.a;
                    s5Var.g = j3 + r5Var.k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    r5Var.k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!r5Var.m) {
                    r5Var.m = true;
                    r5Var.f.b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(o5Var);
                    AndroidUtilities.runOnUIThread(o5Var, 5000L);
                    qcVar.k(true);
                    qcVar.v = o5Var;
                }
                r5Var.e.b.setText(r5Var.d());
                break;
        }
    }
}
