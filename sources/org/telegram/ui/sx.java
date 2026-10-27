package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class sx extends org.telegram.ui.ActionBar.s0 {
    public final /* synthetic */ ey a;

    public sx(ey eyVar) {
        this.a = eyVar;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final boolean b() {
        ey eyVar = this.a;
        org.telegram.ui.ActionBar.w0 w0Var = eyVar.D1;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (eyVar.n2 == null) {
            return true;
        }
        eyVar.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        ey eyVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
        return !kVar.q() && eyVar.R3 == null;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void h() {
        oi.q qVar;
        ey eyVar = this.a;
        rx rxVar = eyVar.X;
        if (rxVar != null) {
            ArrayList arrayList = rxVar.F;
            if (!arrayList.isEmpty() && rxVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((ig.p0) arrayList.get(i10)).h) {
                        ((lx) rxVar.H).f((ig.p0) arrayList.get(i10));
                    }
                }
            }
        }
        eyVar.j2 = false;
        eyVar.k2 = false;
        dy dyVar = eyVar.e0[0];
        if (dyVar != null) {
            dyVar.a.setEmptyView(eyVar.W2 == 0 ? dyVar.w : null);
            eyVar.W4(false, false, true, false);
        }
        eyVar.i5(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        eyVar.X.setCloseButtonVisible(false);
        eyVar.h5(true);
        eyVar.J3();
        qVar = ((org.telegram.ui.ActionBar.r2) eyVar).glassEngine;
        qVar.g();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void i() {
        org.telegram.ui.ActionBar.k kVar;
        oi.q qVar;
        org.telegram.ui.Components.xo0 xo0Var;
        org.telegram.ui.Components.xo0 xo0Var2;
        ey eyVar = this.a;
        eyVar.j2 = true;
        org.telegram.ui.ActionBar.w0 w0Var = eyVar.D1;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        eyVar.U3();
        dy dyVar = eyVar.e0[0];
        if (dyVar != null) {
            if (eyVar.n2 != null) {
                dyVar.a.c1();
                mx mxVar = eyVar.C0;
                if (mxVar != null) {
                    bi.r1 r1Var = mxVar.a0;
                    if (r1Var.g1) {
                        r1Var.g1 = false;
                        r1Var.K0(false);
                    }
                }
            }
            if (!eyVar.l2) {
                fi.v3 v3Var = eyVar.p0;
                if (v3Var != null) {
                    v3Var.e(true);
                }
                fi.v3 v3Var2 = eyVar.q0;
                if (v3Var2 != null) {
                    v3Var2.e(true);
                }
            }
        }
        sw swVar = eyVar.E0;
        if (swVar != null && swVar.getPremiumHint() != null) {
            eyVar.E0.getPremiumHint().e(true);
        }
        if (!eyVar.K) {
            eyVar.K4(0.0f);
        }
        eyVar.i5(false, false);
        kVar = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        qVar = ((org.telegram.ui.ActionBar.r2) eyVar).glassEngine;
        qVar.g();
        mx mxVar2 = eyVar.C0;
        if (mxVar2 != null && (xo0Var2 = mxVar2.d0) != null) {
            xo0Var2.c = ig.f0.d;
        }
        if ((mxVar2 != null && (xo0Var = mxVar2.d0) != null && xo0Var.M()) || eyVar.getMessagesController().getTotalDialogsCount() > 10 || eyVar.t3 || eyVar.K) {
            eyVar.k2 = true;
            if (!eyVar.q3) {
                eyVar.W4(true, false, true, false);
            }
        }
        eyVar.X.setCloseButtonVisible(true);
        eyVar.h5(true);
        eyVar.J3();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void l(EditText editText) {
        mx mxVar;
        org.telegram.ui.Components.xo0 xo0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        ey eyVar = this.a;
        if (!isEmpty || (((mxVar = eyVar.C0) != null && (xo0Var = mxVar.d0) != null && xo0Var.M()) || eyVar.t3 || eyVar.K)) {
            eyVar.k2 = true;
            if (!eyVar.q3) {
                eyVar.W4(true, false, true, false);
            }
        }
        mx mxVar2 = eyVar.C0;
        if (mxVar2 != null) {
            View currentView = mxVar2.getCurrentView();
            boolean z10 = TextUtils.isEmpty(mxVar2.M0) ? true : !mxVar2.g0;
            mxVar2.M0 = obj;
            mxVar2.P(currentView, mxVar2.getCurrentPosition(), obj, z10);
        }
    }
}
