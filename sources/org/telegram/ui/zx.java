package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class zx {
    public final /* synthetic */ oy a;

    public zx(oy oyVar) {
        this.a = oyVar;
    }

    public final long a() {
        oy oyVar = this.a;
        jx jxVar = oyVar.C3;
        if (jxVar == null || !(jxVar.getFragment() instanceof kf1)) {
            return 0L;
        }
        return -((kf1) oyVar.C3.getFragment()).a;
    }

    public final void b() {
        oy oyVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oyVar.getParentActivity());
        org.telegram.ui.Components.wn0 wn0Var = oyVar.z0.V;
        if (wn0Var.K && wn0Var.P()) {
            alertDialog$Builder.a.O = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.wn0 wn0Var2 = oyVar.z0.V;
            ArrayList arrayList = wn0Var2.K ? wn0Var2.s0 : wn0Var2.r0;
            alertDialog$Builder.a.Q = LocaleController.formatPluralString("ClearSearchAlertPartial", arrayList != null ? arrayList.size() : 0, new Object[0]);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.yx
                public final /* synthetic */ zx b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.a.z0.V.E();
                            break;
                        default:
                            oy oyVar2 = this.b.a;
                            if (!oyVar2.z0.V.P()) {
                                org.telegram.ui.Components.wn0 wn0Var3 = oyVar2.z0.V;
                                wn0Var3.g0.c();
                                wn0Var3.G.clear();
                                wn0Var3.l();
                                break;
                            } else {
                                oyVar2.z0.V.E();
                                break;
                            }
                    }
                }
            });
        } else {
            alertDialog$Builder.a.O = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ClearSearchAlert);
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.yx
                public final /* synthetic */ zx b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.a.z0.V.E();
                            break;
                        default:
                            oy oyVar2 = this.b.a;
                            if (!oyVar2.z0.V.P()) {
                                org.telegram.ui.Components.wn0 wn0Var3 = oyVar2.z0.V;
                                wn0Var3.g0.c();
                                wn0Var3.G.clear();
                                wn0Var3.l();
                                break;
                            } else {
                                oyVar2.z0.V.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        oyVar.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
        }
    }

    public final void c() {
        xx xxVar = this.a.z0;
        if (xxVar != null) {
            org.telegram.ui.Components.zk0 zk0Var = xxVar.a0;
            int i10 = xxVar.P0;
            zk0Var.b(i10 > 0 ? i10 + 1 : 0);
            xxVar.P0 = xxVar.V.h();
        }
    }

    public final void d(boolean z4, boolean z10) {
        oy oyVar = this.a;
        if (oyVar.z0.T.getVisibility() == 0) {
            z10 = true;
        }
        if (oyVar.g2 && oyVar.h2) {
            xx xxVar = oyVar.z0;
            if (xxVar.T != null) {
                if (z4 || xxVar.V.h() != 0) {
                    oyVar.z0.T.e(true, z10);
                } else {
                    oyVar.z0.T.e(false, z10);
                }
            }
        }
        if (z4 && oyVar.z0.V.h() == 0) {
            xx xxVar2 = oyVar.z0;
            xxVar2.a0.a();
            xxVar2.S.invalidate();
            xxVar2.P0 = 0;
        }
    }
}
