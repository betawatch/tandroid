package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class zq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.zl0 d;
    public int e;
    public final /* synthetic */ br0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq0(br0 br0Var, Context context) {
        super(context);
        this.f = br0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        zq0 zq0Var;
        super.setTranslationX(f7);
        br0 br0Var = this.f;
        zq0[] zq0VarArr = br0Var.n;
        if (br0Var.s && (zq0Var = zq0VarArr[0]) == this) {
            br0Var.h.j(Math.abs(zq0Var.getTranslationX()) / zq0VarArr[0].getMeasuredWidth(), zq0VarArr[1].e);
        }
    }
}
