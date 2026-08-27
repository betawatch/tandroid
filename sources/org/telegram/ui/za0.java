package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class za0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ fb0 b;

    public /* synthetic */ za0(fb0 fb0Var, int i10) {
        this.a = i10;
        this.b = fb0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                Emoji.replaceEmoji(editable, this.b.G.getPaint().getFontMetricsInt(), false);
                break;
            default:
                fb0 fb0Var = this.b;
                if (!fb0Var.K) {
                    if (editable.toString().equals("0")) {
                        fb0Var.B.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                fb0Var.W(parseInt);
                                break;
                            } else {
                                fb0Var.X();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            fb0Var.X();
                        }
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
}
