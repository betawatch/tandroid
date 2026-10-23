package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class s9 extends org.telegram.ui.ActionBar.h3 {
    public final r9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h5[] c;
    public final /* synthetic */ v9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(Activity activity, org.telegram.ui.ActionBar.h5[] h5VarArr, int i10, v9 v9Var) {
        super(activity, false);
        this.c = h5VarArr;
        this.d = v9Var;
        h5VarArr[0].setFragmentStack(new ArrayList());
        r9 r9Var = new r9(this, i10);
        this.b = r9Var;
        r9Var.x = true;
        ((ActionBarLayout) h5VarArr[0]).c(-1, r9Var);
        ((ActionBarLayout) h5VarArr[0]).d0();
        ViewGroup view = h5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        r9Var.M = v9Var;
        if (v9Var.p0() != null) {
            r9Var.c.setText(v9Var.p0());
        }
        this.containerView = h5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new v5(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        this.c[0] = null;
        this.d.onDismiss();
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.c;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[0];
        if (h5Var == null || h5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) h5VarArr[0]).H();
        }
    }
}
