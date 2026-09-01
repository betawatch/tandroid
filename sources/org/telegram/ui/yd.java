package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yd(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int b10;
        int b11;
        switch (this.a) {
            case 0:
                ke keVar = (ke) this.b;
                ha1 ha1Var = (ha1) this.c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    td tdVar = new td(keVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.W = 1;
                    twoStepVerificationActivity.Y = tdVar;
                    keVar.N0.setLoading(true);
                    twoStepVerificationActivity.s0(new ud(keVar, ha1Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.b;
                org.telegram.ui.Components.s1 s1Var = (org.telegram.ui.Components.s1) this.c;
                if ((i10 == 6 || keyEvent.getKeyCode() == 66) && d2Var.isShowing()) {
                    s1Var.j(d2Var, 0);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.qn qnVar = (org.telegram.ui.Components.qn) this.b;
                org.telegram.ui.Components.pn pnVar = (org.telegram.ui.Components.pn) this.c;
                org.telegram.ui.Components.sn snVar = qnVar.d;
                kb1 kb1Var = snVar.s;
                if (i10 == 5) {
                    View F = kb1Var.F(pnVar);
                    f2.m1 T = F == null ? null : kb1Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i11 = b10 - snVar.q0;
                        int i12 = snVar.J;
                        int i13 = i12 - 1;
                        if (i11 == i13 && i12 < snVar.G) {
                            snVar.P();
                            break;
                        } else if (i11 != i13) {
                            f2.m1 K = kb1Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(pnVar.getTextView());
                            break;
                        }
                    }
                }
                break;
            default:
                fv0 fv0Var = (fv0) this.b;
                ev0 ev0Var = (ev0) this.c;
                hv0 hv0Var = fv0Var.d;
                if (i10 == 5) {
                    kb1 kb1Var2 = hv0Var.c;
                    View F2 = kb1Var2.F(ev0Var);
                    f2.m1 T2 = F2 == null ? null : kb1Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i14 = b11 - hv0Var.k0;
                        int i15 = hv0Var.y;
                        int i16 = i15 - 1;
                        if (i14 == i16 && i15 < hv0Var.n) {
                            hv0Var.f0();
                            break;
                        } else if (i14 != i16) {
                            f2.m1 K2 = hv0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(ev0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
