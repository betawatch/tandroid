package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ys extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ at o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys(at atVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = atVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        et etVar = this.o.a;
        etVar.k = null;
        etVar.K = false;
        if (etVar.R) {
            etVar.n();
        }
    }
}
