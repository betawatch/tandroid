package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rx {
    public final /* synthetic */ gy a;

    public rx(gy gyVar) {
        this.a = gyVar;
    }

    public final long a() {
        gy gyVar = this.a;
        bx bxVar = gyVar.B3;
        if (bxVar == null || !(bxVar.getFragment() instanceof we1)) {
            return 0L;
        }
        return -((we1) gyVar.B3.getFragment()).a;
    }

    public final void b() {
        gy gyVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gyVar.getParentActivity());
        org.telegram.ui.Components.cn0 cn0Var = gyVar.y0.U;
        if (cn0Var.J && cn0Var.P()) {
            alertDialog$Builder.a.N = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.cn0 cn0Var2 = gyVar.y0.U;
            ArrayList arrayList = cn0Var2.J ? cn0Var2.r0 : cn0Var2.q0;
            alertDialog$Builder.a.P = LocaleController.formatPluralString("ClearSearchAlertPartial", arrayList != null ? arrayList.size() : 0, new Object[0]);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.qx
                public final /* synthetic */ rx b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.a.y0.U.E();
                            break;
                        default:
                            gy gyVar2 = this.b.a;
                            if (!gyVar2.y0.U.P()) {
                                org.telegram.ui.Components.cn0 cn0Var3 = gyVar2.y0.U;
                                cn0Var3.f0.c();
                                cn0Var3.F.clear();
                                cn0Var3.l();
                                break;
                            } else {
                                gyVar2.y0.U.E();
                                break;
                            }
                    }
                }
            });
        } else {
            alertDialog$Builder.a.N = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ClearSearchAlert);
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.qx
                public final /* synthetic */ rx b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.a.y0.U.E();
                            break;
                        default:
                            gy gyVar2 = this.b.a;
                            if (!gyVar2.y0.U.P()) {
                                org.telegram.ui.Components.cn0 cn0Var3 = gyVar2.y0.U;
                                cn0Var3.f0.c();
                                cn0Var3.F.clear();
                                cn0Var3.l();
                                break;
                            } else {
                                gyVar2.y0.U.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        gyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.q7));
        }
    }

    public final void c() {
        px pxVar = this.a.y0;
        if (pxVar != null) {
            org.telegram.ui.Components.gk0 gk0Var = pxVar.W;
            int i10 = pxVar.O0;
            gk0Var.b(i10 > 0 ? i10 + 1 : 0);
            pxVar.O0 = pxVar.U.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        gy gyVar = this.a;
        if (gyVar.y0.S.getVisibility() == 0) {
            z11 = true;
        }
        if (gyVar.f2 && gyVar.g2) {
            px pxVar = gyVar.y0;
            if (pxVar.S != null) {
                if (z10 || pxVar.U.h() != 0) {
                    gyVar.y0.S.e(true, z11);
                } else {
                    gyVar.y0.S.e(false, z11);
                }
            }
        }
        if (z10 && gyVar.y0.U.h() == 0) {
            px pxVar2 = gyVar.y0;
            pxVar2.W.a();
            pxVar2.R.invalidate();
            pxVar2.O0 = 0;
        }
    }
}
