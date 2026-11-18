package qi;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class e extends d {
    public SpannableStringBuilder b;

    @Override // qi.d, android.text.SpannableString, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.b) == null) ? super.getSpanEnd(obj) : spannableStringBuilder.getSpanEnd(obj);
    }

    @Override // qi.d, android.text.SpannableString, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.b) == null) ? super.getSpanFlags(obj) : spannableStringBuilder.getSpanFlags(obj);
    }

    @Override // qi.d, android.text.SpannableString, android.text.Spanned
    public final int getSpanStart(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.b) == null) ? super.getSpanStart(obj) : spannableStringBuilder.getSpanStart(obj);
    }

    @Override // qi.d, android.text.SpannableString, android.text.Spanned
    public final Object[] getSpans(int i7, int i10, Class cls) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.b) == null) ? super.getSpans(i7, i10, cls) : spannableStringBuilder.getSpans(i7, i10, cls);
    }

    @Override // qi.d, android.text.SpannableString, android.text.Spanned
    public final int nextSpanTransition(int i7, int i10, Class cls) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.b) == null) ? super.nextSpanTransition(i7, i10, cls) : spannableStringBuilder.nextSpanTransition(i7, i10, cls);
    }
}
