package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class v40 extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ v50 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v40(v50 v50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = v50Var;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        v50 v50Var = this.o;
        if (v50Var.f3 != this) {
            return;
        }
        v50Var.f3 = null;
        AnimatorSet animatorSet = v50Var.e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            v50Var.e3 = null;
        }
        v50Var.Y.X = true;
        v50Var.e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(v50Var.W2, org.telegram.ui.Components.v6.b, 0));
        v50Var.e3.playTogether(arrayList);
        v50Var.e3.setDuration(220L);
        v50Var.e3.addListener(new org.telegram.ui.Components.h31(this, 29));
        v50Var.e3.start();
    }
}
