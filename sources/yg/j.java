package yg;

import android.text.InputFilter;
import android.text.Spanned;
import org.telegram.messenger.g0;
import org.telegram.messenger.p2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j extends InputFilter.LengthFilter {
    public final /* synthetic */ l a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar) {
        super(128);
        this.a = lVar;
    }

    @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        CharSequence filter = super.filter(charSequence, i7, i10, spanned, i11, i12);
        if (filter != null && filter.length() == 0) {
            g0.F3(this.a.a);
            p2.D.a();
        }
        return filter;
    }
}
