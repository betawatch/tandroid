package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tz0 b;

    public /* synthetic */ sz0(tz0 tz0Var, int i10) {
        this.a = i10;
        this.b = tz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.s0;
                fz0 fz0Var = profileActivity.H5;
                if (fz0Var != null) {
                    fz0Var.dismiss();
                    profileActivity.H5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.mm0 currentListView = this.b.m0.N.getCurrentListView();
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
