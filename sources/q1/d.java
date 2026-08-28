package q1;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.k;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d implements InputFilter {
    public final TextView a;
    public c b;

    public d(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b10 = k.a().b();
        if (b10 != 0) {
            if (b10 == 1) {
                if ((i12 == 0 && i11 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i9 != 0 || i10 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i9, i10);
                }
                return k.a().e(0, charSequence.length(), charSequence);
            }
            if (b10 != 3) {
                return charSequence;
            }
        }
        k a2 = k.a();
        if (this.b == null) {
            this.b = new c(textView, this);
        }
        a2.f(this.b);
        return charSequence;
    }
}
