package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class zj extends org.telegram.ui.Components.n21 {
    public final /* synthetic */ wn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(wn wnVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.e = wnVar;
    }

    @Override // org.telegram.ui.Components.n21, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        wn wnVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        if (kVar.s() || wnVar.A9()) {
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
