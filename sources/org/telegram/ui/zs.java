package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class zs extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ ct o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs(ct ctVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = ctVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        gt gtVar = this.o.a;
        gtVar.k = null;
        gtVar.K = false;
        if (gtVar.R) {
            gtVar.n();
        }
        View view = gtVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.e8) {
                ((org.telegram.ui.Cells.e8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.c8) {
                ((org.telegram.ui.Cells.c8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.f2) {
                ((org.telegram.ui.Cells.f2) view).setScaled(false);
            }
            gtVar.h = null;
        }
    }
}
