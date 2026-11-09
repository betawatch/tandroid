package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ya1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb1 b;

    public /* synthetic */ ya1(bb1 bb1Var, int i7) {
        this.a = i7;
        this.b = bb1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.ah0 ah0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                bb1 bb1Var = this.b;
                if (!bb1Var.M) {
                    int i7 = bb1Var.O;
                    if (i7 != 0) {
                        if (i7 != 1) {
                            if (i7 == 8 && editable.length() > 0) {
                                bb1Var.M0(true);
                                break;
                            }
                        } else {
                            try {
                                bb1Var.f0[6].P((int) ((Math.min(1.0f, bb1Var.n.getLayout().getLineWidth(0) / bb1Var.n.getWidth()) * 142.0f) + 18.0f));
                                bb1Var.a.d();
                                break;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.ah0 animatedDrawable = bb1Var.a.getAnimatedDrawable();
                        if (bb1Var.n.length() <= 0) {
                            if (animatedDrawable != bb1Var.f0[3] || bb1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.ah0[] ah0VarArr = bb1Var.f0;
                                if (animatedDrawable != ah0VarArr[5]) {
                                    ah0VarArr[2].P(-1);
                                    org.telegram.ui.Components.ah0 ah0Var2 = bb1Var.f0[2];
                                    if (animatedDrawable != ah0Var2) {
                                        bb1Var.a.setAnimation(ah0Var2);
                                        bb1Var.f0[2].N(49, false, false);
                                    }
                                    bb1Var.a.d();
                                    break;
                                }
                            }
                            bb1Var.a.setAnimation(bb1Var.f0[4]);
                            bb1Var.f0[4].T(false, 0.0f);
                            bb1Var.a.d();
                            break;
                        } else if (bb1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.ah0[] ah0VarArr2 = bb1Var.f0;
                            if (animatedDrawable != ah0VarArr2[3]) {
                                org.telegram.ui.Components.ah0 ah0Var3 = ah0VarArr2[2];
                                if (animatedDrawable == ah0Var3) {
                                    if (ah0Var3.a0 < 49) {
                                        ah0Var3.P(49);
                                        break;
                                    }
                                } else {
                                    bb1Var.a.setAnimation(ah0Var3);
                                    bb1Var.f0[2].P(49);
                                    bb1Var.f0[2].T(false, 0.0f);
                                    bb1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.ah0[] ah0VarArr3 = bb1Var.f0;
                            if (animatedDrawable != ah0VarArr3[3] && animatedDrawable != (ah0Var = ah0VarArr3[5])) {
                                bb1Var.a.setAnimation(ah0Var);
                                bb1Var.f0[5].T(false, 0.0f);
                                bb1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                bb1 bb1Var2 = this.b;
                if (bb1Var2.F) {
                    if (bb1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(bb1Var2.E, true, 0.1f, true, true);
                        break;
                    } else if (bb1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(bb1Var2.E, false, 0.1f, true, true);
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
