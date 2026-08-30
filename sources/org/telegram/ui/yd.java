package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                ga1 ga1Var = (ga1) this.c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    td tdVar = new td(keVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.W = 1;
                    twoStepVerificationActivity.Y = tdVar;
                    keVar.N0.setLoading(true);
                    twoStepVerificationActivity.s0(new ud(keVar, ga1Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.b;
                org.telegram.ui.Components.s1 s1Var = (org.telegram.ui.Components.s1) this.c;
                if ((i10 == 6 || keyEvent.getKeyCode() == 66) && d2Var.isShowing()) {
                    s1Var.i(d2Var, 0);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.on onVar = (org.telegram.ui.Components.on) this.b;
                org.telegram.ui.Components.nn nnVar = (org.telegram.ui.Components.nn) this.c;
                org.telegram.ui.Components.qn qnVar = onVar.d;
                jb1 jb1Var = qnVar.s;
                if (i10 == 5) {
                    View F = jb1Var.F(nnVar);
                    f2.l1 T = F == null ? null : jb1Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i11 = b10 - qnVar.q0;
                        int i12 = qnVar.J;
                        int i13 = i12 - 1;
                        if (i11 == i13 && i12 < qnVar.G) {
                            qnVar.P();
                            break;
                        } else if (i11 != i13) {
                            f2.l1 K = jb1Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(nnVar.getTextView());
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
                    jb1 jb1Var2 = fv0Var.c;
                    View F2 = jb1Var2.F(cv0Var);
                    f2.l1 T2 = F2 == null ? null : jb1Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i14 = b11 - fv0Var.k0;
                        int i15 = fv0Var.y;
                        int i16 = i15 - 1;
                        if (i14 == i16 && i15 < fv0Var.n) {
                            fv0Var.f0();
                            break;
                        } else if (i14 != i16) {
                            f2.l1 K2 = fv0Var.c.K(b11 + 1);
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
