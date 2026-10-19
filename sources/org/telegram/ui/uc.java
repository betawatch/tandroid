package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                ((org.telegram.ui.Components.q21) view).setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i5, zcVar.b));
                break;
            default:
                if (view instanceof org.telegram.ui.Components.q21) {
                    org.telegram.ui.Components.q21 q21Var = (org.telegram.ui.Components.q21) view;
                    q21Var.setFallbackWallpaper(q21Var.G.a.b ? null : this.b.v);
                    break;
                }
                break;
        }
    }
}
