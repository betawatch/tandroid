package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class u9 extends org.telegram.ui.ActionBar.k3 {
    public final t9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.j5[] c;
    public final /* synthetic */ x9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(Activity activity, org.telegram.ui.ActionBar.j5[] j5VarArr, int i10, x9 x9Var) {
        super(activity, false);
        this.c = j5VarArr;
        this.d = x9Var;
        j5VarArr[0].setFragmentStack(new ArrayList());
        t9 t9Var = new t9(this, i10);
        this.b = t9Var;
        t9Var.x = true;
        ((ActionBarLayout) j5VarArr[0]).c(-1, t9Var);
        ((ActionBarLayout) j5VarArr[0]).e0();
        ViewGroup view = j5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        t9Var.M = x9Var;
        if (x9Var.H0() != null) {
            t9Var.c.setText(x9Var.H0());
        }
        this.containerView = j5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new u5(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        this.c[0] = null;
        this.d.onDismiss();
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.c;
        org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[0];
        if (j5Var == null || j5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) j5VarArr[0]).H();
        }
    }
}
