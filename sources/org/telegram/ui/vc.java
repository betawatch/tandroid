package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vc implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ zc b;

    public /* synthetic */ vc(zc zcVar, int i10) {
        this.a = i10;
        this.b = zcVar;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                zc zcVar = this.b;
                zcVar.getClass();
                ((org.telegram.ui.Components.w11) view).setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i5, zcVar.b));
                break;
            default:
                if (view instanceof org.telegram.ui.Components.w11) {
                    org.telegram.ui.Components.w11 w11Var = (org.telegram.ui.Components.w11) view;
                    w11Var.setFallbackWallpaper(w11Var.D.a.b ? null : this.b.v);
                    break;
                }
                break;
        }
    }
}
