package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class sg1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ vg1 b;

    public /* synthetic */ sg1(vg1 vg1Var, int i10) {
        this.a = i10;
        this.b = vg1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.hj0 hj0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                vg1 vg1Var = this.b;
                if (!vg1Var.J) {
                    int i10 = vg1Var.L;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 8 && editable.length() > 0) {
                                vg1Var.H0(true);
                                break;
                            }
                        } else {
                            try {
                                vg1Var.c0[6].N((int) ((Math.min(1.0f, vg1Var.n.getLayout().getLineWidth(0) / vg1Var.n.getWidth()) * 142.0f) + 18.0f));
                                vg1Var.a.d();
                                break;
                            } catch (Exception e6) {
                                FileLog.e(e6);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.hj0 animatedDrawable = vg1Var.a.getAnimatedDrawable();
                        if (vg1Var.n.length() <= 0) {
                            if (animatedDrawable != vg1Var.c0[3] || vg1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.hj0[] hj0VarArr = vg1Var.c0;
                                if (animatedDrawable != hj0VarArr[5]) {
                                    hj0VarArr[2].N(-1);
                                    org.telegram.ui.Components.hj0 hj0Var2 = vg1Var.c0[2];
                                    if (animatedDrawable != hj0Var2) {
                                        vg1Var.a.setAnimation(hj0Var2);
                                        vg1Var.c0[2].L(49, false, false);
                                    }
                                    vg1Var.a.d();
                                    break;
                                }
                            }
                            vg1Var.a.setAnimation(vg1Var.c0[4]);
                            vg1Var.c0[4].Q(0.0f, false);
                            vg1Var.a.d();
                            break;
                        } else if (vg1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.hj0[] hj0VarArr2 = vg1Var.c0;
                            if (animatedDrawable != hj0VarArr2[3]) {
                                org.telegram.ui.Components.hj0 hj0Var3 = hj0VarArr2[2];
                                if (animatedDrawable == hj0Var3) {
                                    if (hj0Var3.Y < 49) {
                                        hj0Var3.N(49);
                                        break;
                                    }
                                } else {
                                    vg1Var.a.setAnimation(hj0Var3);
                                    vg1Var.c0[2].N(49);
                                    vg1Var.c0[2].Q(0.0f, false);
                                    vg1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.hj0[] hj0VarArr3 = vg1Var.c0;
                            if (animatedDrawable != hj0VarArr3[3] && animatedDrawable != (hj0Var = hj0VarArr3[5])) {
                                vg1Var.a.setAnimation(hj0Var);
                                vg1Var.c0[5].Q(0.0f, false);
                                vg1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                vg1 vg1Var2 = this.b;
                if (vg1Var2.C) {
                    if (vg1Var2.B.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(vg1Var2.B, true, 0.1f, true);
                        break;
                    } else if (vg1Var2.B.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(vg1Var2.B, false, 0.1f, true);
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
