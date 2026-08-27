package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class td implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ td(int i10, Object obj, Object obj2) {
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
                fe feVar = (fe) this.b;
                q91 q91Var = (q91) this.c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    od odVar = new od(feVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.V = 1;
                    twoStepVerificationActivity.X = odVar;
                    feVar.M0.setLoading(true);
                    twoStepVerificationActivity.s0(new pd(feVar, q91Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.b;
                nh.p1 p1Var = (nh.p1) this.c;
                if ((i10 == 6 || keyEvent.getKeyCode() == 66) && b2Var.isShowing()) {
                    p1Var.f(b2Var, 0);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.gn gnVar = (org.telegram.ui.Components.gn) this.b;
                org.telegram.ui.Components.fn fnVar = (org.telegram.ui.Components.fn) this.c;
                org.telegram.ui.Components.in inVar = gnVar.d;
                ta1 ta1Var = inVar.s;
                if (i10 == 5) {
                    View F = ta1Var.F(fnVar);
                    f2.o1 T = F == null ? null : ta1Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i11 = b10 - inVar.p0;
                        int i12 = inVar.I;
                        int i13 = i12 - 1;
                        if (i11 == i13 && i12 < inVar.F) {
                            inVar.P();
                            break;
                        } else if (i11 != i13) {
                            f2.o1 K = ta1Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.z5) {
                                    ((org.telegram.ui.Cells.z5) view).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(fnVar.getTextView());
                            break;
                        }
                    }
                }
                break;
            default:
                wu0 wu0Var = (wu0) this.b;
                vu0 vu0Var = (vu0) this.c;
                yu0 yu0Var = wu0Var.d;
                if (i10 == 5) {
                    ta1 ta1Var2 = yu0Var.c;
                    View F2 = ta1Var2.F(vu0Var);
                    f2.o1 T2 = F2 == null ? null : ta1Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i14 = b11 - yu0Var.j0;
                        int i15 = yu0Var.y;
                        int i16 = i15 - 1;
                        if (i14 == i16 && i15 < yu0Var.n) {
                            yu0Var.f0();
                            break;
                        } else if (i14 != i16) {
                            f2.o1 K2 = yu0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.z5) {
                                    ((org.telegram.ui.Cells.z5) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(vu0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
