package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class tj extends org.telegram.ui.Components.s11 {
    public final /* synthetic */ tn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(tn tnVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.e = tnVar;
    }

    @Override // org.telegram.ui.Components.s11, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        tn tnVar = this.e;
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        if (lVar.s() || tnVar.A9()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setTranslationY(float f9) {
        if (getTranslationY() != f9) {
            invalidate();
        }
        super.setTranslationY(f9);
    }
}
