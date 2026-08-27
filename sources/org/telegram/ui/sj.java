package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class sj extends org.telegram.ui.Components.i11 {
    public final /* synthetic */ rn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(rn rnVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.e = rnVar;
    }

    @Override // org.telegram.ui.Components.i11, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        rn rnVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
        if (kVar.t() || rnVar.A9()) {
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
