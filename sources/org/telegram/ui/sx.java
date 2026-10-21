package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class sx extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ cy r;

    public sx(cy cyVar) {
        this.r = cyVar;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean b() {
        cy cyVar = this.r;
        org.telegram.ui.ActionBar.u0 u0Var = cyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (cyVar.n2 == null) {
            return true;
        }
        cyVar.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        cy cyVar = this.r;
        kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
        return !kVar.t() && cyVar.R3 == null;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        cy cyVar = this.r;
        rx rxVar = cyVar.X;
        if (rxVar != null) {
            ArrayList arrayList = rxVar.F;
            if (!arrayList.isEmpty() && rxVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((hg.o0) arrayList.get(i10)).h) {
                        ((hx) rxVar.H).g((hg.o0) arrayList.get(i10));
                    }
                }
            }
        }
        cyVar.j2 = false;
        cyVar.k2 = false;
        ay ayVar = cyVar.e0[0];
        if (ayVar != null) {
            ayVar.a.setEmptyView(cyVar.W2 == 0 ? ayVar.w : null);
            cyVar.M4(false, false, true, false);
        }
        cyVar.X4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        cyVar.X.setCloseButtonVisible(false);
        cyVar.W4(true);
        cyVar.z3();
        cyVar.j3();
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.po0 po0Var;
        org.telegram.ui.Components.po0 po0Var2;
        cy cyVar = this.r;
        cyVar.j2 = true;
        org.telegram.ui.ActionBar.u0 u0Var = cyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        cyVar.K3();
        ay ayVar = cyVar.e0[0];
        if (ayVar != null) {
            if (cyVar.n2 != null) {
                ayVar.a.c1();
                lx lxVar = cyVar.C0;
                if (lxVar != null) {
                    ai.u1 u1Var = lxVar.V;
                    if (u1Var.g1) {
                        u1Var.g1 = false;
                        u1Var.K0(false);
                    }
                }
            }
            if (!cyVar.l2) {
                ei.x3 x3Var = cyVar.p0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                ei.x3 x3Var2 = cyVar.q0;
                if (x3Var2 != null) {
                    x3Var2.e(true);
                }
            }
        }
        tw twVar = cyVar.E0;
        if (twVar != null && twVar.getPremiumHint() != null) {
            cyVar.E0.getPremiumHint().e(true);
        }
        if (!cyVar.K) {
            cyVar.A4(0.0f);
        }
        cyVar.X4(false, false);
        kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        cyVar.j3();
        lx lxVar2 = cyVar.C0;
        if (lxVar2 != null && (po0Var2 = lxVar2.b0) != null) {
            po0Var2.c = hg.e0.d;
        }
        if ((lxVar2 != null && (po0Var = lxVar2.b0) != null && po0Var.N()) || cyVar.getMessagesController().getTotalDialogsCount() > 10 || cyVar.t3 || cyVar.K) {
            cyVar.k2 = true;
            if (!cyVar.q3) {
                cyVar.M4(true, false, true, false);
            }
        }
        cyVar.X.setCloseButtonVisible(true);
        cyVar.W4(true);
        cyVar.z3();
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        lx lxVar;
        org.telegram.ui.Components.po0 po0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        cy cyVar = this.r;
        if (!isEmpty || (((lxVar = cyVar.C0) != null && (po0Var = lxVar.b0) != null && po0Var.N()) || cyVar.t3 || cyVar.K)) {
            cyVar.k2 = true;
            if (!cyVar.q3) {
                cyVar.M4(true, false, true, false);
            }
        }
        lx lxVar2 = cyVar.C0;
        if (lxVar2 != null) {
            View currentView = lxVar2.getCurrentView();
            boolean z10 = TextUtils.isEmpty(lxVar2.K0) ? true : !lxVar2.e0;
            lxVar2.K0 = obj;
            lxVar2.O(currentView, lxVar2.getCurrentPosition(), obj, z10);
        }
    }
}
