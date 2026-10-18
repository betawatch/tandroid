package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class s40 extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ s50 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s40(s50 s50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = s50Var;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        s50 s50Var = this.o;
        if (s50Var.f3 != this) {
            return;
        }
        s50Var.f3 = null;
        AnimatorSet animatorSet = s50Var.e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            s50Var.e3 = null;
        }
        s50Var.Y.X = true;
        s50Var.e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(s50Var.W2, org.telegram.ui.Components.t6.b, 0));
        s50Var.e3.playTogether(arrayList);
        s50Var.e3.setDuration(220L);
        s50Var.e3.addListener(new org.telegram.ui.Components.n31(this, 27));
        s50Var.e3.start();
    }
}
