package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class tg1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg1 b;

    public /* synthetic */ tg1(wg1 wg1Var, int i10) {
        this.a = i10;
        this.b = wg1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.gj0 gj0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                wg1 wg1Var = this.b;
                if (!wg1Var.J) {
                    int i10 = wg1Var.L;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 8 && editable.length() > 0) {
                                wg1Var.H0(true);
                                break;
                            }
                        } else {
                            try {
                                wg1Var.c0[6].N((int) ((Math.min(1.0f, wg1Var.n.getLayout().getLineWidth(0) / wg1Var.n.getWidth()) * 142.0f) + 18.0f));
                                wg1Var.a.d();
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.gj0 animatedDrawable = wg1Var.a.getAnimatedDrawable();
                        if (wg1Var.n.length() <= 0) {
                            if (animatedDrawable != wg1Var.c0[3] || wg1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.gj0[] gj0VarArr = wg1Var.c0;
                                if (animatedDrawable != gj0VarArr[5]) {
                                    gj0VarArr[2].N(-1);
                                    org.telegram.ui.Components.gj0 gj0Var2 = wg1Var.c0[2];
                                    if (animatedDrawable != gj0Var2) {
                                        wg1Var.a.setAnimation(gj0Var2);
                                        wg1Var.c0[2].L(49, false, false);
                                    }
                                    wg1Var.a.d();
                                    break;
                                }
                            }
                            wg1Var.a.setAnimation(wg1Var.c0[4]);
                            wg1Var.c0[4].Q(0.0f, false);
                            wg1Var.a.d();
                            break;
                        } else if (wg1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.gj0[] gj0VarArr2 = wg1Var.c0;
                            if (animatedDrawable != gj0VarArr2[3]) {
                                org.telegram.ui.Components.gj0 gj0Var3 = gj0VarArr2[2];
                                if (animatedDrawable == gj0Var3) {
                                    if (gj0Var3.Y < 49) {
                                        gj0Var3.N(49);
                                        break;
                                    }
                                } else {
                                    wg1Var.a.setAnimation(gj0Var3);
                                    wg1Var.c0[2].N(49);
                                    wg1Var.c0[2].Q(0.0f, false);
                                    wg1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.gj0[] gj0VarArr3 = wg1Var.c0;
                            if (animatedDrawable != gj0VarArr3[3] && animatedDrawable != (gj0Var = gj0VarArr3[5])) {
                                wg1Var.a.setAnimation(gj0Var);
                                wg1Var.c0[5].Q(0.0f, false);
                                wg1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                wg1 wg1Var2 = this.b;
                if (wg1Var2.C) {
                    if (wg1Var2.B.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(wg1Var2.B, true, 0.1f, true);
                        break;
                    } else if (wg1Var2.B.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(wg1Var2.B, false, 0.1f, true);
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
