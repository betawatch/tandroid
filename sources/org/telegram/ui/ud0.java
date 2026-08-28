package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ud0 implements TextWatcher {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ ViewGroup c;

    public ud0(yf.v2 v2Var) {
        this.c = v2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.a) {
            case 0:
                vd0 vd0Var = (vd0) this.c;
                if (this.b) {
                    if (vd0Var.f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (vd0Var.y) {
                            vd0Var.f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(vd0Var.f, true, 0.1f, true);
                        break;
                    } else if (vd0Var.f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(vd0Var.f, false, 0.1f, true);
                        break;
                    }
                }
                break;
            default:
                yf.v2 v2Var = (yf.v2) this.c;
                yf.u2 u2Var = v2Var.m0;
                if (this.b && v2Var.s0 > 0 && v2Var.t0 > 0 && !v2Var.v0 && u2Var.getLayout() != null) {
                    float f10 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = u2Var.getLayout().getHeight();
                    if (height > f10 && (clamp = Utilities.clamp((int) ((f10 / height) * v2Var.getBaseFontSize()), v2Var.t0, v2Var.s0)) != v2Var.getBaseFontSize()) {
                        v2Var.setBaseFontSize(clamp);
                        Runnable runnable = v2Var.u0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                v2Var.s();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.b = i11 > 3;
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.a;
    }

    public ud0(vd0 vd0Var, boolean z10) {
        this.c = vd0Var;
        this.b = z10;
    }

    private final void a(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
