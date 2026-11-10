package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class sv extends di.q {
    public final /* synthetic */ zw O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv(zw zwVar, Context context, zw zwVar2, int i7, int i10) {
        super(context, zwVar2, i7, i10);
        this.O0 = zwVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.f2) this.O0).actionBar;
        return !lVar.x() && super.dispatchTouchEvent(motionEvent);
    }
}
