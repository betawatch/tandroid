package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tx extends org.telegram.ui.Components.s00 {
    public final /* synthetic */ ey B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx(ey eyVar, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.B0 = eyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.n3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
