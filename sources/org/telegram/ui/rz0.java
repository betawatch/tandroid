package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sz0 b;

    public /* synthetic */ rz0(sz0 sz0Var, int i10) {
        this.a = i10;
        this.b = sz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.A0;
                fz0 fz0Var = profileActivity.y5;
                if (fz0Var != null) {
                    fz0Var.dismiss();
                    profileActivity.y5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.tl0 currentListView = this.b.u0.L.getCurrentListView();
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
