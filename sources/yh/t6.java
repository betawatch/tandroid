package yh;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class t6 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e3[] b;

    public t6(boolean[] zArr, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.a = zArr;
        this.b = e3VarArr;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.e3 e3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.a[0] && (e3Var = this.b[0]) != null) {
            e3Var.dismiss();
        }
    }
}
