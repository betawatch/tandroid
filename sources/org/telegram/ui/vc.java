package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
                ((org.telegram.ui.Components.j21) view).setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i5, zcVar.b));
                break;
            default:
                if (view instanceof org.telegram.ui.Components.j21) {
                    org.telegram.ui.Components.j21 j21Var = (org.telegram.ui.Components.j21) view;
                    j21Var.setFallbackWallpaper(j21Var.G.a.b ? null : this.b.v);
                    break;
                }
                break;
        }
    }
}
