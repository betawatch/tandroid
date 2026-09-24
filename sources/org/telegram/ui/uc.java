package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                ((org.telegram.ui.Components.h21) view).setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.i5, ycVar.b));
                break;
            default:
                if (view instanceof org.telegram.ui.Components.h21) {
                    org.telegram.ui.Components.h21 h21Var = (org.telegram.ui.Components.h21) view;
                    h21Var.setFallbackWallpaper(h21Var.G.a.b ? null : this.b.v);
                    break;
                }
                break;
        }
    }
}
