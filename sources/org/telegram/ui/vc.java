package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                ((org.telegram.ui.Components.k21) view).setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i5, zcVar.b));
                break;
            default:
                if (view instanceof org.telegram.ui.Components.k21) {
                    org.telegram.ui.Components.k21 k21Var = (org.telegram.ui.Components.k21) view;
                    k21Var.setFallbackWallpaper(k21Var.G.a.b ? null : this.b.v);
                    break;
                }
                break;
        }
    }
}
