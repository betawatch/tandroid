package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class vj extends org.telegram.ui.Components.b31 {
    public final /* synthetic */ sn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(sn snVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, g6Var);
        this.e = snVar;
    }

    @Override // org.telegram.ui.Components.b31, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        sn snVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
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
