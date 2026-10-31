package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                u61 u61Var = (u61) this.c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    rd rdVar = new rd(leVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.b0 = rdVar;
                    leVar.G0.setLoading(true);
                    twoStepVerificationActivity.w0(new sd(leVar, u61Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.b;
                di.a aVar = (di.a) this.c;
                if ((i10 == 6 || keyEvent.getKeyCode() == 66) && x1Var.isShowing()) {
                    aVar.h(x1Var, 0);
                    break;
                }
                break;
            case 2:
                fg.j jVar = (fg.j) this.b;
                org.telegram.ui.Components.hn hnVar = (org.telegram.ui.Components.hn) this.c;
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) jVar.e;
                w71 w71Var = jnVar.s;
                if (i10 == 5) {
                    View F = w71Var.F(hnVar);
                    s4.c1 T = F == null ? null : w71Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i11 = b10 - jnVar.t0;
                        int i12 = jnVar.M;
                        int i13 = i12 - 1;
                        if (i11 == i13 && i12 < jnVar.J) {
                            jnVar.S();
                            break;
                        } else if (i11 != i13) {
                            s4.c1 K = w71Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.e6) {
                                    ((org.telegram.ui.Cells.e6) view).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.i0.v1(hnVar.getTextView());
                            break;
                        }
                    }
                }
                break;
            default:
                ys0 ys0Var = (ys0) this.b;
                xs0 xs0Var = (xs0) this.c;
                at0 at0Var = ys0Var.d;
                if (i10 == 5) {
                    w71 w71Var2 = at0Var.c;
                    View F2 = w71Var2.F(xs0Var);
                    s4.c1 T2 = F2 == null ? null : w71Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i14 = b11 - at0Var.n0;
                        int i15 = at0Var.D;
                        int i16 = i15 - 1;
                        if (i14 == i16 && i15 < at0Var.n) {
                            at0Var.j0();
                            break;
                        } else if (i14 != i16) {
                            s4.c1 K2 = at0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.e6) {
                                    ((org.telegram.ui.Cells.e6) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.i0.v1(xs0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
