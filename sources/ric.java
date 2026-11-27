// default package

import android.text.TextPaint;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ric {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(kg5.h(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
