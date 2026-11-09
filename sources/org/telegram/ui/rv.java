package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class rv extends di.q {
    public final /* synthetic */ yw O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv(yw ywVar, Context context, yw ywVar2, int i7, int i10) {
        super(context, ywVar2, i7, i10);
        this.O0 = ywVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.f2) this.O0).actionBar;
        return !kVar.w() && super.dispatchTouchEvent(motionEvent);
    }
}
