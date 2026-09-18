package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class s9 extends org.telegram.ui.ActionBar.g3 {
    public final r9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e5[] c;
    public final /* synthetic */ v9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(Activity activity, org.telegram.ui.ActionBar.e5[] e5VarArr, int i10, v9 v9Var) {
        super(activity, false);
        this.c = e5VarArr;
        this.d = v9Var;
        e5VarArr[0].setFragmentStack(new ArrayList());
        r9 r9Var = new r9(this, i10);
        this.b = r9Var;
        r9Var.w = true;
        ((ActionBarLayout) e5VarArr[0]).c(-1, r9Var);
        ((ActionBarLayout) e5VarArr[0]).c0();
        ViewGroup view = e5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        r9Var.L = v9Var;
        if (v9Var.J0() != null) {
            r9Var.b.setText(v9Var.J0());
        }
        this.containerView = e5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new r5(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
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
