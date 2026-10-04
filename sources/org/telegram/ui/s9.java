package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class s9 extends org.telegram.ui.ActionBar.f3 {
    public final r9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c5[] c;
    public final /* synthetic */ v9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(Activity activity, org.telegram.ui.ActionBar.c5[] c5VarArr, int i10, v9 v9Var) {
        super(activity, false);
        this.c = c5VarArr;
        this.d = v9Var;
        c5VarArr[0].setFragmentStack(new ArrayList());
        r9 r9Var = new r9(this, i10);
        this.b = r9Var;
        r9Var.w = true;
        ((ActionBarLayout) c5VarArr[0]).c(-1, r9Var);
        ((ActionBarLayout) c5VarArr[0]).c0();
        ViewGroup view = c5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        r9Var.L = v9Var;
        if (v9Var.J0() != null) {
            r9Var.b.setText(v9Var.J0());
        }
        this.containerView = c5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new s5(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.c[0] = null;
        this.d.onDismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.c5[] c5VarArr = this.c;
        org.telegram.ui.ActionBar.c5 c5Var = c5VarArr[0];
        if (c5Var == null || c5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) c5VarArr[0]).G();
        }
    }
}
