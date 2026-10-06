package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad b;

    public /* synthetic */ wc(ad adVar, int i10) {
        this.a = i10;
        this.b = adVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                ad adVar = this.b;
                adVar.getClass();
                ((org.telegram.ui.Components.t21) view).setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i5, adVar.b));
                break;
            default:
                if (view instanceof org.telegram.ui.Components.t21) {
                    org.telegram.ui.Components.t21 t21Var = (org.telegram.ui.Components.t21) view;
                    t21Var.setFallbackWallpaper(t21Var.G.a.b ? null : this.b.v);
                    break;
                }
                break;
        }
    }
}
