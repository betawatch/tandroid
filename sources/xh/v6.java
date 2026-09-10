package xh;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class v6 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h3[] b;

    public v6(boolean[] zArr, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.a = zArr;
        this.b = h3VarArr;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.h3 h3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.a[0] && (h3Var = this.b[0]) != null) {
            h3Var.dismiss();
        }
    }
}
