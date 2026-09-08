package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class qx0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacyControlActivity b;

    public /* synthetic */ qx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.a = i10;
        this.b = privacyControlActivity;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.z0();
                break;
            case 1:
                this.b.finishFragment();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }
}
