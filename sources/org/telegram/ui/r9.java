package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class r9 extends org.telegram.ui.ActionBar.f3 {
    public final q9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d5[] c;
    public final /* synthetic */ u9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(Activity activity, org.telegram.ui.ActionBar.d5[] d5VarArr, int i10, u9 u9Var) {
        super(activity, false);
        this.c = d5VarArr;
        this.d = u9Var;
        d5VarArr[0].setFragmentStack(new ArrayList());
        q9 q9Var = new q9(this, i10);
        this.b = q9Var;
        q9Var.w = true;
        ((ActionBarLayout) d5VarArr[0]).c(-1, q9Var);
        ((ActionBarLayout) d5VarArr[0]).c0();
        ViewGroup view = d5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        q9Var.L = u9Var;
        if (u9Var.I0() != null) {
            q9Var.b.setText(u9Var.I0());
        }
        this.containerView = d5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new r5(this, 1));
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
