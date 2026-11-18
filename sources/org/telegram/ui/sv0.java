package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                ProfileActivity profileActivity = this.b.n0;
                hv0 hv0Var = profileActivity.T5;
                if (hv0Var != null) {
                    hv0Var.dismiss();
                    profileActivity.T5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.ck0 currentListView = this.b.h0.O.getCurrentListView();
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
