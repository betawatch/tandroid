package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
