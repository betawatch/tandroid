package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yj extends org.telegram.ui.Components.c21 {
    public final /* synthetic */ xn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(xn xnVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.e = xnVar;
    }

    @Override // org.telegram.ui.Components.c21, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        xn xnVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        if (kVar.s() || xnVar.A9()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            invalidate();
        }
        super.setTranslationY(f10);
    }
}
