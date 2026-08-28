package pf;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i1 implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
        return String.valueOf(charSequence).replaceAll("[^\\d_\\p{L}\\x{200c}\\x{00b7}\\x{0d80}-\\x{0dff}]", "");
    }
}
