package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tc implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xc b;

    public /* synthetic */ tc(xc xcVar, int i10) {
        this.a = i10;
        this.b = xcVar;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                xc xcVar = this.b;
                xcVar.getClass();
                if (view instanceof org.telegram.ui.Components.f11) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i5, xcVar.b));
                    break;
                }
                break;
            default:
                if (view instanceof org.telegram.ui.Components.f11) {
                    org.telegram.ui.Components.f11 f11Var = (org.telegram.ui.Components.f11) view;
                    f11Var.setFallbackWallpaper(f11Var.G.a.b ? null : this.b.w);
                    break;
                }
                break;
        }
    }
}
