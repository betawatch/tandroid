package vf;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class h1 implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        return String.valueOf(charSequence).replaceAll("[^\\d_\\p{L}\\x{200c}\\x{00b7}\\x{0d80}-\\x{0dff}]", "");
    }
}
