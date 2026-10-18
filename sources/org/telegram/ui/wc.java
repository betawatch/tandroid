package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd b;

    public /* synthetic */ wc(bd bdVar, int i10) {
        this.a = i10;
        this.b = bdVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                bd bdVar = this.b;
                bdVar.getClass();
                ((org.telegram.ui.Components.p21) view).setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i5, bdVar.b));
                break;
            default:
                if (view instanceof org.telegram.ui.Components.p21) {
                    org.telegram.ui.Components.p21 p21Var = (org.telegram.ui.Components.p21) view;
                    p21Var.setFallbackWallpaper(p21Var.G.a.b ? null : this.b.v);
                    break;
                }
                break;
        }
    }
}
