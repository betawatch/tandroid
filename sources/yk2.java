// default package

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public class yk2 extends SpannableString {
    public static final /* synthetic */ int b = 0;
    public volatile boolean a;

    public yk2(CharSequence charSequence) {
        super(charSequence);
        this.a = false;
    }

    public final int a(CharacterStyle characterStyle) {
        return super.getSpanEnd(characterStyle);
    }

    public final int b(CharacterStyle characterStyle) {
        return super.getSpanStart(characterStyle);
    }

    public final Object[] c(Class cls, int i) {
        return super.getSpans(0, i, cls);
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public int getSpanEnd(Object obj) {
        if (this.a) {
            return super.getSpanEnd(obj);
        }
        return -1;
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public int getSpanFlags(Object obj) {
        if (this.a) {
            return super.getSpanFlags(obj);
        }
        return 0;
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public int getSpanStart(Object obj) {
        if (this.a) {
            return super.getSpanStart(obj);
        }
        return -1;
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public Object[] getSpans(int i, int i2, Class cls) {
        return !this.a ? (Object[]) Array.newInstance((Class<?>) cls, 0) : super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return !this.a ? i2 : super.nextSpanTransition(i, i2, cls);
    }
}
