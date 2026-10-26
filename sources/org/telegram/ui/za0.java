package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class za0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ db0 b;

    public /* synthetic */ za0(db0 db0Var, int i10) {
        this.a = i10;
        this.b = db0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                db0 db0Var = this.b;
                if (!db0Var.N) {
                    if (editable.toString().equals("0")) {
                        db0Var.F.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                db0Var.X(parseInt);
                                break;
                            } else {
                                db0Var.Y();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            db0Var.Y();
                            return;
                        }
                    }
                }
                break;
            default:
                Emoji.replaceEmoji(editable, this.b.K.getPaint().getFontMetricsInt(), false);
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
