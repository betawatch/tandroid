package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vd0 implements TextWatcher {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ ViewGroup c;

    public vd0(sg.w2 w2Var) {
        this.c = w2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.a) {
            case 0:
                wd0 wd0Var = (wd0) this.c;
                if (this.b) {
                    if (wd0Var.f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (wd0Var.y) {
                            wd0Var.f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(wd0Var.f, true, 0.1f, true);
                        break;
                    } else if (wd0Var.f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(wd0Var.f, false, 0.1f, true);
                        break;
                    }
                }
                break;
            default:
                sg.w2 w2Var = (sg.w2) this.c;
                sg.v2 v2Var = w2Var.q0;
                if (this.b && w2Var.w0 > 0 && w2Var.x0 > 0 && !w2Var.z0 && v2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = v2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * w2Var.getBaseFontSize()), w2Var.x0, w2Var.w0)) != w2Var.getBaseFontSize()) {
                        w2Var.setBaseFontSize(clamp);
                        Runnable runnable = w2Var.y0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                w2Var.s();
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

    public vd0(wd0 wd0Var, boolean z10) {
        this.c = wd0Var;
        this.b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
