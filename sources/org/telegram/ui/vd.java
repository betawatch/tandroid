package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                sa1 sa1Var = (sa1) this.c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    rd rdVar = new rd(jeVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.b0 = rdVar;
                    jeVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new sd(jeVar, sa1Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.b;
                ei.u1 u1Var = (ei.u1) this.c;
                if ((i10 == 6 || keyEvent.getKeyCode() == 66) && a2Var.isShowing()) {
                    u1Var.f(a2Var, 0);
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
                pv0 pv0Var = (pv0) this.b;
                ov0 ov0Var = (ov0) this.c;
                rv0 rv0Var = pv0Var.d;
                if (i10 == 5) {
                    wb1 wb1Var2 = rv0Var.c;
                    View F2 = wb1Var2.F(ov0Var);
                    s4.c1 T2 = F2 == null ? null : wb1Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i14 = b11 - rv0Var.n0;
                        int i15 = rv0Var.y;
                        int i16 = i15 - 1;
                        if (i14 == i16 && i15 < rv0Var.n) {
                            rv0Var.f0();
                            break;
                        } else if (i14 != i16) {
                            s4.c1 K2 = rv0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.d6) {
                                    ((org.telegram.ui.Cells.d6) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(ov0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
