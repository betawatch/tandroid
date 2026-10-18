package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class t9 extends org.telegram.ui.ActionBar.f3 {
    public final s9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d5[] c;
    public final /* synthetic */ x9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(Activity activity, org.telegram.ui.ActionBar.d5[] d5VarArr, int i10, boolean z10, x9 x9Var) {
        super(activity, false);
        this.c = d5VarArr;
        this.d = x9Var;
        d5VarArr[0].setFragmentStack(new ArrayList());
        s9 s9Var = new s9(this, i10);
        this.b = s9Var;
        s9Var.y = true;
        s9Var.X = z10;
        ((ActionBarLayout) d5VarArr[0]).c(-1, s9Var);
        ((ActionBarLayout) d5VarArr[0]).c0();
        ViewGroup view = d5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        s9Var.N = x9Var;
        if (x9Var.p0() != null) {
            s9Var.c.setText(x9Var.p0());
        }
        this.containerView = d5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new w5(this, 1));
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
        org.telegram.ui.ActionBar.d5[] d5VarArr = this.c;
        org.telegram.ui.ActionBar.d5 d5Var = d5VarArr[0];
        if (d5Var == null || d5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) d5VarArr[0]).G();
        }
    }
}
