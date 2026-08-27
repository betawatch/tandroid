package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wx extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ gy f;

    public wx(gy gyVar) {
        this.f = gyVar;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean b() {
        gy gyVar = this.f;
        org.telegram.ui.ActionBar.v0 v0Var = gyVar.z1;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (gyVar.j2 == null) {
            return true;
        }
        gyVar.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        gy gyVar = this.f;
        kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
        return !kVar.t() && gyVar.N3 == null;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        gy gyVar = this.f;
        vx vxVar = gyVar.T;
        if (vxVar != null) {
            ArrayList arrayList = vxVar.B;
            if (!arrayList.isEmpty() && vxVar.D != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((pf.e0) arrayList.get(i10)).h) {
                        ((lx) vxVar.D).e((pf.e0) arrayList.get(i10));
                    }
                }
            }
        }
        gyVar.f2 = false;
        gyVar.g2 = false;
        fy fyVar = gyVar.a0[0];
        if (fyVar != null) {
            fyVar.a.setEmptyView(gyVar.R2 == 0 ? fyVar.w : null);
            gyVar.O4(false, false, true, false);
        }
        gyVar.Z4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        gyVar.T.setCloseButtonVisible(false);
        gyVar.Y4(true);
        gyVar.B3();
        gyVar.m3();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.cn0 cn0Var;
        org.telegram.ui.Components.cn0 cn0Var2;
        gy gyVar = this.f;
        gyVar.f2 = true;
        org.telegram.ui.ActionBar.v0 v0Var = gyVar.z1;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        gyVar.M3();
        fy fyVar = gyVar.a0[0];
        if (fyVar != null) {
            if (gyVar.j2 != null) {
                fyVar.a.c1();
                px pxVar = gyVar.y0;
                if (pxVar != null) {
                    hh.f1 f1Var = pxVar.R;
                    if (f1Var.e1) {
                        f1Var.e1 = false;
                        f1Var.J0(false);
                    }
                }
            }
            if (!gyVar.h2) {
                lh.w3 w3Var = gyVar.l0;
                if (w3Var != null) {
                    w3Var.e(true);
                }
                lh.w3 w3Var2 = gyVar.m0;
                if (w3Var2 != null) {
                    w3Var2.e(true);
                }
            }
        }
        yw ywVar = gyVar.A0;
        if (ywVar != null && ywVar.getPremiumHint() != null) {
            gyVar.A0.getPremiumHint().e(true);
        }
        if (!gyVar.G) {
            gyVar.C4(0.0f);
        }
        gyVar.Z4(false, false);
        kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        gyVar.m3();
        px pxVar2 = gyVar.y0;
        if (pxVar2 != null && (cn0Var2 = pxVar2.U) != null) {
            cn0Var2.c = pf.w.d;
        }
        if ((pxVar2 != null && (cn0Var = pxVar2.U) != null && cn0Var.N()) || gyVar.getMessagesController().getTotalDialogsCount() > 10 || gyVar.o3 || gyVar.G) {
            gyVar.g2 = true;
            if (!gyVar.l3) {
                gyVar.O4(true, false, true, false);
            }
        }
        gyVar.T.setCloseButtonVisible(true);
        gyVar.Y4(true);
        gyVar.B3();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        px pxVar;
        org.telegram.ui.Components.cn0 cn0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        gy gyVar = this.f;
        if (!isEmpty || (((pxVar = gyVar.y0) != null && (cn0Var = pxVar.U) != null && cn0Var.N()) || gyVar.o3 || gyVar.G)) {
            gyVar.g2 = true;
            if (!gyVar.l3) {
                gyVar.O4(true, false, true, false);
            }
        }
        px pxVar2 = gyVar.y0;
        if (pxVar2 != null) {
            View currentView = pxVar2.getCurrentView();
            boolean z10 = TextUtils.isEmpty(pxVar2.G0) ? true : !pxVar2.a0;
            pxVar2.G0 = obj;
            pxVar2.O(currentView, pxVar2.getCurrentPosition(), obj, z10);
        }
    }
}
