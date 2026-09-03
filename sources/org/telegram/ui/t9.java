package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class t9 extends org.telegram.ui.ActionBar.g3 {
    public final s9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e5[] c;
    public final /* synthetic */ w9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(Activity activity, org.telegram.ui.ActionBar.e5[] e5VarArr, int i10, w9 w9Var) {
        super(activity, false);
        this.c = e5VarArr;
        this.d = w9Var;
        e5VarArr[0].setFragmentStack(new ArrayList());
        s9 s9Var = new s9(this, i10);
        this.b = s9Var;
        s9Var.w = true;
        ((ActionBarLayout) e5VarArr[0]).c(-1, s9Var);
        ((ActionBarLayout) e5VarArr[0]).c0();
        ViewGroup view = e5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        s9Var.I = w9Var;
        if (w9Var.C0() != null) {
            s9Var.b.setText(w9Var.C0());
        }
        this.containerView = e5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new x5(this, 1));
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
