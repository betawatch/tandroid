// default package

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class sw3 implements InputFilter {
    public final TextView a;
    public rw3 b;

    public sw3(TextView textView) {
        this.a = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r1 != 3) goto L24;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (!textView.isInEditMode()) {
            int b = lw3.a().b();
            if (b != 0) {
                if (b == 1) {
                    if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                        if (i != 0 || i2 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        return lw3.a().e(0, charSequence.length(), charSequence);
                    }
                }
            }
            lw3 a = lw3.a();
            rw3 rw3Var = this.b;
            if (rw3Var == null) {
                rw3Var = new rw3(textView, this);
                this.b = rw3Var;
            }
            a.f(rw3Var);
            return charSequence;
        }
        return charSequence;
    }
}
