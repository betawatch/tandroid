package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wd(int i10, Object obj, Object obj2) {
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
                bb1 bb1Var = (bb1) this.c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    sd sdVar = new sd(keVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.b0 = sdVar;
                    keVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new td(keVar, bb1Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.b;
                fi.u1 u1Var = (fi.u1) this.c;
                if ((i10 == 6 || keyEvent.getKeyCode() == 66) && b2Var.isShowing()) {
                    u1Var.g(b2Var, 0);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) this.b;
                org.telegram.ui.Components.qn qnVar = (org.telegram.ui.Components.qn) this.c;
                org.telegram.ui.Components.tn tnVar = rnVar.d;
                ec1 ec1Var = tnVar.s;
                if (i10 == 5) {
                    View F = ec1Var.F(qnVar);
                    s4.c1 T = F == null ? null : ec1Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i11 = b10 - tnVar.t0;
                        int i12 = tnVar.M;
                        int i13 = i12 - 1;
                        if (i11 == i13 && i12 < tnVar.J) {
                            tnVar.P();
                            break;
                        } else if (i11 != i13) {
                            s4.c1 K = ec1Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(qnVar.getTextView());
                            break;
                        }
                    }
                }
                break;
            default:
                xv0 xv0Var = (xv0) this.b;
                wv0 wv0Var = (wv0) this.c;
                zv0 zv0Var = xv0Var.d;
                if (i10 == 5) {
                    ec1 ec1Var2 = zv0Var.c;
                    View F2 = ec1Var2.F(wv0Var);
                    s4.c1 T2 = F2 == null ? null : ec1Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i14 = b11 - zv0Var.n0;
                        int i15 = zv0Var.y;
                        int i16 = i15 - 1;
                        if (i14 == i16 && i15 < zv0Var.n) {
                            zv0Var.f0();
                            break;
                        } else if (i14 != i16) {
                            s4.c1 K2 = zv0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(wv0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
