package xf;

import android.os.Bundle;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.tn;
import org.telegram.ui.ze1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ c(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (f6) notificationCenterDelegate, Boolean.TRUE, null, -1);
                break;
            default:
                ze1 ze1Var = (ze1) notificationCenterDelegate;
                if (ze1Var.getParentLayout() != null) {
                    ze1Var.D = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ze1Var.a);
                    tn tnVar = new tn(bundle);
                    tnVar.fa = true;
                    ze1Var.presentFragment(tnVar);
                    break;
                }
                break;
        }
    }
}
