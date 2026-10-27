package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class x40 extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ x50 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x40(x50 x50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = x50Var;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        x50 x50Var = this.o;
        if (x50Var.f3 != this) {
            return;
        }
        x50Var.f3 = null;
        AnimatorSet animatorSet = x50Var.e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            x50Var.e3 = null;
        }
        x50Var.Y.X = true;
        x50Var.e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(x50Var.W2, org.telegram.ui.Components.v6.b, 0));
        x50Var.e3.playTogether(arrayList);
        x50Var.e3.setDuration(220L);
        x50Var.e3.addListener(new org.telegram.ui.Components.i31(this, 29));
        x50Var.e3.start();
    }
}
