package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ t(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a0 a0Var = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.hideKeyboard(a0Var.d);
                break;
            case 1:
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.b0, Boolean.TRUE);
                break;
            case 2:
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.b0, Boolean.FALSE);
                break;
            case 3:
                a0.P(a0Var);
                break;
            default:
                a0.Q(a0Var);
                break;
        }
    }
}
