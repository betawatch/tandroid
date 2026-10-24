package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zc b;

    public /* synthetic */ uc(zc zcVar, int i10) {
        this.a = i10;
        this.b = zcVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                zc zcVar = this.b;
                zcVar.getClass();
                if (view instanceof org.telegram.ui.Components.v21) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, zcVar.b));
                    break;
                }
                break;
            default:
                if (view instanceof org.telegram.ui.Components.v21) {
                    org.telegram.ui.Components.v21 v21Var = (org.telegram.ui.Components.v21) view;
                    v21Var.setFallbackWallpaper(v21Var.G.a.b ? null : this.b.v);
                    break;
                }
                break;
        }
    }
}
