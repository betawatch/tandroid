package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class yf1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg1 b;

    public /* synthetic */ yf1(bg1 bg1Var, int i10) {
        this.a = i10;
        this.b = bg1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.yj0 yj0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                bg1 bg1Var = this.b;
                if (!bg1Var.M) {
                    int i10 = bg1Var.O;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 8 && editable.length() > 0) {
                                bg1Var.H0(true);
                                break;
                            }
                        } else {
                            try {
                                bg1Var.f0[6].P((int) ((Math.min(1.0f, bg1Var.n.getLayout().getLineWidth(0) / bg1Var.n.getWidth()) * 142.0f) + 18.0f));
                                bg1Var.a.d();
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.yj0 animatedDrawable = bg1Var.a.getAnimatedDrawable();
                        if (bg1Var.n.length() <= 0) {
                            if (animatedDrawable != bg1Var.f0[3] || bg1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.yj0[] yj0VarArr = bg1Var.f0;
                                if (animatedDrawable != yj0VarArr[5]) {
                                    yj0VarArr[2].P(-1);
                                    org.telegram.ui.Components.yj0 yj0Var2 = bg1Var.f0[2];
                                    if (animatedDrawable != yj0Var2) {
                                        bg1Var.a.setAnimation(yj0Var2);
                                        bg1Var.f0[2].N(49, false, false);
                                    }
                                    bg1Var.a.d();
                                    break;
                                }
                            }
                            bg1Var.a.setAnimation(bg1Var.f0[4]);
                            bg1Var.f0[4].T(0.0f, false);
                            bg1Var.a.d();
                            break;
                        } else if (bg1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.yj0[] yj0VarArr2 = bg1Var.f0;
                            if (animatedDrawable != yj0VarArr2[3]) {
                                org.telegram.ui.Components.yj0 yj0Var3 = yj0VarArr2[2];
                                if (animatedDrawable == yj0Var3) {
                                    if (yj0Var3.a0 < 49) {
                                        yj0Var3.P(49);
                                        break;
                                    }
                                } else {
                                    bg1Var.a.setAnimation(yj0Var3);
                                    bg1Var.f0[2].P(49);
                                    bg1Var.f0[2].T(0.0f, false);
                                    bg1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.yj0[] yj0VarArr3 = bg1Var.f0;
                            if (animatedDrawable != yj0VarArr3[3] && animatedDrawable != (yj0Var = yj0VarArr3[5])) {
                                bg1Var.a.setAnimation(yj0Var);
                                bg1Var.f0[5].T(0.0f, false);
                                bg1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                bg1 bg1Var2 = this.b;
                if (bg1Var2.F) {
                    if (bg1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(bg1Var2.E, true, 0.1f, true);
                        break;
                    } else if (bg1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(bg1Var2.E, false, 0.1f, true);
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
