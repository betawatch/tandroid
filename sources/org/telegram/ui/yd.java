package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                me meVar = (me) this.b;
                ta1 ta1Var = (ta1) this.c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    ud udVar = new ud(meVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.b0 = udVar;
                    meVar.G0.setLoading(true);
                    twoStepVerificationActivity.s0(new vd(meVar, ta1Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.b;
                ei.v1 v1Var = (ei.v1) this.c;
                if ((i10 == 6 || keyEvent.getKeyCode() == 66) && b2Var.isShowing()) {
                    v1Var.g(b2Var, 0);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.vn vnVar = (org.telegram.ui.Components.vn) this.b;
                org.telegram.ui.Components.un unVar = (org.telegram.ui.Components.un) this.c;
                org.telegram.ui.Components.xn xnVar = vnVar.d;
                xb1 xb1Var = xnVar.s;
                if (i10 == 5) {
                    View F = xb1Var.F(unVar);
                    s4.c1 T = F == null ? null : xb1Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i11 = b10 - xnVar.t0;
                        int i12 = xnVar.M;
                        int i13 = i12 - 1;
                        if (i11 == i13 && i12 < xnVar.J) {
                            xnVar.N();
                            break;
                        } else if (i11 != i13) {
                            s4.c1 K = xb1Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.d6) {
                                    ((org.telegram.ui.Cells.d6) view).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(unVar.getTextView());
                            break;
                        }
                    }
                }
                break;
            default:
                sv0 sv0Var = (sv0) this.b;
                rv0 rv0Var = (rv0) this.c;
                uv0 uv0Var = sv0Var.d;
                if (i10 == 5) {
                    xb1 xb1Var2 = uv0Var.c;
                    View F2 = xb1Var2.F(rv0Var);
                    s4.c1 T2 = F2 == null ? null : xb1Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i14 = b11 - uv0Var.n0;
                        int i15 = uv0Var.y;
                        int i16 = i15 - 1;
                        if (i14 == i16 && i15 < uv0Var.n) {
                            uv0Var.f0();
                            break;
                        } else if (i14 != i16) {
                            s4.c1 K2 = uv0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.d6) {
                                    ((org.telegram.ui.Cells.d6) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(rv0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
