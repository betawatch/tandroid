package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qj extends org.telegram.ui.Components.g11 {
    public final /* synthetic */ qn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj(qn qnVar, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, b6Var);
        this.e = qnVar;
    }

    @Override // org.telegram.ui.Components.g11, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        qn qnVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        if (kVar.s() || qnVar.A9()) {
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
