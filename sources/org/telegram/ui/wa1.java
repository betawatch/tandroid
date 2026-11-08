package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class wa1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ za1 b;

    public /* synthetic */ wa1(za1 za1Var, int i7) {
        this.a = i7;
        this.b = za1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.zg0 zg0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                za1 za1Var = this.b;
                if (!za1Var.M) {
                    int i7 = za1Var.O;
                    if (i7 != 0) {
                        if (i7 != 1) {
                            if (i7 == 8 && editable.length() > 0) {
                                za1Var.M0(true);
                                break;
                            }
                        } else {
                            try {
                                za1Var.f0[6].P((int) ((Math.min(1.0f, za1Var.n.getLayout().getLineWidth(0) / za1Var.n.getWidth()) * 142.0f) + 18.0f));
                                za1Var.a.d();
                                break;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.zg0 animatedDrawable = za1Var.a.getAnimatedDrawable();
                        if (za1Var.n.length() <= 0) {
                            if (animatedDrawable != za1Var.f0[3] || za1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.zg0[] zg0VarArr = za1Var.f0;
                                if (animatedDrawable != zg0VarArr[5]) {
                                    zg0VarArr[2].P(-1);
                                    org.telegram.ui.Components.zg0 zg0Var2 = za1Var.f0[2];
                                    if (animatedDrawable != zg0Var2) {
                                        za1Var.a.setAnimation(zg0Var2);
                                        za1Var.f0[2].N(49, false, false);
                                    }
                                    za1Var.a.d();
                                    break;
                                }
                            }
                            za1Var.a.setAnimation(za1Var.f0[4]);
                            za1Var.f0[4].T(false, 0.0f);
                            za1Var.a.d();
                            break;
                        } else if (za1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.zg0[] zg0VarArr2 = za1Var.f0;
                            if (animatedDrawable != zg0VarArr2[3]) {
                                org.telegram.ui.Components.zg0 zg0Var3 = zg0VarArr2[2];
                                if (animatedDrawable == zg0Var3) {
                                    if (zg0Var3.a0 < 49) {
                                        zg0Var3.P(49);
                                        break;
                                    }
                                } else {
                                    za1Var.a.setAnimation(zg0Var3);
                                    za1Var.f0[2].P(49);
                                    za1Var.f0[2].T(false, 0.0f);
                                    za1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.zg0[] zg0VarArr3 = za1Var.f0;
                            if (animatedDrawable != zg0VarArr3[3] && animatedDrawable != (zg0Var = zg0VarArr3[5])) {
                                za1Var.a.setAnimation(zg0Var);
                                za1Var.f0[5].T(false, 0.0f);
                                za1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                za1 za1Var2 = this.b;
                if (za1Var2.F) {
                    if (za1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(za1Var2.E, true, 0.1f, true, true);
                        break;
                    } else if (za1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(za1Var2.E, false, 0.1f, true, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
