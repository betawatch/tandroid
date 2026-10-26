package q1;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.l;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class d implements InputFilter {
    public final TextView a;
    public c b;

    public d(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b10 = l.a().b();
        if (b10 != 0) {
            if (b10 == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return l.a().e(0, charSequence.length(), charSequence);
            }
            if (b10 != 3) {
                return charSequence;
            }
        }
        l a2 = l.a();
        if (this.b == null) {
            this.b = new c(textView, this);
        }
        a2.f(this.b);
        return charSequence;
    }
}
