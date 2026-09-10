package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                ((org.telegram.ui.Components.i21) view).setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i5, adVar.b));
                break;
            default:
                if (view instanceof org.telegram.ui.Components.i21) {
                    org.telegram.ui.Components.i21 i21Var = (org.telegram.ui.Components.i21) view;
                    i21Var.setFallbackWallpaper(i21Var.G.a.b ? null : this.b.v);
                    break;
                }
                break;
        }
    }
}
