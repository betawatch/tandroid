// default package

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import j$.util.stream.IntStream;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class x7c implements Spannable {
    public boolean a = false;
    public Spannable b;

    public x7c(CharSequence charSequence) {
        this.b = new SpannableString(charSequence);
    }

    public final void a() {
        Spannable spannable = this.b;
        if (!this.a) {
            byte b = 28;
            if ((Build.VERSION.SDK_INT < 28 ? new kg7(b) : new w7c(b)).d(spannable)) {
                this.b = new SpannableString(spannable);
            }
        }
        this.a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final /* synthetic */ IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public final /* synthetic */ java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b.toString();
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream chars() {
        return ki0.b(this.b);
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream codePoints() {
        return ki0.c(this.b);
    }

    public x7c(Spannable spannable) {
        this.b = spannable;
    }
}
