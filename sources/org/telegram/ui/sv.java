package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class sv extends fi.q {
    public final /* synthetic */ bx P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv(bx bxVar, Context context, bx bxVar2, int i7, int i10) {
        super(context, bxVar2, i7, i10);
        this.P0 = bxVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.g2) this.P0).actionBar;
        return !kVar.x() && super.dispatchTouchEvent(motionEvent);
    }
}
