package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xc implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd b;

    public /* synthetic */ xc(bd bdVar, int i10) {
        this.a = i10;
        this.b = bdVar;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                bd bdVar = this.b;
                bdVar.getClass();
                ((org.telegram.ui.Components.w11) view).setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i5, bdVar.b));
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
