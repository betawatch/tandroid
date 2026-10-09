package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                ei.u1 u1Var = (ei.u1) this.c;
                if ((i10 == 6 || keyEvent.getKeyCode() == 66) && b2Var.isShowing()) {
                    u1Var.f(b2Var, 0);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.jo joVar = (org.telegram.ui.Components.jo) this.b;
                org.telegram.ui.Components.io ioVar = (org.telegram.ui.Components.io) this.c;
                org.telegram.ui.Components.lo loVar = joVar.d;
                fc1 fc1Var = loVar.s;
                if (i10 == 5) {
                    View F = fc1Var.F(ioVar);
                    s4.d1 T = F == null ? null : fc1Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i11 = b10 - loVar.t0;
                        int i12 = loVar.M;
                        int i13 = i12 - 1;
                        if (i11 == i13 && i12 < loVar.J) {
                            loVar.S();
                            break;
                        } else if (i11 != i13) {
                            s4.d1 K = fc1Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.d6) {
                                    ((org.telegram.ui.Cells.d6) view).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(ioVar.getTextView());
                            break;
                        }
                    }
                }
                break;
            default:
                yv0 yv0Var = (yv0) this.b;
                xv0 xv0Var = (xv0) this.c;
                aw0 aw0Var = yv0Var.d;
                if (i10 == 5) {
                    fc1 fc1Var2 = aw0Var.c;
                    View F2 = fc1Var2.F(xv0Var);
                    s4.d1 T2 = F2 == null ? null : fc1Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i14 = b11 - aw0Var.n0;
                        int i15 = aw0Var.y;
                        int i16 = i15 - 1;
                        if (i14 == i16 && i15 < aw0Var.n) {
                            aw0Var.f0();
                            break;
                        } else if (i14 != i16) {
                            s4.d1 K2 = aw0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.d6) {
                                    ((org.telegram.ui.Cells.d6) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(xv0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
