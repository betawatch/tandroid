package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class xd implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xd(int i10, Object obj, Object obj2) {
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
                le leVar = (le) this.b;
                fb1 fb1Var = (fb1) this.c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    td tdVar = new td(leVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.b0 = tdVar;
                    leVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new ud(leVar, fb1Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.b;
                di.x1 x1Var = (di.x1) this.c;
                if ((i10 == 6 || keyEvent.getKeyCode() == 66) && d2Var.isShowing()) {
                    x1Var.f(d2Var, 0);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.xn xnVar = (org.telegram.ui.Components.xn) this.b;
                org.telegram.ui.Components.wn wnVar = (org.telegram.ui.Components.wn) this.c;
                org.telegram.ui.Components.zn znVar = xnVar.d;
                ic1 ic1Var = znVar.s;
                if (i10 == 5) {
                    View F = ic1Var.F(wnVar);
                    s4.c1 T = F == null ? null : ic1Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i11 = b10 - znVar.t0;
                        int i12 = znVar.M;
                        int i13 = i12 - 1;
                        if (i11 == i13 && i12 < znVar.J) {
                            znVar.P();
                            break;
                        } else if (i11 != i13) {
                            s4.c1 K = ic1Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.e6) {
                                    ((org.telegram.ui.Cells.e6) view).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(wnVar.getTextView());
                            break;
                        }
                    }
                }
                break;
            default:
                zv0 zv0Var = (zv0) this.b;
                yv0 yv0Var = (yv0) this.c;
                bw0 bw0Var = zv0Var.d;
                if (i10 == 5) {
                    ic1 ic1Var2 = bw0Var.c;
                    View F2 = ic1Var2.F(yv0Var);
                    s4.c1 T2 = F2 == null ? null : ic1Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i14 = b11 - bw0Var.n0;
                        int i15 = bw0Var.y;
                        int i16 = i15 - 1;
                        if (i14 == i16 && i15 < bw0Var.n) {
                            bw0Var.f0();
                            break;
                        } else if (i14 != i16) {
                            s4.c1 K2 = bw0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.e6) {
                                    ((org.telegram.ui.Cells.e6) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(yv0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
