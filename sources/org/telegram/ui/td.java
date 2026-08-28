package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class td implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ td(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        int b10;
        int b11;
        switch (this.a) {
            case 0:
                fe feVar = (fe) this.b;
                s91 s91Var = (s91) this.c;
                if (i9 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    od odVar = new od(feVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.V = 1;
                    twoStepVerificationActivity.X = odVar;
                    feVar.M0.setLoading(true);
                    twoStepVerificationActivity.r0(new pd(feVar, s91Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.b;
                mh.q1 q1Var = (mh.q1) this.c;
                if ((i9 == 6 || keyEvent.getKeyCode() == 66) && c2Var.isShowing()) {
                    q1Var.f(c2Var, 0);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.hn hnVar = (org.telegram.ui.Components.hn) this.b;
                org.telegram.ui.Components.gn gnVar = (org.telegram.ui.Components.gn) this.c;
                org.telegram.ui.Components.jn jnVar = hnVar.d;
                va1 va1Var = jnVar.s;
                if (i9 == 5) {
                    View F = va1Var.F(gnVar);
                    f2.q1 T = F == null ? null : va1Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i10 = b10 - jnVar.p0;
                        int i11 = jnVar.I;
                        int i12 = i11 - 1;
                        if (i10 == i12 && i11 < jnVar.F) {
                            jnVar.O();
                            break;
                        } else if (i10 != i12) {
                            f2.q1 K = va1Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(gnVar.getTextView());
                            break;
                        }
                    }
                }
                break;
            default:
                vu0 vu0Var = (vu0) this.b;
                uu0 uu0Var = (uu0) this.c;
                xu0 xu0Var = vu0Var.d;
                if (i9 == 5) {
                    va1 va1Var2 = xu0Var.c;
                    View F2 = va1Var2.F(uu0Var);
                    f2.q1 T2 = F2 == null ? null : va1Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i13 = b11 - xu0Var.j0;
                        int i14 = xu0Var.y;
                        int i15 = i14 - 1;
                        if (i13 == i15 && i14 < xu0Var.n) {
                            xu0Var.e0();
                            break;
                        } else if (i13 != i15) {
                            f2.q1 K2 = xu0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(uu0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
