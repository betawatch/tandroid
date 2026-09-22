package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                    u1Var.k(b2Var, 0);
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
                                if (view instanceof org.telegram.ui.Cells.e6) {
                                    ((org.telegram.ui.Cells.e6) view).getTextView().requestFocus();
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
                yv0 yv0Var = (yv0) this.b;
                xv0 xv0Var = (xv0) this.c;
                aw0 aw0Var = yv0Var.d;
                if (i10 == 5) {
                    fc1 fc1Var2 = aw0Var.c;
                    View G2 = fc1Var2.G(xv0Var);
                    s4.c1 U2 = G2 == null ? null : fc1Var2.U(G2);
                    if (U2 != null && (b11 = U2.b()) != -1) {
                        int i14 = b11 - aw0Var.n0;
                        int i15 = aw0Var.y;
                        int i16 = i15 - 1;
                        if (i14 == i16 && i15 < aw0Var.n) {
                            aw0Var.f0();
                            break;
                        } else if (i14 != i16) {
                            s4.c1 L2 = aw0Var.c.L(b11 + 1);
                            if (L2 != null) {
                                View view2 = L2.a;
                                if (view2 instanceof org.telegram.ui.Cells.e6) {
                                    ((org.telegram.ui.Cells.e6) view2).getTextView().requestFocus();
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
