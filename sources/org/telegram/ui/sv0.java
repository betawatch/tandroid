package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tv0 b;

    public /* synthetic */ sv0(tv0 tv0Var, int i7) {
        this.a = i7;
        this.b = tv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.m0;
                hv0 hv0Var = profileActivity.N5;
                if (hv0Var != null) {
                    hv0Var.dismiss();
                    profileActivity.N5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.pj0 currentListView = this.b.g0.N.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
        }
    }
}
