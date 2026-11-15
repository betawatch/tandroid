package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ua1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ xa1 b;

    public /* synthetic */ ua1(xa1 xa1Var, int i7) {
        this.a = i7;
        this.b = xa1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.ch0 ch0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                xa1 xa1Var = this.b;
                if (!xa1Var.N) {
                    int i7 = xa1Var.P;
                    if (i7 != 0) {
                        if (i7 != 1) {
                            if (i7 == 8 && editable.length() > 0) {
                                xa1Var.M0(true);
                                break;
                            }
                        } else {
                            try {
                                xa1Var.g0[6].P((int) ((Math.min(1.0f, xa1Var.n.getLayout().getLineWidth(0) / xa1Var.n.getWidth()) * 142.0f) + 18.0f));
                                xa1Var.a.d();
                                break;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.ch0 animatedDrawable = xa1Var.a.getAnimatedDrawable();
                        if (xa1Var.n.length() <= 0) {
                            if (animatedDrawable != xa1Var.g0[3] || xa1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.ch0[] ch0VarArr = xa1Var.g0;
                                if (animatedDrawable != ch0VarArr[5]) {
                                    ch0VarArr[2].P(-1);
                                    org.telegram.ui.Components.ch0 ch0Var2 = xa1Var.g0[2];
                                    if (animatedDrawable != ch0Var2) {
                                        xa1Var.a.setAnimation(ch0Var2);
                                        xa1Var.g0[2].N(49, false, false);
                                    }
                                    xa1Var.a.d();
                                    break;
                                }
                            }
                            xa1Var.a.setAnimation(xa1Var.g0[4]);
                            xa1Var.g0[4].T(false, 0.0f);
                            xa1Var.a.d();
                            break;
                        } else if (xa1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.ch0[] ch0VarArr2 = xa1Var.g0;
                            if (animatedDrawable != ch0VarArr2[3]) {
                                org.telegram.ui.Components.ch0 ch0Var3 = ch0VarArr2[2];
                                if (animatedDrawable == ch0Var3) {
                                    if (ch0Var3.b0 < 49) {
                                        ch0Var3.P(49);
                                        break;
                                    }
                                } else {
                                    xa1Var.a.setAnimation(ch0Var3);
                                    xa1Var.g0[2].P(49);
                                    xa1Var.g0[2].T(false, 0.0f);
                                    xa1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.ch0[] ch0VarArr3 = xa1Var.g0;
                            if (animatedDrawable != ch0VarArr3[3] && animatedDrawable != (ch0Var = ch0VarArr3[5])) {
                                xa1Var.a.setAnimation(ch0Var);
                                xa1Var.g0[5].T(false, 0.0f);
                                xa1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                xa1 xa1Var2 = this.b;
                if (xa1Var2.G) {
                    if (xa1Var2.F.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Y3(xa1Var2.F, true, 0.1f, true, true);
                        break;
                    } else if (xa1Var2.F.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Y3(xa1Var2.F, false, 0.1f, true, true);
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
