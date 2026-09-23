package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ yc b;

    public /* synthetic */ uc(yc ycVar, int i10) {
        this.a = i10;
        this.b = ycVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                yc ycVar = this.b;
                ycVar.getClass();
                ((org.telegram.ui.Components.t11) view).setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.i5, ycVar.b));
                break;
            default:
                if (view instanceof org.telegram.ui.Components.t11) {
                    org.telegram.ui.Components.t11 t11Var = (org.telegram.ui.Components.t11) view;
                    t11Var.setFallbackWallpaper(t11Var.G.a.b ? null : this.b.v);
                    break;
                }
                break;
        }
    }
}
