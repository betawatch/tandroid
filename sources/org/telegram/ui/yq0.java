package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class yq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.ml0 d;
    public int e;
    public final /* synthetic */ ar0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq0(ar0 ar0Var, Context context) {
        super(context);
        this.f = ar0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        yq0 yq0Var;
        super.setTranslationX(f7);
        ar0 ar0Var = this.f;
        yq0[] yq0VarArr = ar0Var.n;
        if (ar0Var.s && (yq0Var = yq0VarArr[0]) == this) {
            ar0Var.h.j(Math.abs(yq0Var.getTranslationX()) / yq0VarArr[0].getMeasuredWidth(), yq0VarArr[1].e);
        }
    }
}
