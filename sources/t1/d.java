package t1;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.l;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class d implements InputFilter {
    public final TextView a;
    public c b;

    public d(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b10 = l.a().b();
        if (b10 != 0) {
            if (b10 == 1) {
                if ((i12 == 0 && i11 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i7 != 0 || i10 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i7, i10);
                }
                return l.a().e(0, charSequence.length(), charSequence);
            }
            if (b10 != 3) {
                return charSequence;
            }
        }
        l a10 = l.a();
        if (this.b == null) {
            this.b = new c(textView, this);
        }
        a10.f(this.b);
        return charSequence;
    }
}
