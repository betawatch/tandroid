package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
