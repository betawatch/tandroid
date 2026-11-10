package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class wb0 implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ View c;

    public /* synthetic */ wb0(int i7, View view) {
        this.a = i7;
        this.c = view;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int j3;
        int i7 = this.a;
        View view = this.c;
        switch (i7) {
            case 0:
                xb0 xb0Var = (xb0) view;
                if (this.b) {
                    if (xb0Var.f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (xb0Var.D) {
                            xb0Var.f.callOnClick();
                        }
                        org.telegram.messenger.g0.Z3(xb0Var.f, true, 0.1f, true, true);
                        break;
                    } else if (xb0Var.f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(xb0Var.f, false, 0.1f, true, true);
                        break;
                    }
                }
                break;
            case 1:
                boolean isEmpty = TextUtils.isEmpty(editable);
                if (isEmpty != this.b) {
                    TextView textView = (TextView) view;
                    this.b = isEmpty;
                    textView.setText(org.telegram.messenger.id.M0(isEmpty ? 2131746321 : 2131754486, null));
                    break;
                }
                break;
            case 2:
                tg.k2 k2Var = (tg.k2) view;
                tg.j2 j2Var = k2Var.q0;
                if (this.b && k2Var.w0 > 0 && k2Var.x0 > 0 && !k2Var.z0 && j2Var.getLayout() != null) {
                    float f10 = org.telegram.messenger.g0.q.y / 3.0f;
                    float height = j2Var.getLayout().getHeight();
                    if (height > f10 && (j3 = Utilities.j((int) ((f10 / height) * k2Var.getBaseFontSize()), k2Var.x0, k2Var.w0)) != k2Var.getBaseFontSize()) {
                        k2Var.setBaseFontSize(j3);
                        Runnable runnable = k2Var.y0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                k2Var.s();
                break;
            default:
                zh.n1 n1Var = (zh.n1) view;
                if (!this.b && editable.length() > 12) {
                    this.b = true;
                    editable.delete(12, editable.length());
                    org.telegram.messenger.g0.F3(n1Var);
                    try {
                        n1Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.a) {
            case 2:
                this.b = i11 > 3;
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    public wb0(kg.x0 x0Var, TextView textView) {
        this.a = 1;
        this.c = textView;
        this.b = TextUtils.isEmpty(x0Var.getText());
    }

    public wb0(xb0 xb0Var, boolean z9) {
        this.a = 0;
        this.c = xb0Var;
        this.b = z9;
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

    private final void g(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
