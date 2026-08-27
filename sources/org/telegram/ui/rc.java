package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rc implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc b;

    public /* synthetic */ rc(vc vcVar, int i10) {
        this.a = i10;
        this.b = vcVar;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                vc vcVar = this.b;
                vcVar.getClass();
                ((org.telegram.ui.Components.b11) view).setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i5, vcVar.b));
                break;
            default:
                if (view instanceof org.telegram.ui.Components.b11) {
                    org.telegram.ui.Components.b11 b11Var = (org.telegram.ui.Components.b11) view;
                    b11Var.setFallbackWallpaper(b11Var.C.a.b ? null : this.b.v);
                    break;
                }
                break;
        }
    }
}
