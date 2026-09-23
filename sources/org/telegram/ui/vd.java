package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vd(int i10, Object obj, Object obj2) {
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
                je jeVar = (je) this.b;
                ra1 ra1Var = (ra1) this.c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    rd rdVar = new rd(jeVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.b0 = rdVar;
                    jeVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new sd(jeVar, ra1Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.b;
                ei.u1 u1Var = (ei.u1) this.c;
                if ((i10 == 6 || keyEvent.getKeyCode() == 66) && b2Var.isShowing()) {
                    u1Var.f(b2Var, 0);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.tn tnVar = (org.telegram.ui.Components.tn) this.b;
                org.telegram.ui.Components.sn snVar = (org.telegram.ui.Components.sn) this.c;
                org.telegram.ui.Components.vn vnVar = tnVar.d;
                wb1 wb1Var = vnVar.s;
                if (i10 == 5) {
                    View F = wb1Var.F(snVar);
                    s4.c1 T = F == null ? null : wb1Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i11 = b10 - vnVar.t0;
                        int i12 = vnVar.M;
                        int i13 = i12 - 1;
                        if (i11 == i13 && i12 < vnVar.J) {
                            vnVar.P();
                            break;
                        } else if (i11 != i13) {
                            s4.c1 K = wb1Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.d6) {
                                    ((org.telegram.ui.Cells.d6) view).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(snVar.getTextView());
                            break;
                        }
                    }
                }
                break;
            default:
                rv0 rv0Var = (rv0) this.b;
                qv0 qv0Var = (qv0) this.c;
                tv0 tv0Var = rv0Var.d;
                if (i10 == 5) {
                    wb1 wb1Var2 = tv0Var.c;
                    View F2 = wb1Var2.F(qv0Var);
                    s4.c1 T2 = F2 == null ? null : wb1Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i14 = b11 - tv0Var.n0;
                        int i15 = tv0Var.y;
                        int i16 = i15 - 1;
                        if (i14 == i16 && i15 < tv0Var.n) {
                            tv0Var.f0();
                            break;
                        } else if (i14 != i16) {
                            s4.c1 K2 = tv0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.d6) {
                                    ((org.telegram.ui.Cells.d6) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(qv0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
