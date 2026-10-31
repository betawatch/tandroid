package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tc implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xc b;

    public /* synthetic */ tc(xc xcVar, int i10) {
        this.a = i10;
        this.b = xcVar;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                xc xcVar = this.b;
                xcVar.getClass();
                if (view instanceof org.telegram.ui.Components.e11) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i5, xcVar.b));
                    break;
                }
                break;
            default:
                if (view instanceof org.telegram.ui.Components.e11) {
                    org.telegram.ui.Components.e11 e11Var = (org.telegram.ui.Components.e11) view;
                    e11Var.setFallbackWallpaper(e11Var.G.a.b ? null : this.b.w);
                    break;
                }
                break;
        }
    }
}
