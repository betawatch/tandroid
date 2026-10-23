package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ys extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ dt o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys(dt dtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = dtVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ht htVar = this.o.a;
        htVar.k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.l();
        }
    }
}
