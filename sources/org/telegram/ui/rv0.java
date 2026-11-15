package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                fv0 fv0Var = profileActivity.R5;
                if (fv0Var != null) {
                    fv0Var.dismiss();
                    profileActivity.R5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.uj0 currentListView = this.b.h0.O.getCurrentListView();
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
