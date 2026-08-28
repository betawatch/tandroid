package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class va0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb0 b;

    public /* synthetic */ va0(bb0 bb0Var, int i9) {
        this.a = i9;
        this.b = bb0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                Emoji.replaceEmoji(editable, this.b.G.getPaint().getFontMetricsInt(), false);
                break;
            default:
                bb0 bb0Var = this.b;
                if (!bb0Var.K) {
                    if (editable.toString().equals("0")) {
                        bb0Var.B.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                bb0Var.V(parseInt);
                                break;
                            } else {
                                bb0Var.W();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            bb0Var.W();
                        }
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
}
