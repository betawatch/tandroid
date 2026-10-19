package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class vj extends org.telegram.ui.Components.w21 {
    public final /* synthetic */ qn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(qn qnVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.e = qnVar;
    }

    @Override // org.telegram.ui.Components.w21, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        qn qnVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        if (kVar.t() || qnVar.F9()) {
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
