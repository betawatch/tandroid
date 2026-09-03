package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class r9 extends org.telegram.ui.ActionBar.h3 {
    public final q9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f5[] c;
    public final /* synthetic */ u9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(Activity activity, org.telegram.ui.ActionBar.f5[] f5VarArr, int i10, u9 u9Var) {
        super(activity, false);
        this.c = f5VarArr;
        this.d = u9Var;
        f5VarArr[0].setFragmentStack(new ArrayList());
        q9 q9Var = new q9(this, i10);
        this.b = q9Var;
        q9Var.w = true;
        ((ActionBarLayout) f5VarArr[0]).c(-1, q9Var);
        ((ActionBarLayout) f5VarArr[0]).c0();
        ViewGroup view = f5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        q9Var.I = u9Var;
        if (u9Var.E0() != null) {
            q9Var.b.setText(u9Var.E0());
        }
        this.containerView = f5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new v5(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        this.c[0] = null;
        this.d.onDismiss();
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.f5[] f5VarArr = this.c;
        org.telegram.ui.ActionBar.f5 f5Var = f5VarArr[0];
        if (f5Var == null || f5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) f5VarArr[0]).G();
        }
    }
}
