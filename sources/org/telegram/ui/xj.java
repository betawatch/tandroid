package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
