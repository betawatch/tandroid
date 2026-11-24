// default package

import android.text.TextPaint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sgc {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(hg5.h(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
