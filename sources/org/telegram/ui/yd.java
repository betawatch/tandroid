package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                na1 na1Var = (na1) this.c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    td tdVar = new td(keVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.W = 1;
                    twoStepVerificationActivity.Y = tdVar;
                    keVar.N0.setLoading(true);
                    twoStepVerificationActivity.s0(new ud(keVar, na1Var, twoStepVerificationActivity, 1));
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
                org.telegram.ui.Components.pn pnVar = (org.telegram.ui.Components.pn) this.b;
                org.telegram.ui.Components.on onVar = (org.telegram.ui.Components.on) this.c;
                org.telegram.ui.Components.rn rnVar = pnVar.d;
                qb1 qb1Var = rnVar.s;
                if (i10 == 5) {
                    View F = qb1Var.F(onVar);
                    f2.m1 T = F == null ? null : qb1Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i11 = b10 - rnVar.q0;
                        int i12 = rnVar.J;
                        int i13 = i12 - 1;
                        if (i11 == i13 && i12 < rnVar.G) {
                            rnVar.P();
                            break;
                        } else if (i11 != i13) {
                            f2.m1 K = qb1Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(onVar.getTextView());
                            break;
                        }
                    }
                }
                break;
            default:
                kv0 kv0Var = (kv0) this.b;
                jv0 jv0Var = (jv0) this.c;
                mv0 mv0Var = kv0Var.d;
                if (i10 == 5) {
                    qb1 qb1Var2 = mv0Var.c;
                    View F2 = qb1Var2.F(jv0Var);
                    f2.m1 T2 = F2 == null ? null : qb1Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i14 = b11 - mv0Var.k0;
                        int i15 = mv0Var.y;
                        int i16 = i15 - 1;
                        if (i14 == i16 && i15 < mv0Var.n) {
                            mv0Var.f0();
                            break;
                        } else if (i14 != i16) {
                            f2.m1 K2 = mv0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(jv0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
