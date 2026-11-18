package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class tv extends fi.q {
    public final /* synthetic */ cx P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv(cx cxVar, Context context, cx cxVar2, int i7, int i10) {
        super(context, cxVar2, i7, i10);
        this.P0 = cxVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.h2) this.P0).actionBar;
        return !kVar.y() && super.dispatchTouchEvent(motionEvent);
    }
}
