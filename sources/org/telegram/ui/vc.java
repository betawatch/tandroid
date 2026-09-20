package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class vc implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ zc b;

    public /* synthetic */ vc(zc zcVar, int i10) {
        this.a = i10;
        this.b = zcVar;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                zc zcVar = this.b;
                zcVar.getClass();
                ((org.telegram.ui.Components.i21) view).setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i5, zcVar.b));
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
