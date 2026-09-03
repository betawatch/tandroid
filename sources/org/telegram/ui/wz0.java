package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xz0 b;

    public /* synthetic */ wz0(xz0 xz0Var, int i10) {
        this.a = i10;
        this.b = xz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.A0;
                jz0 jz0Var = profileActivity.y5;
                if (jz0Var != null) {
                    jz0Var.dismiss();
                    profileActivity.y5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.rl0 currentListView = this.b.u0.L.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
        }
    }
}
