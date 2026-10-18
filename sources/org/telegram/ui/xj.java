package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class xj extends org.telegram.ui.Components.v21 {
    public final /* synthetic */ sn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(sn snVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.e = snVar;
    }

    @Override // org.telegram.ui.Components.v21, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        sn snVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
        if (kVar.s() || snVar.F9()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            invalidate();
        }
        super.setTranslationY(f7);
    }
}
