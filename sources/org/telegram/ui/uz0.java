package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vz0 b;

    public /* synthetic */ uz0(vz0 vz0Var, int i10) {
        this.a = i10;
        this.b = vz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.s0;
                hz0 hz0Var = profileActivity.H5;
                if (hz0Var != null) {
                    hz0Var.dismiss();
                    profileActivity.H5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.nm0 currentListView = this.b.m0.N.getCurrentListView();
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
