package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s40 extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ s50 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s40(s50 s50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = s50Var;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        s50 s50Var = this.o;
        if (s50Var.b3 != this) {
            return;
        }
        s50Var.b3 = null;
        AnimatorSet animatorSet = s50Var.a3;
        if (animatorSet != null) {
            animatorSet.cancel();
            s50Var.a3 = null;
        }
        s50Var.U.X = true;
        s50Var.a3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(s50Var.S2, org.telegram.ui.Components.m6.b, 0));
        s50Var.a3.playTogether(arrayList);
        s50Var.a3.setDuration(220L);
        s50Var.a3.addListener(new org.telegram.ui.Components.f11(this, 29));
        s50Var.a3.start();
    }
}
