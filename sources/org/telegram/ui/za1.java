package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class za1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb1 b;

    public /* synthetic */ za1(cb1 cb1Var, int i7) {
        this.a = i7;
        this.b = cb1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.zg0 zg0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                cb1 cb1Var = this.b;
                if (!cb1Var.M) {
                    int i7 = cb1Var.O;
                    if (i7 != 0) {
                        if (i7 != 1) {
                            if (i7 == 8 && editable.length() > 0) {
                                cb1Var.M0(true);
                                break;
                            }
                        } else {
                            try {
                                cb1Var.f0[6].P((int) ((Math.min(1.0f, cb1Var.n.getLayout().getLineWidth(0) / cb1Var.n.getWidth()) * 142.0f) + 18.0f));
                                cb1Var.a.d();
                                break;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.zg0 animatedDrawable = cb1Var.a.getAnimatedDrawable();
                        if (cb1Var.n.length() <= 0) {
                            if (animatedDrawable != cb1Var.f0[3] || cb1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.zg0[] zg0VarArr = cb1Var.f0;
                                if (animatedDrawable != zg0VarArr[5]) {
                                    zg0VarArr[2].P(-1);
                                    org.telegram.ui.Components.zg0 zg0Var2 = cb1Var.f0[2];
                                    if (animatedDrawable != zg0Var2) {
                                        cb1Var.a.setAnimation(zg0Var2);
                                        cb1Var.f0[2].N(49, false, false);
                                    }
                                    cb1Var.a.d();
                                    break;
                                }
                            }
                            cb1Var.a.setAnimation(cb1Var.f0[4]);
                            cb1Var.f0[4].T(false, 0.0f);
                            cb1Var.a.d();
                            break;
                        } else if (cb1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.zg0[] zg0VarArr2 = cb1Var.f0;
                            if (animatedDrawable != zg0VarArr2[3]) {
                                org.telegram.ui.Components.zg0 zg0Var3 = zg0VarArr2[2];
                                if (animatedDrawable == zg0Var3) {
                                    if (zg0Var3.a0 < 49) {
                                        zg0Var3.P(49);
                                        break;
                                    }
                                } else {
                                    cb1Var.a.setAnimation(zg0Var3);
                                    cb1Var.f0[2].P(49);
                                    cb1Var.f0[2].T(false, 0.0f);
                                    cb1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.zg0[] zg0VarArr3 = cb1Var.f0;
                            if (animatedDrawable != zg0VarArr3[3] && animatedDrawable != (zg0Var = zg0VarArr3[5])) {
                                cb1Var.a.setAnimation(zg0Var);
                                cb1Var.f0[5].T(false, 0.0f);
                                cb1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                cb1 cb1Var2 = this.b;
                if (cb1Var2.F) {
                    if (cb1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(cb1Var2.E, true, 0.1f, true, true);
                        break;
                    } else if (cb1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(cb1Var2.E, false, 0.1f, true, true);
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
