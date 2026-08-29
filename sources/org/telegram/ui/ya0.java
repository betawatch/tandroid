package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ya0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ eb0 b;

    public /* synthetic */ ya0(eb0 eb0Var, int i10) {
        this.a = i10;
        this.b = eb0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                Emoji.replaceEmoji(editable, this.b.G.getPaint().getFontMetricsInt(), false);
                break;
            default:
                eb0 eb0Var = this.b;
                if (!eb0Var.K) {
                    if (editable.toString().equals("0")) {
                        eb0Var.B.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                eb0Var.W(parseInt);
                                break;
                            } else {
                                eb0Var.X();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            eb0Var.X();
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
