package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xt extends FrameLayout {
    public org.telegram.ui.ActionBar.d2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.tj0 d;
    public ci.j1 e;
    public int f;
    public final /* synthetic */ yt h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt(yt ytVar, Context context) {
        super(context);
        this.h = ytVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        xt xtVar;
        super.setTranslationX(f10);
        yt ytVar = this.h;
        xt[] xtVarArr = ytVar.f;
        if (ytVar.n && (xtVar = xtVarArr[0]) == this) {
            ytVar.e.i(Math.abs(xtVar.getTranslationX()) / xtVarArr[0].getMeasuredWidth(), xtVarArr[1].f);
        }
    }
}
