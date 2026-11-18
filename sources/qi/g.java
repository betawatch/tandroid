package qi;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.n6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
            textPaint.setTextSize(g0.L(bz.W0 - this.b));
        }
        textPaint.setColor(n6.x0(null, n6.Vc, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
