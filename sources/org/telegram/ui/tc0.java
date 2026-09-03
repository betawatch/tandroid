package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class tc0 extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ bd0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc0(bd0 bd0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = bd0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        this.o.F0 = null;
    }
}
