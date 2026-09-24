package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class wg1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ zg1 b;

    public /* synthetic */ wg1(zg1 zg1Var, int i10) {
        this.a = i10;
        this.b = zg1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.ij0 ij0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                zg1 zg1Var = this.b;
                if (!zg1Var.M) {
                    int i10 = zg1Var.O;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 8 && editable.length() > 0) {
                                zg1Var.H0(true);
                                break;
                            }
                        } else {
                            try {
                                zg1Var.f0[6].P((int) ((Math.min(1.0f, zg1Var.n.getLayout().getLineWidth(0) / zg1Var.n.getWidth()) * 142.0f) + 18.0f));
                                zg1Var.a.d();
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.ij0 animatedDrawable = zg1Var.a.getAnimatedDrawable();
                        if (zg1Var.n.length() <= 0) {
                            if (animatedDrawable != zg1Var.f0[3] || zg1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.ij0[] ij0VarArr = zg1Var.f0;
                                if (animatedDrawable != ij0VarArr[5]) {
                                    ij0VarArr[2].P(-1);
                                    org.telegram.ui.Components.ij0 ij0Var2 = zg1Var.f0[2];
                                    if (animatedDrawable != ij0Var2) {
                                        zg1Var.a.setAnimation(ij0Var2);
                                        zg1Var.f0[2].N(49, false, false);
                                    }
                                    zg1Var.a.d();
                                    break;
                                }
                            }
                            zg1Var.a.setAnimation(zg1Var.f0[4]);
                            zg1Var.f0[4].T(0.0f, false);
                            zg1Var.a.d();
                            break;
                        } else if (zg1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.ij0[] ij0VarArr2 = zg1Var.f0;
                            if (animatedDrawable != ij0VarArr2[3]) {
                                org.telegram.ui.Components.ij0 ij0Var3 = ij0VarArr2[2];
                                if (animatedDrawable == ij0Var3) {
                                    if (ij0Var3.a0 < 49) {
                                        ij0Var3.P(49);
                                        break;
                                    }
                                } else {
                                    zg1Var.a.setAnimation(ij0Var3);
                                    zg1Var.f0[2].P(49);
                                    zg1Var.f0[2].T(0.0f, false);
                                    zg1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.ij0[] ij0VarArr3 = zg1Var.f0;
                            if (animatedDrawable != ij0VarArr3[3] && animatedDrawable != (ij0Var = ij0VarArr3[5])) {
                                zg1Var.a.setAnimation(ij0Var);
                                zg1Var.f0[5].T(0.0f, false);
                                zg1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                zg1 zg1Var2 = this.b;
                if (zg1Var2.F) {
                    if (zg1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(zg1Var2.E, true, 0.1f, true);
                        break;
                    } else if (zg1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(zg1Var2.E, false, 0.1f, true);
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
