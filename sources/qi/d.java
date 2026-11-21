package qi;

import android.text.SpannableString;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public class d extends SpannableString {
    public volatile boolean a;

    public d(CharSequence charSequence) {
        super(charSequence);
        this.a = false;
    }

    public static Object[] a(d dVar, int i7, Class cls) {
        return super.getSpans(0, i7, cls);
    }

    public static int b(d dVar, Object obj) {
        return super.getSpanStart(obj);
    }

    public static int c(d dVar, Object obj) {
        return super.getSpanEnd(obj);
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
    public Object[] getSpans(int i7, int i10, Class cls) {
        return !this.a ? (Object[]) Array.newInstance((Class<?>) cls, 0) : super.getSpans(i7, i10, cls);
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public int nextSpanTransition(int i7, int i10, Class cls) {
        return !this.a ? i10 : super.nextSpanTransition(i7, i10, cls);
    }
}
