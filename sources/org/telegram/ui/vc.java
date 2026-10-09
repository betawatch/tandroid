package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                ((org.telegram.ui.Components.z21) view).setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i5, zcVar.b));
                break;
            default:
                if (view instanceof org.telegram.ui.Components.z21) {
                    org.telegram.ui.Components.z21 z21Var = (org.telegram.ui.Components.z21) view;
                    z21Var.setFallbackWallpaper(z21Var.G.a.b ? null : this.b.v);
                    break;
                }
                break;
        }
    }
}
