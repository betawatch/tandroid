package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class zj extends org.telegram.ui.Components.z21 {
    public final /* synthetic */ yn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(yn ynVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.e = ynVar;
    }

    @Override // org.telegram.ui.Components.z21, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        yn ynVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        if (kVar.s() || ynVar.z9()) {
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
