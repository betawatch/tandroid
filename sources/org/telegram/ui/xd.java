package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                ab1 ab1Var = (ab1) this.c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    td tdVar = new td(leVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.b0 = tdVar;
                    leVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new ud(leVar, ab1Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.b;
                ei.u1 u1Var = (ei.u1) this.c;
                if ((i10 == 6 || keyEvent.getKeyCode() == 66) && c2Var.isShowing()) {
                    u1Var.f(c2Var, 0);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.sn snVar = (org.telegram.ui.Components.sn) this.b;
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) this.c;
                org.telegram.ui.Components.un unVar = snVar.d;
                fc1 fc1Var = unVar.s;
                if (i10 == 5) {
                    View G = fc1Var.G(rnVar);
                    s4.c1 U = G == null ? null : fc1Var.U(G);
                    if (U != null && (b10 = U.b()) != -1) {
                        int i11 = b10 - unVar.t0;
                        int i12 = unVar.M;
                        int i13 = i12 - 1;
                        if (i11 == i13 && i12 < unVar.J) {
                            unVar.P();
                            break;
                        } else if (i11 != i13) {
                            s4.c1 L = fc1Var.L(b10 + 1);
                            if (L != null) {
                                View view = L.a;
                                if (view instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(rnVar.getTextView());
                            break;
                        }
                    }
                }
                break;
            default:
                aw0 aw0Var = (aw0) this.b;
                zv0 zv0Var = (zv0) this.c;
                cw0 cw0Var = aw0Var.d;
                if (i10 == 5) {
                    fc1 fc1Var2 = cw0Var.c;
                    View G2 = fc1Var2.G(zv0Var);
                    s4.c1 U2 = G2 == null ? null : fc1Var2.U(G2);
                    if (U2 != null && (b11 = U2.b()) != -1) {
                        int i14 = b11 - cw0Var.n0;
                        int i15 = cw0Var.y;
                        int i16 = i15 - 1;
                        if (i14 == i16 && i15 < cw0Var.n) {
                            cw0Var.f0();
                            break;
                        } else if (i14 != i16) {
                            s4.c1 L2 = cw0Var.c.L(b11 + 1);
                            if (L2 != null) {
                                View view2 = L2.a;
                                if (view2 instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(zv0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
