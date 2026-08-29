package sf;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t0 implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (charSequence == null) {
            return null;
        }
        String charSequence2 = charSequence.toString();
        if (charSequence2.contains("\n")) {
            return charSequence2.replaceAll("\n", "");
        }
        return null;
    }
}
