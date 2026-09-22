package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ yc b;

    public /* synthetic */ uc(yc ycVar, int i10) {
        this.a = i10;
        this.b = ycVar;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                yc ycVar = this.b;
                ycVar.getClass();
                ((org.telegram.ui.Components.u11) view).setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i5, ycVar.b));
                break;
            default:
                if (view instanceof org.telegram.ui.Components.u11) {
                    org.telegram.ui.Components.u11 u11Var = (org.telegram.ui.Components.u11) view;
                    u11Var.setFallbackWallpaper(u11Var.G.a.b ? null : this.b.v);
                    break;
                }
                break;
        }
    }
}
