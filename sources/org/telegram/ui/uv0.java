package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vv0 b;

    public /* synthetic */ uv0(vv0 vv0Var, int i7) {
        this.a = i7;
        this.b = vv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.m0;
                jv0 jv0Var = profileActivity.P5;
                if (jv0Var != null) {
                    jv0Var.dismiss();
                    profileActivity.P5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.qj0 currentListView = this.b.g0.N.getCurrentListView();
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
