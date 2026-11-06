package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
