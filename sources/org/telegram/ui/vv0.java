package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wv0 b;

    public /* synthetic */ vv0(wv0 wv0Var, int i7) {
        this.a = i7;
        this.b = wv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.m0;
                kv0 kv0Var = profileActivity.P5;
                if (kv0Var != null) {
                    kv0Var.dismiss();
                    profileActivity.P5 = null;
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
