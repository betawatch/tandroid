package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xf1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ ag1 b;

    public /* synthetic */ xf1(ag1 ag1Var, int i9) {
        this.a = i9;
        this.b = ag1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.mi0 mi0Var;
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                ag1 ag1Var = this.b;
                if (!ag1Var.I) {
                    int i9 = ag1Var.K;
                    if (i9 != 0) {
                        if (i9 != 1) {
                            if (i9 == 8 && editable.length() > 0) {
                                ag1Var.G0(true);
                                break;
                            }
                        } else {
                            try {
                                ag1Var.b0[6].N((int) ((Math.min(1.0f, ag1Var.n.getLayout().getLineWidth(0) / ag1Var.n.getWidth()) * 142.0f) + 18.0f));
                                ag1Var.a.d();
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        }
                    } else {
                        org.telegram.ui.Components.mi0 animatedDrawable = ag1Var.a.getAnimatedDrawable();
                        if (ag1Var.n.length() <= 0) {
                            if (animatedDrawable != ag1Var.b0[3] || ag1Var.n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.mi0[] mi0VarArr = ag1Var.b0;
                                if (animatedDrawable != mi0VarArr[5]) {
                                    mi0VarArr[2].N(-1);
                                    org.telegram.ui.Components.mi0 mi0Var2 = ag1Var.b0[2];
                                    if (animatedDrawable != mi0Var2) {
                                        ag1Var.a.setAnimation(mi0Var2);
                                        ag1Var.b0[2].L(49, false, false);
                                    }
                                    ag1Var.a.d();
                                    break;
                                }
                            }
                            ag1Var.a.setAnimation(ag1Var.b0[4]);
                            ag1Var.b0[4].Q(0.0f, false);
                            ag1Var.a.d();
                            break;
                        } else if (ag1Var.n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.mi0[] mi0VarArr2 = ag1Var.b0;
                            if (animatedDrawable != mi0VarArr2[3]) {
                                org.telegram.ui.Components.mi0 mi0Var3 = mi0VarArr2[2];
                                if (animatedDrawable == mi0Var3) {
                                    if (mi0Var3.X < 49) {
                                        mi0Var3.N(49);
                                        break;
                                    }
                                } else {
                                    ag1Var.a.setAnimation(mi0Var3);
                                    ag1Var.b0[2].N(49);
                                    ag1Var.b0[2].Q(0.0f, false);
                                    ag1Var.a.d();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.ui.Components.mi0[] mi0VarArr3 = ag1Var.b0;
                            if (animatedDrawable != mi0VarArr3[3] && animatedDrawable != (mi0Var = mi0VarArr3[5])) {
                                ag1Var.a.setAnimation(mi0Var);
                                ag1Var.b0[5].Q(0.0f, false);
                                ag1Var.a.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                ag1 ag1Var2 = this.b;
                if (ag1Var2.B) {
                    if (ag1Var2.A.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ag1Var2.A, true, 0.1f, true);
                        break;
                    } else if (ag1Var2.A.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ag1Var2.A, false, 0.1f, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.a;
    }

    private final void a(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
