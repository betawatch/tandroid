package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zc b;

    public /* synthetic */ vc(zc zcVar, int i10) {
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
                if (view instanceof org.telegram.ui.Components.e31) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.i5, zcVar.b));
                    break;
                }
                break;
            default:
                if (view instanceof org.telegram.ui.Components.e31) {
                    org.telegram.ui.Components.e31 e31Var = (org.telegram.ui.Components.e31) view;
                    e31Var.setFallbackWallpaper(e31Var.G.a.b ? null : this.b.v);
                    break;
                }
                break;
        }
    }
}
