package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qx {
    public final /* synthetic */ fy a;

    public qx(fy fyVar) {
        this.a = fyVar;
    }

    public final long a() {
        fy fyVar = this.a;
        ax axVar = fyVar.B3;
        if (axVar == null || !(axVar.getFragment() instanceof ze1)) {
            return 0L;
        }
        return -((ze1) fyVar.B3.getFragment()).a;
    }

    public final void b() {
        fy fyVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fyVar.getParentActivity());
        org.telegram.ui.Components.mn0 mn0Var = fyVar.y0.U;
        if (mn0Var.J && mn0Var.P()) {
            alertDialog$Builder.a.N = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.mn0 mn0Var2 = fyVar.y0.U;
            ArrayList arrayList = mn0Var2.J ? mn0Var2.r0 : mn0Var2.q0;
            alertDialog$Builder.a.P = LocaleController.formatPluralString("ClearSearchAlertPartial", arrayList != null ? arrayList.size() : 0, new Object[0]);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.px
                public final /* synthetic */ qx b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.a.y0.U.E();
                            break;
                        default:
                            fy fyVar2 = this.b.a;
                            if (!fyVar2.y0.U.P()) {
                                org.telegram.ui.Components.mn0 mn0Var3 = fyVar2.y0.U;
                                mn0Var3.f0.c();
                                mn0Var3.F.clear();
                                mn0Var3.l();
                                break;
                            } else {
                                fyVar2.y0.U.E();
                                break;
                            }
                    }
                }
            });
        } else {
            alertDialog$Builder.a.N = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ClearSearchAlert);
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.px
                public final /* synthetic */ qx b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.a.y0.U.E();
                            break;
                        default:
                            fy fyVar2 = this.b.a;
                            if (!fyVar2.y0.U.P()) {
                                org.telegram.ui.Components.mn0 mn0Var3 = fyVar2.y0.U;
                                mn0Var3.f0.c();
                                mn0Var3.F.clear();
                                mn0Var3.l();
                                break;
                            } else {
                                fyVar2.y0.U.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        fyVar.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.q7));
        }
    }

    public final void c() {
        ox oxVar = this.a.y0;
        if (oxVar != null) {
            org.telegram.ui.Components.pk0 pk0Var = oxVar.W;
            int i10 = oxVar.O0;
            pk0Var.b(i10 > 0 ? i10 + 1 : 0);
            oxVar.O0 = oxVar.U.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        fy fyVar = this.a;
        if (fyVar.y0.S.getVisibility() == 0) {
            z11 = true;
        }
        if (fyVar.f2 && fyVar.g2) {
            ox oxVar = fyVar.y0;
            if (oxVar.S != null) {
                if (z10 || oxVar.U.h() != 0) {
                    fyVar.y0.S.e(true, z11);
                } else {
                    fyVar.y0.S.e(false, z11);
                }
            }
        }
        if (z10 && fyVar.y0.U.h() == 0) {
            ox oxVar2 = fyVar.y0;
            oxVar2.W.a();
            oxVar2.R.invalidate();
            oxVar2.O0 = 0;
        }
    }
}
