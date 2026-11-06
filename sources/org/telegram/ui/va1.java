package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class va1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ ya1 b;

    public /* synthetic */ va1(ya1 ya1Var, int i7) {
        this.a = i7;
        this.b = ya1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.zg0 zg0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                ya1 ya1Var = this.b;
                if (!ya1Var.M) {
                    int i7 = ya1Var.O;
                    if (i7 != 0) {
                        if (i7 != 1) {
                            if (i7 == 8 && editable.length() > 0) {
                                ya1Var.M0(true);
                                break;
                            }
                        } else {
                            try {
                                ya1Var.f0[6].P((int) ((Math.min(1.0f, ya1Var.n.getLayout().getLineWidth(0) / ya1Var.n.getWidth()) * 142.0f) + 18.0f));
                                ya1Var.a.d();
                                break;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.zg0 animatedDrawable = ya1Var.a.getAnimatedDrawable();
                        if (ya1Var.n.length() <= 0) {
                            if (animatedDrawable != ya1Var.f0[3] || ya1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.zg0[] zg0VarArr = ya1Var.f0;
                                if (animatedDrawable != zg0VarArr[5]) {
                                    zg0VarArr[2].P(-1);
                                    org.telegram.ui.Components.zg0 zg0Var2 = ya1Var.f0[2];
                                    if (animatedDrawable != zg0Var2) {
                                        ya1Var.a.setAnimation(zg0Var2);
                                        ya1Var.f0[2].N(49, false, false);
                                    }
                                    ya1Var.a.d();
                                    break;
                                }
                            }
                            ya1Var.a.setAnimation(ya1Var.f0[4]);
                            ya1Var.f0[4].T(false, 0.0f);
                            ya1Var.a.d();
                            break;
                        } else if (ya1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.zg0[] zg0VarArr2 = ya1Var.f0;
                            if (animatedDrawable != zg0VarArr2[3]) {
                                org.telegram.ui.Components.zg0 zg0Var3 = zg0VarArr2[2];
                                if (animatedDrawable == zg0Var3) {
                                    if (zg0Var3.a0 < 49) {
                                        zg0Var3.P(49);
                                        break;
                                    }
                                } else {
                                    ya1Var.a.setAnimation(zg0Var3);
                                    ya1Var.f0[2].P(49);
                                    ya1Var.f0[2].T(false, 0.0f);
                                    ya1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.zg0[] zg0VarArr3 = ya1Var.f0;
                            if (animatedDrawable != zg0VarArr3[3] && animatedDrawable != (zg0Var = zg0VarArr3[5])) {
                                ya1Var.a.setAnimation(zg0Var);
                                ya1Var.f0[5].T(false, 0.0f);
                                ya1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                ya1 ya1Var2 = this.b;
                if (ya1Var2.F) {
                    if (ya1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(ya1Var2.E, true, 0.1f, true, true);
                        break;
                    } else if (ya1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(ya1Var2.E, false, 0.1f, true, true);
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
