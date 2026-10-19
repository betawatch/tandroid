package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ s(z zVar, int i10) {
        this.a = i10;
        this.b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        z zVar = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.hideKeyboard(zVar.d);
                break;
            case 1:
                zVar.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, zVar.b0, Boolean.TRUE);
                break;
            case 2:
                zVar.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, zVar.b0, Boolean.FALSE);
                break;
            case 3:
                z.S(zVar);
                break;
            default:
                z.T(zVar);
                break;
        }
    }
}
