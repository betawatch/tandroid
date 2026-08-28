package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tx extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ dy f;

    public tx(dy dyVar) {
        this.f = dyVar;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean b() {
        dy dyVar = this.f;
        org.telegram.ui.ActionBar.w0 w0Var = dyVar.z1;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (dyVar.j2 == null) {
            return true;
        }
        dyVar.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        dy dyVar = this.f;
        kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        return !kVar.s() && dyVar.N3 == null;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        dy dyVar = this.f;
        sx sxVar = dyVar.T;
        if (sxVar != null) {
            ArrayList arrayList = sxVar.B;
            if (!arrayList.isEmpty() && sxVar.D != null) {
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    if (((of.m0) arrayList.get(i9)).h) {
                        ((ix) sxVar.D).e((of.m0) arrayList.get(i9));
                    }
                }
            }
        }
        dyVar.f2 = false;
        dyVar.g2 = false;
        cy cyVar = dyVar.a0[0];
        if (cyVar != null) {
            cyVar.a.setEmptyView(dyVar.R2 == 0 ? cyVar.w : null);
            dyVar.O4(false, false, true, false);
        }
        dyVar.Z4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        dyVar.T.setCloseButtonVisible(false);
        dyVar.Y4(true);
        dyVar.B3();
        dyVar.m3();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.an0 an0Var;
        org.telegram.ui.Components.an0 an0Var2;
        dy dyVar = this.f;
        dyVar.f2 = true;
        org.telegram.ui.ActionBar.w0 w0Var = dyVar.z1;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        dyVar.M3();
        cy cyVar = dyVar.a0[0];
        if (cyVar != null) {
            if (dyVar.j2 != null) {
                cyVar.a.c1();
                mx mxVar = dyVar.y0;
                if (mxVar != null) {
                    gh.f1 f1Var = mxVar.R;
                    if (f1Var.e1) {
                        f1Var.e1 = false;
                        f1Var.J0(false);
                    }
                }
            }
            if (!dyVar.h2) {
                kh.x3 x3Var = dyVar.l0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                kh.x3 x3Var2 = dyVar.m0;
                if (x3Var2 != null) {
                    x3Var2.e(true);
                }
            }
        }
        vw vwVar = dyVar.A0;
        if (vwVar != null && vwVar.getPremiumHint() != null) {
            dyVar.A0.getPremiumHint().e(true);
        }
        if (!dyVar.G) {
            dyVar.C4(0.0f);
        }
        dyVar.Z4(false, false);
        kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        dyVar.m3();
        mx mxVar2 = dyVar.y0;
        if (mxVar2 != null && (an0Var2 = mxVar2.U) != null) {
            an0Var2.c = of.c0.d;
        }
        if ((mxVar2 != null && (an0Var = mxVar2.U) != null && an0Var.N()) || dyVar.getMessagesController().getTotalDialogsCount() > 10 || dyVar.o3 || dyVar.G) {
            dyVar.g2 = true;
            if (!dyVar.l3) {
                dyVar.O4(true, false, true, false);
            }
        }
        dyVar.T.setCloseButtonVisible(true);
        dyVar.Y4(true);
        dyVar.B3();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        mx mxVar;
        org.telegram.ui.Components.an0 an0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        dy dyVar = this.f;
        if (!isEmpty || (((mxVar = dyVar.y0) != null && (an0Var = mxVar.U) != null && an0Var.N()) || dyVar.o3 || dyVar.G)) {
            dyVar.g2 = true;
            if (!dyVar.l3) {
                dyVar.O4(true, false, true, false);
            }
        }
        mx mxVar2 = dyVar.y0;
        if (mxVar2 != null) {
            View currentView = mxVar2.getCurrentView();
            boolean z10 = TextUtils.isEmpty(mxVar2.G0) ? true : !mxVar2.a0;
            mxVar2.G0 = obj;
            mxVar2.O(currentView, mxVar2.getCurrentPosition(), obj, z10);
        }
    }
}
