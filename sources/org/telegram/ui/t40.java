package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class t40 extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ u50 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t40(u50 u50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = u50Var;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        u50 u50Var = this.o;
        if (u50Var.f3 != this) {
            return;
        }
        u50Var.f3 = null;
        AnimatorSet animatorSet = u50Var.e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            u50Var.e3 = null;
        }
        u50Var.Y.X = true;
        u50Var.e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(u50Var.W2, org.telegram.ui.Components.t6.b, 0));
        u50Var.e3.playTogether(arrayList);
        u50Var.e3.setDuration(220L);
        u50Var.e3.addListener(new org.telegram.ui.Components.p31(this, 28));
        u50Var.e3.start();
    }
}
