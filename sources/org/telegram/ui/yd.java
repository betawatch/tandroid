package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
                r91 r91Var = (r91) this.c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    ud udVar = new ud(keVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.b0 = udVar;
                    keVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new vd(keVar, r91Var, twoStepVerificationActivity, 1));
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
                ua1 ua1Var = foVar.s;
                if (i10 == 5) {
                    View F = ua1Var.F(boVar);
                    s4.b1 T = F == null ? null : ua1Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i11 = b10 - foVar.t0;
                        int i12 = foVar.M;
                        int i13 = i12 - 1;
                        if (i11 == i13 && i12 < foVar.J) {
                            foVar.S();
                            break;
                        } else if (i11 != i13) {
                            s4.b1 K = ua1Var.K(b10 + 1);
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
                fv0 fv0Var = (fv0) this.b;
                ev0 ev0Var = (ev0) this.c;
                hv0 hv0Var = fv0Var.d;
                if (i10 == 5) {
                    ua1 ua1Var2 = hv0Var.c;
                    View F2 = ua1Var2.F(ev0Var);
                    s4.b1 T2 = F2 == null ? null : ua1Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i14 = b11 - hv0Var.n0;
                        int i15 = hv0Var.y;
                        int i16 = i15 - 1;
                        if (i14 == i16 && i15 < hv0Var.n) {
                            hv0Var.f0();
                            break;
                        } else if (i14 != i16) {
                            s4.b1 K2 = hv0Var.c.K(b11 + 1);
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
