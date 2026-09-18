package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad b;

    public /* synthetic */ wc(ad adVar, int i10) {
        this.a = i10;
        this.b = adVar;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                ad adVar = this.b;
                adVar.getClass();
                ((org.telegram.ui.Components.v11) view).setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i5, adVar.b));
                break;
            default:
                if (view instanceof org.telegram.ui.Components.v11) {
                    org.telegram.ui.Components.v11 v11Var = (org.telegram.ui.Components.v11) view;
                    v11Var.setFallbackWallpaper(v11Var.G.a.b ? null : this.b.v);
                    break;
                }
                break;
        }
    }
}
