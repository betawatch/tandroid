package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                u91 u91Var = (u91) this.c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    sd sdVar = new sd(ieVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.b0 = sdVar;
                    ieVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new td(ieVar, u91Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.b;
                gi.q1 q1Var = (gi.q1) this.c;
                if ((i10 == 6 || keyEvent.getKeyCode() == 66) && c2Var.isShowing()) {
                    q1Var.g(c2Var, 0);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.co coVar = (org.telegram.ui.Components.co) this.b;
                org.telegram.ui.Components.bo boVar = (org.telegram.ui.Components.bo) this.c;
                org.telegram.ui.Components.fo foVar = coVar.d;
                xa1 xa1Var = foVar.s;
                if (i10 == 5) {
                    View F = xa1Var.F(boVar);
                    s4.b1 T = F == null ? null : xa1Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i11 = b10 - foVar.t0;
                        int i12 = foVar.M;
                        int i13 = i12 - 1;
                        if (i11 == i13 && i12 < foVar.J) {
                            foVar.S();
                            break;
                        } else if (i11 != i13) {
                            s4.b1 K = xa1Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.d6) {
                                    ((org.telegram.ui.Cells.d6) view).getTextView().requestFocus();
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
                gv0 gv0Var = (gv0) this.b;
                fv0 fv0Var = (fv0) this.c;
                iv0 iv0Var = gv0Var.d;
                if (i10 == 5) {
                    xa1 xa1Var2 = iv0Var.c;
                    View F2 = xa1Var2.F(fv0Var);
                    s4.b1 T2 = F2 == null ? null : xa1Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i14 = b11 - iv0Var.n0;
                        int i15 = iv0Var.y;
                        int i16 = i15 - 1;
                        if (i14 == i16 && i15 < iv0Var.n) {
                            iv0Var.f0();
                            break;
                        } else if (i14 != i16) {
                            s4.b1 K2 = iv0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.d6) {
                                    ((org.telegram.ui.Cells.d6) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(fv0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
