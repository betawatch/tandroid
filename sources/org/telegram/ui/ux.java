package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ux extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ ey r;

    public ux(ey eyVar) {
        this.r = eyVar;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean b() {
        ey eyVar = this.r;
        org.telegram.ui.ActionBar.u0 u0Var = eyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (eyVar.n2 == null) {
            return true;
        }
        eyVar.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        ey eyVar = this.r;
        kVar = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
        return !kVar.s() && eyVar.R3 == null;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        ey eyVar = this.r;
        tx txVar = eyVar.X;
        if (txVar != null) {
            ArrayList arrayList = txVar.F;
            if (!arrayList.isEmpty() && txVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((hg.o0) arrayList.get(i10)).h) {
                        ((jx) txVar.H).c((hg.o0) arrayList.get(i10));
                    }
                }
            }
        }
        eyVar.j2 = false;
        eyVar.k2 = false;
        dy dyVar = eyVar.e0[0];
        if (dyVar != null) {
            dyVar.a.setEmptyView(eyVar.W2 == 0 ? dyVar.w : null);
            eyVar.M4(false, false, true, false);
        }
        eyVar.X4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        eyVar.X.setCloseButtonVisible(false);
        eyVar.W4(true);
        eyVar.z3();
        eyVar.j3();
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.oo0 oo0Var;
        org.telegram.ui.Components.oo0 oo0Var2;
        ey eyVar = this.r;
        eyVar.j2 = true;
        org.telegram.ui.ActionBar.u0 u0Var = eyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        eyVar.K3();
        dy dyVar = eyVar.e0[0];
        if (dyVar != null) {
            if (eyVar.n2 != null) {
                dyVar.a.c1();
                nx nxVar = eyVar.C0;
                if (nxVar != null) {
                    ai.u1 u1Var = nxVar.V;
                    if (u1Var.g1) {
                        u1Var.g1 = false;
                        u1Var.K0(false);
                    }
                }
            }
            if (!eyVar.l2) {
                ei.x3 x3Var = eyVar.p0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                ei.x3 x3Var2 = eyVar.q0;
                if (x3Var2 != null) {
                    x3Var2.e(true);
                }
            }
        }
        vw vwVar = eyVar.E0;
        if (vwVar != null && vwVar.getPremiumHint() != null) {
            eyVar.E0.getPremiumHint().e(true);
        }
        if (!eyVar.K) {
            eyVar.A4(0.0f);
        }
        eyVar.X4(false, false);
        kVar = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        eyVar.j3();
        nx nxVar2 = eyVar.C0;
        if (nxVar2 != null && (oo0Var2 = nxVar2.b0) != null) {
            oo0Var2.c = hg.e0.d;
        }
        if ((nxVar2 != null && (oo0Var = nxVar2.b0) != null && oo0Var.N()) || eyVar.getMessagesController().getTotalDialogsCount() > 10 || eyVar.t3 || eyVar.K) {
            eyVar.k2 = true;
            if (!eyVar.q3) {
                eyVar.M4(true, false, true, false);
            }
        }
        eyVar.X.setCloseButtonVisible(true);
        eyVar.W4(true);
        eyVar.z3();
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        nx nxVar;
        org.telegram.ui.Components.oo0 oo0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        ey eyVar = this.r;
        if (!isEmpty || (((nxVar = eyVar.C0) != null && (oo0Var = nxVar.b0) != null && oo0Var.N()) || eyVar.t3 || eyVar.K)) {
            eyVar.k2 = true;
            if (!eyVar.q3) {
                eyVar.M4(true, false, true, false);
            }
        }
        nx nxVar2 = eyVar.C0;
        if (nxVar2 != null) {
            View currentView = nxVar2.getCurrentView();
            boolean z10 = TextUtils.isEmpty(nxVar2.K0) ? true : !nxVar2.e0;
            nxVar2.K0 = obj;
            nxVar2.O(currentView, nxVar2.getCurrentPosition(), obj, z10);
        }
    }
}
