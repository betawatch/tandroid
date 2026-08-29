package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vx extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ fy f;

    public vx(fy fyVar) {
        this.f = fyVar;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean b() {
        fy fyVar = this.f;
        org.telegram.ui.ActionBar.w0 w0Var = fyVar.z1;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (fyVar.j2 == null) {
            return true;
        }
        fyVar.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean c() {
        org.telegram.ui.ActionBar.l lVar;
        fy fyVar = this.f;
        lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        return !lVar.s() && fyVar.N3 == null;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        fy fyVar = this.f;
        ux uxVar = fyVar.T;
        if (uxVar != null) {
            ArrayList arrayList = uxVar.B;
            if (!arrayList.isEmpty() && uxVar.D != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((rf.f0) arrayList.get(i10)).h) {
                        ((kx) uxVar.D).g((rf.f0) arrayList.get(i10));
                    }
                }
            }
        }
        fyVar.f2 = false;
        fyVar.g2 = false;
        ey eyVar = fyVar.a0[0];
        if (eyVar != null) {
            eyVar.a.setEmptyView(fyVar.R2 == 0 ? eyVar.w : null);
            fyVar.O4(false, false, true, false);
        }
        fyVar.Z4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        fyVar.T.setCloseButtonVisible(false);
        fyVar.Y4(true);
        fyVar.B3();
        fyVar.m3();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.Components.mn0 mn0Var;
        org.telegram.ui.Components.mn0 mn0Var2;
        fy fyVar = this.f;
        fyVar.f2 = true;
        org.telegram.ui.ActionBar.w0 w0Var = fyVar.z1;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        fyVar.M3();
        ey eyVar = fyVar.a0[0];
        if (eyVar != null) {
            if (fyVar.j2 != null) {
                eyVar.a.c1();
                ox oxVar = fyVar.y0;
                if (oxVar != null) {
                    jh.e1 e1Var = oxVar.R;
                    if (e1Var.e1) {
                        e1Var.e1 = false;
                        e1Var.J0(false);
                    }
                }
            }
            if (!fyVar.h2) {
                nh.t3 t3Var = fyVar.l0;
                if (t3Var != null) {
                    t3Var.e(true);
                }
                nh.t3 t3Var2 = fyVar.m0;
                if (t3Var2 != null) {
                    t3Var2.e(true);
                }
            }
        }
        xw xwVar = fyVar.A0;
        if (xwVar != null && xwVar.getPremiumHint() != null) {
            fyVar.A0.getPremiumHint().e(true);
        }
        if (!fyVar.G) {
            fyVar.C4(0.0f);
        }
        fyVar.Z4(false, false);
        lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        lVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        fyVar.m3();
        ox oxVar2 = fyVar.y0;
        if (oxVar2 != null && (mn0Var2 = oxVar2.U) != null) {
            mn0Var2.c = rf.x.d;
        }
        if ((oxVar2 != null && (mn0Var = oxVar2.U) != null && mn0Var.N()) || fyVar.getMessagesController().getTotalDialogsCount() > 10 || fyVar.o3 || fyVar.G) {
            fyVar.g2 = true;
            if (!fyVar.l3) {
                fyVar.O4(true, false, true, false);
            }
        }
        fyVar.T.setCloseButtonVisible(true);
        fyVar.Y4(true);
        fyVar.B3();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        ox oxVar;
        org.telegram.ui.Components.mn0 mn0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        fy fyVar = this.f;
        if (!isEmpty || (((oxVar = fyVar.y0) != null && (mn0Var = oxVar.U) != null && mn0Var.N()) || fyVar.o3 || fyVar.G)) {
            fyVar.g2 = true;
            if (!fyVar.l3) {
                fyVar.O4(true, false, true, false);
            }
        }
        ox oxVar2 = fyVar.y0;
        if (oxVar2 != null) {
            View currentView = oxVar2.getCurrentView();
            boolean z10 = TextUtils.isEmpty(oxVar2.G0) ? true : !oxVar2.a0;
            oxVar2.G0 = obj;
            oxVar2.O(currentView, oxVar2.getCurrentPosition(), obj, z10);
        }
    }
}
