// default package

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zk2 extends yk2 {
    public SpannableStringBuilder c;

    @Override // yk2, android.text.SpannableString, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.c) == null) ? super.getSpanEnd(obj) : spannableStringBuilder.getSpanEnd(obj);
    }

    @Override // yk2, android.text.SpannableString, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.c) == null) ? super.getSpanFlags(obj) : spannableStringBuilder.getSpanFlags(obj);
    }

    @Override // yk2, android.text.SpannableString, android.text.Spanned
    public final int getSpanStart(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.c) == null) ? super.getSpanStart(obj) : spannableStringBuilder.getSpanStart(obj);
    }

    @Override // yk2, android.text.SpannableString, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.c) == null) ? super.getSpans(i, i2, cls) : spannableStringBuilder.getSpans(i, i2, cls);
    }

    @Override // yk2, android.text.SpannableString, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        SpannableStringBuilder spannableStringBuilder;
        return (this.a || (spannableStringBuilder = this.c) == null) ? super.nextSpanTransition(i, i2, cls) : spannableStringBuilder.nextSpanTransition(i, i2, cls);
    }
}
