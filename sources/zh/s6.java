package zh;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class s6 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3[] b;

    public s6(boolean[] zArr, org.telegram.ui.ActionBar.f3[] f3VarArr) {
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
