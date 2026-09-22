package yh;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class u6 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3[] b;

    public u6(boolean[] zArr, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.a = zArr;
        this.b = f3VarArr;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.f3 f3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.a[0] && (f3Var = this.b[0]) != null) {
            f3Var.dismiss();
        }
    }
}
