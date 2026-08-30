package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class r9 extends org.telegram.ui.ActionBar.g3 {
    public final q9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e5[] c;
    public final /* synthetic */ u9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(Activity activity, org.telegram.ui.ActionBar.e5[] e5VarArr, int i10, u9 u9Var) {
        super(activity, false);
        this.c = e5VarArr;
        this.d = u9Var;
        e5VarArr[0].setFragmentStack(new ArrayList());
        q9 q9Var = new q9(this, i10);
        this.b = q9Var;
        q9Var.w = true;
        ((ActionBarLayout) e5VarArr[0]).c(-1, q9Var);
        ((ActionBarLayout) e5VarArr[0]).c0();
        ViewGroup view = e5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        q9Var.I = u9Var;
        if (u9Var.G0() != null) {
            q9Var.b.setText(u9Var.G0());
        }
        this.containerView = e5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new v5(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        this.c[0] = null;
        this.d.onDismiss();
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.e5[] e5VarArr = this.c;
        org.telegram.ui.ActionBar.e5 e5Var = e5VarArr[0];
        if (e5Var == null || e5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) e5VarArr[0]).G();
        }
    }
}
