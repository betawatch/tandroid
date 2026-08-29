package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rd(int i10, Object obj, Object obj2) {
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
                de deVar = (de) this.b;
                t91 t91Var = (t91) this.c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    nd ndVar = new nd(deVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.V = 1;
                    twoStepVerificationActivity.X = ndVar;
                    deVar.M0.setLoading(true);
                    twoStepVerificationActivity.s0(new od(deVar, t91Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.b;
                org.telegram.ui.Components.u1 u1Var = (org.telegram.ui.Components.u1) this.c;
                if ((i10 == 6 || keyEvent.getKeyCode() == 66) && c2Var.isShowing()) {
                    u1Var.g(c2Var, 0);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.mn mnVar = (org.telegram.ui.Components.mn) this.b;
                org.telegram.ui.Components.ln lnVar = (org.telegram.ui.Components.ln) this.c;
                org.telegram.ui.Components.on onVar = mnVar.d;
                wa1 wa1Var = onVar.s;
                if (i10 == 5) {
                    View F = wa1Var.F(lnVar);
                    f2.n1 T = F == null ? null : wa1Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i11 = b10 - onVar.p0;
                        int i12 = onVar.I;
                        int i13 = i12 - 1;
                        if (i11 == i13 && i12 < onVar.F) {
                            onVar.P();
                            break;
                        } else if (i11 != i13) {
                            f2.n1 K = wa1Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.a6) {
                                    ((org.telegram.ui.Cells.a6) view).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(lnVar.getTextView());
                            break;
                        }
                    }
                }
                break;
            default:
                tu0 tu0Var = (tu0) this.b;
                su0 su0Var = (su0) this.c;
                vu0 vu0Var = tu0Var.d;
                if (i10 == 5) {
                    wa1 wa1Var2 = vu0Var.c;
                    View F2 = wa1Var2.F(su0Var);
                    f2.n1 T2 = F2 == null ? null : wa1Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i14 = b11 - vu0Var.j0;
                        int i15 = vu0Var.y;
                        int i16 = i15 - 1;
                        if (i14 == i16 && i15 < vu0Var.n) {
                            vu0Var.f0();
                            break;
                        } else if (i14 != i16) {
                            f2.n1 K2 = vu0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                    ((org.telegram.ui.Cells.a6) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(su0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
