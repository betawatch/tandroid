package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zf1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ cg1 b;

    public /* synthetic */ zf1(cg1 cg1Var, int i10) {
        this.a = i10;
        this.b = cg1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.xi0 xi0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                cg1 cg1Var = this.b;
                if (!cg1Var.I) {
                    int i10 = cg1Var.K;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 8 && editable.length() > 0) {
                                cg1Var.H0(true);
                                break;
                            }
                        } else {
                            try {
                                cg1Var.b0[6].N((int) ((Math.min(1.0f, cg1Var.n.getLayout().getLineWidth(0) / cg1Var.n.getWidth()) * 142.0f) + 18.0f));
                                cg1Var.a.d();
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.xi0 animatedDrawable = cg1Var.a.getAnimatedDrawable();
                        if (cg1Var.n.length() <= 0) {
                            if (animatedDrawable != cg1Var.b0[3] || cg1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.xi0[] xi0VarArr = cg1Var.b0;
                                if (animatedDrawable != xi0VarArr[5]) {
                                    xi0VarArr[2].N(-1);
                                    org.telegram.ui.Components.xi0 xi0Var2 = cg1Var.b0[2];
                                    if (animatedDrawable != xi0Var2) {
                                        cg1Var.a.setAnimation(xi0Var2);
                                        cg1Var.b0[2].L(49, false, false);
                                    }
                                    cg1Var.a.d();
                                    break;
                                }
                            }
                            cg1Var.a.setAnimation(cg1Var.b0[4]);
                            cg1Var.b0[4].Q(0.0f, false);
                            cg1Var.a.d();
                            break;
                        } else if (cg1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.xi0[] xi0VarArr2 = cg1Var.b0;
                            if (animatedDrawable != xi0VarArr2[3]) {
                                org.telegram.ui.Components.xi0 xi0Var3 = xi0VarArr2[2];
                                if (animatedDrawable == xi0Var3) {
                                    if (xi0Var3.X < 49) {
                                        xi0Var3.N(49);
                                        break;
                                    }
                                } else {
                                    cg1Var.a.setAnimation(xi0Var3);
                                    cg1Var.b0[2].N(49);
                                    cg1Var.b0[2].Q(0.0f, false);
                                    cg1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.xi0[] xi0VarArr3 = cg1Var.b0;
                            if (animatedDrawable != xi0VarArr3[3] && animatedDrawable != (xi0Var = xi0VarArr3[5])) {
                                cg1Var.a.setAnimation(xi0Var);
                                cg1Var.b0[5].Q(0.0f, false);
                                cg1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                cg1 cg1Var2 = this.b;
                if (cg1Var2.B) {
                    if (cg1Var2.A.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(cg1Var2.A, true, 0.1f, true);
                        break;
                    } else if (cg1Var2.A.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(cg1Var2.A, false, 0.1f, true);
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
