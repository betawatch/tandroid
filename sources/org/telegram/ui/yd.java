package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                y91 y91Var = (y91) this.c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    ud udVar = new ud(keVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.b0 = udVar;
                    keVar.G0.setLoading(true);
                    twoStepVerificationActivity.t0(new vd(keVar, y91Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.b;
                org.telegram.ui.Components.s1 s1Var = (org.telegram.ui.Components.s1) this.c;
                if ((i10 == 6 || keyEvent.getKeyCode() == 66) && e2Var.isShowing()) {
                    s1Var.h(e2Var, 0);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.eo eoVar = (org.telegram.ui.Components.eo) this.b;
                org.telegram.ui.Components.co coVar = (org.telegram.ui.Components.co) this.c;
                org.telegram.ui.Components.go goVar = eoVar.d;
                bb1 bb1Var = goVar.s;
                if (i10 == 5) {
                    View F = bb1Var.F(coVar);
                    s4.e1 T = F == null ? null : bb1Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i11 = b10 - goVar.t0;
                        int i12 = goVar.M;
                        int i13 = i12 - 1;
                        if (i11 == i13 && i12 < goVar.J) {
                            goVar.S();
                            break;
                        } else if (i11 != i13) {
                            s4.e1 K = bb1Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.h6) {
                                    ((org.telegram.ui.Cells.h6) view).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(coVar.getTextView());
                            break;
                        }
                    }
                }
                break;
            default:
                mv0 mv0Var = (mv0) this.b;
                lv0 lv0Var = (lv0) this.c;
                ov0 ov0Var = mv0Var.d;
                if (i10 == 5) {
                    bb1 bb1Var2 = ov0Var.c;
                    View F2 = bb1Var2.F(lv0Var);
                    s4.e1 T2 = F2 == null ? null : bb1Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i14 = b11 - ov0Var.n0;
                        int i15 = ov0Var.y;
                        int i16 = i15 - 1;
                        if (i14 == i16 && i15 < ov0Var.n) {
                            ov0Var.g0();
                            break;
                        } else if (i14 != i16) {
                            s4.e1 K2 = ov0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.h6) {
                                    ((org.telegram.ui.Cells.h6) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(lv0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
