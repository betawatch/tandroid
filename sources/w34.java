// default package

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class w34 extends InputFilter.LengthFilter {
    public final /* synthetic */ y34 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w34(y34 y34Var) {
        super(128);
        this.a = y34Var;
    }

    @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
        if (filter != null && filter.length() == 0) {
            hl.z3(this.a.a);
            yw0.E.a();
        }
        return filter;
    }
}
