package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class tf1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ xf1 b;

    public /* synthetic */ tf1(xf1 xf1Var, int i10) {
        this.a = i10;
        this.b = xf1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.uj0 uj0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                xf1 xf1Var = this.b;
                if (!xf1Var.M) {
                    int i10 = xf1Var.O;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 8 && editable.length() > 0) {
                                xf1Var.H0(true);
                                break;
                            }
                        } else {
                            try {
                                xf1Var.f0[6].P((int) ((Math.min(1.0f, xf1Var.n.getLayout().getLineWidth(0) / xf1Var.n.getWidth()) * 142.0f) + 18.0f));
                                xf1Var.a.d();
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.uj0 animatedDrawable = xf1Var.a.getAnimatedDrawable();
                        if (xf1Var.n.length() <= 0) {
                            if (animatedDrawable != xf1Var.f0[3] || xf1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.uj0[] uj0VarArr = xf1Var.f0;
                                if (animatedDrawable != uj0VarArr[5]) {
                                    uj0VarArr[2].P(-1);
                                    org.telegram.ui.Components.uj0 uj0Var2 = xf1Var.f0[2];
                                    if (animatedDrawable != uj0Var2) {
                                        xf1Var.a.setAnimation(uj0Var2);
                                        xf1Var.f0[2].N(49, false, false);
                                    }
                                    xf1Var.a.d();
                                    break;
                                }
                            }
                            xf1Var.a.setAnimation(xf1Var.f0[4]);
                            xf1Var.f0[4].T(0.0f, false);
                            xf1Var.a.d();
                            break;
                        } else if (xf1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.uj0[] uj0VarArr2 = xf1Var.f0;
                            if (animatedDrawable != uj0VarArr2[3]) {
                                org.telegram.ui.Components.uj0 uj0Var3 = uj0VarArr2[2];
                                if (animatedDrawable == uj0Var3) {
                                    if (uj0Var3.a0 < 49) {
                                        uj0Var3.P(49);
                                        break;
                                    }
                                } else {
                                    xf1Var.a.setAnimation(uj0Var3);
                                    xf1Var.f0[2].P(49);
                                    xf1Var.f0[2].T(0.0f, false);
                                    xf1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.uj0[] uj0VarArr3 = xf1Var.f0;
                            if (animatedDrawable != uj0VarArr3[3] && animatedDrawable != (uj0Var = uj0VarArr3[5])) {
                                xf1Var.a.setAnimation(uj0Var);
                                xf1Var.f0[5].T(0.0f, false);
                                xf1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                xf1 xf1Var2 = this.b;
                if (xf1Var2.F) {
                    if (xf1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(xf1Var2.E, true, 0.1f, true);
                        break;
                    } else if (xf1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(xf1Var2.E, false, 0.1f, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
