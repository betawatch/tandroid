package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class s9 extends org.telegram.ui.ActionBar.f3 {
    public final r9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d5[] c;
    public final /* synthetic */ v9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(Activity activity, org.telegram.ui.ActionBar.d5[] d5VarArr, int i10, v9 v9Var) {
        super(activity, false);
        this.c = d5VarArr;
        this.d = v9Var;
        d5VarArr[0].setFragmentStack(new ArrayList());
        r9 r9Var = new r9(this, i10);
        this.b = r9Var;
        r9Var.x = true;
        ((ActionBarLayout) d5VarArr[0]).c(-1, r9Var);
        ((ActionBarLayout) d5VarArr[0]).c0();
        ViewGroup view = d5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        r9Var.M = v9Var;
        if (v9Var.p0() != null) {
            r9Var.c.setText(v9Var.p0());
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
