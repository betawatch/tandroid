package qi;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.cz;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.m6;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class g extends CharacterStyle {
    public final String a;
    public final float b;
    public final boolean c;

    public g(String str, String str2, boolean z10) {
        this.c = z10;
        this.a = str;
        int length = str2 == null ? 0 : str2.length();
        p pVar = j.a;
        this.b = length > 120 ? 5 : length > 50 ? 3 : 2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.c) {
            textPaint.setTextSize(g0.L(cz.W0 - this.b));
        }
        textPaint.setColor(m6.x0(null, m6.Vc, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
