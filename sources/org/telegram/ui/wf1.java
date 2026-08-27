package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wf1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf1 b;

    public /* synthetic */ wf1(zf1 zf1Var, int i10) {
        this.a = i10;
        this.b = zf1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.oi0 oi0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                zf1 zf1Var = this.b;
                if (!zf1Var.I) {
                    int i10 = zf1Var.K;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 8 && editable.length() > 0) {
                                zf1Var.H0(true);
                                break;
                            }
                        } else {
                            try {
                                zf1Var.b0[6].N((int) ((Math.min(1.0f, zf1Var.n.getLayout().getLineWidth(0) / zf1Var.n.getWidth()) * 142.0f) + 18.0f));
                                zf1Var.a.d();
                                break;
                            } catch (Exception e9) {
                                FileLog.e(e9);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.oi0 animatedDrawable = zf1Var.a.getAnimatedDrawable();
                        if (zf1Var.n.length() <= 0) {
                            if (animatedDrawable != zf1Var.b0[3] || zf1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.oi0[] oi0VarArr = zf1Var.b0;
                                if (animatedDrawable != oi0VarArr[5]) {
                                    oi0VarArr[2].N(-1);
                                    org.telegram.ui.Components.oi0 oi0Var2 = zf1Var.b0[2];
                                    if (animatedDrawable != oi0Var2) {
                                        zf1Var.a.setAnimation(oi0Var2);
                                        zf1Var.b0[2].L(49, false, false);
                                    }
                                    zf1Var.a.d();
                                    break;
                                }
                            }
                            zf1Var.a.setAnimation(zf1Var.b0[4]);
                            zf1Var.b0[4].Q(0.0f, false);
                            zf1Var.a.d();
                            break;
                        } else if (zf1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.oi0[] oi0VarArr2 = zf1Var.b0;
                            if (animatedDrawable != oi0VarArr2[3]) {
                                org.telegram.ui.Components.oi0 oi0Var3 = oi0VarArr2[2];
                                if (animatedDrawable == oi0Var3) {
                                    if (oi0Var3.X < 49) {
                                        oi0Var3.N(49);
                                        break;
                                    }
                                } else {
                                    zf1Var.a.setAnimation(oi0Var3);
                                    zf1Var.b0[2].N(49);
                                    zf1Var.b0[2].Q(0.0f, false);
                                    zf1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.oi0[] oi0VarArr3 = zf1Var.b0;
                            if (animatedDrawable != oi0VarArr3[3] && animatedDrawable != (oi0Var = oi0VarArr3[5])) {
                                zf1Var.a.setAnimation(oi0Var);
                                zf1Var.b0[5].Q(0.0f, false);
                                zf1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                zf1 zf1Var2 = this.b;
                if (zf1Var2.B) {
                    if (zf1Var2.A.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(zf1Var2.A, true, 0.1f, true);
                        break;
                    } else if (zf1Var2.A.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(zf1Var2.A, false, 0.1f, true);
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
