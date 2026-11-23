package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sv0 b;

    public /* synthetic */ rv0(sv0 sv0Var, int i7) {
        this.a = i7;
        this.b = sv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.n0;
                gv0 gv0Var = profileActivity.T5;
                if (gv0Var != null) {
                    gv0Var.dismiss();
                    profileActivity.T5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.ek0 currentListView = this.b.h0.O.getCurrentListView();
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
