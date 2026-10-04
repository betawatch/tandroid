package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class yg1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ bh1 b;

    public /* synthetic */ yg1(bh1 bh1Var, int i10) {
        this.a = i10;
        this.b = bh1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.kj0 kj0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                bh1 bh1Var = this.b;
                if (!bh1Var.M) {
                    int i10 = bh1Var.O;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 8 && editable.length() > 0) {
                                bh1Var.H0(true);
                                break;
                            }
                        } else {
                            try {
                                bh1Var.f0[6].P((int) ((Math.min(1.0f, bh1Var.n.getLayout().getLineWidth(0) / bh1Var.n.getWidth()) * 142.0f) + 18.0f));
                                bh1Var.a.d();
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.kj0 animatedDrawable = bh1Var.a.getAnimatedDrawable();
                        if (bh1Var.n.length() <= 0) {
                            if (animatedDrawable != bh1Var.f0[3] || bh1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.kj0[] kj0VarArr = bh1Var.f0;
                                if (animatedDrawable != kj0VarArr[5]) {
                                    kj0VarArr[2].P(-1);
                                    org.telegram.ui.Components.kj0 kj0Var2 = bh1Var.f0[2];
                                    if (animatedDrawable != kj0Var2) {
                                        bh1Var.a.setAnimation(kj0Var2);
                                        bh1Var.f0[2].N(49, false, false);
                                    }
                                    bh1Var.a.d();
                                    break;
                                }
                            }
                            bh1Var.a.setAnimation(bh1Var.f0[4]);
                            bh1Var.f0[4].T(0.0f, false);
                            bh1Var.a.d();
                            break;
                        } else if (bh1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.kj0[] kj0VarArr2 = bh1Var.f0;
                            if (animatedDrawable != kj0VarArr2[3]) {
                                org.telegram.ui.Components.kj0 kj0Var3 = kj0VarArr2[2];
                                if (animatedDrawable == kj0Var3) {
                                    if (kj0Var3.a0 < 49) {
                                        kj0Var3.P(49);
                                        break;
                                    }
                                } else {
                                    bh1Var.a.setAnimation(kj0Var3);
                                    bh1Var.f0[2].P(49);
                                    bh1Var.f0[2].T(0.0f, false);
                                    bh1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.kj0[] kj0VarArr3 = bh1Var.f0;
                            if (animatedDrawable != kj0VarArr3[3] && animatedDrawable != (kj0Var = kj0VarArr3[5])) {
                                bh1Var.a.setAnimation(kj0Var);
                                bh1Var.f0[5].T(0.0f, false);
                                bh1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                bh1 bh1Var2 = this.b;
                if (bh1Var2.F) {
                    if (bh1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(bh1Var2.E, true, 0.1f, true);
                        break;
                    } else if (bh1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(bh1Var2.E, false, 0.1f, true);
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
