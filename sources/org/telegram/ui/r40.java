package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r40 extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ r50 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r40(r50 r50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = r50Var;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        r50 r50Var = this.o;
        if (r50Var.b3 != this) {
            return;
        }
        r50Var.b3 = null;
        AnimatorSet animatorSet = r50Var.a3;
        if (animatorSet != null) {
            animatorSet.cancel();
            r50Var.a3 = null;
        }
        r50Var.U.X = true;
        r50Var.a3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(r50Var.S2, org.telegram.ui.Components.r6.b, 0));
        r50Var.a3.playTogether(arrayList);
        r50Var.a3.setDuration(220L);
        r50Var.a3.addListener(new org.telegram.ui.Components.p11(this, 29));
        r50Var.a3.start();
    }
}
