package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z20 extends org.telegram.ui.ActionBar.f1 {
    public final /* synthetic */ x30 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z20(x30 x30Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = x30Var;
    }

    @Override // org.telegram.ui.ActionBar.f1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        x30 x30Var = this.o;
        if (x30Var.X4 != this) {
            return;
        }
        x30Var.X4 = null;
        AnimatorSet animatorSet = x30Var.W4;
        if (animatorSet != null) {
            animatorSet.cancel();
            x30Var.W4 = null;
        }
        x30Var.Q1.X = true;
        x30Var.W4 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(x30Var.O4, org.telegram.ui.Components.k6.b, 0));
        x30Var.W4.playTogether(arrayList);
        x30Var.W4.setDuration(220L);
        x30Var.W4.addListener(new y20(this, 0));
        x30Var.W4.start();
    }
}
