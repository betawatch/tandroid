package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class qv extends fi.q {
    public final /* synthetic */ yw P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv(yw ywVar, Context context, yw ywVar2, int i7, int i10) {
        super(context, ywVar2, i7, i10);
        this.P0 = ywVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.e2) this.P0).actionBar;
        return !kVar.x() && super.dispatchTouchEvent(motionEvent);
    }
}
