package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class zj extends org.telegram.ui.Components.z11 {
    public final /* synthetic */ xn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(xn xnVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.e = xnVar;
    }

    @Override // org.telegram.ui.Components.z11, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        xn xnVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
        if (kVar.s() || xnVar.A9()) {
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
