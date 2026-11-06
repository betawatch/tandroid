package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class zt extends FrameLayout {
    public org.telegram.ui.ActionBar.f2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.pj0 d;
    public bi.q1 e;
    public int f;
    public final /* synthetic */ au h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt(au auVar, Context context) {
        super(context);
        this.h = auVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        zt ztVar;
        super.setTranslationX(f10);
        au auVar = this.h;
        zt[] ztVarArr = auVar.f;
        if (auVar.n && (ztVar = ztVarArr[0]) == this) {
            auVar.e.i(Math.abs(ztVar.getTranslationX()) / ztVarArr[0].getMeasuredWidth(), ztVarArr[1].f);
        }
    }
}
