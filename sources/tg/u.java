package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ u(b0 b0Var, int i10) {
        this.a = i10;
        this.b = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        b0 b0Var = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.hideKeyboard(b0Var.d);
                break;
            case 1:
                b0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, b0Var.b0, Boolean.TRUE);
                break;
            case 2:
                b0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, b0Var.b0, Boolean.FALSE);
                break;
            case 3:
                b0.R(b0Var);
                break;
            default:
                b0.S(b0Var);
                break;
        }
    }
}
