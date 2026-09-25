package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class wq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.wl0 d;
    public int e;
    public final /* synthetic */ yq0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq0(yq0 yq0Var, Context context) {
        super(context);
        this.f = yq0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        wq0 wq0Var;
        super.setTranslationX(f7);
        yq0 yq0Var = this.f;
        wq0[] wq0VarArr = yq0Var.n;
        if (yq0Var.s && (wq0Var = wq0VarArr[0]) == this) {
            yq0Var.h.j(Math.abs(wq0Var.getTranslationX()) / wq0VarArr[0].getMeasuredWidth(), wq0VarArr[1].e);
        }
    }
}
