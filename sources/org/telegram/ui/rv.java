package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class rv extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.mm0 d;
    public bi.o0 e;
    public int f;
    public final /* synthetic */ sv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv(sv svVar, Context context) {
        super(context);
        this.h = svVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        rv rvVar;
        super.setTranslationX(f7);
        sv svVar = this.h;
        rv[] rvVarArr = svVar.f;
        if (svVar.n && (rvVar = rvVarArr[0]) == this) {
            svVar.e.j(Math.abs(rvVar.getTranslationX()) / rvVarArr[0].getMeasuredWidth(), rvVarArr[1].f);
        }
    }
}
