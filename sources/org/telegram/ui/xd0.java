package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xd0 implements TextWatcher {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ ViewGroup c;

    public xd0(zf.v2 v2Var) {
        this.c = v2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.a) {
            case 0:
                yd0 yd0Var = (yd0) this.c;
                if (this.b) {
                    if (yd0Var.f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (yd0Var.y) {
                            yd0Var.f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(yd0Var.f, true, 0.1f, true);
                        break;
                    } else if (yd0Var.f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(yd0Var.f, false, 0.1f, true);
                        break;
                    }
                }
                break;
            default:
                zf.v2 v2Var = (zf.v2) this.c;
                zf.u2 u2Var = v2Var.m0;
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
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.b = i12 > 3;
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    public xd0(yd0 yd0Var, boolean z10) {
        this.c = yd0Var;
        this.b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
