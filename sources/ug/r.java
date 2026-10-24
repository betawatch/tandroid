package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;

    public /* synthetic */ r(y yVar, int i10) {
        this.a = i10;
        this.b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        y yVar = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.hideKeyboard(yVar.d);
                break;
            case 1:
                yVar.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, yVar.b0, Boolean.TRUE);
                break;
            case 2:
                yVar.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, yVar.b0, Boolean.FALSE);
                break;
            case 3:
                y.R(yVar);
                break;
            default:
                y.S(yVar);
                break;
        }
    }
}
