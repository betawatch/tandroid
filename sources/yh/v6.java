package yh;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class v6 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g3[] b;

    public v6(boolean[] zArr, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.a = zArr;
        this.b = g3VarArr;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.g3 g3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.a[0] && (g3Var = this.b[0]) != null) {
            g3Var.dismiss();
        }
    }
}
