package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class u9 extends org.telegram.ui.ActionBar.e3 {
    public final t9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b5[] c;
    public final /* synthetic */ y9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(Activity activity, org.telegram.ui.ActionBar.b5[] b5VarArr, int i10, boolean z10, y9 y9Var) {
        super(activity, false);
        this.c = b5VarArr;
        this.d = y9Var;
        b5VarArr[0].setFragmentStack(new ArrayList());
        t9 t9Var = new t9(this, i10);
        this.b = t9Var;
        t9Var.x = true;
        t9Var.W = z10;
        ((ActionBarLayout) b5VarArr[0]).c(-1, t9Var);
        ((ActionBarLayout) b5VarArr[0]).c0();
        ViewGroup view = b5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        t9Var.M = y9Var;
        if (y9Var.I0() != null) {
            t9Var.b.setText(y9Var.I0());
        }
        this.containerView = b5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new v5(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        this.c[0] = null;
        this.d.onDismiss();
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.b5[] b5VarArr = this.c;
        org.telegram.ui.ActionBar.b5 b5Var = b5VarArr[0];
        if (b5Var == null || b5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) b5VarArr[0]).G();
        }
    }
}
