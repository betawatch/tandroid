package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                ie ieVar = (ie) this.b;
                p91 p91Var = (p91) this.c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    sd sdVar = new sd(ieVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.b0 = sdVar;
                    ieVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new td(ieVar, p91Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.b;
                gi.q1 q1Var = (gi.q1) this.c;
                if ((i10 == 6 || keyEvent.getKeyCode() == 66) && b2Var.isShowing()) {
                    q1Var.g(b2Var, 0);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.co coVar = (org.telegram.ui.Components.co) this.b;
                org.telegram.ui.Components.bo boVar = (org.telegram.ui.Components.bo) this.c;
                org.telegram.ui.Components.fo foVar = coVar.d;
                sa1 sa1Var = foVar.s;
                if (i10 == 5) {
                    View F = sa1Var.F(boVar);
                    s4.b1 T = F == null ? null : sa1Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i11 = b10 - foVar.t0;
                        int i12 = foVar.M;
                        int i13 = i12 - 1;
                        if (i11 == i13 && i12 < foVar.J) {
                            foVar.S();
                            break;
                        } else if (i11 != i13) {
                            s4.b1 K = sa1Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(boVar.getTextView());
                            break;
                        }
                    }
                }
                break;
            default:
                dv0 dv0Var = (dv0) this.b;
                cv0 cv0Var = (cv0) this.c;
                fv0 fv0Var = dv0Var.d;
                if (i10 == 5) {
                    sa1 sa1Var2 = fv0Var.c;
                    View F2 = sa1Var2.F(cv0Var);
                    s4.b1 T2 = F2 == null ? null : sa1Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i14 = b11 - fv0Var.n0;
                        int i15 = fv0Var.y;
                        int i16 = i15 - 1;
                        if (i14 == i16 && i15 < fv0Var.n) {
                            fv0Var.f0();
                            break;
                        } else if (i14 != i16) {
                            s4.b1 K2 = fv0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(cv0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
